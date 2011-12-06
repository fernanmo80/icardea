package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import org.apache.log4j.Level;
import org.apache.log4j.Logger;



import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.MedicationEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.ObservationEntity;
import tr.com.srdc.icardea.careplanengine.glmodel.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.Vector;


import tr.com.srdc.icardea.ihe.cm.careManager.EHRPHRDataRetriever;

/**
 * <p></p>
 *
 *
 * @poseidon-object-id [I14fcf14m109d9b01fb5mm5d9f]
 */
public class RetrieveEHRHandler {

	/**
	 * <p>Does ...</p>
	 * @param getDataAction
	 *
	 *
	 * @poseidon-object-id [I14fcf14m109d9b01fb5mm5d30]
	 * @return
	 * @param emrEntity
	 */
	public static Logger logger = Logger.getLogger(RetrieveEHRHandler.class);

	public Data_Item retrieveEHRData(GuidelineAgent guidelineAgent, Guideline_Step guidelineStep, EHR_Entity ehrEntity,
		Get_Data_Action getDataAction) {
		try {
			String patientID = guidelineAgent.getPatientID();

			Data_Item item = ehrEntity.getOutput();
			Observation obs = (Observation) FactoryRetriever.retrieveDataItemValue(guidelineAgent.getGuidelineURI(), item);

			String ehrPhrCode = null;
			if (item != null && item.getConcept() != null && item.getConcept().getConcept_id() != null) {
				ehrPhrCode = item.getConcept().getConcept_id();
				if (ehrPhrCode.equals("C0456148")) {
					ehrPhrCode = null;
				}
			}
			// ehrPhrValueType: boolean, integer, float, string, string[], integer[]
			//String ehrPhrValueType = val.getNormal_range().getDisplay_name();

			String refinementScript = null;
			if (obs != null) {
				refinementScript = obs.getDerivation_expression();
			}


			if (ehrEntity.getSemantic_category() == null && !refinementScript.equals("norefinement")) {
				Object[] object = new Object[0];
				refinementScript = preProcessRefinementScript(guidelineAgent, refinementScript);
				logger.info("Retrieving Care Plan with refinementScript:" + refinementScript);

				Object value = JavaScriptEngine.refineValue(object, refinementScript);
				String dataStr = "<Data1><Patient_Data><Id>" + patientID + "</Id></Patient_Data><Observation><Id_OB>";
				dataStr += item.getName2() + "</Id_OB><Text_Value>" + value + "</Text_Value></Observation></Data1>";
				return placeEHRVariable(guidelineAgent, guidelineStep, ehrEntity, getDataAction, dataStr,
					obs, false, null);
			}
			String informationType = ehrEntity.getSemantic_category().getConcept_name();
			String dataSource = ehrEntity.getSemantic_category().getConcept_source();

			logger.info("Retrieving EHR/PHR, patientID" + patientID
				+ " ehrPhrCode:" + ehrPhrCode
				+ " :refinementScript:" + refinementScript
				+ " informationType:" + informationType + " datasource:" + dataSource);

			boolean considerEHRPHRDistinction = false;
			boolean fromPHR = false;

			if (dataSource.trim().equalsIgnoreCase("C0018739")) { // i.e. if the data should be retrieved from PHR
				considerEHRPHRDistinction = true;
				fromPHR = true;
			} else if (dataSource.trim().equalsIgnoreCase("C2362543")) { // i.e. if the data should be retrieved from EHR
				considerEHRPHRDistinction = true;
				fromPHR = false;
			} else { // else the data should be retrieved from both EHR and PHR
				considerEHRPHRDistinction = false;
			}

			logger.info("Retrieving EHR/PHR, patientID" + patientID
				+ " ehrPhrCode:" + ehrPhrCode
				+ " :refinementScript:" + refinementScript
				+ " informationType:" + informationType + " datasource:" + dataSource
				+ " considerEHRPHRDistinction:" + considerEHRPHRDistinction + " fromPHR:" + fromPHR);
			Object[] object = (new EHRPHRDataRetriever()).retriveEHRPHRData(patientID, true, informationType,
				ehrPhrCode, considerEHRPHRDistinction, fromPHR);

			for (Object o : object) {
				logger.info("Retrieved Result:" + o);
			}
			logger.info("Retrieved data:" + object);
			Object value = null;
			if (!refinementScript.equals("norefinement")) {
				value = JavaScriptEngine.refineValue(object, refinementScript);
			}
			logger.info("Refined Value:" + value);
			String dataStr = "";
			boolean isObject = false;
			if (value == null) { // if the returned EHR data is Object not primitive type
				isObject = true;
				value = "THEELEMENTISOBJECT";
			}
			dataStr = "<Data1><Patient_Data><Id>" + patientID + "</Id></Patient_Data><Observation><Id_OB>";
			dataStr += item.getName2() + "</Id_OB><Text_Value>" + value + "</Text_Value></Observation></Data1>";
			logger.info("Data Str:" + dataStr);
			return placeEHRVariable(guidelineAgent, guidelineStep,
				ehrEntity, getDataAction, dataStr, obs, isObject, object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private Data_Item placeEHRVariable(GuidelineAgent guidelineAgent, Guideline_Step guidelineStep,
		EHR_Entity ehrEntity, Get_Data_Action getDataAction, String dataStr,
		Object dataItemValue, boolean isObject, Object object) {
		if (dataItemValue instanceof Observation) {
			ObservationEntity oe = new ObservationEntity((Observation) dataItemValue, guidelineAgent.getGuidelineURI());

			oe.fromString(dataStr);
			logger.info((oe.toString()));
			EHRFiller.fillObservation((Observation) dataItemValue, oe, guidelineAgent.getGuidelineURI());
		} else if (dataItemValue instanceof Medication) {
			MedicationEntity me = new MedicationEntity((Medication) dataItemValue);

			me.fromString(dataStr);
			logger.info(("..................."));
			logger.info((me.toString()));
			EHRFiller.fillMedication((Medication) dataItemValue, me);
		}

		logger.info("VARIABLE_EKLE:::::::" + getDataAction.getVariable_name() + " Value:" + dataItemValue);

		guidelineAgent.storeGlobalVariable(getDataAction.getVariable_name(), dataItemValue);
		if (isObject) {
			guidelineAgent.storeGlobalVariableObjectValue(getDataAction.getVariable_name(), object);
		}

//      // [itasyurt 17.08.06 ] temporary message to monitoring
		// TODO:  get rid of it
		Vector<String> messageVector = new Vector<String>();
		messageVector.add(GuidelineHistoryFrame.EMR_DATA_RETRIEVED);
		try {
			messageVector.add(guidelineStep.getName());
		} catch (Exception exc) {
			messageVector.add("Eligibility");
		}
		messageVector.add(getDataAction.getVariable_name());
		messageVector.add(dataStr);
		guidelineAgent.messageToMonitoring(messageVector);

		return ehrEntity.getOutput();
	}

	private String preProcessRefinementScript(GuidelineAgent guidelineAgent, String sentence) {
		if (sentence == null) {
			return null;
		}
		int beginIndex, endIndex, endIndex1, endIndex2, endIndex3;

		String result = sentence;
		while (result.contains("$")) {
			beginIndex = result.indexOf('$', 0);
			endIndex1 = result.indexOf(' ', beginIndex);
			endIndex2 = result.indexOf('+', beginIndex);
			endIndex3 = result.indexOf(';', beginIndex);

			if (endIndex1 == -1) {
				endIndex1 = Integer.MAX_VALUE;
			}
			if (endIndex2 == -1) {
				endIndex2 = Integer.MAX_VALUE;
			}
			if (endIndex3 == -1) {
				endIndex3 = Integer.MAX_VALUE;
			}

			endIndex = Integer.MAX_VALUE;
			if (endIndex1 < endIndex) {
				endIndex = endIndex1;
			}
			if (endIndex2 < endIndex) {
				endIndex = endIndex2;
			}
			if (endIndex3 < endIndex) {
				endIndex = endIndex3;
			}

			String variable = result.substring(beginIndex + 1, endIndex);
			Object object = guidelineAgent.getGlobalVariable(variable);
			String valueStr = "";
			if (object != null && object instanceof Observation) {
				Observation obs = (Observation) object;
				if (obs.hasValue()) {
					Observation_Value val = FactoryRetriever.retrieveObservationValue(guidelineAgent.getGuidelineURI(), obs.getValue());
					if (val instanceof Text_Value) {
						valueStr = ((Text_Value) val).getText();
					} else if (val instanceof Index) {
						valueStr = new String(Float.toString((((Index) val).getIndex())));
					}
				}
			}

			result = result.replaceFirst("\\$" + result.substring(beginIndex + 1, endIndex),
				valueStr + " ");

			if (object == null) {
				result = result.replaceFirst("\\$", "");
			}
		}

		return result;
	}
}
//~ Formatted by Jindent --- http://www.jindent.com

