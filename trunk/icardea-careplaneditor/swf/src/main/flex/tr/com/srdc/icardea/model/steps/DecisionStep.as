
package tr.com.srdc.icardea.model.steps{
	import mx.collections.ArrayCollection;
	
	[Bindable]
	[XmlClass(alias="DecisionStep", ordered="true")]
	public class DecisionStep{
		public function DecisionStep(){
			
		}
		
		public  var ownName : String = "decisionStep";
		
		[XmlAttribute(alias="ID")]	
		public  var id : String = "";
		[XmlAttribute]	
		public  var name : String = "";
		[XmlArray(alias="*", order="1", type = "tr.com.srdc.icardea.model.variables.Variable")]
		public  var variable : ArrayCollection = new ArrayCollection; //no refinement script in variable
		[XmlArray(alias="*", order="2", type = "tr.com.srdc.icardea.model.steps.NextStep")]
		public  var nextStep : ArrayCollection = new ArrayCollection; 
		}
}