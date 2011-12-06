package tr.com.srdc.icardea.platform.dao.hibernate;

import tr.com.srdc.icardea.platform.dao.PersonDao;
import tr.com.srdc.icardea.platform.model.Person;

public class PersonDaoImpl extends BaseHibernateDao<Person,String> implements PersonDao {

	public PersonDaoImpl() {
		super(Person.class);
	}
	
	public Person findByUsername(String username) {
		String HQL = "from Person p where p.username = ?";
		return (Person) getHibernateTemplate().find(HQL,username).get(0);		
	}

	public String findRoleByUsername(String username) {
		String HQL = "select p.role from Person p where p.username =:username";
		return getSession().createQuery(HQL).setString("username", username).uniqueResult().toString();
		//return  (String) getHibernateTemplate().find(HQL,username).get(0);		
	}
}
