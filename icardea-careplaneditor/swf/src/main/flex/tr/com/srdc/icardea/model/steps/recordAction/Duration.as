
package tr.com.srdc.icardea.model.steps.recordAction{
	
	[Bindable]
    [XmlClass(alias="Duration")]
     public class Duration{
		public function Duration(){
			
		}
	
		public var ownName:String = "duration";
		
		[XmlAttribute(alias="unit")]		
		public  var unit : String = "";
		[XmlAttribute(alias="amount")]	
		public  var amount : String = "";
	
		}
}

