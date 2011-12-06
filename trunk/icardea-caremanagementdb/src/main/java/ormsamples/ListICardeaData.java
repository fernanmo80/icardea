/**
 * Licensee: Gokce  Laleci
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListICardeaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing MedicalCareplanTemplate...");
		tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate[] trcomsrdcicardeahibernateMedicalCareplanTemplates = tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate.listMedicalCareplanTemplateByQuery(null, null);
		int length = Math.min(trcomsrdcicardeahibernateMedicalCareplanTemplates.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateMedicalCareplanTemplates[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PersonalizedMedicalCareplan...");
		tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan[] trcomsrdcicardeahibernatePersonalizedMedicalCareplans = tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan.listPersonalizedMedicalCareplanByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernatePersonalizedMedicalCareplans.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernatePersonalizedMedicalCareplans[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PersonalizedMedicalCareplanInstance...");
		tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance[] trcomsrdcicardeahibernatePersonalizedMedicalCareplanInstances = tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance.listPersonalizedMedicalCareplanInstanceByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernatePersonalizedMedicalCareplanInstances.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernatePersonalizedMedicalCareplanInstances[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Contact...");
		tr.com.srdc.icardea.hibernate.Contact[] trcomsrdcicardeahibernateContacts = tr.com.srdc.icardea.hibernate.Contact.listContactByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateContacts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateContacts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Organization...");
		tr.com.srdc.icardea.hibernate.Organization[] trcomsrdcicardeahibernateOrganizations = tr.com.srdc.icardea.hibernate.Organization.listOrganizationByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateOrganizations.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateOrganizations[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Person...");
		tr.com.srdc.icardea.hibernate.Person[] trcomsrdcicardeahibernatePersons = tr.com.srdc.icardea.hibernate.Person.listPersonByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernatePersons.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernatePersons[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PatientHealthcareActorAssignment...");
		tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment[] trcomsrdcicardeahibernatePatientHealthcareActorAssignments = tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment.listPatientHealthcareActorAssignmentByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernatePatientHealthcareActorAssignments.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernatePatientHealthcareActorAssignments[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing CIEDData...");
		tr.com.srdc.icardea.hibernate.CIEDData[] trcomsrdcicardeahibernateCIEDDatas = tr.com.srdc.icardea.hibernate.CIEDData.listCIEDDataByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateCIEDDatas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateCIEDDatas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Patient...");
		tr.com.srdc.icardea.hibernate.Patient[] trcomsrdcicardeahibernatePatients = tr.com.srdc.icardea.hibernate.Patient.listPatientByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernatePatients.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernatePatients[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Observation...");
		tr.com.srdc.icardea.hibernate.Observation[] trcomsrdcicardeahibernateObservations = tr.com.srdc.icardea.hibernate.Observation.listObservationByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateObservations.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateObservations[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EHRPHRData...");
		tr.com.srdc.icardea.hibernate.EHRPHRData[] trcomsrdcicardeahibernateEHRPHRDatas = tr.com.srdc.icardea.hibernate.EHRPHRData.listEHRPHRDataByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateEHRPHRDatas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateEHRPHRDatas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing VitalSign...");
		tr.com.srdc.icardea.hibernate.VitalSign[] trcomsrdcicardeahibernateVitalSigns = tr.com.srdc.icardea.hibernate.VitalSign.listVitalSignByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateVitalSigns.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateVitalSigns[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Concern...");
		tr.com.srdc.icardea.hibernate.Concern[] trcomsrdcicardeahibernateConcerns = tr.com.srdc.icardea.hibernate.Concern.listConcernByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateConcerns.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateConcerns[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ImagingResult...");
		tr.com.srdc.icardea.hibernate.ImagingResult[] trcomsrdcicardeahibernateImagingResults = tr.com.srdc.icardea.hibernate.ImagingResult.listImagingResultByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateImagingResults.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateImagingResults[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Medication...");
		tr.com.srdc.icardea.hibernate.Medication[] trcomsrdcicardeahibernateMedications = tr.com.srdc.icardea.hibernate.Medication.listMedicationByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateMedications.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateMedications[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Immunization...");
		tr.com.srdc.icardea.hibernate.Immunization[] trcomsrdcicardeahibernateImmunizations = tr.com.srdc.icardea.hibernate.Immunization.listImmunizationByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateImmunizations.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateImmunizations[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Encounter...");
		tr.com.srdc.icardea.hibernate.Encounter[] trcomsrdcicardeahibernateEncounters = tr.com.srdc.icardea.hibernate.Encounter.listEncounterByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateEncounters.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateEncounters[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Procedure...");
		tr.com.srdc.icardea.hibernate.Procedure[] trcomsrdcicardeahibernateProcedures = tr.com.srdc.icardea.hibernate.Procedure.listProcedureByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateProcedures.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateProcedures[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Problem...");
		tr.com.srdc.icardea.hibernate.Problem[] trcomsrdcicardeahibernateProblems = tr.com.srdc.icardea.hibernate.Problem.listProblemByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateProblems.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateProblems[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PG...");
		tr.com.srdc.icardea.hibernate.PG[] trcomsrdcicardeahibernatePGs = tr.com.srdc.icardea.hibernate.PG.listPGByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernatePGs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernatePGs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing LEAD2...");
		tr.com.srdc.icardea.hibernate.LEAD2[] trcomsrdcicardeahibernateLEAD2s = tr.com.srdc.icardea.hibernate.LEAD2.listLEAD2ByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateLEAD2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateLEAD2s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing SESS...");
		tr.com.srdc.icardea.hibernate.SESS[] trcomsrdcicardeahibernateSESSs = tr.com.srdc.icardea.hibernate.SESS.listSESSByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateSESSs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateSESSs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MSMT...");
		tr.com.srdc.icardea.hibernate.MSMT[] trcomsrdcicardeahibernateMSMTs = tr.com.srdc.icardea.hibernate.MSMT.listMSMTByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateMSMTs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateMSMTs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing BATTERY2...");
		tr.com.srdc.icardea.hibernate.BATTERY2[] trcomsrdcicardeahibernateBATTERY2s = tr.com.srdc.icardea.hibernate.BATTERY2.listBATTERY2ByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateBATTERY2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateBATTERY2s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing CAP...");
		tr.com.srdc.icardea.hibernate.CAP[] trcomsrdcicardeahibernateCAPs = tr.com.srdc.icardea.hibernate.CAP.listCAPByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateCAPs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateCAPs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing SENSINGMSMT...");
		tr.com.srdc.icardea.hibernate.SENSINGMSMT[] trcomsrdcicardeahibernateSENSINGMSMTs = tr.com.srdc.icardea.hibernate.SENSINGMSMT.listSENSINGMSMTByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateSENSINGMSMTs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateSENSINGMSMTs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PACINGTHRESHOLD...");
		tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD[] trcomsrdcicardeahibernatePACINGTHRESHOLDs = tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD.listPACINGTHRESHOLDByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernatePACINGTHRESHOLDs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernatePACINGTHRESHOLDs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing IMPEDANCE...");
		tr.com.srdc.icardea.hibernate.IMPEDANCE[] trcomsrdcicardeahibernateIMPEDANCEs = tr.com.srdc.icardea.hibernate.IMPEDANCE.listIMPEDANCEByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateIMPEDANCEs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateIMPEDANCEs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing LEADHVCHANNELMSMT...");
		tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT[] trcomsrdcicardeahibernateLEADHVCHANNELMSMTs = tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT.listLEADHVCHANNELMSMTByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateLEADHVCHANNELMSMTs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateLEADHVCHANNELMSMTs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing SET...");
		tr.com.srdc.icardea.hibernate.SET[] trcomsrdcicardeahibernateSETs = tr.com.srdc.icardea.hibernate.SET.listSETByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateSETs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateSETs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing CRTSET...");
		tr.com.srdc.icardea.hibernate.CRTSET[] trcomsrdcicardeahibernateCRTSETs = tr.com.srdc.icardea.hibernate.CRTSET.listCRTSETByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateCRTSETs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateCRTSETs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MAGNET...");
		tr.com.srdc.icardea.hibernate.MAGNET[] trcomsrdcicardeahibernateMAGNETs = tr.com.srdc.icardea.hibernate.MAGNET.listMAGNETByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateMAGNETs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateMAGNETs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PACING...");
		tr.com.srdc.icardea.hibernate.PACING[] trcomsrdcicardeahibernatePACINGs = tr.com.srdc.icardea.hibernate.PACING.listPACINGByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernatePACINGs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernatePACINGs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing SHOCKVECTOR...");
		tr.com.srdc.icardea.hibernate.SHOCKVECTOR[] trcomsrdcicardeahibernateSHOCKVECTORs = tr.com.srdc.icardea.hibernate.SHOCKVECTOR.listSHOCKVECTORByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateSHOCKVECTORs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateSHOCKVECTORs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing BRADYSET...");
		tr.com.srdc.icardea.hibernate.BRADYSET[] trcomsrdcicardeahibernateBRADYSETs = tr.com.srdc.icardea.hibernate.BRADYSET.listBRADYSETByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateBRADYSETs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateBRADYSETs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TACHYTHERAPYSET...");
		tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET[] trcomsrdcicardeahibernateTACHYTHERAPYSETs = tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET.listTACHYTHERAPYSETByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateTACHYTHERAPYSETs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateTACHYTHERAPYSETs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ZONE...");
		tr.com.srdc.icardea.hibernate.ZONE[] trcomsrdcicardeahibernateZONEs = tr.com.srdc.icardea.hibernate.ZONE.listZONEByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateZONEs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateZONEs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing HEART_RATE...");
		tr.com.srdc.icardea.hibernate.HEART_RATE[] trcomsrdcicardeahibernateHEART_RATEs = tr.com.srdc.icardea.hibernate.HEART_RATE.listHEART_RATEByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateHEART_RATEs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateHEART_RATEs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing AT...");
		tr.com.srdc.icardea.hibernate.AT[] trcomsrdcicardeahibernateATs = tr.com.srdc.icardea.hibernate.AT.listATByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateATs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateATs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EPISODESTAT...");
		tr.com.srdc.icardea.hibernate.EPISODESTAT[] trcomsrdcicardeahibernateEPISODESTATs = tr.com.srdc.icardea.hibernate.EPISODESTAT.listEPISODESTATByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateEPISODESTATs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateEPISODESTATs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing LEADCHNLMSMT...");
		tr.com.srdc.icardea.hibernate.LEADCHNLMSMT[] trcomsrdcicardeahibernateLEADCHNLMSMTs = tr.com.srdc.icardea.hibernate.LEADCHNLMSMT.listLEADCHNLMSMTByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateLEADCHNLMSMTs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateLEADCHNLMSMTs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing STAT...");
		tr.com.srdc.icardea.hibernate.STAT[] trcomsrdcicardeahibernateSTATs = tr.com.srdc.icardea.hibernate.STAT.listSTATByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateSTATs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateSTATs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing LEADCHNLSET...");
		tr.com.srdc.icardea.hibernate.LEADCHNLSET[] trcomsrdcicardeahibernateLEADCHNLSETs = tr.com.srdc.icardea.hibernate.LEADCHNLSET.listLEADCHNLSETByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateLEADCHNLSETs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateLEADCHNLSETs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing SENSINGSET...");
		tr.com.srdc.icardea.hibernate.SENSINGSET[] trcomsrdcicardeahibernateSENSINGSETs = tr.com.srdc.icardea.hibernate.SENSINGSET.listSENSINGSETByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateSENSINGSETs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateSENSINGSETs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing LEADHVCHANNELSET...");
		tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET[] trcomsrdcicardeahibernateLEADHVCHANNELSETs = tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET.listLEADHVCHANNELSETByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateLEADHVCHANNELSETs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateLEADHVCHANNELSETs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing BRADYSTAT...");
		tr.com.srdc.icardea.hibernate.BRADYSTAT[] trcomsrdcicardeahibernateBRADYSTATs = tr.com.srdc.icardea.hibernate.BRADYSTAT.listBRADYSTATByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateBRADYSTATs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateBRADYSTATs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TACHYTHERAPYSTAT...");
		tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT[] trcomsrdcicardeahibernateTACHYTHERAPYSTATs = tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT.listTACHYTHERAPYSTATByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateTACHYTHERAPYSTATs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateTACHYTHERAPYSTATs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing CRTSTAT...");
		tr.com.srdc.icardea.hibernate.CRTSTAT[] trcomsrdcicardeahibernateCRTSTATs = tr.com.srdc.icardea.hibernate.CRTSTAT.listCRTSTATByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateCRTSTATs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateCRTSTATs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EPISODEROOT...");
		tr.com.srdc.icardea.hibernate.EPISODEROOT[] trcomsrdcicardeahibernateEPISODEROOTs = tr.com.srdc.icardea.hibernate.EPISODEROOT.listEPISODEROOTByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateEPISODEROOTs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateEPISODEROOTs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing BinaryData...");
		tr.com.srdc.icardea.hibernate.BinaryData[] trcomsrdcicardeahibernateBinaryDatas = tr.com.srdc.icardea.hibernate.BinaryData.listBinaryDataByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateBinaryDatas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateBinaryDatas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing System...");
		tr.com.srdc.icardea.hibernate.System[] trcomsrdcicardeahibernateSystems = tr.com.srdc.icardea.hibernate.System.listSystemByQuery(null, null);
		length = Math.min(trcomsrdcicardeahibernateSystems.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trcomsrdcicardeahibernateSystems[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing MedicalCareplanTemplate by Criteria...");
		tr.com.srdc.icardea.hibernate.MedicalCareplanTemplateCriteria medicalCareplanTemplateCriteria = new tr.com.srdc.icardea.hibernate.MedicalCareplanTemplateCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//medicalCareplanTemplateCriteria.ID.eq();
		medicalCareplanTemplateCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate[] trcomsrdcicardeahibernateMedicalCareplanTemplates = medicalCareplanTemplateCriteria.listMedicalCareplanTemplate();
		int length =trcomsrdcicardeahibernateMedicalCareplanTemplates== null ? 0 : Math.min(trcomsrdcicardeahibernateMedicalCareplanTemplates.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateMedicalCareplanTemplates[i]);
		}
		System.out.println(length + " MedicalCareplanTemplate record(s) retrieved."); 
		
		System.out.println("Listing PersonalizedMedicalCareplan by Criteria...");
		tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanCriteria personalizedMedicalCareplanCriteria = new tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//personalizedMedicalCareplanCriteria.ID.eq();
		personalizedMedicalCareplanCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan[] trcomsrdcicardeahibernatePersonalizedMedicalCareplans = personalizedMedicalCareplanCriteria.listPersonalizedMedicalCareplan();
		length =trcomsrdcicardeahibernatePersonalizedMedicalCareplans== null ? 0 : Math.min(trcomsrdcicardeahibernatePersonalizedMedicalCareplans.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernatePersonalizedMedicalCareplans[i]);
		}
		System.out.println(length + " PersonalizedMedicalCareplan record(s) retrieved."); 
		
		System.out.println("Listing PersonalizedMedicalCareplanInstance by Criteria...");
		tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstanceCriteria personalizedMedicalCareplanInstanceCriteria = new tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstanceCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//personalizedMedicalCareplanInstanceCriteria.ID.eq();
		personalizedMedicalCareplanInstanceCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance[] trcomsrdcicardeahibernatePersonalizedMedicalCareplanInstances = personalizedMedicalCareplanInstanceCriteria.listPersonalizedMedicalCareplanInstance();
		length =trcomsrdcicardeahibernatePersonalizedMedicalCareplanInstances== null ? 0 : Math.min(trcomsrdcicardeahibernatePersonalizedMedicalCareplanInstances.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernatePersonalizedMedicalCareplanInstances[i]);
		}
		System.out.println(length + " PersonalizedMedicalCareplanInstance record(s) retrieved."); 
		
		System.out.println("Listing Contact by Criteria...");
		tr.com.srdc.icardea.hibernate.ContactCriteria contactCriteria = new tr.com.srdc.icardea.hibernate.ContactCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//contactCriteria.ID.eq();
		contactCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.Contact[] trcomsrdcicardeahibernateContacts = contactCriteria.listContact();
		length =trcomsrdcicardeahibernateContacts== null ? 0 : Math.min(trcomsrdcicardeahibernateContacts.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateContacts[i]);
		}
		System.out.println(length + " Contact record(s) retrieved."); 
		
		System.out.println("Listing Organization by Criteria...");
		tr.com.srdc.icardea.hibernate.OrganizationCriteria organizationCriteria = new tr.com.srdc.icardea.hibernate.OrganizationCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//organizationCriteria.ID.eq();
		organizationCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.Organization[] trcomsrdcicardeahibernateOrganizations = organizationCriteria.listOrganization();
		length =trcomsrdcicardeahibernateOrganizations== null ? 0 : Math.min(trcomsrdcicardeahibernateOrganizations.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateOrganizations[i]);
		}
		System.out.println(length + " Organization record(s) retrieved."); 
		
		System.out.println("Listing Person by Criteria...");
		tr.com.srdc.icardea.hibernate.PersonCriteria personCriteria = new tr.com.srdc.icardea.hibernate.PersonCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//personCriteria.ID.eq();
		personCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.Person[] trcomsrdcicardeahibernatePersons = personCriteria.listPerson();
		length =trcomsrdcicardeahibernatePersons== null ? 0 : Math.min(trcomsrdcicardeahibernatePersons.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernatePersons[i]);
		}
		System.out.println(length + " Person record(s) retrieved."); 
		
		System.out.println("Listing PatientHealthcareActorAssignment by Criteria...");
		tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignmentCriteria patientHealthcareActorAssignmentCriteria = new tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignmentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//patientHealthcareActorAssignmentCriteria.ID.eq();
		patientHealthcareActorAssignmentCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment[] trcomsrdcicardeahibernatePatientHealthcareActorAssignments = patientHealthcareActorAssignmentCriteria.listPatientHealthcareActorAssignment();
		length =trcomsrdcicardeahibernatePatientHealthcareActorAssignments== null ? 0 : Math.min(trcomsrdcicardeahibernatePatientHealthcareActorAssignments.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernatePatientHealthcareActorAssignments[i]);
		}
		System.out.println(length + " PatientHealthcareActorAssignment record(s) retrieved."); 
		
		System.out.println("Listing CIEDData by Criteria...");
		tr.com.srdc.icardea.hibernate.CIEDDataCriteria cIEDDataCriteria = new tr.com.srdc.icardea.hibernate.CIEDDataCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//cIEDDataCriteria.ID.eq();
		cIEDDataCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.CIEDData[] trcomsrdcicardeahibernateCIEDDatas = cIEDDataCriteria.listCIEDData();
		length =trcomsrdcicardeahibernateCIEDDatas== null ? 0 : Math.min(trcomsrdcicardeahibernateCIEDDatas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateCIEDDatas[i]);
		}
		System.out.println(length + " CIEDData record(s) retrieved."); 
		
		System.out.println("Listing Patient by Criteria...");
		tr.com.srdc.icardea.hibernate.PatientCriteria patientCriteria = new tr.com.srdc.icardea.hibernate.PatientCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//patientCriteria.ID.eq();
		patientCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.Patient[] trcomsrdcicardeahibernatePatients = patientCriteria.listPatient();
		length =trcomsrdcicardeahibernatePatients== null ? 0 : Math.min(trcomsrdcicardeahibernatePatients.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernatePatients[i]);
		}
		System.out.println(length + " Patient record(s) retrieved."); 
		
		System.out.println("Listing Observation by Criteria...");
		tr.com.srdc.icardea.hibernate.ObservationCriteria observationCriteria = new tr.com.srdc.icardea.hibernate.ObservationCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//observationCriteria.ID.eq();
		observationCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.Observation[] trcomsrdcicardeahibernateObservations = observationCriteria.listObservation();
		length =trcomsrdcicardeahibernateObservations== null ? 0 : Math.min(trcomsrdcicardeahibernateObservations.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateObservations[i]);
		}
		System.out.println(length + " Observation record(s) retrieved."); 
		
		System.out.println("Listing EHRPHRData by Criteria...");
		tr.com.srdc.icardea.hibernate.EHRPHRDataCriteria eHRPHRDataCriteria = new tr.com.srdc.icardea.hibernate.EHRPHRDataCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eHRPHRDataCriteria.ID.eq();
		eHRPHRDataCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.EHRPHRData[] trcomsrdcicardeahibernateEHRPHRDatas = eHRPHRDataCriteria.listEHRPHRData();
		length =trcomsrdcicardeahibernateEHRPHRDatas== null ? 0 : Math.min(trcomsrdcicardeahibernateEHRPHRDatas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateEHRPHRDatas[i]);
		}
		System.out.println(length + " EHRPHRData record(s) retrieved."); 
		
		System.out.println("Listing VitalSign by Criteria...");
		tr.com.srdc.icardea.hibernate.VitalSignCriteria vitalSignCriteria = new tr.com.srdc.icardea.hibernate.VitalSignCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//vitalSignCriteria.ID.eq();
		vitalSignCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.VitalSign[] trcomsrdcicardeahibernateVitalSigns = vitalSignCriteria.listVitalSign();
		length =trcomsrdcicardeahibernateVitalSigns== null ? 0 : Math.min(trcomsrdcicardeahibernateVitalSigns.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateVitalSigns[i]);
		}
		System.out.println(length + " VitalSign record(s) retrieved."); 
		
		System.out.println("Listing Concern by Criteria...");
		tr.com.srdc.icardea.hibernate.ConcernCriteria concernCriteria = new tr.com.srdc.icardea.hibernate.ConcernCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//concernCriteria.ID.eq();
		concernCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.Concern[] trcomsrdcicardeahibernateConcerns = concernCriteria.listConcern();
		length =trcomsrdcicardeahibernateConcerns== null ? 0 : Math.min(trcomsrdcicardeahibernateConcerns.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateConcerns[i]);
		}
		System.out.println(length + " Concern record(s) retrieved."); 
		
		System.out.println("Listing ImagingResult by Criteria...");
		tr.com.srdc.icardea.hibernate.ImagingResultCriteria imagingResultCriteria = new tr.com.srdc.icardea.hibernate.ImagingResultCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//imagingResultCriteria.ID.eq();
		imagingResultCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.ImagingResult[] trcomsrdcicardeahibernateImagingResults = imagingResultCriteria.listImagingResult();
		length =trcomsrdcicardeahibernateImagingResults== null ? 0 : Math.min(trcomsrdcicardeahibernateImagingResults.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateImagingResults[i]);
		}
		System.out.println(length + " ImagingResult record(s) retrieved."); 
		
		System.out.println("Listing Medication by Criteria...");
		tr.com.srdc.icardea.hibernate.MedicationCriteria medicationCriteria = new tr.com.srdc.icardea.hibernate.MedicationCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//medicationCriteria.ID.eq();
		medicationCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.Medication[] trcomsrdcicardeahibernateMedications = medicationCriteria.listMedication();
		length =trcomsrdcicardeahibernateMedications== null ? 0 : Math.min(trcomsrdcicardeahibernateMedications.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateMedications[i]);
		}
		System.out.println(length + " Medication record(s) retrieved."); 
		
		System.out.println("Listing Immunization by Criteria...");
		tr.com.srdc.icardea.hibernate.ImmunizationCriteria immunizationCriteria = new tr.com.srdc.icardea.hibernate.ImmunizationCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//immunizationCriteria.ID.eq();
		immunizationCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.Immunization[] trcomsrdcicardeahibernateImmunizations = immunizationCriteria.listImmunization();
		length =trcomsrdcicardeahibernateImmunizations== null ? 0 : Math.min(trcomsrdcicardeahibernateImmunizations.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateImmunizations[i]);
		}
		System.out.println(length + " Immunization record(s) retrieved."); 
		
		System.out.println("Listing Encounter by Criteria...");
		tr.com.srdc.icardea.hibernate.EncounterCriteria encounterCriteria = new tr.com.srdc.icardea.hibernate.EncounterCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//encounterCriteria.ID.eq();
		encounterCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.Encounter[] trcomsrdcicardeahibernateEncounters = encounterCriteria.listEncounter();
		length =trcomsrdcicardeahibernateEncounters== null ? 0 : Math.min(trcomsrdcicardeahibernateEncounters.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateEncounters[i]);
		}
		System.out.println(length + " Encounter record(s) retrieved."); 
		
		System.out.println("Listing Procedure by Criteria...");
		tr.com.srdc.icardea.hibernate.ProcedureCriteria procedureCriteria = new tr.com.srdc.icardea.hibernate.ProcedureCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//procedureCriteria.ID.eq();
		procedureCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.Procedure[] trcomsrdcicardeahibernateProcedures = procedureCriteria.listProcedure();
		length =trcomsrdcicardeahibernateProcedures== null ? 0 : Math.min(trcomsrdcicardeahibernateProcedures.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateProcedures[i]);
		}
		System.out.println(length + " Procedure record(s) retrieved."); 
		
		System.out.println("Listing Problem by Criteria...");
		tr.com.srdc.icardea.hibernate.ProblemCriteria problemCriteria = new tr.com.srdc.icardea.hibernate.ProblemCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//problemCriteria.ID.eq();
		problemCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.Problem[] trcomsrdcicardeahibernateProblems = problemCriteria.listProblem();
		length =trcomsrdcicardeahibernateProblems== null ? 0 : Math.min(trcomsrdcicardeahibernateProblems.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateProblems[i]);
		}
		System.out.println(length + " Problem record(s) retrieved."); 
		
		System.out.println("Listing PG by Criteria...");
		tr.com.srdc.icardea.hibernate.PGCriteria pGCriteria = new tr.com.srdc.icardea.hibernate.PGCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//pGCriteria.ID.eq();
		pGCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.PG[] trcomsrdcicardeahibernatePGs = pGCriteria.listPG();
		length =trcomsrdcicardeahibernatePGs== null ? 0 : Math.min(trcomsrdcicardeahibernatePGs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernatePGs[i]);
		}
		System.out.println(length + " PG record(s) retrieved."); 
		
		System.out.println("Listing LEAD2 by Criteria...");
		tr.com.srdc.icardea.hibernate.LEAD2Criteria lEAD2Criteria = new tr.com.srdc.icardea.hibernate.LEAD2Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lEAD2Criteria.ID.eq();
		lEAD2Criteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.LEAD2[] trcomsrdcicardeahibernateLEAD2s = lEAD2Criteria.listLEAD2();
		length =trcomsrdcicardeahibernateLEAD2s== null ? 0 : Math.min(trcomsrdcicardeahibernateLEAD2s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateLEAD2s[i]);
		}
		System.out.println(length + " LEAD2 record(s) retrieved."); 
		
		System.out.println("Listing SESS by Criteria...");
		tr.com.srdc.icardea.hibernate.SESSCriteria sESSCriteria = new tr.com.srdc.icardea.hibernate.SESSCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//sESSCriteria.ID.eq();
		sESSCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.SESS[] trcomsrdcicardeahibernateSESSs = sESSCriteria.listSESS();
		length =trcomsrdcicardeahibernateSESSs== null ? 0 : Math.min(trcomsrdcicardeahibernateSESSs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateSESSs[i]);
		}
		System.out.println(length + " SESS record(s) retrieved."); 
		
		System.out.println("Listing MSMT by Criteria...");
		tr.com.srdc.icardea.hibernate.MSMTCriteria mSMTCriteria = new tr.com.srdc.icardea.hibernate.MSMTCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//mSMTCriteria.ID.eq();
		mSMTCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.MSMT[] trcomsrdcicardeahibernateMSMTs = mSMTCriteria.listMSMT();
		length =trcomsrdcicardeahibernateMSMTs== null ? 0 : Math.min(trcomsrdcicardeahibernateMSMTs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateMSMTs[i]);
		}
		System.out.println(length + " MSMT record(s) retrieved."); 
		
		System.out.println("Listing BATTERY2 by Criteria...");
		tr.com.srdc.icardea.hibernate.BATTERY2Criteria bATTERY2Criteria = new tr.com.srdc.icardea.hibernate.BATTERY2Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bATTERY2Criteria.ID.eq();
		bATTERY2Criteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.BATTERY2[] trcomsrdcicardeahibernateBATTERY2s = bATTERY2Criteria.listBATTERY2();
		length =trcomsrdcicardeahibernateBATTERY2s== null ? 0 : Math.min(trcomsrdcicardeahibernateBATTERY2s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateBATTERY2s[i]);
		}
		System.out.println(length + " BATTERY2 record(s) retrieved."); 
		
		System.out.println("Listing CAP by Criteria...");
		tr.com.srdc.icardea.hibernate.CAPCriteria cAPCriteria = new tr.com.srdc.icardea.hibernate.CAPCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//cAPCriteria.ID.eq();
		cAPCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.CAP[] trcomsrdcicardeahibernateCAPs = cAPCriteria.listCAP();
		length =trcomsrdcicardeahibernateCAPs== null ? 0 : Math.min(trcomsrdcicardeahibernateCAPs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateCAPs[i]);
		}
		System.out.println(length + " CAP record(s) retrieved."); 
		
		System.out.println("Listing SENSINGMSMT by Criteria...");
		tr.com.srdc.icardea.hibernate.SENSINGMSMTCriteria sENSINGMSMTCriteria = new tr.com.srdc.icardea.hibernate.SENSINGMSMTCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//sENSINGMSMTCriteria.ID.eq();
		sENSINGMSMTCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.SENSINGMSMT[] trcomsrdcicardeahibernateSENSINGMSMTs = sENSINGMSMTCriteria.listSENSINGMSMT();
		length =trcomsrdcicardeahibernateSENSINGMSMTs== null ? 0 : Math.min(trcomsrdcicardeahibernateSENSINGMSMTs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateSENSINGMSMTs[i]);
		}
		System.out.println(length + " SENSINGMSMT record(s) retrieved."); 
		
		System.out.println("Listing PACINGTHRESHOLD by Criteria...");
		tr.com.srdc.icardea.hibernate.PACINGTHRESHOLDCriteria pACINGTHRESHOLDCriteria = new tr.com.srdc.icardea.hibernate.PACINGTHRESHOLDCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//pACINGTHRESHOLDCriteria.ID.eq();
		pACINGTHRESHOLDCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD[] trcomsrdcicardeahibernatePACINGTHRESHOLDs = pACINGTHRESHOLDCriteria.listPACINGTHRESHOLD();
		length =trcomsrdcicardeahibernatePACINGTHRESHOLDs== null ? 0 : Math.min(trcomsrdcicardeahibernatePACINGTHRESHOLDs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernatePACINGTHRESHOLDs[i]);
		}
		System.out.println(length + " PACINGTHRESHOLD record(s) retrieved."); 
		
		System.out.println("Listing IMPEDANCE by Criteria...");
		tr.com.srdc.icardea.hibernate.IMPEDANCECriteria iMPEDANCECriteria = new tr.com.srdc.icardea.hibernate.IMPEDANCECriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//iMPEDANCECriteria.ID.eq();
		iMPEDANCECriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.IMPEDANCE[] trcomsrdcicardeahibernateIMPEDANCEs = iMPEDANCECriteria.listIMPEDANCE();
		length =trcomsrdcicardeahibernateIMPEDANCEs== null ? 0 : Math.min(trcomsrdcicardeahibernateIMPEDANCEs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateIMPEDANCEs[i]);
		}
		System.out.println(length + " IMPEDANCE record(s) retrieved."); 
		
		System.out.println("Listing LEADHVCHANNELMSMT by Criteria...");
		tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMTCriteria lEADHVCHANNELMSMTCriteria = new tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMTCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lEADHVCHANNELMSMTCriteria.ID.eq();
		lEADHVCHANNELMSMTCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT[] trcomsrdcicardeahibernateLEADHVCHANNELMSMTs = lEADHVCHANNELMSMTCriteria.listLEADHVCHANNELMSMT();
		length =trcomsrdcicardeahibernateLEADHVCHANNELMSMTs== null ? 0 : Math.min(trcomsrdcicardeahibernateLEADHVCHANNELMSMTs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateLEADHVCHANNELMSMTs[i]);
		}
		System.out.println(length + " LEADHVCHANNELMSMT record(s) retrieved."); 
		
		System.out.println("Listing SET by Criteria...");
		tr.com.srdc.icardea.hibernate.SETCriteria sETCriteria = new tr.com.srdc.icardea.hibernate.SETCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//sETCriteria.ID.eq();
		sETCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.SET[] trcomsrdcicardeahibernateSETs = sETCriteria.listSET();
		length =trcomsrdcicardeahibernateSETs== null ? 0 : Math.min(trcomsrdcicardeahibernateSETs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateSETs[i]);
		}
		System.out.println(length + " SET record(s) retrieved."); 
		
		System.out.println("Listing CRTSET by Criteria...");
		tr.com.srdc.icardea.hibernate.CRTSETCriteria cRTSETCriteria = new tr.com.srdc.icardea.hibernate.CRTSETCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//cRTSETCriteria.ID.eq();
		cRTSETCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.CRTSET[] trcomsrdcicardeahibernateCRTSETs = cRTSETCriteria.listCRTSET();
		length =trcomsrdcicardeahibernateCRTSETs== null ? 0 : Math.min(trcomsrdcicardeahibernateCRTSETs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateCRTSETs[i]);
		}
		System.out.println(length + " CRTSET record(s) retrieved."); 
		
		System.out.println("Listing MAGNET by Criteria...");
		tr.com.srdc.icardea.hibernate.MAGNETCriteria mAGNETCriteria = new tr.com.srdc.icardea.hibernate.MAGNETCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//mAGNETCriteria.ID.eq();
		mAGNETCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.MAGNET[] trcomsrdcicardeahibernateMAGNETs = mAGNETCriteria.listMAGNET();
		length =trcomsrdcicardeahibernateMAGNETs== null ? 0 : Math.min(trcomsrdcicardeahibernateMAGNETs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateMAGNETs[i]);
		}
		System.out.println(length + " MAGNET record(s) retrieved."); 
		
		System.out.println("Listing PACING by Criteria...");
		tr.com.srdc.icardea.hibernate.PACINGCriteria pACINGCriteria = new tr.com.srdc.icardea.hibernate.PACINGCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//pACINGCriteria.ID.eq();
		pACINGCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.PACING[] trcomsrdcicardeahibernatePACINGs = pACINGCriteria.listPACING();
		length =trcomsrdcicardeahibernatePACINGs== null ? 0 : Math.min(trcomsrdcicardeahibernatePACINGs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernatePACINGs[i]);
		}
		System.out.println(length + " PACING record(s) retrieved."); 
		
		System.out.println("Listing SHOCKVECTOR by Criteria...");
		tr.com.srdc.icardea.hibernate.SHOCKVECTORCriteria sHOCKVECTORCriteria = new tr.com.srdc.icardea.hibernate.SHOCKVECTORCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//sHOCKVECTORCriteria.ID.eq();
		sHOCKVECTORCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.SHOCKVECTOR[] trcomsrdcicardeahibernateSHOCKVECTORs = sHOCKVECTORCriteria.listSHOCKVECTOR();
		length =trcomsrdcicardeahibernateSHOCKVECTORs== null ? 0 : Math.min(trcomsrdcicardeahibernateSHOCKVECTORs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateSHOCKVECTORs[i]);
		}
		System.out.println(length + " SHOCKVECTOR record(s) retrieved."); 
		
		System.out.println("Listing BRADYSET by Criteria...");
		tr.com.srdc.icardea.hibernate.BRADYSETCriteria bRADYSETCriteria = new tr.com.srdc.icardea.hibernate.BRADYSETCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bRADYSETCriteria.ID.eq();
		bRADYSETCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.BRADYSET[] trcomsrdcicardeahibernateBRADYSETs = bRADYSETCriteria.listBRADYSET();
		length =trcomsrdcicardeahibernateBRADYSETs== null ? 0 : Math.min(trcomsrdcicardeahibernateBRADYSETs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateBRADYSETs[i]);
		}
		System.out.println(length + " BRADYSET record(s) retrieved."); 
		
		System.out.println("Listing TACHYTHERAPYSET by Criteria...");
		tr.com.srdc.icardea.hibernate.TACHYTHERAPYSETCriteria tACHYTHERAPYSETCriteria = new tr.com.srdc.icardea.hibernate.TACHYTHERAPYSETCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tACHYTHERAPYSETCriteria.ID.eq();
		tACHYTHERAPYSETCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET[] trcomsrdcicardeahibernateTACHYTHERAPYSETs = tACHYTHERAPYSETCriteria.listTACHYTHERAPYSET();
		length =trcomsrdcicardeahibernateTACHYTHERAPYSETs== null ? 0 : Math.min(trcomsrdcicardeahibernateTACHYTHERAPYSETs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateTACHYTHERAPYSETs[i]);
		}
		System.out.println(length + " TACHYTHERAPYSET record(s) retrieved."); 
		
		System.out.println("Listing ZONE by Criteria...");
		tr.com.srdc.icardea.hibernate.ZONECriteria zONECriteria = new tr.com.srdc.icardea.hibernate.ZONECriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//zONECriteria.ID.eq();
		zONECriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.ZONE[] trcomsrdcicardeahibernateZONEs = zONECriteria.listZONE();
		length =trcomsrdcicardeahibernateZONEs== null ? 0 : Math.min(trcomsrdcicardeahibernateZONEs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateZONEs[i]);
		}
		System.out.println(length + " ZONE record(s) retrieved."); 
		
		System.out.println("Listing HEART_RATE by Criteria...");
		tr.com.srdc.icardea.hibernate.HEART_RATECriteria hEART_RATECriteria = new tr.com.srdc.icardea.hibernate.HEART_RATECriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//hEART_RATECriteria.ID.eq();
		hEART_RATECriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.HEART_RATE[] trcomsrdcicardeahibernateHEART_RATEs = hEART_RATECriteria.listHEART_RATE();
		length =trcomsrdcicardeahibernateHEART_RATEs== null ? 0 : Math.min(trcomsrdcicardeahibernateHEART_RATEs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateHEART_RATEs[i]);
		}
		System.out.println(length + " HEART_RATE record(s) retrieved."); 
		
		System.out.println("Listing AT by Criteria...");
		tr.com.srdc.icardea.hibernate.ATCriteria aTCriteria = new tr.com.srdc.icardea.hibernate.ATCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//aTCriteria.ID.eq();
		aTCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.AT[] trcomsrdcicardeahibernateATs = aTCriteria.listAT();
		length =trcomsrdcicardeahibernateATs== null ? 0 : Math.min(trcomsrdcicardeahibernateATs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateATs[i]);
		}
		System.out.println(length + " AT record(s) retrieved."); 
		
		System.out.println("Listing EPISODESTAT by Criteria...");
		tr.com.srdc.icardea.hibernate.EPISODESTATCriteria ePISODESTATCriteria = new tr.com.srdc.icardea.hibernate.EPISODESTATCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ePISODESTATCriteria.ID.eq();
		ePISODESTATCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.EPISODESTAT[] trcomsrdcicardeahibernateEPISODESTATs = ePISODESTATCriteria.listEPISODESTAT();
		length =trcomsrdcicardeahibernateEPISODESTATs== null ? 0 : Math.min(trcomsrdcicardeahibernateEPISODESTATs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateEPISODESTATs[i]);
		}
		System.out.println(length + " EPISODESTAT record(s) retrieved."); 
		
		System.out.println("Listing LEADCHNLMSMT by Criteria...");
		tr.com.srdc.icardea.hibernate.LEADCHNLMSMTCriteria lEADCHNLMSMTCriteria = new tr.com.srdc.icardea.hibernate.LEADCHNLMSMTCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lEADCHNLMSMTCriteria.ID.eq();
		lEADCHNLMSMTCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.LEADCHNLMSMT[] trcomsrdcicardeahibernateLEADCHNLMSMTs = lEADCHNLMSMTCriteria.listLEADCHNLMSMT();
		length =trcomsrdcicardeahibernateLEADCHNLMSMTs== null ? 0 : Math.min(trcomsrdcicardeahibernateLEADCHNLMSMTs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateLEADCHNLMSMTs[i]);
		}
		System.out.println(length + " LEADCHNLMSMT record(s) retrieved."); 
		
		System.out.println("Listing STAT by Criteria...");
		tr.com.srdc.icardea.hibernate.STATCriteria sTATCriteria = new tr.com.srdc.icardea.hibernate.STATCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//sTATCriteria.ID.eq();
		sTATCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.STAT[] trcomsrdcicardeahibernateSTATs = sTATCriteria.listSTAT();
		length =trcomsrdcicardeahibernateSTATs== null ? 0 : Math.min(trcomsrdcicardeahibernateSTATs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateSTATs[i]);
		}
		System.out.println(length + " STAT record(s) retrieved."); 
		
		System.out.println("Listing LEADCHNLSET by Criteria...");
		tr.com.srdc.icardea.hibernate.LEADCHNLSETCriteria lEADCHNLSETCriteria = new tr.com.srdc.icardea.hibernate.LEADCHNLSETCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lEADCHNLSETCriteria.ID.eq();
		lEADCHNLSETCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.LEADCHNLSET[] trcomsrdcicardeahibernateLEADCHNLSETs = lEADCHNLSETCriteria.listLEADCHNLSET();
		length =trcomsrdcicardeahibernateLEADCHNLSETs== null ? 0 : Math.min(trcomsrdcicardeahibernateLEADCHNLSETs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateLEADCHNLSETs[i]);
		}
		System.out.println(length + " LEADCHNLSET record(s) retrieved."); 
		
		System.out.println("Listing SENSINGSET by Criteria...");
		tr.com.srdc.icardea.hibernate.SENSINGSETCriteria sENSINGSETCriteria = new tr.com.srdc.icardea.hibernate.SENSINGSETCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//sENSINGSETCriteria.ID.eq();
		sENSINGSETCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.SENSINGSET[] trcomsrdcicardeahibernateSENSINGSETs = sENSINGSETCriteria.listSENSINGSET();
		length =trcomsrdcicardeahibernateSENSINGSETs== null ? 0 : Math.min(trcomsrdcicardeahibernateSENSINGSETs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateSENSINGSETs[i]);
		}
		System.out.println(length + " SENSINGSET record(s) retrieved."); 
		
		System.out.println("Listing LEADHVCHANNELSET by Criteria...");
		tr.com.srdc.icardea.hibernate.LEADHVCHANNELSETCriteria lEADHVCHANNELSETCriteria = new tr.com.srdc.icardea.hibernate.LEADHVCHANNELSETCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lEADHVCHANNELSETCriteria.ID.eq();
		lEADHVCHANNELSETCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET[] trcomsrdcicardeahibernateLEADHVCHANNELSETs = lEADHVCHANNELSETCriteria.listLEADHVCHANNELSET();
		length =trcomsrdcicardeahibernateLEADHVCHANNELSETs== null ? 0 : Math.min(trcomsrdcicardeahibernateLEADHVCHANNELSETs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateLEADHVCHANNELSETs[i]);
		}
		System.out.println(length + " LEADHVCHANNELSET record(s) retrieved."); 
		
		System.out.println("Listing BRADYSTAT by Criteria...");
		tr.com.srdc.icardea.hibernate.BRADYSTATCriteria bRADYSTATCriteria = new tr.com.srdc.icardea.hibernate.BRADYSTATCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bRADYSTATCriteria.ID.eq();
		bRADYSTATCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.BRADYSTAT[] trcomsrdcicardeahibernateBRADYSTATs = bRADYSTATCriteria.listBRADYSTAT();
		length =trcomsrdcicardeahibernateBRADYSTATs== null ? 0 : Math.min(trcomsrdcicardeahibernateBRADYSTATs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateBRADYSTATs[i]);
		}
		System.out.println(length + " BRADYSTAT record(s) retrieved."); 
		
		System.out.println("Listing TACHYTHERAPYSTAT by Criteria...");
		tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTATCriteria tACHYTHERAPYSTATCriteria = new tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTATCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tACHYTHERAPYSTATCriteria.ID.eq();
		tACHYTHERAPYSTATCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT[] trcomsrdcicardeahibernateTACHYTHERAPYSTATs = tACHYTHERAPYSTATCriteria.listTACHYTHERAPYSTAT();
		length =trcomsrdcicardeahibernateTACHYTHERAPYSTATs== null ? 0 : Math.min(trcomsrdcicardeahibernateTACHYTHERAPYSTATs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateTACHYTHERAPYSTATs[i]);
		}
		System.out.println(length + " TACHYTHERAPYSTAT record(s) retrieved."); 
		
		System.out.println("Listing CRTSTAT by Criteria...");
		tr.com.srdc.icardea.hibernate.CRTSTATCriteria cRTSTATCriteria = new tr.com.srdc.icardea.hibernate.CRTSTATCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//cRTSTATCriteria.ID.eq();
		cRTSTATCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.CRTSTAT[] trcomsrdcicardeahibernateCRTSTATs = cRTSTATCriteria.listCRTSTAT();
		length =trcomsrdcicardeahibernateCRTSTATs== null ? 0 : Math.min(trcomsrdcicardeahibernateCRTSTATs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateCRTSTATs[i]);
		}
		System.out.println(length + " CRTSTAT record(s) retrieved."); 
		
		System.out.println("Listing EPISODEROOT by Criteria...");
		tr.com.srdc.icardea.hibernate.EPISODEROOTCriteria ePISODEROOTCriteria = new tr.com.srdc.icardea.hibernate.EPISODEROOTCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ePISODEROOTCriteria.ID.eq();
		ePISODEROOTCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.EPISODEROOT[] trcomsrdcicardeahibernateEPISODEROOTs = ePISODEROOTCriteria.listEPISODEROOT();
		length =trcomsrdcicardeahibernateEPISODEROOTs== null ? 0 : Math.min(trcomsrdcicardeahibernateEPISODEROOTs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateEPISODEROOTs[i]);
		}
		System.out.println(length + " EPISODEROOT record(s) retrieved."); 
		
		System.out.println("Listing BinaryData by Criteria...");
		tr.com.srdc.icardea.hibernate.BinaryDataCriteria binaryDataCriteria = new tr.com.srdc.icardea.hibernate.BinaryDataCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//binaryDataCriteria.ID.eq();
		binaryDataCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.BinaryData[] trcomsrdcicardeahibernateBinaryDatas = binaryDataCriteria.listBinaryData();
		length =trcomsrdcicardeahibernateBinaryDatas== null ? 0 : Math.min(trcomsrdcicardeahibernateBinaryDatas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateBinaryDatas[i]);
		}
		System.out.println(length + " BinaryData record(s) retrieved."); 
		
		System.out.println("Listing System by Criteria...");
		tr.com.srdc.icardea.hibernate.SystemCriteria systemCriteria = new tr.com.srdc.icardea.hibernate.SystemCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//systemCriteria.ID.eq();
		systemCriteria.setMaxResults(ROW_COUNT);
		tr.com.srdc.icardea.hibernate.System[] trcomsrdcicardeahibernateSystems = systemCriteria.listSystem();
		length =trcomsrdcicardeahibernateSystems== null ? 0 : Math.min(trcomsrdcicardeahibernateSystems.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trcomsrdcicardeahibernateSystems[i]);
		}
		System.out.println(length + " System record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListICardeaData listICardeaData = new ListICardeaData();
			try {
				listICardeaData.listTestData();
				//listICardeaData.listByCriteria();
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
