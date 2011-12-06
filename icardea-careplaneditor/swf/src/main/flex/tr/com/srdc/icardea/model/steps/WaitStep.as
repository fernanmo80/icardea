
package tr.com.srdc.icardea.model.steps{
	import tr.com.srdc.icardea.model.steps.recordAction.Duration;
	import tr.com.srdc.icardea.model.steps.recordAction.EventAction;
	import tr.com.srdc.icardea.model.steps.NextStep;
	
	[Bindable]
    [XmlClass(alias="WaitStep")]
     public class WaitStep{
		public function WaitStep(){
			
		}
	
		public var ownName:String = "waitStep";
		
		[XmlAttribute(alias="ID")]		
		public var id : String = "";	
		[XmlAttribute(alias="name")]		
		public var name : String = "";		
		[XmlElement(alias="NextStep")]
		public var nextStep : NextStep = new NextStep;		
		[XmlElement(alias="Event")]
		public var eventAction : EventAction;//only one event	
		[XmlElement(alias="Duration")]
		public var duration : Duration;//only one duration
		
		}
}

