/**
 * Licensee: Gokce  Laleci
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateICardeaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession().beginTransaction();
		try {
			tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate ltrcomsrdcicardeahibernateMedicalCareplanTemplate = tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate.createMedicalCareplanTemplate();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : personalizedMedicalCareplan
			ltrcomsrdcicardeahibernateMedicalCareplanTemplate.save();
			tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan ltrcomsrdcicardeahibernatePersonalizedMedicalCareplan = tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan.createPersonalizedMedicalCareplan();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : personalizedMedicalCareplanInstance, medicalCareplanTemplate
			ltrcomsrdcicardeahibernatePersonalizedMedicalCareplan.save();
			tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance ltrcomsrdcicardeahibernatePersonalizedMedicalCareplanInstance = tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance.createPersonalizedMedicalCareplanInstance();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : personalizedMedicalCareplan
			ltrcomsrdcicardeahibernatePersonalizedMedicalCareplanInstance.save();
			tr.com.srdc.icardea.hibernate.Contact ltrcomsrdcicardeahibernateContact = tr.com.srdc.icardea.hibernate.Contact.createContact();
			// Initialize the properties of the persistent object here
			ltrcomsrdcicardeahibernateContact.save();
			tr.com.srdc.icardea.hibernate.Organization ltrcomsrdcicardeahibernateOrganization = tr.com.srdc.icardea.hibernate.Organization.createOrganization();
			// Initialize the properties of the persistent object here
			ltrcomsrdcicardeahibernateOrganization.save();
			tr.com.srdc.icardea.hibernate.Person ltrcomsrdcicardeahibernatePerson = tr.com.srdc.icardea.hibernate.Person.createPerson();
			// Initialize the properties of the persistent object here
			ltrcomsrdcicardeahibernatePerson.save();
			tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment ltrcomsrdcicardeahibernatePatientHealthcareActorAssignment = tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment.createPatientHealthcareActorAssignment();
			// Initialize the properties of the persistent object here
			ltrcomsrdcicardeahibernatePatientHealthcareActorAssignment.save();
			tr.com.srdc.icardea.hibernate.CIEDData ltrcomsrdcicardeahibernateCIEDData = tr.com.srdc.icardea.hibernate.CIEDData.createCIEDData();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : patient1, observationfillerOrderNumber
			ltrcomsrdcicardeahibernateCIEDData.save();
			tr.com.srdc.icardea.hibernate.Patient ltrcomsrdcicardeahibernatePatient = tr.com.srdc.icardea.hibernate.Patient.createPatient();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cIEDData1, eHRPHRData
			ltrcomsrdcicardeahibernatePatient.save();
			tr.com.srdc.icardea.hibernate.Observation ltrcomsrdcicardeahibernateObservation = tr.com.srdc.icardea.hibernate.Observation.createObservation();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : binaryData, cIEDData, system
			ltrcomsrdcicardeahibernateObservation.save();
			tr.com.srdc.icardea.hibernate.EHRPHRData ltrcomsrdcicardeahibernateEHRPHRData = tr.com.srdc.icardea.hibernate.EHRPHRData.createEHRPHRData();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : vitalSign, encounter, procedure, imagingResult, problem, immunization, medication, concern, patient
			ltrcomsrdcicardeahibernateEHRPHRData.save();
			tr.com.srdc.icardea.hibernate.VitalSign ltrcomsrdcicardeahibernateVitalSign = tr.com.srdc.icardea.hibernate.VitalSign.createVitalSign();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eHRPHRData
			ltrcomsrdcicardeahibernateVitalSign.save();
			tr.com.srdc.icardea.hibernate.Concern ltrcomsrdcicardeahibernateConcern = tr.com.srdc.icardea.hibernate.Concern.createConcern();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eHRPHRData
			ltrcomsrdcicardeahibernateConcern.save();
			tr.com.srdc.icardea.hibernate.ImagingResult ltrcomsrdcicardeahibernateImagingResult = tr.com.srdc.icardea.hibernate.ImagingResult.createImagingResult();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eHRPHRData
			ltrcomsrdcicardeahibernateImagingResult.save();
			tr.com.srdc.icardea.hibernate.Medication ltrcomsrdcicardeahibernateMedication = tr.com.srdc.icardea.hibernate.Medication.createMedication();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eHRPHRData
			ltrcomsrdcicardeahibernateMedication.save();
			tr.com.srdc.icardea.hibernate.Immunization ltrcomsrdcicardeahibernateImmunization = tr.com.srdc.icardea.hibernate.Immunization.createImmunization();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eHRPHRData
			ltrcomsrdcicardeahibernateImmunization.save();
			tr.com.srdc.icardea.hibernate.Encounter ltrcomsrdcicardeahibernateEncounter = tr.com.srdc.icardea.hibernate.Encounter.createEncounter();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eHRPHRData
			ltrcomsrdcicardeahibernateEncounter.save();
			tr.com.srdc.icardea.hibernate.Procedure ltrcomsrdcicardeahibernateProcedure = tr.com.srdc.icardea.hibernate.Procedure.createProcedure();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eHRPHRData
			ltrcomsrdcicardeahibernateProcedure.save();
			tr.com.srdc.icardea.hibernate.Problem ltrcomsrdcicardeahibernateProblem = tr.com.srdc.icardea.hibernate.Problem.createProblem();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eHRPHRData
			ltrcomsrdcicardeahibernateProblem.save();
			tr.com.srdc.icardea.hibernate.PG ltrcomsrdcicardeahibernatePG = tr.com.srdc.icardea.hibernate.PG.createPG();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : system
			ltrcomsrdcicardeahibernatePG.save();
			tr.com.srdc.icardea.hibernate.LEAD2 ltrcomsrdcicardeahibernateLEAD2 = tr.com.srdc.icardea.hibernate.LEAD2.createLEAD2();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : system
			ltrcomsrdcicardeahibernateLEAD2.save();
			tr.com.srdc.icardea.hibernate.SESS ltrcomsrdcicardeahibernateSESS = tr.com.srdc.icardea.hibernate.SESS.createSESS();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : system
			ltrcomsrdcicardeahibernateSESS.save();
			tr.com.srdc.icardea.hibernate.MSMT ltrcomsrdcicardeahibernateMSMT = tr.com.srdc.icardea.hibernate.MSMT.createMSMT();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lEADHVCHANNELMSMT, lEADCHNLMSMT, system
			ltrcomsrdcicardeahibernateMSMT.save();
			tr.com.srdc.icardea.hibernate.BATTERY2 ltrcomsrdcicardeahibernateBATTERY2 = tr.com.srdc.icardea.hibernate.BATTERY2.createBATTERY2();
			// Initialize the properties of the persistent object here
			ltrcomsrdcicardeahibernateBATTERY2.save();
			tr.com.srdc.icardea.hibernate.CAP ltrcomsrdcicardeahibernateCAP = tr.com.srdc.icardea.hibernate.CAP.createCAP();
			// Initialize the properties of the persistent object here
			ltrcomsrdcicardeahibernateCAP.save();
			tr.com.srdc.icardea.hibernate.SENSINGMSMT ltrcomsrdcicardeahibernateSENSINGMSMT = tr.com.srdc.icardea.hibernate.SENSINGMSMT.createSENSINGMSMT();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lEADCHNLMSMT
			ltrcomsrdcicardeahibernateSENSINGMSMT.save();
			tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD ltrcomsrdcicardeahibernatePACINGTHRESHOLD = tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD.createPACINGTHRESHOLD();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lEADCHNLMSMT
			ltrcomsrdcicardeahibernatePACINGTHRESHOLD.save();
			tr.com.srdc.icardea.hibernate.IMPEDANCE ltrcomsrdcicardeahibernateIMPEDANCE = tr.com.srdc.icardea.hibernate.IMPEDANCE.createIMPEDANCE();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lEADCHNLMSMT
			ltrcomsrdcicardeahibernateIMPEDANCE.save();
			tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT ltrcomsrdcicardeahibernateLEADHVCHANNELMSMT = tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT.createLEADHVCHANNELMSMT();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mSMT
			ltrcomsrdcicardeahibernateLEADHVCHANNELMSMT.save();
			tr.com.srdc.icardea.hibernate.SET ltrcomsrdcicardeahibernateSET = tr.com.srdc.icardea.hibernate.SET.createSET();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lEADCHNLSET, lEADHVCHANNELSET, zONE, tACHYTHERAPYSET, bRADYSET, mAGNET, cRTSET, system
			ltrcomsrdcicardeahibernateSET.save();
			tr.com.srdc.icardea.hibernate.CRTSET ltrcomsrdcicardeahibernateCRTSET = tr.com.srdc.icardea.hibernate.CRTSET.createCRTSET();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sET
			ltrcomsrdcicardeahibernateCRTSET.save();
			tr.com.srdc.icardea.hibernate.MAGNET ltrcomsrdcicardeahibernateMAGNET = tr.com.srdc.icardea.hibernate.MAGNET.createMAGNET();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sET
			ltrcomsrdcicardeahibernateMAGNET.save();
			tr.com.srdc.icardea.hibernate.PACING ltrcomsrdcicardeahibernatePACING = tr.com.srdc.icardea.hibernate.PACING.createPACING();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lEADCHNLSET
			ltrcomsrdcicardeahibernatePACING.save();
			tr.com.srdc.icardea.hibernate.SHOCKVECTOR ltrcomsrdcicardeahibernateSHOCKVECTOR = tr.com.srdc.icardea.hibernate.SHOCKVECTOR.createSHOCKVECTOR();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lEADHVCHANNELSET
			ltrcomsrdcicardeahibernateSHOCKVECTOR.save();
			tr.com.srdc.icardea.hibernate.BRADYSET ltrcomsrdcicardeahibernateBRADYSET = tr.com.srdc.icardea.hibernate.BRADYSET.createBRADYSET();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sET
			ltrcomsrdcicardeahibernateBRADYSET.save();
			tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET ltrcomsrdcicardeahibernateTACHYTHERAPYSET = tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET.createTACHYTHERAPYSET();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sET
			ltrcomsrdcicardeahibernateTACHYTHERAPYSET.save();
			tr.com.srdc.icardea.hibernate.ZONE ltrcomsrdcicardeahibernateZONE = tr.com.srdc.icardea.hibernate.ZONE.createZONE();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sET
			ltrcomsrdcicardeahibernateZONE.save();
			tr.com.srdc.icardea.hibernate.HEART_RATE ltrcomsrdcicardeahibernateHEART_RATE = tr.com.srdc.icardea.hibernate.HEART_RATE.createHEART_RATE();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sTAT
			ltrcomsrdcicardeahibernateHEART_RATE.save();
			tr.com.srdc.icardea.hibernate.AT ltrcomsrdcicardeahibernateAT = tr.com.srdc.icardea.hibernate.AT.createAT();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sTAT
			ltrcomsrdcicardeahibernateAT.save();
			tr.com.srdc.icardea.hibernate.EPISODESTAT ltrcomsrdcicardeahibernateEPISODESTAT = tr.com.srdc.icardea.hibernate.EPISODESTAT.createEPISODESTAT();
			// Initialize the properties of the persistent object here
			ltrcomsrdcicardeahibernateEPISODESTAT.save();
			tr.com.srdc.icardea.hibernate.LEADCHNLMSMT ltrcomsrdcicardeahibernateLEADCHNLMSMT = tr.com.srdc.icardea.hibernate.LEADCHNLMSMT.createLEADCHNLMSMT();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : iMPEDANCE, pACINGTHRESHOLD, sENSINGMSMT, mSMT
			ltrcomsrdcicardeahibernateLEADCHNLMSMT.save();
			tr.com.srdc.icardea.hibernate.STAT ltrcomsrdcicardeahibernateSTAT = tr.com.srdc.icardea.hibernate.STAT.createSTAT();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tACHYTHERAPYSTAT, cRTSTAT, bRADYSTAT, aT, hEART_RATE, system
			ltrcomsrdcicardeahibernateSTAT.save();
			tr.com.srdc.icardea.hibernate.LEADCHNLSET ltrcomsrdcicardeahibernateLEADCHNLSET = tr.com.srdc.icardea.hibernate.LEADCHNLSET.createLEADCHNLSET();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pACING, sENSINGSET, sET
			ltrcomsrdcicardeahibernateLEADCHNLSET.save();
			tr.com.srdc.icardea.hibernate.SENSINGSET ltrcomsrdcicardeahibernateSENSINGSET = tr.com.srdc.icardea.hibernate.SENSINGSET.createSENSINGSET();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lEADCHNLSET
			ltrcomsrdcicardeahibernateSENSINGSET.save();
			tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET ltrcomsrdcicardeahibernateLEADHVCHANNELSET = tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET.createLEADHVCHANNELSET();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sHOCKVECTOR, sET
			ltrcomsrdcicardeahibernateLEADHVCHANNELSET.save();
			tr.com.srdc.icardea.hibernate.BRADYSTAT ltrcomsrdcicardeahibernateBRADYSTAT = tr.com.srdc.icardea.hibernate.BRADYSTAT.createBRADYSTAT();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sTAT
			ltrcomsrdcicardeahibernateBRADYSTAT.save();
			tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT ltrcomsrdcicardeahibernateTACHYTHERAPYSTAT = tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT.createTACHYTHERAPYSTAT();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sTAT
			ltrcomsrdcicardeahibernateTACHYTHERAPYSTAT.save();
			tr.com.srdc.icardea.hibernate.CRTSTAT ltrcomsrdcicardeahibernateCRTSTAT = tr.com.srdc.icardea.hibernate.CRTSTAT.createCRTSTAT();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sTAT
			ltrcomsrdcicardeahibernateCRTSTAT.save();
			tr.com.srdc.icardea.hibernate.EPISODEROOT ltrcomsrdcicardeahibernateEPISODEROOT = tr.com.srdc.icardea.hibernate.EPISODEROOT.createEPISODEROOT();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : system
			ltrcomsrdcicardeahibernateEPISODEROOT.save();
			tr.com.srdc.icardea.hibernate.BinaryData ltrcomsrdcicardeahibernateBinaryData = tr.com.srdc.icardea.hibernate.BinaryData.createBinaryData();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : observation
			ltrcomsrdcicardeahibernateBinaryData.save();
			tr.com.srdc.icardea.hibernate.System ltrcomsrdcicardeahibernateSystem = tr.com.srdc.icardea.hibernate.System.createSystem();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ePISODEROOT, sTAT, sET, mSMT, sESS, lEAD2, pG, observation
			ltrcomsrdcicardeahibernateSystem.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateICardeaData createICardeaData = new CreateICardeaData();
			try {
				createICardeaData.createTestData();
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
