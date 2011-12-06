package tr.com.srdc.icardea.careplan.pojo
{
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="tr.com.srdc.icardea.careplan.pojo.Patient")]
	[Bindable]
	public class Patient
	{
	
		public var administrativeSex : String
		public var assigningAuthority : String
		public var citizenshipNumber : String
		public var city : String
		public var country : String
		public var dateTimeOfBirth : Date
		public var familyName : String
		public var givenName : String
		public var id : Number
		public var identifierTypeCode : String
		public var personalizedmedicalcareplans : ArrayCollection
		public var postalCode : String
		public var secondName : String
		public var street : String
		
		
		public function Patient()
		{
			
		}

	}
}