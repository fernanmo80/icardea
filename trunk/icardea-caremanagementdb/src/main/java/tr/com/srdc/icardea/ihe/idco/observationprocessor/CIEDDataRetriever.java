/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.srdc.icardea.ihe.idco.observationprocessor;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.orm.PersistentException;
import tr.com.srdc.icardea.hibernate.CIEDData;
import tr.com.srdc.icardea.hibernate.CIEDDataCriteria;
import tr.com.srdc.icardea.hibernate.ICardeaPersistentManager;
import tr.com.srdc.icardea.hibernate.LEADCHNLMSMT;
import tr.com.srdc.icardea.hibernate.LEADCHNLSET;
import tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET;
import tr.com.srdc.icardea.hibernate.MSMT;
import tr.com.srdc.icardea.hibernate.Observation;
import tr.com.srdc.icardea.hibernate.ObservationCriteria;
import tr.com.srdc.icardea.hibernate.Patient;
import tr.com.srdc.icardea.hibernate.PatientCriteria;
import tr.com.srdc.icardea.hibernate.Problem;
import tr.com.srdc.icardea.hibernate.ProblemCriteria;
import tr.com.srdc.icardea.hibernate.SET;
import tr.com.srdc.icardea.hibernate.STAT;
import tr.com.srdc.icardea.hibernate.System;

/**
 * 
 * @author ibrahim
 */
public class CIEDDataRetriever {

	public static Logger logger = Logger.getLogger(CIEDDataRetriever.class);

	public CIEDData[] retrieveCIEDDataByPatientID(String patientID) {
		try {
			ICardeaPersistentManager.instance().getSession().clear();
			PatientCriteria patientCriteria = new PatientCriteria();
			patientCriteria.patientIdentifier.eq(patientID);
			Patient[] patientList = Patient.listPatientByCriteria(patientCriteria);
			CIEDData[] result = patientList[0].cIEDData1.toArray();
			return result;
		} catch (PersistentException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public CIEDData[] retrieveCIEDDataByPatientIDSecure(String patientID) {
		String role = "doctor";
		boolean isAllowed = tr.com.srdc.icardea.consenteditor.webservice.client.ConsentManagerImplServiceTest.getInstance().grantRequest(patientID, role, "CIEDREPORT");
		if (isAllowed) {
			return retrieveCIEDDataByPatientID(patientID);
		}	
		return null;
	}

	public CIEDData[] retrieveCIEDDataByCitizenShipNumber(String patientID) {
		logger.info("Retrieving the CIED Data of patient:" + patientID);
		try {
			ICardeaPersistentManager.instance().getSession().clear();
			PatientCriteria patientCriteria = new PatientCriteria();
			patientCriteria.citizenshipNumber.eq(patientID);
			Patient[] patientList = Patient.listPatientByCriteria(patientCriteria);
			CIEDData[] result = patientList[0].cIEDData1.toArray();
			return result;
		} catch (PersistentException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public CIEDData[] retrieveCIEDDataByCitizenShipNumberSecure(String patientID) {
		String role = "doctor";
		boolean isAllowed = tr.com.srdc.icardea.consenteditor.webservice.client.ConsentManagerImplServiceTest.getInstance().grantRequest(patientID, role, "CIEDREPORT");
		if (isAllowed) {
			return retrieveCIEDDataByCitizenShipNumber(patientID);
		}
		return null;
	}

	public CIEDData retrieveLatestCIEDDataByPatientID(String patientID, boolean isCIEDNumber) {
		try {
			ICardeaPersistentManager.instance().getSession().clear();
			logger.info("Patient ID:" + patientID);
			CIEDDataCriteria cIEDDataCriteria = new CIEDDataCriteria();
			cIEDDataCriteria.receivedTime.order(false);
			PatientCriteria patientCriteria = cIEDDataCriteria.createPatient1Criteria();
			if (isCIEDNumber) {
				patientCriteria.patientIdentifier.eq(patientID);
			} else {
				patientCriteria.citizenshipNumber.eq(patientID);
			}
			CIEDData[] result = CIEDData.listCIEDDataByCriteria(cIEDDataCriteria);
			return result[0];
		} catch (PersistentException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public CIEDData retrieveLatestCIEDDataByPatientIDSecure(String patientID, boolean isCIEDNumber) {
		String role = "doctor";
		boolean isAllowed = tr.com.srdc.icardea.consenteditor.webservice.client.ConsentManagerImplServiceTest.getInstance().grantRequest(patientID, role, "CIEDREPORT");
		if (isAllowed) {
			return retrieveLatestCIEDDataByPatientID(patientID, isCIEDNumber);	
		}	
		return null;
	}

	public String getPDFBase64Data(String patientID, boolean isCIEDNumber) {
		CIEDData ciedData = retrieveLatestCIEDDataByPatientID(patientID, isCIEDNumber);
		return ciedData.getObservationfillerOrderNumber().getBase64String();
	}

	public String getPDFBase64DataSecure(String patientID, boolean isCIEDNumber) {
		String role = "doctor";
		boolean isAllowed = tr.com.srdc.icardea.consenteditor.webservice.client.ConsentManagerImplServiceTest.getInstance().grantRequest(patientID, role, "CIEDREPORT");
		if (isAllowed) {
			return getPDFBase64Data(patientID, isCIEDNumber);	
		}
		
		return null;
	}

	public Object[] retrieveValue(String patientID, String mdcIdcCode, boolean hasSemanticCategory, boolean isCIEDNumber)
		throws Exception {
		logger.info("Patient ID:" + patientID + " mdcIdcCode:" + mdcIdcCode + " hasSemanticCategory:" + hasSemanticCategory + " isCIEDno:" + isCIEDNumber);
		MDC_IDC_Codes codes = new MDC_IDC_Codes();
		String classesAndOperation = codes.get(mdcIdcCode);
		String mdcClass = codes.getClass(mdcIdcCode);
		// CIEDData ciedData = retrieveLatestCIEDDataByPatientID(patientID);
		String[] parts = classesAndOperation.split("\\.");
		String operation = parts[1];
		operation = operation.toLowerCase();
		char[] opCharArray = operation.toCharArray();
		opCharArray[0] = Character.toUpperCase(opCharArray[0]);
		operation = new String(opCharArray);
		Object[] objects = retrieveObject(patientID, mdcClass, isCIEDNumber);
		if (hasSemanticCategory) {
			return objects;
		}
		List<String> list = new ArrayList();
		for (int i = 0; i < objects.length; i++) {
			Object object = objects[i];
			Class parameter[] = new Class[0];
			Method method = object.getClass().getMethod("get" + operation,
				parameter);

			Object arglist[] = new Object[0];
			Object returnObject = method.invoke(object, arglist);
			logger.info(" Return Object:" + (String) returnObject);
			list.add((String) returnObject);
		}
		return list.toArray(new String[0]);
	}

	public String[] retrieveValue2(String patientID, String mdcString, boolean isCIEDNumber)
		throws Exception {
		MDC_IDC_Codes codes = new MDC_IDC_Codes();
		// CIEDData ciedData = retrieveLatestCIEDDataByPatientID(patientID);
		String classes[] = mdcString.split("/");
		// String operation = classes[1];
		// operation = operation.toLowerCase();
		// char[] opCharArray = operation.toCharArray();
		// opCharArray[0] = Character.toUpperCase(opCharArray[0]);
		// operation = new String(opCharArray);

		Object[] objects;
		CIEDData ciedData = retrieveLatestCIEDDataByPatientID(patientID, isCIEDNumber);

		// There are at most 4 level in the object hierarchy
		Object[] data = new Object[4];
		String operation = "";
		data[0] = ciedData.getObservationfillerOrderNumber().getSystem();
		for (int i = 0; i < classes.length; i++) {
			String mdcClass = classes[i];
			String previousMdcClass = (i == 0) ? "Patient" : classes[i - 1];

			if (mdcClass.equals("Patient")) {
				data[i] = ciedData.getPatient1();
			} else if (mdcClass.startsWith("Problem")) {
				ProblemCriteria problemCriteria = new ProblemCriteria();
				if (mdcClass.contains("[")) {
					String problemValue = mdcClass.substring(mdcClass.indexOf('=') + 1, mdcClass.indexOf(']'));
					logger.info("Problem Value:"
						+ problemValue);
					problemCriteria.problemValue.eq(problemValue);
				}
				Problem[] problems = Problem.listProblemByCriteria(problemCriteria);
				data[i] = problems[0];
			} else if (mdcClass.startsWith("CIEDData")) {
				data[i] = ciedData;
			} else if (mdcClass.startsWith("Observation")) {
				ObservationCriteria observationCriteria = new ObservationCriteria();
				Observation[] observations = Observation.listObservationByCriteria(observationCriteria);
				if (observations.length == 0) {
					logger.info("Observation could not be found!!");
				} else {
					data[i] = observations[0];
				}
			} else if (mdcClass.startsWith("@")) {
				operation = mdcClass.substring(1);
				// operation = operation.toLowerCase();
				char[] opCharArray = operation.toCharArray();
				opCharArray[0] = Character.toUpperCase(opCharArray[0]);
				operation = new String(opCharArray);
				data[i] = data[i - 1];
			}
		}

		Object returnObject = data[classes.length - 1];

		if (returnObject instanceof Object[]) {
			objects = (Object[]) returnObject;
		} else {
			Object[] array = new Object[1];
			array[0] = returnObject;

			objects = array;
		}
		List<String> list = new ArrayList();
		for (int i = 0; i < objects.length; i++) {
			Object object = objects[i];
			Class parameter[] = new Class[0];
			Method method = object.getClass().getMethod("get" + operation,
				parameter);
			Object arglist[] = new Object[0];
			Logger.getLogger(CIEDDataRetriever.class).log(Level.INFO,
				method.toString());
			returnObject = method.invoke(object, arglist);
			if (returnObject == null) {
				returnObject = "";
			}
			list.add((String) returnObject);
		}

		return list.toArray(new String[0]);
	}

	// TODO: Her seferinde tum CIED data'yi cekiyor.. Oyle yapmasin Criteria
	// objeleriyle sen ufak tablolari sorgula...
	// Ne de olsa hangi tabloyu sorgulayacagini biliyorsun.
	// SANIRIM her seferinde cekmiyor. Cachleme var herhalde..
	public Object[] retrieveObject(String patientID, String className, boolean isCIEDNumber)
		throws Exception {
		MDC_IDC_Codes codes = new MDC_IDC_Codes();
		// System:STAT:TACHYTHERAPYSTAT
		String classesAndOperation = codes.getImplClass(className);
		logger.info("Classes and operation:" + classesAndOperation);
		CIEDData ciedData = retrieveLatestCIEDDataByPatientID(patientID, isCIEDNumber);
		String[] classes = classesAndOperation.split(":");

		// There are at most 4 level in the object hierarchy
		Object[] object = new Object[4];

		String immediateRoot = classes[classes.length - 2];
		for (int i = 0; i < classes.length; i++) {
			String mdcClass = classes[i];
			String previousMdcClass = (i == 0) ? "System" : classes[i - 1];
			logger.info("MDC Class:" + mdcClass);
			if (mdcClass.equals("System")) {
				object[i] = ciedData.getObservationfillerOrderNumber().getSystem();
			} else if (mdcClass.equals("PG")) {
				object[i] = ((System) object[i - 1]).getpG();
			} else if (mdcClass.equals("LEAD")) {
				object[i] = ((System) object[i - 1]).lEAD2.toArray();
			} else if (mdcClass.equals("SESS")) {
				object[i] = ((System) object[i - 1]).getsESS();
			} else if (mdcClass.equals("MSMT")) {
				object[i] = ((System) object[i - 1]).getmSMT();
			} else if (mdcClass.equals("BATTERY")) {
				object[i] = ((MSMT) object[i - 1]).bATTERY2.toArray();
			} else if (mdcClass.equals("CAP")) {
				object[i] = ((MSMT) object[i - 1]).cAP.toArray();
			} else if (mdcClass.startsWith("LEADCHNLMSMT")) {
				String[] parts = mdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLMSMT leadchnl = null;

				for (int j = 0; j < ciedData.getObservationfillerOrderNumber().getSystem().getmSMT().lEADCHNLMSMT.size(); j++) {
					LEADCHNLMSMT temp = ciedData.getObservationfillerOrderNumber().getSystem().getmSMT().lEADCHNLMSMT.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}
				object[i] = leadchnl;
			} else if (mdcClass.equals("SENSINGMSMT")) {
				String[] parts = previousMdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLMSMT leadchnl = null;
				for (int j = 0; j < ciedData.getObservationfillerOrderNumber().getSystem().getmSMT().lEADCHNLMSMT.size(); j++) {
					LEADCHNLMSMT temp = ciedData.getObservationfillerOrderNumber().getSystem().getmSMT().lEADCHNLMSMT.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}

				object[i] = leadchnl.getsENSINGMSMT();
			} else if (mdcClass.equals("PACING_THRESHOLD")) {
				String[] parts = previousMdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLMSMT leadchnl = null;
				for (int j = 0; j < ciedData.getObservationfillerOrderNumber().getSystem().getmSMT().lEADCHNLMSMT.size(); j++) {
					LEADCHNLMSMT temp = ciedData.getObservationfillerOrderNumber().getSystem().getmSMT().lEADCHNLMSMT.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}

				object[i] = leadchnl.getpACINGTHRESHOLD();
			} else if (mdcClass.equals("IMPEDANCE")) {
				String[] parts = previousMdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLMSMT leadchnl = null;
				for (int j = 0; j < ciedData.getObservationfillerOrderNumber().getSystem().getmSMT().lEADCHNLMSMT.size(); j++) {
					LEADCHNLMSMT temp = ciedData.getObservationfillerOrderNumber().getSystem().getmSMT().lEADCHNLMSMT.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}

				object[i] = leadchnl.getiMPEDANCE();
			} else if (mdcClass.startsWith("LEADCHNLSET")) {
				String[] parts = mdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLSET leadchnl = null;

				for (int j = 0; j < ciedData.getObservationfillerOrderNumber().getSystem().getsET().lEADCHNLSET.size(); j++) {
					LEADCHNLSET temp = ciedData.getObservationfillerOrderNumber().getSystem().getsET().lEADCHNLSET.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}
				object[i] = leadchnl;
			} else if (mdcClass.equals("PACING")) {
				String[] parts = previousMdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLSET leadchnl = null;

				for (int j = 0; j < ciedData.getObservationfillerOrderNumber().getSystem().getsET().lEADCHNLSET.size(); j++) {
					LEADCHNLSET temp = ciedData.getObservationfillerOrderNumber().getSystem().getsET().lEADCHNLSET.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}
				object[i] = leadchnl.getpACING();
			} else if (mdcClass.equals("SENSINGSET")) {
				String[] parts = mdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLSET leadchnl = null;

				for (int j = 0; j < ciedData.getObservationfillerOrderNumber().getSystem().getsET().lEADCHNLSET.size(); j++) {
					LEADCHNLSET temp = ciedData.getObservationfillerOrderNumber().getSystem().getsET().lEADCHNLSET.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}
				object[i] = leadchnl.getsENSINGSET();
			} else if (mdcClass.equals("LEADHVCHNLMSMT")) {
				object[i] = ((MSMT) object[i - 1]).lEADHVCHANNELMSMT.toArray();
			} else if (mdcClass.equals("LEADHVCHNLSET")) {
				object[i] = ((SET) object[i - 1]).getlEADHVCHANNELSET();
			} else if (mdcClass.equals("SET")) {
				object[i] = ((System) object[i - 1]).getsET();
			} else if (mdcClass.equals("CRTSTAT")) {
				object[i] = ((STAT) object[i - 1]).getcRTSTAT();
			} else if (mdcClass.equals("CRTSET")) {
				object[i] = ((SET) object[i - 1]).getcRTSET();
			} else if (mdcClass.equals("MAGNET")) {
				object[i] = ((SET) object[i - 1]).getmAGNET();
			} else if (mdcClass.equals("SHOCK_VECTOR")) {
				object[i] = ((LEADHVCHANNELSET) object[i - 1]).getsHOCKVECTOR();
			} else if (mdcClass.equals("BRADYSET")) {
				object[i] = ((SET) object[i - 1]).getbRADYSET();
			} else if (mdcClass.equals("BRADYSTAT")) {
				object[i] = ((STAT) object[i - 1]).getbRADYSTAT();
			} else if (mdcClass.equals("TACHYTHERAPYSET")) {
				object[i] = ((SET) object[i - 1]).gettACHYTHERAPYSET();
			} else if (mdcClass.equals("TACHYTHERAPYSTAT")) {
				object[i] = ((STAT) object[i - 1]).gettACHYTHERAPYSTAT();
			} else if (mdcClass.equals("ZONE")) {
				object[i] = ((SET) object[i - 1]).zONE;
			} else if (mdcClass.equals("HEART_RATE")) {
				object[i] = ((STAT) object[i - 1]).gethEART_RATE();
			} else if (mdcClass.equals("AT")) {
				object[i] = ((STAT) object[i - 1]).getaT();
			} else if (mdcClass.equals("STAT")) {
				object[i] = ((System) object[i - 1]).getsTAT();
			} else if (mdcClass.equals("EPISODESTAT")) {
				object[i] = ((STAT) object[i - 1]).ePISODESTAT.toArray();
			} else if (mdcClass.equals("EPISODEROOT")) {
				object[i] = ((System) object[i - 1]).ePISODEROOT.toArray();
			}
		}
		Object returnObject = object[classes.length - 1];
		if (returnObject instanceof Object[]) {
			return (Object[]) returnObject;
		} else {
			Object[] array = new Object[1];
			array[0] = returnObject;

			return array;
		}
	}

	public static void main(String argv[]) {
		CIEDDataRetriever retriever = new CIEDDataRetriever();
		CIEDData[] ciedData = retriever.retrieveCIEDDataByCitizenShipNumber("149202063491");
		Logger.getLogger(CIEDDataRetriever.class).log(Level.INFO, " *** CIED DATA:" + ciedData.length);
		/*Object[] value = null;
		try {
		value = retrieveValue("149202063490", "739568", false, false);
		logger.info(value);
		} catch (Exception ex) {
		ex.printStackTrace();
		}*/
	}
}
