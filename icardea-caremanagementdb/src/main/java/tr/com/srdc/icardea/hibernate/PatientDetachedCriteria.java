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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PatientDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public PatientDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.Patient.class, tr.com.srdc.icardea.hibernate.PatientCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		assigningAuthority = new StringExpression("assigningAuthority", this.getDetachedCriteria());
		identifierTypeCode = new StringExpression("identifierTypeCode", this.getDetachedCriteria());
		givenName = new StringExpression("givenName", this.getDetachedCriteria());
		familyName = new StringExpression("familyName", this.getDetachedCriteria());
		secondName = new StringExpression("secondName", this.getDetachedCriteria());
		dateTimeOfBirth = new StringExpression("dateTimeOfBirth", this.getDetachedCriteria());
		administrativeSex = new StringExpression("administrativeSex", this.getDetachedCriteria());
		street = new StringExpression("street", this.getDetachedCriteria());
		city = new StringExpression("city", this.getDetachedCriteria());
		postalCode = new StringExpression("postalCode", this.getDetachedCriteria());
		country = new StringExpression("country", this.getDetachedCriteria());
		patientIdentifier = new StringExpression("patientIdentifier", this.getDetachedCriteria());
		citizenshipNumber = new StringExpression("citizenshipNumber", this.getDetachedCriteria());
	}
	
	public PatientDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.PatientCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		assigningAuthority = new StringExpression("assigningAuthority", this.getDetachedCriteria());
		identifierTypeCode = new StringExpression("identifierTypeCode", this.getDetachedCriteria());
		givenName = new StringExpression("givenName", this.getDetachedCriteria());
		familyName = new StringExpression("familyName", this.getDetachedCriteria());
		secondName = new StringExpression("secondName", this.getDetachedCriteria());
		dateTimeOfBirth = new StringExpression("dateTimeOfBirth", this.getDetachedCriteria());
		administrativeSex = new StringExpression("administrativeSex", this.getDetachedCriteria());
		street = new StringExpression("street", this.getDetachedCriteria());
		city = new StringExpression("city", this.getDetachedCriteria());
		postalCode = new StringExpression("postalCode", this.getDetachedCriteria());
		country = new StringExpression("country", this.getDetachedCriteria());
		patientIdentifier = new StringExpression("patientIdentifier", this.getDetachedCriteria());
		citizenshipNumber = new StringExpression("citizenshipNumber", this.getDetachedCriteria());
	}
	
	public EHRPHRDataDetachedCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataDetachedCriteria(createCriteria("ORM_EHRPHRData"));
	}
	
	public CIEDDataDetachedCriteria createCIEDData1Criteria() {
		return new CIEDDataDetachedCriteria(createCriteria("ORM_CIEDData1"));
	}
	
	public Patient uniquePatient(PersistentSession session) {
		return (Patient) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Patient[] listPatient(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Patient[]) list.toArray(new Patient[list.size()]);
	}
}

