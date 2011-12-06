/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.srdc.icardea.ihe.idco.observationprocessor;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v25.datatype.CE;
import ca.uhn.hl7v2.model.v25.datatype.CWE;
import ca.uhn.hl7v2.model.v25.datatype.ED;
import ca.uhn.hl7v2.model.v25.datatype.NM;
import ca.uhn.hl7v2.model.v25.datatype.SN;
import ca.uhn.hl7v2.model.v25.datatype.ST;
import ca.uhn.hl7v2.model.v25.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.OBX;
import ca.uhn.hl7v2.model.v25.datatype.DTM;
import ca.uhn.hl7v2.model.v25.datatype.TX;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import tr.com.srdc.icardea.hibernate.AT;
import tr.com.srdc.icardea.hibernate.BATTERY2;
import tr.com.srdc.icardea.hibernate.BRADYSET;
import tr.com.srdc.icardea.hibernate.BRADYSTAT;
import tr.com.srdc.icardea.hibernate.BinaryData;
import tr.com.srdc.icardea.hibernate.CAP;

import tr.com.srdc.icardea.hibernate.CIEDData;
import tr.com.srdc.icardea.hibernate.CRTSET;
import tr.com.srdc.icardea.hibernate.CRTSTAT;
import tr.com.srdc.icardea.hibernate.EPISODEROOT;
import tr.com.srdc.icardea.hibernate.EPISODESTAT;
import tr.com.srdc.icardea.hibernate.HEART_RATE;
import tr.com.srdc.icardea.hibernate.IMPEDANCE;
import tr.com.srdc.icardea.hibernate.LEAD2;
import tr.com.srdc.icardea.hibernate.LEADCHNLMSMT;
import tr.com.srdc.icardea.hibernate.LEADCHNLSET;
import tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT;
import tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET;
import tr.com.srdc.icardea.hibernate.MAGNET;
import tr.com.srdc.icardea.hibernate.MSMT;
import tr.com.srdc.icardea.hibernate.Observation;
import tr.com.srdc.icardea.hibernate.PACING;
import tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD;
import tr.com.srdc.icardea.hibernate.PG;
import tr.com.srdc.icardea.hibernate.SENSINGMSMT;
import tr.com.srdc.icardea.hibernate.SENSINGSET;
import tr.com.srdc.icardea.hibernate.SESS;
import tr.com.srdc.icardea.hibernate.SET;
import tr.com.srdc.icardea.hibernate.SHOCKVECTOR;
import tr.com.srdc.icardea.hibernate.STAT;
import tr.com.srdc.icardea.hibernate.System;
import tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET;
import tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT;
import tr.com.srdc.icardea.hibernate.ZONE;

/**
 *
 * @author ibrahim
 */
class OBXHandler {

	private ORU_R01 oru;
	private CIEDData ciedData;
	private MDC_IDC_Codes codes;
	private Observation observation;
	private String base64String = null;
	public static Logger logger = Logger.getLogger(OBXHandler.class);
	private boolean inXML;

	public OBXHandler(ORU_R01 oru, CIEDData ciedData, String b, boolean inXML) {
		this.oru = oru;
		this.ciedData = ciedData;
		codes = new MDC_IDC_Codes();
		this.base64String = b;
		this.inXML = inXML;
	}

	void run() throws HL7Exception {
		ORU_R01_ORDER_OBSERVATION orderObservation = oru.getPATIENT_RESULT().getORDER_OBSERVATION();
		observation = ciedData.getObservationfillerOrderNumber();

		// OBX Segments
		int numberOfOBX = orderObservation.getOBSERVATIONReps();
		java.lang.System.out.println(" Number of OBX:"+ numberOfOBX);
		for (int i = 0; i < numberOfOBX; i++) {
			logger.info("Processing OBX Segment " + (i + 1));
			OBX obx = orderObservation.getOBSERVATION(i).getOBX();
			String valueType = obx.getValueType().getValue();

			String observationResultStatus = obx.getObservationResultStatus().getValue(); // CH07 HL7 Table 0085
			String dateTimeOfObservation = obx.getDateTimeOfTheObservation().getTime().getValue();
			if (obx.getObservationMethod(0) != null && obx.getObservationMethod(0).getIdentifier() != null) {
				String observationMethodIdentifier = obx.getObservationMethod(0).getIdentifier().getValue(); //OPTIONAL, Table 4.12-10, a general time interval for which a given aggregate term was calculated
			}
			if (obx.getObservationMethod(0) != null && obx.getObservationMethod(0).getText() != null) {
				String observationMethodText = obx.getObservationMethod(0).getText().getValue(); // OPTIONAL, Table 4.12-10
			}
			if (obx.getUnits() != null && obx.getUnits().getIdentifier() != null) {
				String unitIdentifier = obx.getUnits().getIdentifier().getValue(); // Optional, CH07 Figure 7-6, ISO 2955-1983
			}

			if (obx.getAbnormalFlags(0) != null) {
				String abnormalFlags = obx.getAbnormalFlags(0).getValue(); // OPTIONAL, Table 3.Y.4.1.2-10
				observation.setAbnormalFlags(abnormalFlags);
			}
			if (obx.getEquipmentInstanceIdentifier(0) != null && obx.getEquipmentInstanceIdentifier(0).getEntityIdentifier() != null) {
				String equipmentInstanceIdentifier = obx.getEquipmentInstanceIdentifier(0).getEntityIdentifier().getValue();
				observation.setEquipmentInstanceIdentifier(equipmentInstanceIdentifier);
			}

			String observationValue = "";
			String observationValueIdentifier = "";
			String observationNameOfCodingSystem = "";

			String observationIdentifier = obx.getObservationIdentifier().getIdentifier().getValue(); // MDC_IDC Nomenclature code value
			if (obx.getObservationIdentifier().getText() != null) {
				String observationIdentifierText = obx.getObservationIdentifier().getText().getValue(); // OPTIONAL, MDC_IDC Nomenclature reference id
			}
			String observationIdentifierNameOfCodeSystem = obx.getObservationIdentifier().getNameOfCodingSystem().getValue(); // Has value "MDC_IDC"

			String observationSubID = null;
			if (obx.getObservationSubID() != null) {
				observationSubID = obx.getObservationSubID().getValue(); // OPTIONAL, Used for Complex Data Type Observations
			}

			if (valueType.equals("ST")) {
				observationValue = ((ST) obx.getObservationValue(0).getData()).getValue();
			} else if (valueType.equals("NM")) {
				observationValue = ((NM) obx.getObservationValue(0).getData()).getValue();
			} else if (valueType.equals("TX")) {
				logger.info(" *** TX:" + obx.getObservationValue(0).getData() + ":" + observationValueIdentifier);
				if (obx.getObservationValue(0).getData().toString() == null) {
					observationValue = "";
				} else {
					observationValue = ((TX) obx.getObservationValue(0).getData()).getValue();
				}
			} else if (valueType.equals("SN")) {
				SN sn = (SN) obx.getObservationValue(0).getData();
				observationValue = sn.getComparator().getValue() + sn.getNum1().getValue()
					+ sn.getSeparatorSuffix().getValue() + sn.getNum2();
			} else if (valueType.equals("DTM")) {
				observationValue = ((DTM) obx.getObservationValue(0).getData()).getValue();
			} else if (valueType.equals("CE")) {
				observationValue = ((CE) obx.getObservationValue(0).getData()).getCe1_Identifier().getValue();
				observationValueIdentifier = ((CE) obx.getObservationValue(0).getData()).getIdentifier().getValue();
				observationNameOfCodingSystem = ((CE) obx.getObservationValue(0).getData()).getNameOfCodingSystem().getValue();
			} else if (valueType.equals("CWE")) {
				observationValue = ((CWE) obx.getObservationValue(0).getData()).getCwe1_Identifier().getValue();
				observationValueIdentifier = ((CWE) obx.getObservationValue(0).getData()).getIdentifier().getValue();
				observationNameOfCodingSystem = ((CWE) obx.getObservationValue(0).getData()).getNameOfCodingSystem().getValue();
			} else if (valueType.equals("ED")) {
				// TODO: HAPI XML'den deserialize ederken, gidiyor base64 data'sini ED.4 altina koyuyor.
				// ED.4'un de veri tipi ID. Bu yuzden "200'den kucuk olmali" hatasi veriyor.
				// Hatta gonderirken sadece ED.2, ED.3, ED.4, ED.5 gonderiyorsun, alirken bunlari,
				// ED.1, ED.2, ED.3, ED.4'e yaziyor. Yani gonderdigin ile aldigin bir olmayabilir.
				// Bu yuzden boyle durumlarda gonderdigin ve aldigin mesajlari karsilastir.


				if (base64String == null) {
					ED ed = (ED) obx.getObservationValue(0).getData();
					String mimeMessageString = ed.getData().getValue();
					if (inXML) {
						mimeMessageString = ed.getEncoding().getValue();
					}
					observation.setBase64String(mimeMessageString);
				} else {
					observation.setBase64String(base64String);
				}
				/*BinaryData binary = BinaryData.createBinaryData();
				binary.setBase64String(mimeMessageString);
				observation.binaryData.add(binary);*/
				logger.info("Processing OBX Segment with ED data type");
				return;
			}
			contruct(observationIdentifier, observationValue, observationSubID);
		}
	}

	private void contruct(String observationIdentifier, String observationValue, String observationSubID) throws HL7Exception {
		// observationSubID == null olabilir bu durumda multiplicity yok
		System system = null;
		String classesAndOperation = null;
		int index = 0;
		// TODO: Asagidakini duzelt....
		if (observationSubID != null) {
			if (observationSubID.lastIndexOf('.') > -1) {
				observationSubID = observationSubID.substring(2);
			}
			index = Integer.parseInt(observationSubID) - 1;
		}

		// TODO: aslinda asagidaki exception donmesi lazim
		if (observationIdentifier == null) {
			return;
		}
		//java.lang.System.out.println("Observation Identifier:"+observationIdentifier);
		try {
			classesAndOperation = codes.get(observationIdentifier);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// TODO: aslinda asagidaki exception donmesi lazim
		if (classesAndOperation == null) {
			return;
		}
		java.lang.System.out.flush();
		java.lang.System.out.println(" $$$ Classes and Operation:" + classesAndOperation);
		
		String[] classes = classesAndOperation.split(":");
		if (classesAndOperation.indexOf('.') == -1) {
			return;
		}

		logger.info(" *** OBX:\n"
			+ " classesAndOperation = " + classesAndOperation
			+ " observationIdentifier = " + observationIdentifier
			+ " observationValue = " + observationValue
			+ " observationSubID = " + observationSubID);

		for (int i = 0; i < classes.length; i++) {
			String mdcClass = classes[i];
			String previousMdcClass = (i == 0) ? "System" : classes[i - 1];
			String operation = null;
			if (mdcClass.indexOf('.') != -1) {
				logger.info("MDC Class:" + mdcClass);
				String[] tmp = mdcClass.split("\\.");
				mdcClass = tmp[0];
				operation = tmp[1];
			}

			if (mdcClass.equals("System")) {
				system = observation.getSystem();
				if (system == null) {
					system = System.createSystem();
					observation.setSystem(system);
				}
			} else if (mdcClass.equals("PG")) {
				PG pg = system.getpG();
				if (pg == null) {
					pg = PG.createPG();
					system.setpG(pg);
				}
				invokeMethod(pg, operation, observationValue);
			} else if (mdcClass.equals("LEAD")) {
				LEAD2 lead;
				if (system.lEAD2.size() <= index) {
					lead = LEAD2.createLEAD2();
					lead.setSubID(index);
					system.lEAD2.add(lead);
				} else {
					lead = system.lEAD2.toArray("subID")[index];
				}
				invokeMethod(lead, operation, observationValue);
			} else if (mdcClass.equals("SESS")) {
				SESS sess = system.getsESS();
				if (sess == null) {
					sess = SESS.createSESS();
					system.setsESS(sess);
				}
				invokeMethod(sess, operation, observationValue);
			} else if (mdcClass.equals("MSMT")) {
				MSMT msmt = system.getmSMT();
				if (msmt == null) {
					msmt = MSMT.createMSMT();
					system.setmSMT(msmt);
				}
				invokeMethod(msmt, operation, observationValue);
			} else if (mdcClass.equals("BATTERY")) {
				BATTERY2 battery2;
				if (system.getmSMT().bATTERY2.size() <= index) {
					battery2 = BATTERY2.createBATTERY2();
					battery2.setSubID(index);
					system.getmSMT().bATTERY2.add(battery2);
				} else {
					battery2 = system.getmSMT().bATTERY2.toArray("subID")[index];
				}
				invokeMethod(battery2, operation, observationValue);
			} else if (mdcClass.equals("CAP")) {
				CAP cap;
				if (system.getmSMT().cAP.size() <= index) {
					cap = CAP.createCAP();
					cap.setSubID(index);
					system.getmSMT().cAP.add(cap);
				} else {
					cap = system.getmSMT().cAP.toArray("subID")[index];
				}
				invokeMethod(cap, operation, observationValue);
			} else if (mdcClass.startsWith("LEADCHNLMSMT")) {
				String[] parts = mdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLMSMT leadchnl = null;

				for (int j = 0; j < system.getmSMT().lEADCHNLMSMT.size(); j++) {
					LEADCHNLMSMT temp = system.getmSMT().lEADCHNLMSMT.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}
				if (leadchnl == null) {
					leadchnl = LEADCHNLMSMT.createLEADCHNLMSMT();
					leadchnl.setChamber(chamber);
					system.getmSMT().lEADCHNLMSMT.add(leadchnl);
				}
				invokeMethod(leadchnl, operation, observationValue);
			} else if (mdcClass.startsWith("LEADCHNLSET")) {
				String[] parts = mdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLSET leadchnl = null;

				for (int j = 0; j < system.getsET().lEADCHNLSET.size(); j++) {
					LEADCHNLSET temp = system.getsET().lEADCHNLSET.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}
				if (leadchnl == null) {
					leadchnl = LEADCHNLSET.createLEADCHNLSET();
					leadchnl.setChamber(chamber);
					system.getsET().lEADCHNLSET.add(leadchnl);
				}
				invokeMethod(leadchnl, operation, observationValue);
			} else if (mdcClass.equals("SENSINGMSMT")) {
				String[] parts = previousMdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLMSMT leadchnl = null;
				for (int j = 0; j < system.getmSMT().lEADCHNLMSMT.size(); j++) {
					LEADCHNLMSMT temp = system.getmSMT().lEADCHNLMSMT.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}

				SENSINGMSMT sensing = leadchnl.getsENSINGMSMT();
				if (sensing == null) {
					sensing = SENSINGMSMT.createSENSINGMSMT();
					leadchnl.setsENSINGMSMT(sensing);
				}
				invokeMethod(sensing, operation, observationValue);
			} else if (mdcClass.equals("SENSINGSET")) {
				String[] parts = previousMdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLSET leadchnl = null;
				for (int j = 0; j < system.getsET().lEADCHNLSET.size(); j++) {
					LEADCHNLSET temp = system.getsET().lEADCHNLSET.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}

				SENSINGSET sensing = leadchnl.getsENSINGSET();
				if (sensing == null) {
					sensing = SENSINGSET.createSENSINGSET();
					leadchnl.setsENSINGSET(sensing);
				}
				invokeMethod(sensing, operation, observationValue);
			} else if (mdcClass.equals("PACING_THRESHOLD")) {
				String[] parts = previousMdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLMSMT leadchnl = null;
				for (int j = 0; j < system.getmSMT().lEADCHNLMSMT.size(); j++) {
					LEADCHNLMSMT temp = system.getmSMT().lEADCHNLMSMT.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}
				PACINGTHRESHOLD pacingThreshold = leadchnl.getpACINGTHRESHOLD();
				if (pacingThreshold == null) {
					pacingThreshold = PACINGTHRESHOLD.createPACINGTHRESHOLD();
					leadchnl.setpACINGTHRESHOLD(pacingThreshold);
				}
				invokeMethod(pacingThreshold, operation, observationValue);
			} else if (mdcClass.equals("IMPEDANCE")) {
				String[] parts = previousMdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLMSMT leadchnl = null;
				for (int j = 0; j < system.getmSMT().lEADCHNLMSMT.size(); j++) {
					LEADCHNLMSMT temp = system.getmSMT().lEADCHNLMSMT.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}
				IMPEDANCE impedance = leadchnl.getiMPEDANCE();
				if (impedance == null) {
					impedance = IMPEDANCE.createIMPEDANCE();
					leadchnl.setiMPEDANCE(impedance);
				}
				invokeMethod(impedance, operation, observationValue);
			} else if (mdcClass.equals("LEADHVCHNLMSMT")) {
				LEADHVCHANNELMSMT leadhvchnl = null;

				if (system.getmSMT().lEADHVCHANNELMSMT.size() <= index) {
					leadhvchnl = LEADHVCHANNELMSMT.createLEADHVCHANNELMSMT();
					leadhvchnl.setSubID(index);
					system.getmSMT().lEADHVCHANNELMSMT.add(leadhvchnl);
				} else {
					leadhvchnl = system.getmSMT().lEADHVCHANNELMSMT.toArray("subID")[index];
				}

				invokeMethod(leadhvchnl, operation, observationValue);
			} else if (mdcClass.equals("LEADHVCHNLSET")) {
				LEADHVCHANNELSET leadhvchnl = system.getsET().getlEADHVCHANNELSET();
				if (leadhvchnl == null) {
					leadhvchnl = LEADHVCHANNELSET.createLEADHVCHANNELSET();
					system.getsET().setlEADHVCHANNELSET(leadhvchnl);
				}

				invokeMethod(leadhvchnl, operation, observationValue);
			} else if (mdcClass.equals("SET")) {
				SET set = system.getsET();
				if (set == null) {
					set = SET.createSET();
					system.setsET(set);
				}
				invokeMethod(set, operation, observationValue);
			} else if (mdcClass.equals("CRTSTAT")) {
				CRTSTAT crt = system.getsTAT().getcRTSTAT();
				if (crt == null) {
					crt = CRTSTAT.createCRTSTAT();
					system.getsTAT().setcRTSTAT(crt);
				}

				invokeMethod(crt, operation, observationValue);
			} else if (mdcClass.equals("CRTSET")) {
				CRTSET crt = system.getsET().getcRTSET();
				if (crt == null) {
					crt = CRTSET.createCRTSET();
					system.getsET().setcRTSET(crt);
				}

				invokeMethod(crt, operation, observationValue);
			} else if (mdcClass.equals("MAGNET")) {
				MAGNET magnet = system.getsET().getmAGNET();
				if (magnet == null) {
					magnet.createMAGNET();
					system.getsET().setmAGNET(magnet);
				}
				invokeMethod(magnet, operation, observationValue);
			} else if (mdcClass.equals("PACING")) {
				String[] parts = previousMdcClass.split("-");
				String chamber = parts[1];
				LEADCHNLSET leadchnl = null;
				for (int j = 0; j < system.getsET().lEADCHNLSET.size(); j++) {
					LEADCHNLSET temp = system.getsET().lEADCHNLSET.toArray()[j];
					if (temp.getChamber().equals(chamber)) {
						leadchnl = temp;
					}
				}
				PACING pacing = leadchnl.getpACING();
				if (pacing == null) {
					pacing = PACING.createPACING();
					leadchnl.setpACING(pacing);
				}
				invokeMethod(pacing, operation, observationValue);
			} else if (mdcClass.equals("SHOCK_VECTOR")) {
				SHOCKVECTOR shockvector = system.getsET().getlEADHVCHANNELSET().getsHOCKVECTOR();
				if (shockvector == null) {
					shockvector = SHOCKVECTOR.createSHOCKVECTOR();
					system.getsET().getlEADHVCHANNELSET().setsHOCKVECTOR(shockvector);
				}
				invokeMethod(shockvector, operation, observationValue);
			} else if (mdcClass.equals("BRADYSET")) {
				BRADYSET brady = system.getsET().getbRADYSET();
				if (brady == null) {
					brady = BRADYSET.createBRADYSET();
					system.getsET().setbRADYSET(brady);
				}

				invokeMethod(brady, operation, observationValue);
			} else if (mdcClass.equals("BRADYSTAT")) {
				BRADYSTAT brady = system.getsTAT().getbRADYSTAT();
				if (brady == null) {
					brady = BRADYSTAT.createBRADYSTAT();
					system.getsTAT().setbRADYSTAT(brady);
				}

				invokeMethod(brady, operation, observationValue);
			} else if (mdcClass.equals("TACHYTHERAPYSET")) {
				TACHYTHERAPYSET tachythrerapy = system.getsET().gettACHYTHERAPYSET();
				if (tachythrerapy == null) {
					tachythrerapy = TACHYTHERAPYSET.createTACHYTHERAPYSET();
					system.getsET().settACHYTHERAPYSET(tachythrerapy);

				}
				invokeMethod(tachythrerapy, operation, observationValue);
			} else if (mdcClass.equals("TACHYTHERAPYSTAT")) {
				TACHYTHERAPYSTAT tachythrerapy = system.getsTAT().gettACHYTHERAPYSTAT();
				if (tachythrerapy == null) {
					tachythrerapy = TACHYTHERAPYSTAT.createTACHYTHERAPYSTAT();
					system.getsTAT().settACHYTHERAPYSTAT(tachythrerapy);

				}
				invokeMethod(tachythrerapy, operation, observationValue);
			} else if (mdcClass.equals("ZONE")) {
				ZONE zone;
				if (system.getsET().zONE.size() <= index) {
					zone = ZONE.createZONE();
					zone.setSubID(index);
					system.getsET().zONE.add(zone);
				} else {
					zone = system.getsET().zONE.toArray("subID")[index];
				}
				invokeMethod(zone, operation, observationValue);
			} else if (mdcClass.equals(":STAT")) {
				STAT stat = system.getsTAT();
				if (stat == null) {
					stat = STAT.createSTAT();
					system.setsTAT(stat);
				}
				invokeMethod(stat, operation, observationValue);
			} else if (mdcClass.equals("HEART_RATE")) {
				HEART_RATE heartrate = system.getsTAT().gethEART_RATE();
				if (heartrate == null) {
					heartrate = HEART_RATE.createHEART_RATE();
					system.getsTAT().sethEART_RATE(heartrate);
				}
				invokeMethod(heartrate, operation, observationValue);
			} else if (mdcClass.equals("AT")) {
				AT at = system.getsTAT().getaT();
				if (at == null) {
					at = AT.createAT();
					system.getsTAT().setaT(at);
				}
				invokeMethod(at, operation, observationValue);
			} else if (mdcClass.equals("STAT")) {
				STAT stat = system.getsTAT();
				if (stat == null) {
					stat = STAT.createSTAT();
					system.setsTAT(stat);
				}
				invokeMethod(stat, operation, observationValue);
			} else if (mdcClass.equals("EPISODESTAT")) {
				EPISODESTAT episode;
				if (system.getsTAT().ePISODESTAT.size() <= index) {
					episode = EPISODESTAT.createEPISODESTAT();
					episode.setSubID(index);
					system.getsTAT().ePISODESTAT.add(episode);
				} else {
					episode = system.getsTAT().ePISODESTAT.toArray("subID")[index];
				}
				invokeMethod(episode, operation, observationValue);
			} else if (mdcClass.equals("EPISODEROOT")) {
				EPISODEROOT episode;
				if (system.ePISODEROOT.size() <= index) {
					episode = EPISODEROOT.createEPISODEROOT();
					episode.setSubID(index);
					system.ePISODEROOT.add(episode);
				} else {
					episode = system.ePISODEROOT.toArray("subID")[index];
				}
				invokeMethod(episode, operation, observationValue);
			} else {
				throw new HL7Exception("Undefined class:" + mdcClass);
			}
		}
	}

	private void invokeMethod(Object object, String operation, String observationValue) {
		if (operation == null || object == null) {
			return;
		}
		operation = operation.toLowerCase();
		char[] opCharArray = operation.toCharArray();
		opCharArray[0] = Character.toUpperCase(opCharArray[0]);
		operation = new String(opCharArray);

		Class parameter[] = new Class[1];
		parameter[0] = String.class;
		try {
			Method method = object.getClass().getMethod("set" + operation, parameter);
			Object arglist[] = new Object[1];
			arglist[0] = observationValue;
			method.invoke(object, arglist);
		} catch (IllegalAccessException ex) {
		} catch (IllegalArgumentException ex) {
		} catch (InvocationTargetException ex) {
		} catch (NoSuchMethodException ex) {
			//Logger.getLogger(OBXHandler.class).log(Level.INFO, "Class Name: "+ object.getClass().getName()
			//        + " Method Name: "+"set" + operation);
		} catch (SecurityException ex) {
		}
	}
}
