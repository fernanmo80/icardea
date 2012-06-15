
package tr.com.srdc.icardea.model.careplan{
	import tr.com.srdc.icardea.model.mainStructure.Body;
	import tr.com.srdc.icardea.model.mainStructure.Header;
	
	[RemoteClass(alias="tr.com.srdc.icardea.platform.model.careplan.MedicalCareplan")]
	[Bindable]
	[XmlClass(alias="MedicalCareplan", ordered="true")]
	public class MedicalCareplan{
		public function MedicalCareplan(){
			
		}

		[XmlElement(alias="Body", order="2")]	
		public  var body : Body = new Body;
		[XmlElement(alias="Header", order="1")]	
		public  var header : Header = new Header;
		[XmlAttribute(alias="ID")]	
		public  var id : String = "";
		[XmlAttribute(alias="status")]	
		public  var status : String;
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
