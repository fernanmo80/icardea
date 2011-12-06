
package tr.com.srdc.icardea.model.mainStructure{
	import tr.com.srdc.icardea.model.userRoles.CareplanReviewer;
	import tr.com.srdc.icardea.model.userRoles.HealthcareActor;
	import tr.com.srdc.icardea.model.userRoles.MedicalDomainExpert;
	import tr.com.srdc.icardea.model.userRoles.Patient;
	import tr.com.srdc.icardea.model.userControl.History;
	
	[Bindable]
	[XmlClass(alias="Header")]
	public class Header{
		public function Header(){
			
		}

		[XmlElement(alias="CareplanReviewer")]	
		public  var careplanReviewer:CareplanReviewer = new CareplanReviewer;
		[XmlElement(alias="HealthcareActor")]	
		public  var healthcareActor : HealthcareActor = new HealthcareActor;
		[XmlElement(alias="History")]	
		public  var history : History = new History;
		[XmlElement(alias="MedicalDomainExpert")]	
		public  var medicalDomainExpert : MedicalDomainExpert = new MedicalDomainExpert;
		[XmlElement(alias="Patient")]	
		public  var patient : Patient =new Patient;
		
		[XmlElement(alias="CreatedBy")]	
		public  var createdBy : String = "";
		[XmlElement(alias="ApprovedBy")]	
    	public  var approvedBy : String = "";
    	[XmlElement(alias="PersonalizedBy")]	
    	public  var personalizedBy : String = "";
    	[XmlElement(alias="PersonalizedForPatient")]	
    	public  var personalizedForPatient : String = "";

    	
		}
}

