package tr.com.srdc.icardea.api
{

	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="tr.com.srdc.icardea.careplan.pojo.PersonalizedMedicalCareplan")]
	[Bindable]
	public class PersonalizedMedicalCareplanInstance 
	{
		public var id:int;
		public var content:String;
		public var identifier:String;
		public var instantiationDate:Date;
		public var personalizedMedicalCareplan:PersonalizedMedicalCareplan;
	}
}