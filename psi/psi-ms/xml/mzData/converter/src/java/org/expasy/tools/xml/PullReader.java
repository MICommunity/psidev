package org.expasy.tools.xml;

import java.io.*;
import java.util.*;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;
import org.xmlpull.mxp1.MXParser;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;


/**
 * Base class for reading objects from an XML source.
 * @author Eric Jain
 * Minor changes by Kai Runte to remove dependency to
 * org.expasy.models.util.Evidenced
 */

public abstract class PullReader {
    private XmlPullParser parser;
    private Node node = new Node(null);
    private Stack objects = new Stack();
    private MultiMap map = new MultiHashMap();
    private Map prefixes = new HashMap();
    private String namespace = "";
    private Name element;


    protected static class DefaultAction {
        protected XmlPullParser parser;
        protected Stack stack;
        protected MultiMap map;

        public void setParser(XmlPullParser parser) {
            this.parser = parser;
        }

        public void setStack(Stack objects) {
            this.stack = objects;
        }

        public void setMap(MultiMap map) {
            this.map = map;
        }

        protected String getAttribute(String key) {
            return parser.getAttributeValue("", key);
        }

        protected String getAttribute(String prefix, String key) {
            return parser.getAttributeValue(prefix, key);
        }

        protected String getText()
                throws Exception {
            return parser.nextText();
        }

        public void execute()
                throws Exception {

        }

        public void cleanup()
                throws Exception {

        }

        protected void put(String key, Object object)
                throws Exception {
            map.put(key, object);
        }

        protected List get(String key)
                throws Exception {
            return (List) map.get(key);
        }

    }


    private static class Name {
        private final String namespace;
        private final String name;

        public Name(String namespace, String name) {
            this.namespace = namespace;
            this.name = name;
        }

        public boolean equals(Object that) {
            return that instanceof Name &&
                    name.equals(((Name) that).name) &&
                    namespace.equals(((Name) that).namespace);
        }

        public int hashCode() {
            return name.hashCode() ^ namespace.hashCode();
        }

        public String toString() {
            return namespace + ":" + name;
        }

    }


    private static class Node {
        private final Name name;
        private Node parent;
        private Map children = new HashMap();
        private DefaultAction action;

        public Node(Name name) {
            this.name = name;
        }

        public boolean hasAction() {
            return action != null;
        }

        public DefaultAction getAction() {
            return action;
        }

        public void setAction(DefaultAction action) {
            assert this.action == null : "Can't set more than one action for a single node";
            this.action = action;
        }

        public boolean hasParent() {
            return parent != null;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            assert parent != this: "Recursive parent-child relationships are not allowed";
            this.parent = parent;
        }

        public Node getChild(Name name) {
            if (children.containsKey(name))
                return (Node) children.get(name);
            Node child = new Node(name);
            child.setParent(this);
            children.put(name, child);
            return child;
        }

        public String toString() {
            return name + " -> " + action;
        }
    }


    protected PullReader(File input)
            throws IOException {
        init(new BufferedReader(input.getName().endsWith(".gz") ?
                new InputStreamReader(new java.util.zip.GZIPInputStream(new FileInputStream(input))) :
                new FileReader(input)));
    }


    protected PullReader(Reader input)
            throws IOException {
        init(input);
    }


    private void init(Reader input)
            throws IOException {
        try {
            parser = new MXParser();
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, true);
            parser.setInput(input);
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }


    protected void setNamespace(String namespace) {
        this.namespace = namespace;
    }


    protected void setElement(String namespace, String name) {
        element = new Name(namespace, name);
    }


    protected void setPrefix(String prefix, String namespace) {
        prefixes.put(prefix, namespace);
    }


    protected void register(String xpath, DefaultAction action) {
        action.setParser(parser);
        action.setStack(objects);
        action.setMap(map);
        assert xpath.startsWith("/") : "Path must be absolute";
        StringTokenizer st = new StringTokenizer(xpath, "/");
        Node current = node;
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            int colon = s.indexOf(':');
            Name name = colon == -1 ?
                    new Name(namespace, s) :
                    new Name((String) prefixes.get(s.substring(0, colon)), s.substring(colon + 1));
            current = current.getChild(name);
        }
        current.setAction(action);
    }


    protected static class FormatException
            extends IOException {
        private final long line;

        FormatException(String message, long line) {
            super(message);
            this.line = line;
        }

        public long getLine() {
            return line;
        }

        public String toString() {
            return super.toString() + " at line " + line;
        }
    }


    protected boolean process(Object base)
            throws IOException {
        if (base != null)
            objects.push(base);

        boolean processed = false;

        try {
            if (parser.getEventType() == XmlPullParser.END_DOCUMENT)
                return false;

            LOOP:
            while (parser.next() != XmlPullParser.END_DOCUMENT) {
                Name name = null;
                switch (parser.getEventType()) {
                    case XmlPullParser.START_TAG:
                        {
                            name = new Name(parser.getNamespace(), parser.getName());
                            node = node.getChild(name);
                            if (node.hasAction()) {
                                node.getAction().execute();
                                processed = true;
                            }
                            if (parser.getEventType() != XmlPullParser.END_TAG)
                                break;
                        }

                    case XmlPullParser.END_TAG:
                        {
                            if (name == null)
                                name = new Name(parser.getNamespace(), parser.getName());
                            if (node.hasAction())
                                node.getAction().cleanup();
                            if (!node.hasParent())
                                break LOOP;
                            node = node.getParent();
                            if (name.equals(element))
                                break LOOP;
                            break;
                        }
                }
            }

            assert objects.size() == 1:
                    "Expected single object on stack, found " + objects;
        } catch (IOException e) {
            throw e;
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        } catch (Exception e) {
            throw new FormatException(e.getMessage(), parser.getLineNumber());
        } finally {
            objects.pop();
            map.clear();
        }

        return processed;
    }
}
