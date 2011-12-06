package tr.com.srdc.icardea.platform.dao.hibernate;

import tr.com.srdc.icardea.platform.dao.OrganizationDao;
import tr.com.srdc.icardea.platform.model.Organization;

public class OrganizationDaoImpl extends BaseHibernateDao<Organization,String> implements OrganizationDao {

	public OrganizationDaoImpl() {
		super(Organization.class);
	}
}
