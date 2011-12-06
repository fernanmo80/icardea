/**
 * Licensee: Gokce  Laleci
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteICardeaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession().beginTransaction();
		try {
			tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate ltrcomsrdcicardeahibernateMedicalCareplanTemplate = tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate.loadMedicalCareplanTemplateByQuery(null, null);
			ltrcomsrdcicardeahibernateMedicalCareplanTemplate.delete();
			tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan ltrcomsrdcicardeahibernatePersonalizedMedicalCareplan = tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan.loadPersonalizedMedicalCareplanByQuery(null, null);
			ltrcomsrdcicardeahibernatePersonalizedMedicalCareplan.delete();
			tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance ltrcomsrdcicardeahibernatePersonalizedMedicalCareplanInstance = tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance.loadPersonalizedMedicalCareplanInstanceByQuery(null, null);
			ltrcomsrdcicardeahibernatePersonalizedMedicalCareplanInstance.delete();
			tr.com.srdc.icardea.hibernate.Contact ltrcomsrdcicardeahibernateContact = tr.com.srdc.icardea.hibernate.Contact.loadContactByQuery(null, null);
			ltrcomsrdcicardeahibernateContact.delete();
			tr.com.srdc.icardea.hibernate.Organization ltrcomsrdcicardeahibernateOrganization = tr.com.srdc.icardea.hibernate.Organization.loadOrganizationByQuery(null, null);
			ltrcomsrdcicardeahibernateOrganization.delete();
			tr.com.srdc.icardea.hibernate.Person ltrcomsrdcicardeahibernatePerson = tr.com.srdc.icardea.hibernate.Person.loadPersonByQuery(null, null);
			ltrcomsrdcicardeahibernatePerson.delete();
			tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment ltrcomsrdcicardeahibernatePatientHealthcareActorAssignment = tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment.loadPatientHealthcareActorAssignmentByQuery(null, null);
			ltrcomsrdcicardeahibernatePatientHealthcareActorAssignment.delete();
			tr.com.srdc.icardea.hibernate.CIEDData ltrcomsrdcicardeahibernateCIEDData = tr.com.srdc.icardea.hibernate.CIEDData.loadCIEDDataByQuery(null, null);
			ltrcomsrdcicardeahibernateCIEDData.delete();
			tr.com.srdc.icardea.hibernate.Patient ltrcomsrdcicardeahibernatePatient = tr.com.srdc.icardea.hibernate.Patient.loadPatientByQuery(null, null);
			ltrcomsrdcicardeahibernatePatient.delete();
			tr.com.srdc.icardea.hibernate.Observation ltrcomsrdcicardeahibernateObservation = tr.com.srdc.icardea.hibernate.Observation.loadObservationByQuery(null, null);
			ltrcomsrdcicardeahibernateObservation.delete();
			tr.com.srdc.icardea.hibernate.EHRPHRData ltrcomsrdcicardeahibernateEHRPHRData = tr.com.srdc.icardea.hibernate.EHRPHRData.loadEHRPHRDataByQuery(null, null);
			ltrcomsrdcicardeahibernateEHRPHRData.delete();
			tr.com.srdc.icardea.hibernate.VitalSign ltrcomsrdcicardeahibernateVitalSign = tr.com.srdc.icardea.hibernate.VitalSign.loadVitalSignByQuery(null, null);
			ltrcomsrdcicardeahibernateVitalSign.delete();
			tr.com.srdc.icardea.hibernate.Concern ltrcomsrdcicardeahibernateConcern = tr.com.srdc.icardea.hibernate.Concern.loadConcernByQuery(null, null);
			ltrcomsrdcicardeahibernateConcern.delete();
			tr.com.srdc.icardea.hibernate.ImagingResult ltrcomsrdcicardeahibernateImagingResult = tr.com.srdc.icardea.hibernate.ImagingResult.loadImagingResultByQuery(null, null);
			ltrcomsrdcicardeahibernateImagingResult.delete();
			tr.com.srdc.icardea.hibernate.Medication ltrcomsrdcicardeahibernateMedication = tr.com.srdc.icardea.hibernate.Medication.loadMedicationByQuery(null, null);
			ltrcomsrdcicardeahibernateMedication.delete();
			tr.com.srdc.icardea.hibernate.Immunization ltrcomsrdcicardeahibernateImmunization = tr.com.srdc.icardea.hibernate.Immunization.loadImmunizationByQuery(null, null);
			ltrcomsrdcicardeahibernateImmunization.delete();
			tr.com.srdc.icardea.hibernate.Encounter ltrcomsrdcicardeahibernateEncounter = tr.com.srdc.icardea.hibernate.Encounter.loadEncounterByQuery(null, null);
			ltrcomsrdcicardeahibernateEncounter.delete();
			tr.com.srdc.icardea.hibernate.Procedure ltrcomsrdcicardeahibernateProcedure = tr.com.srdc.icardea.hibernate.Procedure.loadProcedureByQuery(null, null);
			ltrcomsrdcicardeahibernateProcedure.delete();
			tr.com.srdc.icardea.hibernate.Problem ltrcomsrdcicardeahibernateProblem = tr.com.srdc.icardea.hibernate.Problem.loadProblemByQuery(null, null);
			ltrcomsrdcicardeahibernateProblem.delete();
			tr.com.srdc.icardea.hibernate.PG ltrcomsrdcicardeahibernatePG = tr.com.srdc.icardea.hibernate.PG.loadPGByQuery(null, null);
			ltrcomsrdcicardeahibernatePG.delete();
			tr.com.srdc.icardea.hibernate.LEAD2 ltrcomsrdcicardeahibernateLEAD2 = tr.com.srdc.icardea.hibernate.LEAD2.loadLEAD2ByQuery(null, null);
			ltrcomsrdcicardeahibernateLEAD2.delete();
			tr.com.srdc.icardea.hibernate.SESS ltrcomsrdcicardeahibernateSESS = tr.com.srdc.icardea.hibernate.SESS.loadSESSByQuery(null, null);
			ltrcomsrdcicardeahibernateSESS.delete();
			tr.com.srdc.icardea.hibernate.MSMT ltrcomsrdcicardeahibernateMSMT = tr.com.srdc.icardea.hibernate.MSMT.loadMSMTByQuery(null, null);
			ltrcomsrdcicardeahibernateMSMT.delete();
			tr.com.srdc.icardea.hibernate.BATTERY2 ltrcomsrdcicardeahibernateBATTERY2 = tr.com.srdc.icardea.hibernate.BATTERY2.loadBATTERY2ByQuery(null, null);
			ltrcomsrdcicardeahibernateBATTERY2.delete();
			tr.com.srdc.icardea.hibernate.CAP ltrcomsrdcicardeahibernateCAP = tr.com.srdc.icardea.hibernate.CAP.loadCAPByQuery(null, null);
			ltrcomsrdcicardeahibernateCAP.delete();
			tr.com.srdc.icardea.hibernate.SENSINGMSMT ltrcomsrdcicardeahibernateSENSINGMSMT = tr.com.srdc.icardea.hibernate.SENSINGMSMT.loadSENSINGMSMTByQuery(null, null);
			ltrcomsrdcicardeahibernateSENSINGMSMT.delete();
			tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD ltrcomsrdcicardeahibernatePACINGTHRESHOLD = tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD.loadPACINGTHRESHOLDByQuery(null, null);
			ltrcomsrdcicardeahibernatePACINGTHRESHOLD.delete();
			tr.com.srdc.icardea.hibernate.IMPEDANCE ltrcomsrdcicardeahibernateIMPEDANCE = tr.com.srdc.icardea.hibernate.IMPEDANCE.loadIMPEDANCEByQuery(null, null);
			ltrcomsrdcicardeahibernateIMPEDANCE.delete();
			tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT ltrcomsrdcicardeahibernateLEADHVCHANNELMSMT = tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT.loadLEADHVCHANNELMSMTByQuery(null, null);
			ltrcomsrdcicardeahibernateLEADHVCHANNELMSMT.delete();
			tr.com.srdc.icardea.hibernate.SET ltrcomsrdcicardeahibernateSET = tr.com.srdc.icardea.hibernate.SET.loadSETByQuery(null, null);
			ltrcomsrdcicardeahibernateSET.delete();
			tr.com.srdc.icardea.hibernate.CRTSET ltrcomsrdcicardeahibernateCRTSET = tr.com.srdc.icardea.hibernate.CRTSET.loadCRTSETByQuery(null, null);
			ltrcomsrdcicardeahibernateCRTSET.delete();
			tr.com.srdc.icardea.hibernate.MAGNET ltrcomsrdcicardeahibernateMAGNET = tr.com.srdc.icardea.hibernate.MAGNET.loadMAGNETByQuery(null, null);
			ltrcomsrdcicardeahibernateMAGNET.delete();
			tr.com.srdc.icardea.hibernate.PACING ltrcomsrdcicardeahibernatePACING = tr.com.srdc.icardea.hibernate.PACING.loadPACINGByQuery(null, null);
			ltrcomsrdcicardeahibernatePACING.delete();
			tr.com.srdc.icardea.hibernate.SHOCKVECTOR ltrcomsrdcicardeahibernateSHOCKVECTOR = tr.com.srdc.icardea.hibernate.SHOCKVECTOR.loadSHOCKVECTORByQuery(null, null);
			ltrcomsrdcicardeahibernateSHOCKVECTOR.delete();
			tr.com.srdc.icardea.hibernate.BRADYSET ltrcomsrdcicardeahibernateBRADYSET = tr.com.srdc.icardea.hibernate.BRADYSET.loadBRADYSETByQuery(null, null);
			ltrcomsrdcicardeahibernateBRADYSET.delete();
			tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET ltrcomsrdcicardeahibernateTACHYTHERAPYSET = tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET.loadTACHYTHERAPYSETByQuery(null, null);
			ltrcomsrdcicardeahibernateTACHYTHERAPYSET.delete();
			tr.com.srdc.icardea.hibernate.ZONE ltrcomsrdcicardeahibernateZONE = tr.com.srdc.icardea.hibernate.ZONE.loadZONEByQuery(null, null);
			ltrcomsrdcicardeahibernateZONE.delete();
			tr.com.srdc.icardea.hibernate.HEART_RATE ltrcomsrdcicardeahibernateHEART_RATE = tr.com.srdc.icardea.hibernate.HEART_RATE.loadHEART_RATEByQuery(null, null);
			ltrcomsrdcicardeahibernateHEART_RATE.delete();
			tr.com.srdc.icardea.hibernate.AT ltrcomsrdcicardeahibernateAT = tr.com.srdc.icardea.hibernate.AT.loadATByQuery(null, null);
			ltrcomsrdcicardeahibernateAT.delete();
			tr.com.srdc.icardea.hibernate.EPISODESTAT ltrcomsrdcicardeahibernateEPISODESTAT = tr.com.srdc.icardea.hibernate.EPISODESTAT.loadEPISODESTATByQuery(null, null);
			ltrcomsrdcicardeahibernateEPISODESTAT.delete();
			tr.com.srdc.icardea.hibernate.LEADCHNLMSMT ltrcomsrdcicardeahibernateLEADCHNLMSMT = tr.com.srdc.icardea.hibernate.LEADCHNLMSMT.loadLEADCHNLMSMTByQuery(null, null);
			ltrcomsrdcicardeahibernateLEADCHNLMSMT.delete();
			tr.com.srdc.icardea.hibernate.STAT ltrcomsrdcicardeahibernateSTAT = tr.com.srdc.icardea.hibernate.STAT.loadSTATByQuery(null, null);
			ltrcomsrdcicardeahibernateSTAT.delete();
			tr.com.srdc.icardea.hibernate.LEADCHNLSET ltrcomsrdcicardeahibernateLEADCHNLSET = tr.com.srdc.icardea.hibernate.LEADCHNLSET.loadLEADCHNLSETByQuery(null, null);
			ltrcomsrdcicardeahibernateLEADCHNLSET.delete();
			tr.com.srdc.icardea.hibernate.SENSINGSET ltrcomsrdcicardeahibernateSENSINGSET = tr.com.srdc.icardea.hibernate.SENSINGSET.loadSENSINGSETByQuery(null, null);
			ltrcomsrdcicardeahibernateSENSINGSET.delete();
			tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET ltrcomsrdcicardeahibernateLEADHVCHANNELSET = tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET.loadLEADHVCHANNELSETByQuery(null, null);
			ltrcomsrdcicardeahibernateLEADHVCHANNELSET.delete();
			tr.com.srdc.icardea.hibernate.BRADYSTAT ltrcomsrdcicardeahibernateBRADYSTAT = tr.com.srdc.icardea.hibernate.BRADYSTAT.loadBRADYSTATByQuery(null, null);
			ltrcomsrdcicardeahibernateBRADYSTAT.delete();
			tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT ltrcomsrdcicardeahibernateTACHYTHERAPYSTAT = tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT.loadTACHYTHERAPYSTATByQuery(null, null);
			ltrcomsrdcicardeahibernateTACHYTHERAPYSTAT.delete();
			tr.com.srdc.icardea.hibernate.CRTSTAT ltrcomsrdcicardeahibernateCRTSTAT = tr.com.srdc.icardea.hibernate.CRTSTAT.loadCRTSTATByQuery(null, null);
			ltrcomsrdcicardeahibernateCRTSTAT.delete();
			tr.com.srdc.icardea.hibernate.EPISODEROOT ltrcomsrdcicardeahibernateEPISODEROOT = tr.com.srdc.icardea.hibernate.EPISODEROOT.loadEPISODEROOTByQuery(null, null);
			ltrcomsrdcicardeahibernateEPISODEROOT.delete();
			tr.com.srdc.icardea.hibernate.BinaryData ltrcomsrdcicardeahibernateBinaryData = tr.com.srdc.icardea.hibernate.BinaryData.loadBinaryDataByQuery(null, null);
			ltrcomsrdcicardeahibernateBinaryData.delete();
			tr.com.srdc.icardea.hibernate.System ltrcomsrdcicardeahibernateSystem = tr.com.srdc.icardea.hibernate.System.loadSystemByQuery(null, null);
			ltrcomsrdcicardeahibernateSystem.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteICardeaData deleteICardeaData = new DeleteICardeaData();
			try {
				deleteICardeaData.deleteTestData();
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
