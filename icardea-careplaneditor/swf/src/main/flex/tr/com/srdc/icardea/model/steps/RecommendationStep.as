
package tr.com.srdc.icardea.model.steps{
	import mx.collections.ArrayCollection;
	import tr.com.srdc.icardea.model.htmlEditor.Display;
	import tr.com.srdc.icardea.model.userRoles.Receiver;
	
	[Bindable]
	[XmlClass(alias="RecommendationStep", ordered="true")]
	public class RecommendationStep{
		public function RecommendationStep(){
			
		}

		public  var ownName : String = "recommendationStep";
		
		[XmlAttribute(alias="ID")]	
		public  var id : String = "";
		[XmlAttribute]
		public  var name : String = "";
		[XmlElement(alias="Receiver", order="1")]
        public  var receiver : Receiver = new Receiver;
        [XmlElement(alias="Urgency", order="2")]
		public  var urgency : String = "";
        [XmlElement(alias="Display", order="3")]
		public  var display : Display = new Display;
		[XmlArray(alias="*", order="3", type = "tr.com.srdc.icardea.model.steps.NextStep")]
		public  var nextStep : ArrayCollection = new ArrayCollection;
		}
}

