The Proteomics Mass Spectrometry Data Representation XML Standards Project
==========================================================================
Proteomics Standards Initiative (PSI) effort to standardize
mass spectrometry data representation for proteomics using XML
There are currently two XML schemas in the CVS repository:

1. Micromass XML schema:
License:
=======
You can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option) any later version.  This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
See the GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License along with this library; 
if not, write to the Free Software Foundation, Inc., 
59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

Files
=====
proteinlynx.dtd - Micromass DTD for proteomics data storage and interchange

	The ProteinLynx.dtd file (from Micromass) describes an XML format 
	for representing proteomics data from mass spectrometry experiments.  
	It has been contributed to the Proteomics Standards Initiative as a 
	starting point for discussion.


prot100.xsd - First attempt to represent the same information via an XML-schema

	To allow further discussion, this DTD was converted to an W3C XML-Schema 
	using the automatic conversion capability of XMLspy.

2. University of Menchester XML schema:
License:
=======
Refer to PedroLicense.doc for the licensing details.

Files:
=====
PedroML.xsd - XML schema for proteomics data storage and exchanges.
PedroML.xml - XML instance documents, conformed to schema PedroML.xsd.
