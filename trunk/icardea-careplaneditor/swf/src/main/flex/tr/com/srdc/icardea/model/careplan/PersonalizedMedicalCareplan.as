
package tr.com.srdc.icardea.model.careplan{
	
	[RemoteClass(alias="tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan")]
	[Bindable]
	public class PersonalizedMedicalCareplan{
		public function PersonalizedMedicalCareplan(){
			
		}
		public  var ID:int;
		public  var content:String;
		public  var identifier:String;
		public  var name:String;
		public  var ICD10Code:String;
		public  var patientIdentifier:String;
		

		
		}
}
