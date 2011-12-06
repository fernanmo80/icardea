package tr.com.srdc.icardea.platform.dao;

import tr.com.srdc.icardea.platform.model.Person;

public interface PersonDao extends GenericDao<Person, String> {
	Person findByUsername(String username);
	String findRoleByUsername(String username);
}
