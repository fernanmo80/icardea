
package tr.com.srdc.icardea.model.steps{
	import tr.com.srdc.icardea.model.steps.NextStep;
	
	[Bindable]
    [XmlClass(alias="StartStep")]
     public class StartStep{
		public function StartStep(){
			
		}
	
		public var ownName:String = "startStep";
		
		[XmlAttribute(alias="ID")]		
		public var id : String = "";		
		[XmlElement(alias="NextStep")]
		public var nextStep : NextStep = new NextStep;
		public var name : String = "Guideline Starts!";	
		
		}
}