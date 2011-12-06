/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.srdc.icardea.ihe.cm.careManager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import tr.com.srdc.icardea.hibernate.Concern;
import tr.com.srdc.icardea.hibernate.ConcernCriteria;
import tr.com.srdc.icardea.hibernate.EHRPHRData;
import tr.com.srdc.icardea.hibernate.EHRPHRDataCriteria;
import tr.com.srdc.icardea.hibernate.Encounter;
import tr.com.srdc.icardea.hibernate.EncounterCriteria;
import tr.com.srdc.icardea.hibernate.ICardeaPersistentManager;
import tr.com.srdc.icardea.hibernate.ImagingResult;
import tr.com.srdc.icardea.hibernate.ImagingResultCriteria;
import tr.com.srdc.icardea.hibernate.Immunization;
import tr.com.srdc.icardea.hibernate.ImmunizationCriteria;
import tr.com.srdc.icardea.hibernate.Medication;
import tr.com.srdc.icardea.hibernate.MedicationCriteria;
import tr.com.srdc.icardea.hibernate.Patient;
import tr.com.srdc.icardea.hibernate.PatientCriteria;
import tr.com.srdc.icardea.hibernate.Problem;
import tr.com.srdc.icardea.hibernate.ProblemCriteria;
import tr.com.srdc.icardea.hibernate.Procedure;
import tr.com.srdc.icardea.hibernate.ProcedureCriteria;
import tr.com.srdc.icardea.hibernate.VitalSign;
import tr.com.srdc.icardea.hibernate.VitalSignCriteria;

/**
 *
 * @author ibrahim
 */
public class EHRPHRDataRetriever {

	public static Logger logger = Logger.getLogger(EHRPHRDataRetriever.class);

	public Patient retrieveEHRPHRDataByPatientID(String patientID) { // CIED id giriliyor
		try {
			ICardeaPersistentManager.instance().getSession().clear();
			PatientCriteria patientCriteria = new PatientCriteria();
			patientCriteria.patientIdentifier.eq(patientID);
			Patient[] result = Patient.listPatientByCriteria(patientCriteria);
			if (result.length > 0) {
				return result[0];
			}
		} catch (PersistentException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public Patient retrieveEHRPHRDataByCitizenshipNumber(String citizenshipNumber) { // citizenship Number
		try {
			ICardeaPersistentManager.instance().getSession().clear();
			PatientCriteria patientCriteria = new PatientCriteria();
			patientCriteria.citizenshipNumber.eq(citizenshipNumber);
			Patient[] result = Patient.listPatientByCriteria(patientCriteria);
			if (result.length > 0) {
				return result[0];
			}
		} catch (PersistentException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public Object[] retriveEHRPHRData(String patientID, String informationType) {
		return retriveEHRPHRData(patientID, false, informationType, null, false, false);
	}

	public Object[] retriveEHRPHRDataSecure(String patientID, String informationType) {
		String resource = "";
		String role = "doctor";
		if (informationType.equals("Problem") || informationType.equals("C0033213")) {
			resource = "Condition";
		} else if (informationType.equals("Medication") || informationType.equals("C2598133")) {
			resource = "Medication";
		} else if (informationType.equals("Procedure") || informationType.equals("C1948041")) {
			resource = "Operation";
		} else if (informationType.equals("ImagingResult") || informationType.equals("C1254595")
			|| informationType.equals("LaboratoryResult")) {
			resource = "TestResult";
		} else if (informationType.equals("VitalSign") || informationType.equals("C0518766")) {
			resource = "BasicHealth";
		} else if (informationType.equals("Concern") || informationType.equals("C2699424")) {
			resource = "Condition";
		} else if (informationType.equals("Encounter") || informationType.equals("C1947978")) {
			resource = "Operation";
		} else if (informationType.equals("Immunization") || informationType.equals("C0020971")) {
			resource = "Immunization";
		}
		boolean isAllowed = tr.com.srdc.icardea.consenteditor.webservice.client.ConsentManagerImplServiceTest.getInstance().grantRequest(patientID, role, resource);
		if (isAllowed) {
			return retriveEHRPHRData(patientID, false, informationType, null, false, false);
		} else {
			return null;
		}
	}

	public Object[] retriveEHRPHRData(String patientID, String informationType, String code) {
		return retriveEHRPHRData(patientID, false, informationType, code, false, false);
	}

	// considerEHRPHRDistinction true set edilirse --> fromPHR true ise sadece PHR'dan gelenleri doner
	public Object[] retriveEHRPHRData(String patientID, boolean isCitizenShipNumber,
		String informationType, String code, boolean considerEHRPHRDistinction, boolean fromPHR) {
		try {
			ICardeaPersistentManager.instance().getSession().clear();
			if (informationType.equals("Problem") || informationType.equals("C0033213")) {
				ProblemCriteria criteria = new ProblemCriteria();
				criteria.effectiveTimeLow.order(false);

				if (code != null) {
					criteria.problemValue.eq(code);
				}
				//criteria.problemCode.eq(code);
				// TODO: Digerleri icinde degisebilir. Yani hep code kismina bakiliyor.
				// Ama value'ya bakmak gerekebilir. Aslinda guideline'a ve gelen data'ya gore sekillenecek.

				EHRPHRDataCriteria ehrPhrDataCriteria = criteria.createEHRPHRDataCriteria();
				if (considerEHRPHRDistinction) {
					if (fromPHR) {
						ehrPhrDataCriteria.isEHR.eq(0);
					} else {
						ehrPhrDataCriteria.isEHR.eq(1);
					}
				}
				PatientCriteria patientCriteria = ehrPhrDataCriteria.createPatientCriteria();
				if (isCitizenShipNumber) {
					patientCriteria.citizenshipNumber.eq(patientID);
				} else {
					patientCriteria.patientIdentifier.eq(patientID);
				}
				// Concern'in altindakilere de bak
				return Problem.listProblemByCriteria(criteria);
			} else if (informationType.equals("Medication") || informationType.equals("C2598133")) {
				MedicationCriteria criteria = new MedicationCriteria();
				criteria.effectiveTime.order(false);
				if (code != null) {
					criteria.drugCode.eq(code);
				}
				EHRPHRDataCriteria ehrPhrDataCriteria = criteria.createEHRPHRDataCriteria();
				if (considerEHRPHRDistinction) {
					if (fromPHR) {
						ehrPhrDataCriteria.isEHR.eq(0);
					} else {
						ehrPhrDataCriteria.isEHR.eq(1);
					}
				}
				PatientCriteria patientCriteria = ehrPhrDataCriteria.createPatientCriteria();
				if (isCitizenShipNumber) {
					patientCriteria.citizenshipNumber.eq(patientID);
				} else {
					patientCriteria.patientIdentifier.eq(patientID);
				}

				Medication meds[] = Medication.listMedicationByCriteria(criteria);

				return meds;
			} else if (informationType.equals("Procedure") || informationType.equals("C1948041")) {
				ProcedureCriteria criteria = new ProcedureCriteria();
				criteria.effectiveTimeLow.order(false);
				if (code != null) {
					if (code != "") {
						criteria.procedureCode.eq(code);
					}
				}

				EHRPHRDataCriteria ehrPhrDataCriteria = criteria.createEHRPHRDataCriteria();
				if (considerEHRPHRDistinction) {
					if (fromPHR) {
						ehrPhrDataCriteria.isEHR.eq(0);
					} else {
						ehrPhrDataCriteria.isEHR.eq(1);
					}
				}
				PatientCriteria patientCriteria = ehrPhrDataCriteria.createPatientCriteria();
				if (isCitizenShipNumber) {
					patientCriteria.citizenshipNumber.eq(patientID);
				} else {
					patientCriteria.patientIdentifier.eq(patientID);
				}

				return Procedure.listProcedureByCriteria(criteria);
			} else if (informationType.equals("ImagingResult") || informationType.equals("C1254595") || informationType.equals("LaboratoryResult")) {
				ImagingResultCriteria criteria = new ImagingResultCriteria();
				criteria.effectiveTime.order(false);
				if (code != null) {
					criteria.labResultCode.eq(code);
				}
				EHRPHRDataCriteria ehrPhrDataCriteria = criteria.createEHRPHRDataCriteria();
				if (considerEHRPHRDistinction) {
					if (fromPHR) {
						ehrPhrDataCriteria.isEHR.eq(0);
					} else {
						ehrPhrDataCriteria.isEHR.eq(1);
					}
				}
				PatientCriteria patientCriteria = ehrPhrDataCriteria.createPatientCriteria();
				if (isCitizenShipNumber) {
					patientCriteria.citizenshipNumber.eq(patientID);
				} else {
					patientCriteria.patientIdentifier.eq(patientID);
				}

				return ImagingResult.listImagingResultByCriteria(criteria);
			} else if (informationType.equals("VitalSign") || informationType.equals("C0518766")) {
				VitalSignCriteria criteria = new VitalSignCriteria();
				criteria.effectiveTime.order(false);
				if (code != null) {
					criteria.careProvisionCode.eq(code);
				}
				EHRPHRDataCriteria ehrPhrDataCriteria = criteria.createEHRPHRDataCriteria();
				if (considerEHRPHRDistinction) {
					if (fromPHR) {
						ehrPhrDataCriteria.isEHR.eq(0);
					} else {
						ehrPhrDataCriteria.isEHR.eq(1);
					}
				}
				PatientCriteria patientCriteria = ehrPhrDataCriteria.createPatientCriteria();
				if (isCitizenShipNumber) {
					patientCriteria.citizenshipNumber.eq(patientID);
				} else {
					patientCriteria.patientIdentifier.eq(patientID);
				}

				return VitalSign.listVitalSignByCriteria(criteria);
			} else if (informationType.equals("Concern") || informationType.equals("C2699424")) {
				ConcernCriteria criteria = new ConcernCriteria();
				criteria.effectiveTimeLow.order(false);
				if (code != null) {
					criteria.allergyCode.eq(code);
				}
				EHRPHRDataCriteria ehrPhrDataCriteria = criteria.createEHRPHRDataCriteria();
				if (considerEHRPHRDistinction) {
					if (fromPHR) {
						ehrPhrDataCriteria.isEHR.eq(0);
					} else {
						ehrPhrDataCriteria.isEHR.eq(1);
					}
				}
				PatientCriteria patientCriteria = ehrPhrDataCriteria.createPatientCriteria();
				if (isCitizenShipNumber) {
					patientCriteria.citizenshipNumber.eq(patientID);
				} else {
					patientCriteria.patientIdentifier.eq(patientID);
				}

				return Concern.listConcernByCriteria(criteria);
			} else if (informationType.equals("Encounter") || informationType.equals("C1947978")) {
				EncounterCriteria criteria = new EncounterCriteria();
				criteria.effectiveTimeLow.order(false);
				if (code != null) {
					criteria.encounterCode.eq(code);
				}
				EHRPHRDataCriteria ehrPhrDataCriteria = criteria.createEHRPHRDataCriteria();
				if (considerEHRPHRDistinction) {
					if (fromPHR) {
						ehrPhrDataCriteria.isEHR.eq(0);
					} else {
						ehrPhrDataCriteria.isEHR.eq(1);
					}
				}
				PatientCriteria patientCriteria = ehrPhrDataCriteria.createPatientCriteria();
				if (isCitizenShipNumber) {
					patientCriteria.citizenshipNumber.eq(patientID);
				} else {
					patientCriteria.patientIdentifier.eq(patientID);
				}

				return Encounter.listEncounterByCriteria(criteria);
			} else if (informationType.equals("Immunization") || informationType.equals("C0020971")) {
				ImmunizationCriteria criteria = new ImmunizationCriteria();
				criteria.effectiveTime.order(false);
				if (code != null) {
					criteria.drugCode.eq(code);
				}
				EHRPHRDataCriteria ehrPhrDataCriteria = criteria.createEHRPHRDataCriteria();
				if (considerEHRPHRDistinction) {
					if (fromPHR) {
						ehrPhrDataCriteria.isEHR.eq(0);
					} else {
						ehrPhrDataCriteria.isEHR.eq(1);
					}
				}
				PatientCriteria patientCriteria = ehrPhrDataCriteria.createPatientCriteria();
				patientCriteria.patientIdentifier.eq(patientID);

				return Immunization.listImmunizationByCriteria(criteria);
			} else if (informationType.equals("Demographics") || informationType.equals("C0011298")) {
				String[] result = null;
				Patient patient = null;
				if (isCitizenShipNumber) {
					patient = retrieveEHRPHRDataByCitizenshipNumber(patientID);
				} else {
					patient = retrieveEHRPHRDataByPatientID(patientID);
				}
				if (code != null) {
					if (code.equals("dateTimeOfBirth")) {
						result = new String[1];
						result[0] = patient.getDateTimeOfBirth();
					}
				}

				return result;
			} else if (informationType.equals("Patient")) {
				String[] result = null;
				Patient patient = null;
				if (isCitizenShipNumber) {
					patient = retrieveEHRPHRDataByCitizenshipNumber(patientID);
				} else {
					patient = retrieveEHRPHRDataByPatientID(patientID);
				}
				if (code != null) {
					if (code.equals("dateTimeOfBirth")) {
						result = new String[1];
						result[0] = patient.getDateTimeOfBirth();
					}
				}

				return result;
			}

		} catch (PersistentException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public void recordData(String patientID, String tableCode, String dataCode, String dataName, String value) {
		try {
			ICardeaPersistentManager.instance().getSession().clear();
			PersistentTransaction transaction = null;
			transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();
			PatientCriteria patientCriteria = new PatientCriteria();
			patientCriteria.citizenshipNumber.eq(patientID); // Bunu kontrol et.. normal id'de olabilir mi acaba?
			Patient[] patientList = Patient.listPatientByCriteria(patientCriteria);
			Patient patientDB;
			patientDB = patientList[0];
			EHRPHRData ehrPhrData = EHRPHRData.createEHRPHRData();
			ehrPhrData.setIsEHR(0);

			ehrPhrData.setPcc9QueryId("1111");
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			Date date = new Date();
			ehrPhrData.setMessageDateTime(dateFormat.format(date));
			patientDB.eHRPHRData.add(ehrPhrData);

			if (tableCode.equals("Problem") || tableCode.equals("C0033213")) {
				Problem problem = Problem.createProblem();
				problem.setCareProvisionCode("MEDCCAT");
				problem.setEffectiveTimeHigh(dateFormat.format(date));
				problem.setEffectiveTimeLow(dateFormat.format(date));
				problem.setProblemCode(dataCode);
				problem.setProblemText(dataName);
				problem.setProblemValue(value);
				//problem.setProblemValueCodeSystem(problemValueCodeSystem);
				problem.setProblemValueCodeSystem("UMLS");
				problem.setProblemValueOriginalText(value);
				problem.setSeverity("M");
				ehrPhrData.setProblem(problem);
			} else if (tableCode.equals("Medication") || tableCode.equals("C2598133")) {
			} else if (tableCode.equals("Procedure") || tableCode.equals("C1948041")) {
			} else if (tableCode.equals("ImagingResult") || tableCode.equals("C1254595")) {
			} else if (tableCode.equals("VitalSign") || tableCode.equals("C0518766")) {
			} else if (tableCode.equals("Concern") || tableCode.equals("C2699424")) {
			} else if (tableCode.equals("Encounter") || tableCode.equals("C1947978")) {
			} else if (tableCode.equals("Immunization") || tableCode.equals("C0020971")) {
			}
			patientDB.save();
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String argv[]) {
		/*Object objects[] = EHRPHRDataRetriever.retriveEHRPHRData("149202063490", true, "Medication", null, true, false);
		for (int i = 0; i < objects.length; i++) {
		Medication med = (Medication) objects[i];
		logger.info("Medication:" + med.getDrugCode());
		}*/
		EHRPHRDataRetriever retriever = new EHRPHRDataRetriever();
		Object objects[] = retriever.retriveEHRPHRData("149202063491", true, "C1254595", null, false, false);
		logger.info("Length:" + objects.length);
	}
}
