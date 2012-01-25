package tr.com.srdc.icardea.platform.service.user;

import java.util.List;

import tr.com.srdc.icardea.platform.model.Person;
import tr.com.srdc.icardea.platform.model.Organization;

public interface UserService {
	List<Person> getPersons();

	List<Person> addPerson(Person person);

	Person getPersonByUsername(String username);
	
	String getRoleByUsername(String username);
	
	Boolean checkPerson(String username);
	
	List<Person> removePersonByUsername(String username);
	
	List<Organization> getOrganizations();

	void doLogout();
}