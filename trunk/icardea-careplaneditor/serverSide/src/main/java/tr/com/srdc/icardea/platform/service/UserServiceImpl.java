package tr.com.srdc.icardea.platform.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.context.SecurityContextHolder;

import tr.com.srdc.icardea.platform.dao.ContactDao;
import tr.com.srdc.icardea.platform.dao.OrganizationDao;
import tr.com.srdc.icardea.platform.dao.PersonDao;
import tr.com.srdc.icardea.platform.model.Person;
import tr.com.srdc.icardea.platform.model.Organization;
import flex.messaging.FlexContext;

public class UserServiceImpl implements UserService {
	private PersonDao personDao;
	private OrganizationDao organizationDao;
	private ContactDao contactDao;

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	public void setOrganizationDao(OrganizationDao organizationDao) {
		this.organizationDao = organizationDao;
	}
	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}
	
	public List<Person> getPersons() {
		return personDao.findAll();		
	}

	public List<Person> addPerson(Person user) {
		personDao.merge(user);
		/*EmailService emailService = new EmailServiceImpl();
		emailService.sendEmail(user);*/
		return getPersons();
	}

	public Person updatePerson(Person person) {
		Person p = getPersonByUsername(person.getUsername());
		p.setName(person.getName());
		p.setMiddleName(person.getMiddleName());
		p.setSurname(person.getSurname());
		p.setOrganization(person.getOrganization());
		p.setContact(person.getContact());
		p.setTitle(person.getTitle());
	
		personDao.merge(p);
		return person;

	}


	public Person getPersonByUsername(String username) {
		return personDao.findByUsername(username);
	}
	
	public String getRoleByUsername(String username) {
		return personDao.findRoleByUsername(username);
	}

	public Boolean checkPerson(String username) {
		Person person = personDao.findByUsername(username);
		if(person == null){
			return false;
		}else{
			return true;
		}
	}
	
	public List<Person> removePersonByUsername(String username){
		Person person = personDao.findByUsername(username);
		personDao.delete(person);
		return personDao.findAll();
	}
	
	public List<Organization> getOrganizations() {
		return organizationDao.findAll();
	}
	
	public String doLogin() {
		String username = "unknown";
		try {
			//Get php session info from here
			
		} catch (RuntimeException e) {
			// dosomething like logging
		}
		System.out.println("username: "+username);
		return username;
	}
	
	public void doLogout() {
		String username = "unknown";
		try {
			// php session related issues
			
			
//			username = SecurityContextHolder.getContext().getAuthentication().getName();
//			FlexContext.setUserPrincipal(null);
//			FlexContext.getHttpRequest().getSession().invalidate();
//			FlexContext.getFlexSession().invalidate();
//			SecurityContextHolder.clearContext();
		} catch (RuntimeException e) {
			// dosomething like logging
		}
	}
}