package tr.com.srdc.icardea.api
{

	import mx.collections.ArrayCollection;

	[RemoteClass(alias="tr.com.srdc.icardea.careplan.pojo.PersonalizedMedicalCareplan")]
	[Bindable]
	public class PersonalizedMedicalCareplan 
	{
		public var id:int;
		public var content:String;
		public var diagramContent:String;
		public var identifier:String;
		public var creationDate:Date;
		public var name:String;
		public var patient:Patient;
		public var medicalcareplantemplate:MedicalCareplanTemplate;
		//public var personalizedMedicalCareplanInstance:ArrayCollection = new ArrayCollection();
		
		public function PersonalizedMedicalCareplan(){
		
		}
	}
}