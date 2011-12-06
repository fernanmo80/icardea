
package tr.com.srdc.icardea.model.steps{	
	import mx.collections.ArrayCollection;
	
	import tr.com.srdc.icardea.model.htmlEditor.Display;
		
	[Bindable]
	[XmlClass(alias="ConsultStep", ordered="true")]
	public class ConsultStep{
		public function ConsultStep(){
			
		}
		
		
		public  var ownName : String = "consultStep";
		
		[XmlAttribute(alias="ID")]		
		public  var id : String = "";
		[XmlAttribute]	
		public  var name : String = "";
		[XmlArray(alias="*", order="1", type = "tr.com.srdc.icardea.model.variables.Variable")]
		public  var variable : ArrayCollection = new  ArrayCollection;
		[XmlElement(alias="Display", order="2")]
		public  var display : Display = new Display;
		[XmlArray(alias="*", order="3", type = "tr.com.srdc.icardea.model.steps.NextStep")]
		public  var nextStep : ArrayCollection = new ArrayCollection;
		}
}