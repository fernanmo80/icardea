package tr.com.srdc.icardea.control
{
	import tr.com.srdc.icardea.model.userRoles.Person;
	
	public interface EmailControl
	{		
		function sendEmail(person:Person):void;
	}
}