
package  tr.com.srdc.icardea.model.htmlEditor{
	
	
	[Bindable]
	[XmlClass(alias="HTML")]
	public class HTML{
		public function HTML(){
			
		}

		[XmlElement(alias="head")]
		public  var head : String = "<head></head>";  
		[XmlElement(alias="body")]
		public  var body :String;
	
		}
}



