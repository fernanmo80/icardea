/**
 * Licensee: Gokce  Laleci
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateICardeaData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession().beginTransaction();
		try {
			tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate ltrcomsrdcicardeahibernateMedicalCareplanTemplate = tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate.loadMedicalCareplanTemplateByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateMedicalCareplanTemplate.save();
			tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan ltrcomsrdcicardeahibernatePersonalizedMedicalCareplan = tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan.loadPersonalizedMedicalCareplanByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernatePersonalizedMedicalCareplan.save();
			tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance ltrcomsrdcicardeahibernatePersonalizedMedicalCareplanInstance = tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance.loadPersonalizedMedicalCareplanInstanceByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernatePersonalizedMedicalCareplanInstance.save();
			tr.com.srdc.icardea.hibernate.Contact ltrcomsrdcicardeahibernateContact = tr.com.srdc.icardea.hibernate.Contact.loadContactByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateContact.save();
			tr.com.srdc.icardea.hibernate.Organization ltrcomsrdcicardeahibernateOrganization = tr.com.srdc.icardea.hibernate.Organization.loadOrganizationByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateOrganization.save();
			tr.com.srdc.icardea.hibernate.Person ltrcomsrdcicardeahibernatePerson = tr.com.srdc.icardea.hibernate.Person.loadPersonByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernatePerson.save();
			tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment ltrcomsrdcicardeahibernatePatientHealthcareActorAssignment = tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment.loadPatientHealthcareActorAssignmentByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernatePatientHealthcareActorAssignment.save();
			tr.com.srdc.icardea.hibernate.CIEDData ltrcomsrdcicardeahibernateCIEDData = tr.com.srdc.icardea.hibernate.CIEDData.loadCIEDDataByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateCIEDData.save();
			tr.com.srdc.icardea.hibernate.Patient ltrcomsrdcicardeahibernatePatient = tr.com.srdc.icardea.hibernate.Patient.loadPatientByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernatePatient.save();
			tr.com.srdc.icardea.hibernate.Observation ltrcomsrdcicardeahibernateObservation = tr.com.srdc.icardea.hibernate.Observation.loadObservationByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateObservation.save();
			tr.com.srdc.icardea.hibernate.EHRPHRData ltrcomsrdcicardeahibernateEHRPHRData = tr.com.srdc.icardea.hibernate.EHRPHRData.loadEHRPHRDataByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateEHRPHRData.save();
			tr.com.srdc.icardea.hibernate.VitalSign ltrcomsrdcicardeahibernateVitalSign = tr.com.srdc.icardea.hibernate.VitalSign.loadVitalSignByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateVitalSign.save();
			tr.com.srdc.icardea.hibernate.Concern ltrcomsrdcicardeahibernateConcern = tr.com.srdc.icardea.hibernate.Concern.loadConcernByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateConcern.save();
			tr.com.srdc.icardea.hibernate.ImagingResult ltrcomsrdcicardeahibernateImagingResult = tr.com.srdc.icardea.hibernate.ImagingResult.loadImagingResultByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateImagingResult.save();
			tr.com.srdc.icardea.hibernate.Medication ltrcomsrdcicardeahibernateMedication = tr.com.srdc.icardea.hibernate.Medication.loadMedicationByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateMedication.save();
			tr.com.srdc.icardea.hibernate.Immunization ltrcomsrdcicardeahibernateImmunization = tr.com.srdc.icardea.hibernate.Immunization.loadImmunizationByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateImmunization.save();
			tr.com.srdc.icardea.hibernate.Encounter ltrcomsrdcicardeahibernateEncounter = tr.com.srdc.icardea.hibernate.Encounter.loadEncounterByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateEncounter.save();
			tr.com.srdc.icardea.hibernate.Procedure ltrcomsrdcicardeahibernateProcedure = tr.com.srdc.icardea.hibernate.Procedure.loadProcedureByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateProcedure.save();
			tr.com.srdc.icardea.hibernate.Problem ltrcomsrdcicardeahibernateProblem = tr.com.srdc.icardea.hibernate.Problem.loadProblemByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateProblem.save();
			tr.com.srdc.icardea.hibernate.PG ltrcomsrdcicardeahibernatePG = tr.com.srdc.icardea.hibernate.PG.loadPGByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernatePG.save();
			tr.com.srdc.icardea.hibernate.LEAD2 ltrcomsrdcicardeahibernateLEAD2 = tr.com.srdc.icardea.hibernate.LEAD2.loadLEAD2ByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateLEAD2.save();
			tr.com.srdc.icardea.hibernate.SESS ltrcomsrdcicardeahibernateSESS = tr.com.srdc.icardea.hibernate.SESS.loadSESSByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateSESS.save();
			tr.com.srdc.icardea.hibernate.MSMT ltrcomsrdcicardeahibernateMSMT = tr.com.srdc.icardea.hibernate.MSMT.loadMSMTByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateMSMT.save();
			tr.com.srdc.icardea.hibernate.BATTERY2 ltrcomsrdcicardeahibernateBATTERY2 = tr.com.srdc.icardea.hibernate.BATTERY2.loadBATTERY2ByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateBATTERY2.save();
			tr.com.srdc.icardea.hibernate.CAP ltrcomsrdcicardeahibernateCAP = tr.com.srdc.icardea.hibernate.CAP.loadCAPByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateCAP.save();
			tr.com.srdc.icardea.hibernate.SENSINGMSMT ltrcomsrdcicardeahibernateSENSINGMSMT = tr.com.srdc.icardea.hibernate.SENSINGMSMT.loadSENSINGMSMTByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateSENSINGMSMT.save();
			tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD ltrcomsrdcicardeahibernatePACINGTHRESHOLD = tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD.loadPACINGTHRESHOLDByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernatePACINGTHRESHOLD.save();
			tr.com.srdc.icardea.hibernate.IMPEDANCE ltrcomsrdcicardeahibernateIMPEDANCE = tr.com.srdc.icardea.hibernate.IMPEDANCE.loadIMPEDANCEByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateIMPEDANCE.save();
			tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT ltrcomsrdcicardeahibernateLEADHVCHANNELMSMT = tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT.loadLEADHVCHANNELMSMTByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateLEADHVCHANNELMSMT.save();
			tr.com.srdc.icardea.hibernate.SET ltrcomsrdcicardeahibernateSET = tr.com.srdc.icardea.hibernate.SET.loadSETByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateSET.save();
			tr.com.srdc.icardea.hibernate.CRTSET ltrcomsrdcicardeahibernateCRTSET = tr.com.srdc.icardea.hibernate.CRTSET.loadCRTSETByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateCRTSET.save();
			tr.com.srdc.icardea.hibernate.MAGNET ltrcomsrdcicardeahibernateMAGNET = tr.com.srdc.icardea.hibernate.MAGNET.loadMAGNETByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateMAGNET.save();
			tr.com.srdc.icardea.hibernate.PACING ltrcomsrdcicardeahibernatePACING = tr.com.srdc.icardea.hibernate.PACING.loadPACINGByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernatePACING.save();
			tr.com.srdc.icardea.hibernate.SHOCKVECTOR ltrcomsrdcicardeahibernateSHOCKVECTOR = tr.com.srdc.icardea.hibernate.SHOCKVECTOR.loadSHOCKVECTORByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateSHOCKVECTOR.save();
			tr.com.srdc.icardea.hibernate.BRADYSET ltrcomsrdcicardeahibernateBRADYSET = tr.com.srdc.icardea.hibernate.BRADYSET.loadBRADYSETByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateBRADYSET.save();
			tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET ltrcomsrdcicardeahibernateTACHYTHERAPYSET = tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET.loadTACHYTHERAPYSETByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateTACHYTHERAPYSET.save();
			tr.com.srdc.icardea.hibernate.ZONE ltrcomsrdcicardeahibernateZONE = tr.com.srdc.icardea.hibernate.ZONE.loadZONEByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateZONE.save();
			tr.com.srdc.icardea.hibernate.HEART_RATE ltrcomsrdcicardeahibernateHEART_RATE = tr.com.srdc.icardea.hibernate.HEART_RATE.loadHEART_RATEByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateHEART_RATE.save();
			tr.com.srdc.icardea.hibernate.AT ltrcomsrdcicardeahibernateAT = tr.com.srdc.icardea.hibernate.AT.loadATByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateAT.save();
			tr.com.srdc.icardea.hibernate.EPISODESTAT ltrcomsrdcicardeahibernateEPISODESTAT = tr.com.srdc.icardea.hibernate.EPISODESTAT.loadEPISODESTATByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateEPISODESTAT.save();
			tr.com.srdc.icardea.hibernate.LEADCHNLMSMT ltrcomsrdcicardeahibernateLEADCHNLMSMT = tr.com.srdc.icardea.hibernate.LEADCHNLMSMT.loadLEADCHNLMSMTByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateLEADCHNLMSMT.save();
			tr.com.srdc.icardea.hibernate.STAT ltrcomsrdcicardeahibernateSTAT = tr.com.srdc.icardea.hibernate.STAT.loadSTATByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateSTAT.save();
			tr.com.srdc.icardea.hibernate.LEADCHNLSET ltrcomsrdcicardeahibernateLEADCHNLSET = tr.com.srdc.icardea.hibernate.LEADCHNLSET.loadLEADCHNLSETByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateLEADCHNLSET.save();
			tr.com.srdc.icardea.hibernate.SENSINGSET ltrcomsrdcicardeahibernateSENSINGSET = tr.com.srdc.icardea.hibernate.SENSINGSET.loadSENSINGSETByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateSENSINGSET.save();
			tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET ltrcomsrdcicardeahibernateLEADHVCHANNELSET = tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET.loadLEADHVCHANNELSETByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateLEADHVCHANNELSET.save();
			tr.com.srdc.icardea.hibernate.BRADYSTAT ltrcomsrdcicardeahibernateBRADYSTAT = tr.com.srdc.icardea.hibernate.BRADYSTAT.loadBRADYSTATByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateBRADYSTAT.save();
			tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT ltrcomsrdcicardeahibernateTACHYTHERAPYSTAT = tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT.loadTACHYTHERAPYSTATByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateTACHYTHERAPYSTAT.save();
			tr.com.srdc.icardea.hibernate.CRTSTAT ltrcomsrdcicardeahibernateCRTSTAT = tr.com.srdc.icardea.hibernate.CRTSTAT.loadCRTSTATByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateCRTSTAT.save();
			tr.com.srdc.icardea.hibernate.EPISODEROOT ltrcomsrdcicardeahibernateEPISODEROOT = tr.com.srdc.icardea.hibernate.EPISODEROOT.loadEPISODEROOTByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateEPISODEROOT.save();
			tr.com.srdc.icardea.hibernate.BinaryData ltrcomsrdcicardeahibernateBinaryData = tr.com.srdc.icardea.hibernate.BinaryData.loadBinaryDataByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateBinaryData.save();
			tr.com.srdc.icardea.hibernate.System ltrcomsrdcicardeahibernateSystem = tr.com.srdc.icardea.hibernate.System.loadSystemByQuery(null, null);
			// Update the properties of the persistent object
			ltrcomsrdcicardeahibernateSystem.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving MedicalCareplanTemplate by MedicalCareplanTemplateCriteria");
		tr.com.srdc.icardea.hibernate.MedicalCareplanTemplateCriteria medicalCareplanTemplateCriteria = new tr.com.srdc.icardea.hibernate.MedicalCareplanTemplateCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//medicalCareplanTemplateCriteria.ID.eq();
		System.out.println(medicalCareplanTemplateCriteria.uniqueMedicalCareplanTemplate());
		
		System.out.println("Retrieving PersonalizedMedicalCareplan by PersonalizedMedicalCareplanCriteria");
		tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanCriteria personalizedMedicalCareplanCriteria = new tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//personalizedMedicalCareplanCriteria.ID.eq();
		System.out.println(personalizedMedicalCareplanCriteria.uniquePersonalizedMedicalCareplan());
		
		System.out.println("Retrieving PersonalizedMedicalCareplanInstance by PersonalizedMedicalCareplanInstanceCriteria");
		tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstanceCriteria personalizedMedicalCareplanInstanceCriteria = new tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstanceCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//personalizedMedicalCareplanInstanceCriteria.ID.eq();
		System.out.println(personalizedMedicalCareplanInstanceCriteria.uniquePersonalizedMedicalCareplanInstance());
		
		System.out.println("Retrieving Contact by ContactCriteria");
		tr.com.srdc.icardea.hibernate.ContactCriteria contactCriteria = new tr.com.srdc.icardea.hibernate.ContactCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//contactCriteria.ID.eq();
		System.out.println(contactCriteria.uniqueContact());
		
		System.out.println("Retrieving Organization by OrganizationCriteria");
		tr.com.srdc.icardea.hibernate.OrganizationCriteria organizationCriteria = new tr.com.srdc.icardea.hibernate.OrganizationCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//organizationCriteria.ID.eq();
		System.out.println(organizationCriteria.uniqueOrganization());
		
		System.out.println("Retrieving Person by PersonCriteria");
		tr.com.srdc.icardea.hibernate.PersonCriteria personCriteria = new tr.com.srdc.icardea.hibernate.PersonCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//personCriteria.ID.eq();
		System.out.println(personCriteria.uniquePerson());
		
		System.out.println("Retrieving PatientHealthcareActorAssignment by PatientHealthcareActorAssignmentCriteria");
		tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignmentCriteria patientHealthcareActorAssignmentCriteria = new tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignmentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//patientHealthcareActorAssignmentCriteria.ID.eq();
		System.out.println(patientHealthcareActorAssignmentCriteria.uniquePatientHealthcareActorAssignment());
		
		System.out.println("Retrieving CIEDData by CIEDDataCriteria");
		tr.com.srdc.icardea.hibernate.CIEDDataCriteria cIEDDataCriteria = new tr.com.srdc.icardea.hibernate.CIEDDataCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//cIEDDataCriteria.ID.eq();
		System.out.println(cIEDDataCriteria.uniqueCIEDData());
		
		System.out.println("Retrieving Patient by PatientCriteria");
		tr.com.srdc.icardea.hibernate.PatientCriteria patientCriteria = new tr.com.srdc.icardea.hibernate.PatientCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//patientCriteria.ID.eq();
		System.out.println(patientCriteria.uniquePatient());
		
		System.out.println("Retrieving Observation by ObservationCriteria");
		tr.com.srdc.icardea.hibernate.ObservationCriteria observationCriteria = new tr.com.srdc.icardea.hibernate.ObservationCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//observationCriteria.ID.eq();
		System.out.println(observationCriteria.uniqueObservation());
		
		System.out.println("Retrieving EHRPHRData by EHRPHRDataCriteria");
		tr.com.srdc.icardea.hibernate.EHRPHRDataCriteria eHRPHRDataCriteria = new tr.com.srdc.icardea.hibernate.EHRPHRDataCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eHRPHRDataCriteria.ID.eq();
		System.out.println(eHRPHRDataCriteria.uniqueEHRPHRData());
		
		System.out.println("Retrieving VitalSign by VitalSignCriteria");
		tr.com.srdc.icardea.hibernate.VitalSignCriteria vitalSignCriteria = new tr.com.srdc.icardea.hibernate.VitalSignCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//vitalSignCriteria.ID.eq();
		System.out.println(vitalSignCriteria.uniqueVitalSign());
		
		System.out.println("Retrieving Concern by ConcernCriteria");
		tr.com.srdc.icardea.hibernate.ConcernCriteria concernCriteria = new tr.com.srdc.icardea.hibernate.ConcernCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//concernCriteria.ID.eq();
		System.out.println(concernCriteria.uniqueConcern());
		
		System.out.println("Retrieving ImagingResult by ImagingResultCriteria");
		tr.com.srdc.icardea.hibernate.ImagingResultCriteria imagingResultCriteria = new tr.com.srdc.icardea.hibernate.ImagingResultCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//imagingResultCriteria.ID.eq();
		System.out.println(imagingResultCriteria.uniqueImagingResult());
		
		System.out.println("Retrieving Medication by MedicationCriteria");
		tr.com.srdc.icardea.hibernate.MedicationCriteria medicationCriteria = new tr.com.srdc.icardea.hibernate.MedicationCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//medicationCriteria.ID.eq();
		System.out.println(medicationCriteria.uniqueMedication());
		
		System.out.println("Retrieving Immunization by ImmunizationCriteria");
		tr.com.srdc.icardea.hibernate.ImmunizationCriteria immunizationCriteria = new tr.com.srdc.icardea.hibernate.ImmunizationCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//immunizationCriteria.ID.eq();
		System.out.println(immunizationCriteria.uniqueImmunization());
		
		System.out.println("Retrieving Encounter by EncounterCriteria");
		tr.com.srdc.icardea.hibernate.EncounterCriteria encounterCriteria = new tr.com.srdc.icardea.hibernate.EncounterCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//encounterCriteria.ID.eq();
		System.out.println(encounterCriteria.uniqueEncounter());
		
		System.out.println("Retrieving Procedure by ProcedureCriteria");
		tr.com.srdc.icardea.hibernate.ProcedureCriteria procedureCriteria = new tr.com.srdc.icardea.hibernate.ProcedureCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//procedureCriteria.ID.eq();
		System.out.println(procedureCriteria.uniqueProcedure());
		
		System.out.println("Retrieving Problem by ProblemCriteria");
		tr.com.srdc.icardea.hibernate.ProblemCriteria problemCriteria = new tr.com.srdc.icardea.hibernate.ProblemCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//problemCriteria.ID.eq();
		System.out.println(problemCriteria.uniqueProblem());
		
		System.out.println("Retrieving PG by PGCriteria");
		tr.com.srdc.icardea.hibernate.PGCriteria pGCriteria = new tr.com.srdc.icardea.hibernate.PGCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//pGCriteria.ID.eq();
		System.out.println(pGCriteria.uniquePG());
		
		System.out.println("Retrieving LEAD2 by LEAD2Criteria");
		tr.com.srdc.icardea.hibernate.LEAD2Criteria lEAD2Criteria = new tr.com.srdc.icardea.hibernate.LEAD2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lEAD2Criteria.ID.eq();
		System.out.println(lEAD2Criteria.uniqueLEAD2());
		
		System.out.println("Retrieving SESS by SESSCriteria");
		tr.com.srdc.icardea.hibernate.SESSCriteria sESSCriteria = new tr.com.srdc.icardea.hibernate.SESSCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//sESSCriteria.ID.eq();
		System.out.println(sESSCriteria.uniqueSESS());
		
		System.out.println("Retrieving MSMT by MSMTCriteria");
		tr.com.srdc.icardea.hibernate.MSMTCriteria mSMTCriteria = new tr.com.srdc.icardea.hibernate.MSMTCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//mSMTCriteria.ID.eq();
		System.out.println(mSMTCriteria.uniqueMSMT());
		
		System.out.println("Retrieving BATTERY2 by BATTERY2Criteria");
		tr.com.srdc.icardea.hibernate.BATTERY2Criteria bATTERY2Criteria = new tr.com.srdc.icardea.hibernate.BATTERY2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bATTERY2Criteria.ID.eq();
		System.out.println(bATTERY2Criteria.uniqueBATTERY2());
		
		System.out.println("Retrieving CAP by CAPCriteria");
		tr.com.srdc.icardea.hibernate.CAPCriteria cAPCriteria = new tr.com.srdc.icardea.hibernate.CAPCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//cAPCriteria.ID.eq();
		System.out.println(cAPCriteria.uniqueCAP());
		
		System.out.println("Retrieving SENSINGMSMT by SENSINGMSMTCriteria");
		tr.com.srdc.icardea.hibernate.SENSINGMSMTCriteria sENSINGMSMTCriteria = new tr.com.srdc.icardea.hibernate.SENSINGMSMTCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//sENSINGMSMTCriteria.ID.eq();
		System.out.println(sENSINGMSMTCriteria.uniqueSENSINGMSMT());
		
		System.out.println("Retrieving PACINGTHRESHOLD by PACINGTHRESHOLDCriteria");
		tr.com.srdc.icardea.hibernate.PACINGTHRESHOLDCriteria pACINGTHRESHOLDCriteria = new tr.com.srdc.icardea.hibernate.PACINGTHRESHOLDCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//pACINGTHRESHOLDCriteria.ID.eq();
		System.out.println(pACINGTHRESHOLDCriteria.uniquePACINGTHRESHOLD());
		
		System.out.println("Retrieving IMPEDANCE by IMPEDANCECriteria");
		tr.com.srdc.icardea.hibernate.IMPEDANCECriteria iMPEDANCECriteria = new tr.com.srdc.icardea.hibernate.IMPEDANCECriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//iMPEDANCECriteria.ID.eq();
		System.out.println(iMPEDANCECriteria.uniqueIMPEDANCE());
		
		System.out.println("Retrieving LEADHVCHANNELMSMT by LEADHVCHANNELMSMTCriteria");
		tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMTCriteria lEADHVCHANNELMSMTCriteria = new tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMTCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lEADHVCHANNELMSMTCriteria.ID.eq();
		System.out.println(lEADHVCHANNELMSMTCriteria.uniqueLEADHVCHANNELMSMT());
		
		System.out.println("Retrieving SET by SETCriteria");
		tr.com.srdc.icardea.hibernate.SETCriteria sETCriteria = new tr.com.srdc.icardea.hibernate.SETCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//sETCriteria.ID.eq();
		System.out.println(sETCriteria.uniqueSET());
		
		System.out.println("Retrieving CRTSET by CRTSETCriteria");
		tr.com.srdc.icardea.hibernate.CRTSETCriteria cRTSETCriteria = new tr.com.srdc.icardea.hibernate.CRTSETCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//cRTSETCriteria.ID.eq();
		System.out.println(cRTSETCriteria.uniqueCRTSET());
		
		System.out.println("Retrieving MAGNET by MAGNETCriteria");
		tr.com.srdc.icardea.hibernate.MAGNETCriteria mAGNETCriteria = new tr.com.srdc.icardea.hibernate.MAGNETCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//mAGNETCriteria.ID.eq();
		System.out.println(mAGNETCriteria.uniqueMAGNET());
		
		System.out.println("Retrieving PACING by PACINGCriteria");
		tr.com.srdc.icardea.hibernate.PACINGCriteria pACINGCriteria = new tr.com.srdc.icardea.hibernate.PACINGCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//pACINGCriteria.ID.eq();
		System.out.println(pACINGCriteria.uniquePACING());
		
		System.out.println("Retrieving SHOCKVECTOR by SHOCKVECTORCriteria");
		tr.com.srdc.icardea.hibernate.SHOCKVECTORCriteria sHOCKVECTORCriteria = new tr.com.srdc.icardea.hibernate.SHOCKVECTORCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//sHOCKVECTORCriteria.ID.eq();
		System.out.println(sHOCKVECTORCriteria.uniqueSHOCKVECTOR());
		
		System.out.println("Retrieving BRADYSET by BRADYSETCriteria");
		tr.com.srdc.icardea.hibernate.BRADYSETCriteria bRADYSETCriteria = new tr.com.srdc.icardea.hibernate.BRADYSETCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bRADYSETCriteria.ID.eq();
		System.out.println(bRADYSETCriteria.uniqueBRADYSET());
		
		System.out.println("Retrieving TACHYTHERAPYSET by TACHYTHERAPYSETCriteria");
		tr.com.srdc.icardea.hibernate.TACHYTHERAPYSETCriteria tACHYTHERAPYSETCriteria = new tr.com.srdc.icardea.hibernate.TACHYTHERAPYSETCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tACHYTHERAPYSETCriteria.ID.eq();
		System.out.println(tACHYTHERAPYSETCriteria.uniqueTACHYTHERAPYSET());
		
		System.out.println("Retrieving ZONE by ZONECriteria");
		tr.com.srdc.icardea.hibernate.ZONECriteria zONECriteria = new tr.com.srdc.icardea.hibernate.ZONECriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//zONECriteria.ID.eq();
		System.out.println(zONECriteria.uniqueZONE());
		
		System.out.println("Retrieving HEART_RATE by HEART_RATECriteria");
		tr.com.srdc.icardea.hibernate.HEART_RATECriteria hEART_RATECriteria = new tr.com.srdc.icardea.hibernate.HEART_RATECriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//hEART_RATECriteria.ID.eq();
		System.out.println(hEART_RATECriteria.uniqueHEART_RATE());
		
		System.out.println("Retrieving AT by ATCriteria");
		tr.com.srdc.icardea.hibernate.ATCriteria aTCriteria = new tr.com.srdc.icardea.hibernate.ATCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//aTCriteria.ID.eq();
		System.out.println(aTCriteria.uniqueAT());
		
		System.out.println("Retrieving EPISODESTAT by EPISODESTATCriteria");
		tr.com.srdc.icardea.hibernate.EPISODESTATCriteria ePISODESTATCriteria = new tr.com.srdc.icardea.hibernate.EPISODESTATCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ePISODESTATCriteria.ID.eq();
		System.out.println(ePISODESTATCriteria.uniqueEPISODESTAT());
		
		System.out.println("Retrieving LEADCHNLMSMT by LEADCHNLMSMTCriteria");
		tr.com.srdc.icardea.hibernate.LEADCHNLMSMTCriteria lEADCHNLMSMTCriteria = new tr.com.srdc.icardea.hibernate.LEADCHNLMSMTCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lEADCHNLMSMTCriteria.ID.eq();
		System.out.println(lEADCHNLMSMTCriteria.uniqueLEADCHNLMSMT());
		
		System.out.println("Retrieving STAT by STATCriteria");
		tr.com.srdc.icardea.hibernate.STATCriteria sTATCriteria = new tr.com.srdc.icardea.hibernate.STATCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//sTATCriteria.ID.eq();
		System.out.println(sTATCriteria.uniqueSTAT());
		
		System.out.println("Retrieving LEADCHNLSET by LEADCHNLSETCriteria");
		tr.com.srdc.icardea.hibernate.LEADCHNLSETCriteria lEADCHNLSETCriteria = new tr.com.srdc.icardea.hibernate.LEADCHNLSETCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lEADCHNLSETCriteria.ID.eq();
		System.out.println(lEADCHNLSETCriteria.uniqueLEADCHNLSET());
		
		System.out.println("Retrieving SENSINGSET by SENSINGSETCriteria");
		tr.com.srdc.icardea.hibernate.SENSINGSETCriteria sENSINGSETCriteria = new tr.com.srdc.icardea.hibernate.SENSINGSETCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//sENSINGSETCriteria.ID.eq();
		System.out.println(sENSINGSETCriteria.uniqueSENSINGSET());
		
		System.out.println("Retrieving LEADHVCHANNELSET by LEADHVCHANNELSETCriteria");
		tr.com.srdc.icardea.hibernate.LEADHVCHANNELSETCriteria lEADHVCHANNELSETCriteria = new tr.com.srdc.icardea.hibernate.LEADHVCHANNELSETCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lEADHVCHANNELSETCriteria.ID.eq();
		System.out.println(lEADHVCHANNELSETCriteria.uniqueLEADHVCHANNELSET());
		
		System.out.println("Retrieving BRADYSTAT by BRADYSTATCriteria");
		tr.com.srdc.icardea.hibernate.BRADYSTATCriteria bRADYSTATCriteria = new tr.com.srdc.icardea.hibernate.BRADYSTATCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bRADYSTATCriteria.ID.eq();
		System.out.println(bRADYSTATCriteria.uniqueBRADYSTAT());
		
		System.out.println("Retrieving TACHYTHERAPYSTAT by TACHYTHERAPYSTATCriteria");
		tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTATCriteria tACHYTHERAPYSTATCriteria = new tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTATCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tACHYTHERAPYSTATCriteria.ID.eq();
		System.out.println(tACHYTHERAPYSTATCriteria.uniqueTACHYTHERAPYSTAT());
		
		System.out.println("Retrieving CRTSTAT by CRTSTATCriteria");
		tr.com.srdc.icardea.hibernate.CRTSTATCriteria cRTSTATCriteria = new tr.com.srdc.icardea.hibernate.CRTSTATCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//cRTSTATCriteria.ID.eq();
		System.out.println(cRTSTATCriteria.uniqueCRTSTAT());
		
		System.out.println("Retrieving EPISODEROOT by EPISODEROOTCriteria");
		tr.com.srdc.icardea.hibernate.EPISODEROOTCriteria ePISODEROOTCriteria = new tr.com.srdc.icardea.hibernate.EPISODEROOTCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ePISODEROOTCriteria.ID.eq();
		System.out.println(ePISODEROOTCriteria.uniqueEPISODEROOT());
		
		System.out.println("Retrieving BinaryData by BinaryDataCriteria");
		tr.com.srdc.icardea.hibernate.BinaryDataCriteria binaryDataCriteria = new tr.com.srdc.icardea.hibernate.BinaryDataCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//binaryDataCriteria.ID.eq();
		System.out.println(binaryDataCriteria.uniqueBinaryData());
		
		System.out.println("Retrieving System by SystemCriteria");
		tr.com.srdc.icardea.hibernate.SystemCriteria systemCriteria = new tr.com.srdc.icardea.hibernate.SystemCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//systemCriteria.ID.eq();
		System.out.println(systemCriteria.uniqueSystem());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateICardeaData retrieveAndUpdateICardeaData = new RetrieveAndUpdateICardeaData();
			try {
				retrieveAndUpdateICardeaData.retrieveAndUpdateTestData();
				//retrieveAndUpdateICardeaData.retrieveByCriteria();
			}
			finally {
				tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
