
package tr.com.srdc.icardea.model.steps{
	import mx.collections.ArrayCollection;
	
	[Bindable]
	[XmlClass(alias="EligibilityCriteria")]
	public class EligibilityCriteria{
		public function EligibilityCriteria(){
			/* ctor not implemented */
		}

		
		public  var ownName : String = "eligibilityCriteria";
		
		[XmlElement(alias="EvaluationScript")]
		public  var evaluationScript : String = "function EligibleToGuidelineCriterion() { return true; }";
		[XmlArray(alias="*", type = "tr.com.srdc.icardea.model.variables.Variable")]
		public  var variable : ArrayCollection = new ArrayCollection;
		}
}

