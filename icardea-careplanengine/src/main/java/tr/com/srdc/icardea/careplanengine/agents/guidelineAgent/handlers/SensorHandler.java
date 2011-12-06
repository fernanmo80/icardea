package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import org.apache.xerces.dom.DocumentImpl;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.FactoryRetriever;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.GuidelineAgent;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.MedicationEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.ObservationEntity;
import tr.com.srdc.icardea.careplanengine.glmodel.*;

//~--- JDK imports ------------------------------------------------------------

//import java.util.Hashtable;
import java.io.StringWriter;

import java.util.Vector;
import tr.com.srdc.icardea.hibernate.EPISODEROOT;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.ihe.idco.observationprocessor.CIEDDataRetriever;

/**
 * <p>
 * </p>
 * 
 * 
 * @poseidon-object-id [Ia0f8fddm109d522e9f0mm577b]
 */
public class SensorHandler {

	public static Logger logger = Logger.getLogger(SensorHandler.class);

	public Data_Item retrieveSensorData(GuidelineAgent guidelineAgent,
		Guideline_Step guidelineStep, Sensor_Entity sensorEntity,
		Get_Data_Action getDataAction) {
		try {
			String patientID = guidelineAgent.getPatientID();
			logger.info("Retrieving CIED Data for: " + patientID);
			Data_Item item = sensorEntity.getOutput();
			Observation val = (Observation) FactoryRetriever.retrieveDataItemValue(guidelineAgent.getGuidelineURI(),
				item);

			String ciedValue = "<Data1><Patient_Data><Id>" + patientID
				+ "</Id></Patient_Data><Observation><Id_OB>";
			String mdcIdcCode = item.getConcept().getConcept_id();
			// mdcIdcType: boolean, integer, float, string, string[], integer[]
			// String mdcIdcType = val.getNormal_range().getDisplay_name();
			String refinementScript = val.getDerivation_expression();
			logger.info("Retrieving CIED Data: " + patientID + " code:"
				+ mdcIdcCode + " refinementScript:"
				+ refinementScript);

			logger.info("*********" + patientID + "********"
				+ mdcIdcCode + "*********");
			boolean hasSemanticCategory = sensorEntity.getSemantic_category() != null;
			Object[] result = (new CIEDDataRetriever()).retrieveValue(patientID,
				mdcIdcCode, hasSemanticCategory, false);
			logger.info("Retrieved CIED Data:" + result);
			for (Object s : result) {
				logger.info("Refine Input is:" + s);
				if (s instanceof EPISODEROOT) {
					Object o = new Object();
				}
			}
			refinementScript = "importPackage(Packages.tr.com.srdc.icardea.hibernate)\n" + refinementScript;
			logger.info("New Refinement Script:" + refinementScript);
			Object value = JavaScriptEngine.refineValue(result,
				refinementScript);
			logger.info("Refined CIED Data:" + value);

			if(value == null || (value != null && value instanceof String && ((String)value).trim().equalsIgnoreCase("null")))
				value = "0";


			/*
			 * if (mdcIdcType.equals("boolean")) { boolean tempResult =
			 * ((Boolean) value).booleanValue(); } else if
			 * (mdcIdcType.equals("integer")) { int tempResult = (int) ((Double)
			 * value).doubleValue(); } else if (mdcIdcType.equals("string")) {
			 * String tempResult = (String) value; } else if
			 * (mdcIdcType.equals("integer[]")) { int[] tempResult = (int[])
			 * value; } else if (mdcIdcType.equals("string[]")) { String[]
			 * tempResult = (String[]) value; } else if
			 * (mdcIdcType.equals("float")) { double tempResult = ((Double)
			 * value).doubleValue(); }
			 */

			ciedValue += item.getName2() + "</Id_OB><Text_Value>" + value
				+ "</Text_Value></Observation></Data1>";

			// [itasyurt 17.08.06 ] temporary message to monitoring
			Vector<String> messageVector = new Vector<String>();
			messageVector.add(GuidelineHistoryFrame.SENSOR_DATA_RETRIEVED);
			try {
				messageVector.add(guidelineStep.getName());
			} catch (Exception exc) {
				messageVector.add("Eligibility");
			}
			messageVector.add(getDataAction.getVariable_name());
			messageVector.add(ciedValue);
			guidelineAgent.messageToMonitoring(messageVector);

			if (val instanceof Observation) {
				ObservationEntity oe = new ObservationEntity((Observation) val,
					guidelineAgent.getGuidelineURI());

				oe.fromString(ciedValue);
				logger.info((oe.toString()));
				logger.info((getDataAction.getVariable_name() + "!!!"));
				EHRFiller.fillObservation((Observation) val, oe, guidelineAgent.getGuidelineURI());
			} else if (val instanceof Medication) {
				MedicationEntity me = new MedicationEntity();

				me.fromString(ciedValue);
				logger.info((me.toString()));
				EHRFiller.fillMedication((Medication) val, me);
			}

			logger.info(("////////////////////////////////////////////"));
			logger.info(("ret:::" + item.getName2() + val.getClass().getName()));
			logger.info(("////////////////////////////////////////////:"));

			logger.info("Global Variable Stored:" + getDataAction.getVariable_name() + " Value:" + val);
			guidelineAgent.storeGlobalVariable(
				getDataAction.getVariable_name(), val);

			return item;
		} catch (Exception exc) {
			exc.printStackTrace();
		}

		return null;
	}

	public static String toStringForSensorServices(String patientID) {
		return "<f>" + "<patID>" + patientID + "</patID>" + "</f>";
	}

	public static String toStringWithDataElementAsRoot(String patientID) {
		Document doc;
		StringWriter strWriter = new StringWriter();

		try {
			doc = new DocumentImpl();

			Element rootElem = doc.createElement("Data");

			doc.appendChild(rootElem);

			Element patientDataElement = doc.createElement("Patient_Data");
			Element patientIDElement = doc.createElement("Id");
			Text text = doc.createTextNode(patientID);

			patientIDElement.appendChild(text);
			patientDataElement.appendChild(patientIDElement);
			rootElem.appendChild(patientDataElement);

			XMLSerializer serializer = new XMLSerializer(strWriter,
				new OutputFormat(doc));

			serializer.serialize(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return strWriter.toString();
	}
}
// ~ Formatted by Jindent --- http://www.jindent.com

