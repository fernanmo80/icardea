
package tr.com.srdc.icardea.model.careplan{
	import tr.com.srdc.icardea.model.mainStructure.Body;
	import tr.com.srdc.icardea.model.mainStructure.Header;
	
	[RemoteClass(alias="tr.com.srdc.icardea.platform.model.careplan.MedicalCareplan")]
	[Bindable]
	[XmlClass(alias="MedicalCareplan")]
	public class MedicalCareplan{
		public function MedicalCareplan(){
			
		}

		[XmlElement(alias="Body")]	
		public  var body : Body = new Body;
		[XmlElement(alias="Header")]	
		public  var header : Header = new Header;
		[XmlAttribute(alias="ID")]	
		public  var id : String = "";
		[XmlAttribute(alias="Status")]	
		public  var status : String = "no";
		[XmlAttribute(alias="name")]	
		public  var name : String = "";
		[XmlAttribute(alias="version")]	
		public  var version : String = "";
		//Non-XML field
		public var diagram: String = "";
		//Non-XML field
		public var careplan: String = "";
		public var url: String = "";
		}
}
