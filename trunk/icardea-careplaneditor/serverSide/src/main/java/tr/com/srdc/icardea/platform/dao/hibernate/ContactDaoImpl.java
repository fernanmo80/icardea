package tr.com.srdc.icardea.platform.dao.hibernate;

import tr.com.srdc.icardea.platform.dao.ContactDao;
import tr.com.srdc.icardea.platform.model.Contact;

public class ContactDaoImpl extends BaseHibernateDao<Contact,String> implements ContactDao {

	public ContactDaoImpl() {
		super(Contact.class);
	}
}
