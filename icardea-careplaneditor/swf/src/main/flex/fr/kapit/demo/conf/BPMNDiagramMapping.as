/*
* ////////////////////////////////////////////////////////////////////////////////
* //
* //  Kap IT  -  Copyright 2009 Kap IT  -  All Rights Reserved.  
* //   
* //  TERMS OF USE  
* //  Developers who wish to access source code must agree to the License that accompanies the code
* //  (see file “License.txt” contained in the archive, or http://lab.kapit.fr/display/Store/Licenses)
* //  If you use the source code, you accept to be bound by the License.  If you do not accept the License, do not use the source code.  
* //  Licensees may use the source code to assist with the development of related software. Licensees may not modify or redistribute the source code.  
* //
* ////////////////////////////////////////////////////////////////////////////////
*/

package fr.kapit.demo.conf
{
	public class BPMNDiagramMapping
	{
		 public static function get xml():XML
  		 {
        	return _xml;
    	 }

    	private static const _xml:XML =
    	<mappings>
    	
    	  <sprite id="consultStep" width="60" height="60" proxyclass="fr.kapit.demo.data.MyObjectProxy" />
    	  <sprite id="startStep" width="60" height="60" proxyclass="fr.kapit.demo.data.MyObjectProxy" />
    	  <sprite id="recommendationStep" width="60" height="60" proxyclass="fr.kapit.demo.data.MyObjectProxy" />
    	  <sprite id="decisionStep" width="60" height="60" proxyclass="fr.kapit.demo.data.MyObjectProxy" />
    	  <sprite id="finalStep" width="60" height="60" proxyclass="fr.kapit.demo.data.MyObjectProxy" />
    	  <sprite id="waitStep" width="60" height="60" proxyclass="fr.kapit.demo.data.MyObjectProxy" />
    	  <sprite id="recordActionStep" width="60" height="60" proxyclass="fr.kapit.demo.data.MyObjectProxy" />
    	  <lanelink id="5" proxyclass="fr.kapit.demo.data.MyLinkProxy"/>
    	
    	</mappings>
        ;

	}
}