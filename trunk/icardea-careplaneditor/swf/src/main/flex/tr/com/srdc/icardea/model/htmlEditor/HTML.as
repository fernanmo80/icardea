
package  tr.com.srdc.icardea.model.htmlEditor{
	
	
	[Bindable]
	[XmlClass(alias="HTML", ordered="true")]
	public class HTML{
		public function HTML(){
			
		}

		[XmlElement(alias="head", order="1")]
		public  var head : XML = new XML();
		[XmlElement(alias="body", order="2")]
		public  var body :XML;
	
		}
}



