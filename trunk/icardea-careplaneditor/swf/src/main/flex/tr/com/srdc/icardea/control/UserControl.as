package tr.com.srdc.icardea.control
{
	import tr.com.srdc.icardea.model.userRoles.Person;
	
	public interface UserControl{
		function addPerson(person:Person) : void;
		function updatePerson(person:Person) : void;
		function getPersons() : void;
		function getPersonByUsername(username:String) : void;
		function removePersonByUsername(username:String) : void;
		function getOrganizations() : void;
		function doLogout() : void;
	}
}