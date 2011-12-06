
package tr.com.srdc.icardea.model.mainStructure{
	import tr.com.srdc.icardea.model.steps.EligibilityCriteria;
	[Bindable]
	[XmlClass(alias="Body", ordered="true")]
	public class Body{
		public function Body(){
			
		}

		[XmlElement(alias="Algorithm", order="2")]
		public  var algorithm : Algorithm = new Algorithm;
		[XmlElement(alias="EligibilityCriteria", order="1")]
		public  var eligibilityCriteria : EligibilityCriteria = new EligibilityCriteria;
		}
}

