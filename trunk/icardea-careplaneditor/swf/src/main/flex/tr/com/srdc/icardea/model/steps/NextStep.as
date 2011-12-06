
package tr.com.srdc.icardea.model.steps{
	[Bindable]
	[XmlClass(alias="NextStep")]
	public class NextStep{
		public function NextStep(){
			
			
		}

		[XmlElement(alias="EvaluationScript")]
		public  var evaluationScript : String ;
		[XmlAttribute]	
		public  var ref : String ;
		[XmlAttribute]	
		public  var name : String ;
		}
}

