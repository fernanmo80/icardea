package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Properties;
import java.util.UUID;
import java.util.Vector;

import org.apache.xerces.dom.DocumentImpl;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import tr.com.srdc.icardea.careplanengine.communication.webservice.Client;
import tr.com.srdc.icardea.careplanengine.agents.communication.ontology.consultingOntology.ConsultingMessage;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.FactoryRetriever;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.GuidelineAgent;
import tr.com.srdc.icardea.careplanengine.alarmSystem.AlarmDatabaseConnection;
import tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageEntity;
import tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageType;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.MedicationEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.ObservationEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.ProcedureEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.PatientDataEntity;
import tr.com.srdc.icardea.careplanengine.glmodel.*;
import tr.com.srdc.icardea.ihe.idco.observationprocessor.CIEDDataRetriever;
import tr.com.srdc.icardea.ihe.cm.careManager.EHRPHRDataRetriever;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import tr.com.srdc.icardea.hibernate.ImagingResult;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardDecryptionMaterial;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDXObjectImage;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Date;
import java.text.SimpleDateFormat;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.JavaScriptEngine;
import tr.com.srdc.icardea.hibernate.CIEDData;

/**
 * <p>
 * </p>
 * 
 * @poseidon-object-id [Ia0f8fddm109d522e9f0mm5627]
 */
public class MedicallyOrientedActionHandler {

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 * @poseidon-object-id [Ia0f8fddm109d522e9f0mm5614]
	 * @param medicallyOrientedAction
	 * 
	 * 
	 */
	// Create a new Call object, setting the location (gotten from the WSDL)
	GuidelineAgent guidelineAgent;
	static String DBKeyword = "<data ";
	static String SCRIPTKeyword = "<script";
	static String IMGKeyword = "<img ";
	public static Logger logger = Logger
			.getLogger(MedicallyOrientedActionHandler.class);

	public void handle(GuidelineAgent guidelineAgent,
			Guideline_Step guidelineStep,
			Medically_Oriented_Action_Specification medicallyOrientedAction) {
		// your code here
		try {
			ResourceBundle properties = ResourceBundle.getBundle("icardea");
			String configuredDate = properties.getString("current.date");
			Date date = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
			if (!configuredDate.equals("system")) {
				try {
					date = simpleDateFormat.parse(configuredDate);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

			String currentDate = simpleDateFormat.format(date);

			this.guidelineAgent = guidelineAgent;

			MonitoringMessageEntity monitoringMessage = new MonitoringMessageEntity();
			monitoringMessage.setStepName(guidelineStep.getName2());
			monitoringMessage.setType(MonitoringMessageType
					.getMedicallyOrientedActionType());
			String patientName = guidelineAgent.getAssignmentEntity()
					.getPatientEntity().getName();
			long patientID = guidelineAgent.getAssignmentEntity()
					.getPatientEntity().getPcode();

			if (!guidelineAgent.showGUI) {
				String stepID = medicallyOrientedAction.getName2().split(":")[0];
				tr.com.srdc.icardea.careplanengine.agents.afAgent.EngineInterface
						.sendMonitoringMessage(guidelineAgent.getAID(), stepID,
								"FINISHED", "" + patientID);
			}

			String description = medicallyOrientedAction.getDescription();
			if (description.startsWith("Wait for event")) { // It is WaitStep
				String[] parts = description.split(":");
				if (parts[1].equals("C0581396")) {
					boolean found = false;
					Date now = new Date();
					while (!found) {
						logger.info("Calling CIEDDataRetriever....");
						Object[] objects = (new CIEDDataRetriever())
								.retrieveCIEDDataByCitizenShipNumber(""
										+ patientID);
						for (int i = 0; i < objects.length; i++) {
							CIEDData ciedData = (CIEDData) objects[i];
							String messageTime = ciedData.getMessageTime();
							SimpleDateFormat dateFormat = new SimpleDateFormat(
									"yyyyMMddHHmmSS");
							Date messageDate = dateFormat.parse(messageTime);
							int results = messageDate.compareTo(now);
							logger.info("Compared Message Date:'"
									+ messageDate.toString() + "' and found:"
									+ results);
							if (results >= 1) {
								found = true;
								break;
							}
						}
						logger.info("Waiting for CIED Data later than "
								+ now.toString());
						Thread.sleep(10000);
					}
				} else {
					String informationType = parts[2];
					boolean considerEHRPHRDistinction = false;
					boolean fromPHR = false;
					if (parts[1].equals("C1562065")) { // BOTH EHR and PHR
					} else if (parts[1].equals("C2362543")) { // Only EHR
						considerEHRPHRDistinction = true;
						fromPHR = false;
					} else if (parts[1].equals("C0018739")) { // Only PHR
						considerEHRPHRDistinction = true;
						fromPHR = true;
					} else {
						logger.error("The sequence of DataSources in the Event tag is wrong...");
					}
					boolean found = false;
					while (!found) {
						logger.info("Retrieving:" + patientID
								+ " EHR/PHR Distinction:"
								+ considerEHRPHRDistinction + " From PHR:"
								+ fromPHR);
						Object[] objects = (new EHRPHRDataRetriever())
								.retriveEHRPHRData("" + patientID, true,
										informationType, null,
										considerEHRPHRDistinction, fromPHR);

						// TODO: Buradada hepsini al.. eger effective time'i
						// current date'ten buyuk olan varmi ona bak...
						// eger varsa devam et...
						if (objects != null && objects.length > 0) {
							for (int i = 0; i < objects.length; i++) {
								if (informationType.equals("C1254595")) {
									ImagingResult imagingResult = (ImagingResult) objects[i];
									String imagingResultTime = imagingResult
											.getEffectiveTime();
									// String currentDateString =
									// dateFormat.format(currentDate);
									if (imagingResultTime == null)
										continue;
									imagingResultTime = imagingResultTime
											.substring(0, 8);
									Date imagingResultDate = simpleDateFormat
											.parse(imagingResultTime);
									logger.info("Lab result ("
											+ imagingResult.getLabResultText()
											+ ") date in the database:"
											+ imagingResultDate.toString());
									int results = imagingResultDate
											.compareTo(date);
									if (results >= 1) {
										found = true;
										break;
									}
								}
							}
						}
						logger.info("Waiting for Data... " + informationType
								+ " older than " + date.toString());
						Thread.sleep(10000);
					}
				}
				if (!guidelineAgent.showGUI) {
					String stepID = medicallyOrientedAction.getName2().split(
							":")[0];
					// tr.com.srdc.icardea.careplanengine.agents.afAgent.EngineInterface.sendMonitoringMessage(guidelineAgent.getAID(),
					// stepID, "FINISHED", "" + patientID);
				}
				return;
			}
			if (description.startsWith("Wait for duration")) { // It is WaitStep
				String[] parts = description.split(":");
				long time = Long.parseLong(parts[1]);
				String unit = parts[2];
				if (unit.equals("s")) {
					time *= 1000;
				} else if (unit.equals("m")) {
					time *= 60 * 1000;
				} else if (unit.equals("h")) {
					time *= 60 * 60 * 1000;
				} else if (unit.equals("d")) {
					time *= 24 * 60 * 60 * 1000;
				} else if (unit.equals("w")) {
					time *= 7 * 24 * 60 * 60 * 1000;
				}
				logger.info("Waiting for " + time + " " + unit);
				Thread.sleep(time);
				if (!guidelineAgent.showGUI) {
					String stepID = medicallyOrientedAction.getName2().split(
							":")[0];
					tr.com.srdc.icardea.careplanengine.agents.afAgent.EngineInterface
							.sendMonitoringMessage(guidelineAgent.getAID(),
									stepID, "FINISHED", "" + patientID);
				}
				return;
			} else if (description.startsWith("Record ")) { // It is
															// RecordActionStep
				String[] parts = description.split(":");
				(new EHRPHRDataRetriever()).recordData("" + patientID,
						parts[1], parts[4], parts[5], parts[7]);
				if (!guidelineAgent.showGUI) {
					String stepID = medicallyOrientedAction.getName2().split(
							":")[0];
					tr.com.srdc.icardea.careplanengine.agents.afAgent.EngineInterface
							.sendMonitoringMessage(guidelineAgent.getAID(),
									stepID, "FINISHED", "" + patientID);
				}
				return;
			}

			Medical_Action_Entity maEntity = medicallyOrientedAction
					.getMedical_task();
			if (maEntity == null) {
				return;
			}

			String service_wsdl = maEntity.getService_wsdl();
			String service_xsd = maEntity.getService_xsd();
			String service_owls = maEntity.getService_owls();

			// [itasyurt 25.07.06 ]
			// wait action implemented here

			Concept functionality = maEntity.getFunctionality();

			if ((functionality != null)
					&& (functionality.getConcept_name()
							.equalsIgnoreCase("Consult"))) {
				try {
					Data_Item input = maEntity.getInput();

					Data_Item retrievedInput = FactoryRetriever
							.retrieveDataItem(guidelineAgent.getGuidelineURI(),
									input);

					if (retrievedInput instanceof Variable_Data_Item) {
						logger.info("RETRIEVED INPUT NAME:"
								+ retrievedInput.getName2());
						// Variable_Data_Item variableDataItem =
						// (Variable_Data_Item) retrievedInput;
						// Data_Item_Value dataItemValue =
						// variableDataItem.getData_value();

						Object retrievedVal = FactoryRetriever
								.retrieveDataItemValue(
										guidelineAgent.getGuidelineURI(), input);

						String inputContent = "";
						if (retrievedVal instanceof Observation) {
							logger.info("DERIVATION EXP:"
									+ ((Observation) retrievedVal)
											.getDerivation_expression());
							Observation observation = (Observation) retrievedVal;
							ObservationEntity entity = new ObservationEntity(
									observation,
									guidelineAgent.getGuidelineURI());
							inputContent = entity.toString();
							logger.info("INPUT CONTENT:" + inputContent);
						} else if (retrievedVal instanceof Medication) {
							Medication medication = (Medication) retrievedVal;
							MedicationEntity entity = new MedicationEntity(
									medication);
							inputContent = entity.toString();
						}

						ConsultingMessage consultingMessage = new ConsultingMessage();
						consultingMessage.setInputName(retrievedInput
								.getName2());
						// [MUSTAFA: May 13, 2010]: Added for dynamic evaluation
						// of the consult string
						String consultSentence = preProcessConsultSentenceValue(
								medicallyOrientedAction.getDescription(),
								patientName, patientID);
						consultingMessage.setConsultSentence(consultSentence);

						consultingMessage.setPatientName(patientName);
						consultingMessage.setPatientID(patientID + "");
						consultingMessage.setMessageContent(inputContent);
						String stepID = medicallyOrientedAction.getName2()
								.split(":")[0];
						String response = guidelineAgent
								.processConsultingMessage(stepID,
										consultingMessage);
						logger.info("----------RESPONSE:" + response);

						if (retrievedVal instanceof Observation) {
							logger.info(" $$$ it is observation... "
									+ retrievedInput.getName2());
							ObservationEntity obs = new ObservationEntity(
									(Observation) retrievedVal,
									guidelineAgent.getGuidelineURI());
							obs.fromString(response);
							EHRFiller.fillObservation(
									(Observation) retrievedVal, obs,
									guidelineAgent.getGuidelineURI());
						} else if (retrievedVal instanceof Medication) {
							MedicationEntity med = new MedicationEntity(
									(Medication) retrievedVal);
							med.fromString(response);
							EHRFiller.fillMedication((Medication) retrievedVal,
									med);
						} else {
							logger.info(" !!!!!!!! ERROR neither Observation nor Medication !!!!!!!!!!");
						}
						// / [01.08.06 itasyurt] stores the result
						guidelineAgent.storeGlobalVariable(
								retrievedInput.getName2(), retrievedVal);
						Logger.getLogger(this.getClass()).log(Level.DEBUG,
								(retrievedInput.getName2()));

						// [itasyurt 18.08.06 ] temporary message to monitoring
						// TODO: get rid of these monitoring message mechanism
						Vector<String> messageVector = new Vector<String>();
						messageVector
								.add(GuidelineHistoryFrame.CONSULT_PERFORMED);
						messageVector.add(guidelineStep.getName());
						messageVector.add(retrievedInput.getName2());
						messageVector.add(response);
						guidelineAgent.messageToMonitoring(messageVector);
						if (!guidelineAgent.showGUI) {
							stepID = medicallyOrientedAction.getName2().split(
									":")[0];
							tr.com.srdc.icardea.careplanengine.agents.afAgent.EngineInterface
									.sendMonitoringMessage(
											guidelineAgent.getAID(), stepID,
											"FINISHED", "" + patientID);
						}
					}
				} catch (Exception exc) {
					exc.printStackTrace();

				}

			} else if ((functionality != null)
					&& (functionality.getConcept_name()
							.equalsIgnoreCase("Wait"))) {
				// / in this condition wait duration is kept in service_xsd....
				// TODO: Message to monitoring [itasyurt 25.07.06 ]
				Integer waitDuration = Integer.parseInt(service_wsdl);

				System.gc();
				for (int i = 0; i < waitDuration; ++i) {
					Thread.sleep(1000);
					Logger.getLogger(this.getClass())
							.log(Level.DEBUG,
									("Waiting for " + waitDuration
											+ " seconds Left:" + (waitDuration - i)));
				}
				// [itasyurt 17.08.06 ] temporary message to monitoring
				Vector<String> messageVector = new Vector<String>();
				messageVector.add(GuidelineHistoryFrame.WAIT_PERFORMED);
				messageVector.add(guidelineStep.getName());
				messageVector.add(service_wsdl);
				guidelineAgent.messageToMonitoring(messageVector);
			} else {

				/* Gunes ALUC, SRDC, 06 June 2007 ****************** */
				/* extension to enable the Monitoring Agent/GUI *** */
				/* view the values with which the Medical WS ****** */
				/* is called. ************************************* */

				Vector<String> messageVector = new Vector<String>();
				messageVector.add(GuidelineHistoryFrame.WS_CALLED);
				messageVector.add(guidelineStep.getName());
				messageVector.add(medicallyOrientedAction.getName2());
				// PLEASE NOTE: messageVector is further modified
				// and sent individually in each conditional branch.

				if (maEntity.getIs_synchronous()) {
					monitoringMessage.setMonitoringInfo("var name& value");

					Data_Item input = maEntity.getInput();
					Object retrievedVal = FactoryRetriever
							.retrieveDataItemValue(
									guidelineAgent.getGuidelineURI(), input);

					String inputContent = "";
					String wsResult = "";

					if (retrievedVal instanceof Procedure) {
						Procedure procedure = (Procedure) retrievedVal;
						ProcedureEntity entity = new ProcedureEntity(procedure);
						inputContent = toStringWithDataElementAsRoot(entity,
								guidelineAgent.getPatientID());
					} else if (retrievedVal instanceof Medication) {
						Medication medication = (Medication) retrievedVal;
						MedicationEntity entity = new MedicationEntity(
								medication);
						inputContent = toStringWithDataElementAsRoot(entity,
								guidelineAgent.getPatientID());
					}

					messageVector.add(inputContent);
					guidelineAgent.messageToMonitoring(messageVector);

					/* **************************************
					 * [2007.09.21:::Gunes ALUC] * extension for
					 * WS-Authorization * ************************************
					 */
					/*
					 * if(com.srdc.icardea.careplanengine.util.
					 * ICARDEAConfigurationUtil.SECURE_WS_ENABLED &&
					 * com.srdc.icardea
					 * .careplanengine.util.ICARDEAConfigurationUtil
					 * .PRIVACY_OF_WS_ENABLED) { ClientCredentials credentials =
					 * new ClientCredentials("GuidelineExecutionAgent",
					 * "ExecutionRelatedServices",
					 * guidelineAgent.getPatientID());
					 * HandlersInternalObjectRepository
					 * .getInstance().storeClientCredentials(credentials); }
					 */
					/* **************************************
					 * end-of-extension * ************************************
					 */

					wsResult = Client.invokeMedicalWS(guidelineAgent,
							service_wsdl, inputContent, service_owls,
							service_xsd);
					Logger.getLogger(this.getClass()).log(Level.DEBUG,
							("Medical WS result:\n" + wsResult));

				} /*
				 * else if(maEntity.getIs_critical()) { String patientDataStr =
				 * toStringWithDataElementAsRoot(
				 * medicallyOrientedAction.getName2() + " for patient " +
				 * guidelineAgent.getPatientID() );
				 * 
				 * ResultExecution resultExecution = new
				 * ResultExecution(guidelineAgent,maEntity,service_xsd);
				 * 
				 * messageVector.add(patientDataStr);
				 * guidelineAgent.messageToMonitoring(messageVector);
				 * 
				 * 
				 * 
				 * 
				 * Client.invokeWSAsynch(guidelineAgent,service_wsdl,patientDataStr
				 * ,service_owls,service_xsd,resultExecution);
				 * monitoringMessage.setMonitoringInfo("var name& value"); }
				 */

				// TODO: Message to monitoring
				// Logger.getLogger(this.getClass()).log(Level.DEBUG,
				// ("TODO: Message to Monitoring ");

				/* END-OF-EXTENSION ******************************** */
			}
		} catch (Exception exc) {

			exc.printStackTrace();

		}
	}

	public static String toStringWithDataElementAsRoot(
			PatientDataEntity patientDataEntity, String patientID) {
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
			rootElem.appendChild(patientDataEntity.toXmlElement(doc));

			XMLSerializer serializer = new XMLSerializer(strWriter,
					new OutputFormat(doc));
			serializer.serialize(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return strWriter.toString();
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

	private String preProcessConsultSentence(String sentence) {
		int beginIndex, endIndex, endIndex1, endIndex2, endIndex3;

		String result = sentence;
		while (result.contains("$")) {
			beginIndex = result.indexOf('$', 0);
			endIndex1 = result.indexOf(' ', beginIndex);
			endIndex2 = result.indexOf(',', beginIndex);
			endIndex3 = result.indexOf('.', beginIndex);
			if (endIndex1 == -1) {
				endIndex1 = Integer.MAX_VALUE;
			}
			if (endIndex2 == -1) {
				endIndex2 = Integer.MAX_VALUE;
			}
			if (endIndex3 == -1) {
				endIndex3 = Integer.MAX_VALUE;
			}
			if (endIndex1 < endIndex2) {
				if (endIndex1 < endIndex3) {
					endIndex = endIndex1;
				} else {
					endIndex = endIndex3;
				}
			} else {
				if (endIndex2 < endIndex3) {
					endIndex = endIndex2;
				} else {
					endIndex = endIndex3;
				}
			}

			String variable = result.substring(beginIndex + 1, endIndex);
			Object object = guidelineAgent.getGlobalVariable(variable);
			String valueStr = "";
			if (object != null && object instanceof Observation) {
				Observation obs = (Observation) object;
				if (obs.hasValue()) {
					Observation_Value val = FactoryRetriever
							.retrieveObservationValue(
									guidelineAgent.getGuidelineURI(),
									obs.getValue());
					if (val instanceof Text_Value) {
						valueStr = ((Text_Value) val).getText();
					} else if (val instanceof Index) {
						valueStr = new String(Float.toString((((Index) val)
								.getIndex())));
					}
				}
			}

			// Logger.getLogger(this.getClass()).log(Level.DEBUG,
			// ("BULDUKKKK " + variable + " - " + valueStr);

			// now replace text
			if (!valueStr.equals("")) {
				// keep the variable but remove '$'
				if (valueStr.equals("1.0") || valueStr.equals("true")) {
					if (variable.endsWith("Status")) {
						result = result.replace(
								result.substring(beginIndex, endIndex),
								variable.substring(0, variable.length() - 6));
					} else {
						result = result.replaceFirst("\\$", "");
					}
					// Logger.getLogger(this.getClass()).log(Level.DEBUG,
					// ("DEGISTIRDIMMMM: " + result);
				} else {
					result = result.replace(
							result.substring(beginIndex, endIndex + 1), "");
					// Logger.getLogger(this.getClass()).log(Level.DEBUG,
					// ("DEGISTIRDIMMMM2: " + result);
				}
			}
			// I have to remove the $ sign even if the variable is not found
			// otherwise infinite loop
			if (object == null) {
				result = result.replaceFirst("\\$", "");
			}
		}
		return result;
	}

	private String preProcessConsultSentenceValue(String sentence,
			String patientName, long patientID) {
		int beginIndex, endIndex, endIndex1, endIndex2, endIndex3, endIndex4, endIndex5;

		String result = sentence;

		while (result.contains("PPM:")) {
			logger.info("There is a link to PPM in the HTML...");
			beginIndex = result.indexOf("PPM:");
			endIndex = beginIndex + 8;

			String ppmlink = result.substring(beginIndex, endIndex);
			char[] ppmLinkArray = ppmlink.toCharArray();
			char tab = ppmLinkArray[ppmLinkArray.length - 1];

			// 
			String openid = tr.com.srdc.icardea.platform.service.login.RegistrationModel.getOpenIdStatic();
			if(openid == null)
				openid = "https://icardea-server.lksdom21.lks.local/idp/u=xrypa";

			ResourceBundle properties = ResourceBundle.getBundle("icardea");
			// https://localhost:8443/ppm_v2/view?startup=de.offis.health.icardea.ppm.viewapp
			String ppmEndpoint = properties.getString("ppm.end");
			ppmEndpoint += "&scaled=true";
			ppmEndpoint += "&patientid=" + patientID;
			ppmEndpoint += "&tab=" + tab;
			ppmEndpoint += "&openid=" + openid;
			result = result.replaceAll(ppmlink, ppmEndpoint);
		}

		while (result.contains(SCRIPTKeyword)) {
			logger.info("There is a script in the HTML....");
			String value = " ";
			beginIndex = result.indexOf(SCRIPTKeyword, 0);
			endIndex = result.indexOf("</script>", beginIndex);

			int contentBeginIndex = result.indexOf("<content>");
			int contentEndIndex = result.indexOf("<", contentBeginIndex + 1);
			String script = result.substring(contentBeginIndex + 9,
					contentEndIndex);

			int argumentsBeginIndex = result.indexOf("<arguments>");
			int argumentsEndIndex = result
					.indexOf("<", argumentsBeginIndex + 1);
			String arguments = result.substring(argumentsBeginIndex + 11,
					argumentsEndIndex);
			arguments = arguments.replaceAll(" ", "");
			String[] argumentNames = arguments.split(",");
			List argumentList = new ArrayList();
			logger.info("Arguments:" + arguments + " Script:" + script);
			for (int i = 0; i < argumentNames.length; i++) {
				String variable = argumentNames[i].replaceAll("\\$", "");
				Object object = guidelineAgent.getGlobalVariable(variable);
				String valueStr = "";
				boolean isObject = false;

				if (object != null && object instanceof Observation) {
					Observation obs = (Observation) object;
					if (obs.hasValue()) {
						Observation_Value val = FactoryRetriever
								.retrieveObservationValue(
										guidelineAgent.getGuidelineURI(),
										obs.getValue());
						if (val instanceof Text_Value) {
							valueStr = ((Text_Value) val).getText();
							if (valueStr.equals("THEELEMENTISOBJECT")) {
								isObject = true;
							}
						} else if (val instanceof Index) {
							valueStr = new String(Float.toString((((Index) val)
									.getIndex())));
						}
					}
				}

				if (isObject) {
					logger.info("Variable is object:" + variable);
					object = guidelineAgent
							.getGlobalVariableObjectValue(variable);
					argumentList.add(object);
				} else {
					argumentList.add(valueStr);
				}
			}
			value = (String) JavaScriptEngine.execute(argumentList.toArray(),
					script);
			logger.info("Script Execution Result:" + value);
			result = result.replace(result.substring(beginIndex, endIndex + 9),
					value);
			logger.info("Result after script execution:" + result);
		}

		while (result.contains("$")) {
			beginIndex = result.indexOf('$', 0);
			endIndex1 = result.indexOf(' ', beginIndex);
			endIndex2 = result.indexOf(',', beginIndex);
			endIndex3 = result.indexOf('.', beginIndex);
			endIndex4 = result.indexOf("</b>", beginIndex);
			endIndex5 = result.indexOf('\n', beginIndex);
			if (endIndex1 == -1) {
				endIndex1 = Integer.MAX_VALUE;
			}
			if (endIndex2 == -1) {
				endIndex2 = Integer.MAX_VALUE;
			}
			if (endIndex3 == -1) {
				endIndex3 = Integer.MAX_VALUE;
			}
			if (endIndex4 == -1) {
				endIndex4 = Integer.MAX_VALUE;
			}
			if (endIndex5 == -1) {
				endIndex5 = Integer.MAX_VALUE;
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
			if (endIndex4 < endIndex) {
				endIndex = endIndex4;
			}
			if (endIndex5 < endIndex) {
				endIndex = endIndex5;
			}
			String variable = result.substring(beginIndex + 1, endIndex);
			// logger.info("RESULT:\n\n\n" + result);
			logger.info("VARiable:" + variable);
			Object object = guidelineAgent.getGlobalVariable(variable);
			String valueStr = "";
			boolean isObject = false;

			if (object != null && object instanceof Observation) {
				Observation obs = (Observation) object;
				if (obs.hasValue()) {
					Observation_Value val = FactoryRetriever
							.retrieveObservationValue(
									guidelineAgent.getGuidelineURI(),
									obs.getValue());
					if (val instanceof Text_Value) {
						valueStr = ((Text_Value) val).getText();
						if (valueStr.equals("THEELEMENTISOBJECT")) {
							isObject = true;
						}
					} else if (val instanceof Index) {
						valueStr = new String(Float.toString((((Index) val)
								.getIndex())));
					}
				}
			}

			// object = guidelineAgent.getGlobalVariableObjectValue(variable);

			// Logger.getLogger(this.getClass()).log(Level.DEBUG,
			// ("BULDUKKKK " + variable + " - " + valueStr);

			result = result.replaceFirst(
					"\\$" + result.substring(beginIndex + 1, endIndex), "<b>"
							+ valueStr + "</b>");

			/*
			 * // now replace text if(!valueStr.equals("")) { // keep the
			 * variable but remove '$' if(valueStr.equals("1.0") ||
			 * valueStr.equals("true")) { if(variable.endsWith("Status")) result
			 * = result.replace(result.substring(beginIndex, endIndex),
			 * variable.substring(0, variable.length()-6)); else result =
			 * result.replaceFirst("\\$", "");
			 * //Logger.getLogger(this.getClass()).log(Level.DEBUG,
			 * ("DEGISTIRDIMMMM: " + result); } else { result =
			 * result.replace(result.substring(beginIndex, endIndex+1), "");
			 * //Logger.getLogger(this.getClass()).log(Level.DEBUG,
			 * ("DEGISTIRDIMMMM2: " + result); } }
			 */
			// I have to remove the $ sign even if the variable is not found
			// otherwise infinite loop
			if (object == null) {
				result = result.replaceFirst("\\$", "");
			}

		}

		while (result.contains(DBKeyword)) {
			logger.info("KeyWORD found!!");
			beginIndex = result.indexOf(DBKeyword, 0);
			endIndex = result.indexOf('>', beginIndex);
			String valueStr = "";
			String variable = result.substring(beginIndex + 11, endIndex - 2);
			logger.info("KeyWORD:" + variable);
			String parts[] = variable.split(":");
			if (parts[0].equals("caremanagementdb")) {
				try {
					if (parts.length > 2) {
						Object results[] = (new CIEDDataRetriever())
								.retrieveValue(
										(new Long(patientID)).toString(),
										parts[1].substring(2), false, false);
						if (results != null && results.length > 0
								&& results[0] != null) {
							valueStr = results[0].toString();
						}

					} else {
						String results[] = (new CIEDDataRetriever())
								.retrieveValue2(
										(new Long(patientID)).toString(),
										parts[1].substring(2), false);
						if (results != null && results.length > 0
								&& results[0] != null) {
							valueStr = results[0];
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (parts[0].equals("alarmmanager")) {
				valueStr = AlarmDatabaseConnection.getDateOfLastMessage();
			} else {
				logger.info("Unknown database name!!");
			}

			valueStr += " ";
			result = result.replace(result.substring(beginIndex, endIndex + 1),
					"<b>" + valueStr + "</b>");
			// if(valueStr.equals("")) {
			// result = result.replace(result.substring(beginIndex, endIndex),
			// valueStr);;
			// }

		}

		while (result.contains(IMGKeyword)) {
			logger.info("<img Keyword found in:" + result);
			beginIndex = result.indexOf(IMGKeyword, 0);
			beginIndex = result.indexOf("src=", beginIndex);
			endIndex = result.indexOf('"', beginIndex);
			endIndex = result.indexOf('"', endIndex + 1);
			logger.info("Start index=" + beginIndex + " End index=" + endIndex);
			String valueStr = "";
			String variable = result.substring(beginIndex + 5, endIndex);
			logger.info("KeyWORD:" + variable);
			String parts[] = variable.split(":");
			if (parts[0].equals("caremanagementdb")) {
				try {
					String results[] = (new CIEDDataRetriever())
							.retrieveValue2((new Long(patientID)).toString(),
									parts[1].substring(2), false);
					valueStr = results[0];
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				logger.info("Unknown image name!!");
			}

			byte[] decodedPDF = Base64.decodeBase64(valueStr.getBytes());
			String fileName = UUID.randomUUID().toString();
			String suffix = "";
			FileOutputStream fos;
			try {
				Properties properties = new Properties();
				properties.load(this.getClass().getClassLoader()
						.getResourceAsStream("icardea.properties"));
				String pdfReports = properties.getProperty("tomcat.home")
						+ "webapps/ROOT/icardea/pdfReports/";
				File file2 = new File(pdfReports);
				file2.mkdirs();
				File file = new File(pdfReports + fileName + ".pdf");
				file.createNewFile();
				fos = new FileOutputStream(pdfReports + fileName + ".pdf");
				fos.write(decodedPDF);
				fos.close();
				suffix = extractImages(file.getAbsolutePath());
			} catch (FileNotFoundException e) {
				logger.info("File Not Found!!");
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			String hostname = "";
			try {
				InetAddress addr = InetAddress.getLocalHost();
				hostname = addr.getHostAddress();

			} catch (UnknownHostException e) {
			}

			String link = "<a href=\\" + "http://" + hostname + ":8080"
					+ "/icardea/pdfReports/" + fileName + ".pdf"
					+ "\">Exported CIED document<br/><IMG src=\"http://"
					+ hostname + ":8080/icardea/pdfReports/" + fileName
					+ ".pdf." + suffix
					+ "\" width=\"240\" height=\"330\"/></a>";
			/*
			 * String link = "<center><a href=\"http://localhost:" +
			 * ICARDEAConfigurationUtil.TOMCAT_PORT + "/icardea/pdfReports/" +
			 * fileName + ".pdf" +
			 * "\">Exported CIED document<br/><IMG src=\"http://localhost:" +
			 * ICARDEAConfigurationUtil.TOMCAT_PORT +
			 * "/icardea/pdfReports/a.jpg\" width=\"240\" height=\"330\"/></a></center>"
			 * ;
			 */
			logger.info("Link:" + link);
			beginIndex = result.indexOf(IMGKeyword, 0);
			endIndex = result.indexOf('>', beginIndex);
			result = result.replace(result.substring(beginIndex, endIndex + 1),
					link);
			// if(valueStr.equals("")) {
			// result = result.replace(result.substring(beginIndex, endIndex),
			// valueStr);;
			// }

		}

		return result;
	}

	private String extractImages(String fileName) throws Exception {
		PDDocument document = null;
		PDXObjectImage image = null;
		String suffix = "";
		try {
			document = PDDocument.load(fileName);
			List pages = document.getDocumentCatalog().getAllPages();
			Iterator iter = pages.iterator();
			while (iter.hasNext()) {
				PDPage page = (PDPage) iter.next();
				PDResources resources = page.getResources();
				Map images = resources.getImages();
				if (images != null) {
					Iterator imageIter = images.keySet().iterator();
					while (imageIter.hasNext()) {
						String key = (String) imageIter.next();
						image = (PDXObjectImage) images.get(key);
						String name = fileName;
						logger.info("Writing image:" + name);
						image.write2file(name);
						suffix = image.getSuffix();
						if (image.getSuffix().equalsIgnoreCase("png")) {
							File file = new File(fileName + ".png");
							BufferedImage bufimage = ImageIO.read(file);
							File newfile = new File(fileName + ".jpg");
							ImageIO.write(bufimage, "jpg", newfile);
							suffix = "jpg";
						}
					}
				}
				break;
			}
		} finally {
			if (document != null) {
				document.close();
			}
		}
		return suffix;
	}
}
