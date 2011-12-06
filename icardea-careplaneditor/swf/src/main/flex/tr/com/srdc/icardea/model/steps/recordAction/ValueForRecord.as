
package tr.com.srdc.icardea.model.steps.recordAction{
	
	[Bindable]
	[XmlClass(alias="ValueForRecord")]
	public class ValueForRecord{
		public function ValueForRecord(){
			
		}
		[XmlAttribute(alias="text")]	
		public  var text : String = "";
		
		[XmlElement(alias="DUMY", ignoreOn="serialize")]	
		public  var fname : String;
				
		}
}

