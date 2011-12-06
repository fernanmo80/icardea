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
	public class BPMNSVGLib
	{
		 public static function get svg():XML
   		 {
       		 return _bpmnsvg;
   		 }

		private static const _bpmnsvg:XML =
<svg version="1.1" id="BPMN" xmlns="http://www.w3.org/2000/svg" xmlns:k="http://schemas.kapit.fr/svg/2007/" xmlns:xlink="http://www.w3.org/1999/xlink"
	 x="0" y="0" width="1000px" height="1000px" viewBox="0 0 1000 1000">
  <defs id="defs4">
  <style type="text/css">
      <![CDATA[
.basic, .bpmn, .socialnetwork
{
action-accept:annotation;
action-click:link;
action-accept:link;
}
.bg
{
action-click:link;
action-accept:link;
}

.annotation
{
font-style:italic
}
.label
{
font-size:12px;
action-doubleclick:textedit;
fill:#666666;
lock:all;
font-family:Arial;
wordwrap:true
}
]]>
</style>

<linearGradient id="SVGID_1_" gradientUnits="userSpaceOnUse" x1="748.001" y1="301" x2="748.001" y2="187">
  <stop  offset="0" style="stop-color:#CCCCCC"/>
  <stop  offset="1" style="stop-color:#FFFFFF"/>
 </linearGradient>
 
<linearGradient id="SVGID_2_" gradientUnits="userSpaceOnUse" x1="1203" y1="305.1709" x2="1203" y2="182.833">
  <stop  offset="0" style="stop-color:#CCCCCC"/>
  <stop  offset="1" style="stop-color:#FFFFFF"/>
</linearGradient>
  
<linearGradient id="SVGID_4_" gradientUnits="userSpaceOnUse" x1="292.001" y1="306" x2="292.001" y2="182">
  <stop  offset="0" style="stop-color:#CCCCCC"/>
  <stop  offset="1" style="stop-color:#FFFFFF"/>
</linearGradient>
  
<linearGradient id="SVGID_3_" gradientUnits="userSpaceOnUse" x1="64.001" y1="307" x2="64.001" y2="181">
  <stop  offset="0" style="stop-color:#CCCCCC"/>
  <stop  offset="1" style="stop-color:#FFFFFF"/>
</linearGradient>
  
<linearGradient id="SVGID_5_" gradientUnits="userSpaceOnUse" x1="520.002" y1="305.166" x2="520.002" y2="182.8281">
  <stop  offset="0" style="stop-color:#CCCCCC"/>
  <stop  offset="1" style="stop-color:#FFFFFF"/>
</linearGradient>
  
<linearGradient id="SVGID_6_" gradientUnits="userSpaceOnUse" x1="64.0015" y1="523.1689" x2="64.0015" y2="400.8311">
	<stop  offset="0" style="stop-color:#CCCCCC"/>
	<stop  offset="1" style="stop-color:#FFFFFF"/>
</linearGradient>

<linearGradient id="SVGID_7_" gradientUnits="userSpaceOnUse" x1="458.001" y1="80" x2="810.001" y2="80">
  <stop  offset="0" style="stop-color:#D9D9D9"/>
  <stop  offset="1" style="stop-color:#F2F2F2"/>
</linearGradient>
  
<linearGradient id="SVGID_8_" gradientUnits="userSpaceOnUse" x1="914.001" y1="80" x2="1266.001" y2="80">
  <stop  offset="0" style="stop-color:#D9D9D9"/>
  <stop  offset="1" style="stop-color:#F2F2F2"/>
</linearGradient>
  
<linearGradient id="SVGID_9_" gradientUnits="userSpaceOnUse" x1="178.001" y1="158" x2="178.001" y2="2">
  <stop  offset="0" style="stop-color:#D9D9D9"/>
  <stop  offset="1" style="stop-color:#F2F2F2"/>
</linearGradient> 
  
<linearGradient id="SVGID_10_" gradientUnits="userSpaceOnUse" x1="976.001" y1="306" x2="976.001" y2="182">
  <stop  offset="0" style="stop-color:#CCCCCC"/>
  <stop  offset="1" style="stop-color:#FFFFFF"/>
</linearGradient>

 </defs>

<g k:spriteid="startStep" k:groupid="Bpmn" class="bpmn" id="startStepCircle">
	<path fill="url(#SVGID_1_)" d="M748.001,301c-31.43,0-57-25.57-57-57s25.57-57,57-57s57,25.57,57,57S779.431,301,748.001,301 L748.001,301z"/>
	<path fill="#B3B3B3" stroke="#999999" d="M748.001,194c27.57,0,50,22.43,50,50s-22.43,50-50,50s-50-22.43-50-50 S720.431,194,748.001,194 M748.001,180c-35.346,0-64,28.654-64,64s28.654,64,64,64s64-28.654,64-64S783.347,180,748.001,180L748.001,180z"/>
</g>

<g k:spriteid="consultStep" k:groupid="Bpmn" class="bpmn" id="consultStepCircle">
	<path fill="url(#SVGID_3_)" d="M64.001,307c-34.738,0-63-28.262-63-63s28.262-63,63-63s63,28.262,63,63S98.739,307,64.001,307 L64.001,307z"/>
	<path fill="#4D4D4D" stroke="#999999" stroke-width="0.25" d="M64.001,182c34.187,0,62,27.813,62,62s-27.813,62-62,62 s-62-27.813-62-62S29.814,182,64.001,182 M64.001,180c-35.346,0-64,28.654-64,64s28.654,64,64,64s64-28.654,64-64S99.347,180,64.001,180L64.001,180z"/>
	<rect x="39.001" y="209.584" fill="#FFFFFF" width="50" height="70.833"/>
	<path d="M88.001,211v68h-48v-68H88.001 M91.001,208h-54v74h54V208L91.001,208z"/>
	<path d="M47.001,216v5h34v-5H47.001z"/>
	<path d="M47.001,269v5h34v-5H47.001z"/>
	<path d="M47.001,255v2h34v-2H47.001z"/>
	<path d="M47.001,244v2h34v-2H47.001z"/>
	<path d="M47.001,233v2h34v-2H47.001z"/>
</g>

<g k:spriteid="decisionStep" k:groupid="Bpmn" class="bpmn" id="decisionStepPolygone">
	<polygon fill="url(#SVGID_5_)" points="458.83,244 520.001,182.828 581.174,243.995 520.003,305.166"/>
	<path fill="#B3B3B3" stroke="#999999" d="M520.001,185.657l58.345,58.338l-58.343,58.342L461.658,244L520.001,185.657 M520.001,180l-64,64l64.002,63.995l64-63.999L520.001,180L520.001,180z"/>
	<path opacity="0.9" d="M546.331,239.997h-22.329v-22.334c0-2.2-1.8-4-4-4s-4,1.8-4,4v22.334h-22.332c-2.2,0-4,1.8-4,4s1.8,4,4,4h22.332v22.334c0,2.2,1.8,4,4,4s4-1.8,4-4v-22.334h22.329c2.2,0,4-1.8,4-4S548.531,239.997,546.331,239.997z"/>
</g>

<g k:spriteid="recommendationStep" k:groupid="Bpmn" class="bpmn" id="intermediateMessageEventCircleB">

	<path fill="url(#SVGID_4_)" d="M292.001,306c-34.187,0-62-27.813-62-62c0-34.187,27.813-62,62-62s62,27.813,62,62C354.001,278.187,326.188,306,292.001,306L292.001,306z"/>
	<path fill="#4D4D4D" stroke="#999999" stroke-width="0.25" d="M292.001,182c34.187,0,62,27.813,62,62s-27.813,62-62,62s-62-27.813-62-62S257.814,182,292.001,182 M292.001,180c-35.346,0-64,28.654-64,64s28.654,64,64,64s64-28.654,64-64S327.347,180,292.001,180L292.001,180z"/>
	<path fill="#4D4D4D" stroke="#999999" stroke-width="0.25" d="M292.001,189c30.327,0,55,24.673,55,55s-24.673,55-55,55s-55-24.673-55-55S261.674,189,292.001,189 M292.001,187c-31.48,0-57,25.52-57,57s25.52,57,57,57c31.479,0,57-25.52,57-57S323.48,187,292.001,187L292.001,187z"/>
	<polygon fill-rule="evenodd" clip-rule="evenodd" points="291.835,245.771 321.162,226.193 321.162,224.56 262.84,224.56 262.84,226.429"/>
	<path fill-rule="evenodd" clip-rule="evenodd" d="M292.942,250.227c-0.334,0.201-0.703,0.328-1.091,0.331c-0.003,0-0.008,0.004-0.014,0.004h-0.001h-0.002c-0.005,0-0.01-0.004-0.013-0.004c-0.388-0.003-0.757-0.13-1.092-0.331c-0.03-0.018-25.789-17.17-27.889-18.568v31.782h58.322v-32.018C319.049,232.831,292.973,250.209,292.942,250.227z"/>
</g>

<g k:spriteid="finalStep" k:groupid="Bpmn" class="bpmn" id="finalStepLosange">
	<polygon fill="url(#SVGID_6_)" points="2.829,462.002 64,400.831 125.174,461.998 64.002,523.169 "/>
	<path fill="#B3B3B3" stroke="#999999" d="M64,403.66l58.345,58.338L64.002,520.34L5.657,462.002L64,403.66 M64,398.003l-64,64l64.002,63.995l64-63.999L64,398.003L64,398.003z"/>
	<path d="M78.648,483.088L67.401,462l11.245-21.086c0.78-1.462,0.227-3.279-1.235-4.059c-1.463-0.78-3.28-0.227-4.059,1.235l-9.351,17.535l-9.353-17.537c-0.781-1.463-2.599-2.015-4.059-1.235c-1.462,0.78-2.015,2.597-1.235,4.059L60.601,462l-11.244,21.084c-0.78,1.462-0.227,3.279,1.235,4.059c0.45,0.24,0.933,0.354,1.409,0.354c1.072,0,2.11-0.577,2.649-1.589l9.35-17.533l9.353,17.537c0.54,1.013,1.577,1.589,2.649,1.589c0.477,0,0.96-0.114,1.409-0.354C78.875,486.367,79.428,484.55,78.648,483.088z"/>
</g>
<g k:spriteid="waitStep" k:groupid="Bpmn" class="bpmn" id="waitStepRect">
        <path fill="url(#SVGID_8_)" d="M921.001,158c-3.859,0-7-3.14-7-7V9c0-3.86,3.141-7,7-7h338c3.859,0,7,3.14,7,7v142c0,3.86-3.141,7-7,7H921.001z"/>
        <path fill="#808080" d="M1259.001,4c2.757,0,5,2.243,5,5v142c0,2.757-2.243,5-5,5h-338c-2.757,0-5-2.243-5-5V9c0-2.757,2.243-5,5-5H1259.001 M1259.001,0h-338c-4.95,0-9,4.05-9,9v142c0,4.95,4.05,9,9,9h338c4.95,0,9-4.05,9-9V9C1268.001,4.05,1263.951,0,1259.001,0L1259.001,0z"/>
</g>
<g k:spriteid="recordActionStep" k:groupid="Bpmn" class="bpmn" id="recordActionStepRect">
		<polygon fill="url(#SVGID_2_)" points="2.829,462.002 64,400.831 125.174,461.998 64.002,523.169 "/>
</g>


</svg>
;
		
		
}
}