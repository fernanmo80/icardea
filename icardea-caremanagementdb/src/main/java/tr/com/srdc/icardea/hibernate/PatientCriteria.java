/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Gokce  Laleci
 * License Type: Evaluation
 */
package tr.com.srdc.icardea.hibernate;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PatientCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression assigningAuthority;
	public final StringExpression identifierTypeCode;
	public final StringExpression givenName;
	public final StringExpression familyName;
	public final StringExpression secondName;
	public final StringExpression dateTimeOfBirth;
	public final StringExpression administrativeSex;
	public final StringExpression street;
	public final StringExpression city;
	public final StringExpression postalCode;
	public final StringExpression country;
	public final StringExpression patientIdentifier;
	public final StringExpression citizenshipNumber;
	
	public PatientCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		assigningAuthority = new StringExpression("assigningAuthority", this);
		identifierTypeCode = new StringExpression("identifierTypeCode", this);
		givenName = new StringExpression("givenName", this);
		familyName = new StringExpression("familyName", this);
		secondName = new StringExpression("secondName", this);
		dateTimeOfBirth = new StringExpression("dateTimeOfBirth", this);
		administrativeSex = new StringExpression("administrativeSex", this);
		street = new StringExpression("street", this);
		city = new StringExpression("city", this);
		postalCode = new StringExpression("postalCode", this);
		country = new StringExpression("country", this);
		patientIdentifier = new StringExpression("patientIdentifier", this);
		citizenshipNumber = new StringExpression("citizenshipNumber", this);
	}
	
	public PatientCriteria(PersistentSession session) {
		this(session.createCriteria(Patient.class));
	}
	
	public PatientCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public EHRPHRDataCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataCriteria(createCriteria("ORM_eHRPHRData"));
	}
	
	public CIEDDataCriteria createCIEDData1Criteria() {
		return new CIEDDataCriteria(createCriteria("ORM_cIEDData1"));
	}
	
	public Patient uniquePatient() {
		return (Patient) super.uniqueResult();
	}
	
	public Patient[] listPatient() {
		java.util.List list = super.list();
		return (Patient[]) list.toArray(new Patient[list.size()]);
	}
}

