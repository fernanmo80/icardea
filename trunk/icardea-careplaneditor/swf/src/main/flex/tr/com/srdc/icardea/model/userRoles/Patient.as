
package tr.com.srdc.icardea.model.userRoles{
	import mx.collections.ArrayCollection;
	
	import tr.com.srdc.icardea.model.userControl.Contact;
	import tr.com.srdc.icardea.model.userControl.ID;
	import tr.com.srdc.icardea.model.userControl.Organization;
	[RemoteClass(alias="tr.com.srdc.icardea.platform.model.Patient")]
	[Bindable]
	[XmlClass(alias="Patient")]
	public class Patient{
		public function Patient(){
			
		}
		
		public var dateOfBirth : String = "";
		public var gender : String = "";
		public var initialDiagnosis : String = "";
		public var idList:ArrayCollection = new ArrayCollection;
		public var ehrSubscriptions:ArrayCollection = new ArrayCollection;
		public var phrSubscriptions:ArrayCollection = new ArrayCollection;
		public var assignedCareplans:ArrayCollection = new ArrayCollection;
		public var urgencyLevelForHCactor:String;
		public var caregivers:ArrayCollection = new ArrayCollection;
		public var isSelected:Boolean = false;
	
		public var contact:Contact = new Contact();
		
		[XmlElement(alias="ID")]	
		public  var id : ID = new ID; // <ID schemeID="TCKN">14920263556</ID>
		[XmlElement(alias="Middlename")]	
		public  var middlename : String = "";
		[XmlElement(alias="Name")]	
		public  var name : String = "";
		[XmlElement(alias="Organization")]	
		public  var organization : Organization = new Organization;
		[XmlAttribute(alias="personID")]
		public  var personID : String = "";
		[XmlElement(alias="Surname")]	
		public  var surname : String = "";
		
		}
}

