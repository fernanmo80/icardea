package tr.com.srdc.icardea.api
{
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="tr.com.srdc.icardea.careplan.pojo.MedicalCareplanTemplate")]
	[Bindable]
	public class MedicalCareplanTemplate 
	{
		public var id:int;
		public var content:String;
		public var diagramContent:String;
		public var identifier:String;
		public var approved:Boolean;
		public var iCD10Code:String;
		public var creationDate:Date;
		public var name:String;
		//public var personalizedMedicalCareplan:ArrayCollection = new ArrayCollection();
		
		public function MedicalCareplanTemplate(){
		
		}
	}
}