package tr.com.srdc.icardea.api
{
	
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="tr.com.srdc.icardea.careplan.pojo.Patient")]
	[Bindable]
	public class Patient 
	{
		public var id:int;
		public var assigningAuthority:String;
		public var identifierTypeCode:String;
		public var givenName:String;
		public var familyName:String;
		public var secondName:String;
		public var dateTimeOfBirth:String;
		public var administrativeSex:String;
		public var street:String;
		public var city:String;
		public var postalCode:String;
		public var country:String;
		public var patientIdentifer:String;
		public var citizenshipNumber:String;
		//public var _eHRPHRData:ArrayCollection = new ArrayCollection();
		//public var _cIEDData1:ArrayCollection = new ArrayCollection();
		
		public function Patient(){
		}
	}
	
	
}