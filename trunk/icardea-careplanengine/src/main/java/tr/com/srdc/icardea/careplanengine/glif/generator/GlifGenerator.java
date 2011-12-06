package tr.com.srdc.icardea.careplanengine.glif.generator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.log4j.Logger;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import tr.com.srdc.icardea.careplanengine.glmodel.Action_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Alarm_Entity;
import tr.com.srdc.icardea.careplanengine.glmodel.Algorithm;
import tr.com.srdc.icardea.careplanengine.glmodel.Case_Condition;
import tr.com.srdc.icardea.careplanengine.glmodel.Case_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Concept;
import tr.com.srdc.icardea.careplanengine.glmodel.Criterion;
import tr.com.srdc.icardea.careplanengine.glmodel.Decision_Option;
import tr.com.srdc.icardea.careplanengine.glmodel.EHR_Entity;
import tr.com.srdc.icardea.careplanengine.glmodel.Event;
import tr.com.srdc.icardea.careplanengine.glmodel.Get_Data_Action;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Index;
import tr.com.srdc.icardea.careplanengine.glmodel.Medical_Action_Entity;
import tr.com.srdc.icardea.careplanengine.glmodel.Medically_Oriented_Action_Specification;
import tr.com.srdc.icardea.careplanengine.glmodel.Message_Action;
import tr.com.srdc.icardea.careplanengine.glmodel.MyFactory;
import tr.com.srdc.icardea.careplanengine.glmodel.Observation;
import tr.com.srdc.icardea.careplanengine.glmodel.Patient_State_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Range;
import tr.com.srdc.icardea.careplanengine.glmodel.Sensor_Entity;
import tr.com.srdc.icardea.careplanengine.glmodel.Text_Value;
import tr.com.srdc.icardea.careplanengine.glmodel.Variable_Data_Item;
import tr.com.srdc.icardea.careplanengine.xmlmodel.Code;
import tr.com.srdc.icardea.careplanengine.xmlmodel.ConsultStep;
import tr.com.srdc.icardea.careplanengine.xmlmodel.DecisionStep;
import tr.com.srdc.icardea.careplanengine.xmlmodel.Duration;
import tr.com.srdc.icardea.careplanengine.xmlmodel.FinalStep;
import tr.com.srdc.icardea.careplanengine.xmlmodel.MedicalCareplan;
import tr.com.srdc.icardea.careplanengine.xmlmodel.RecommendationStep;
import tr.com.srdc.icardea.careplanengine.xmlmodel.RecordActionStep;
import tr.com.srdc.icardea.careplanengine.xmlmodel.Reference;
import tr.com.srdc.icardea.careplanengine.xmlmodel.StartStep;
import tr.com.srdc.icardea.careplanengine.xmlmodel.Value;
import tr.com.srdc.icardea.careplanengine.xmlmodel.Variable;
import tr.com.srdc.icardea.careplanengine.xmlmodel.WaitStep;

import com.hp.hpl.jena.util.FileUtils;

import edu.stanford.smi.protegex.owl.ProtegeOWL;
import edu.stanford.smi.protegex.owl.jena.JenaOWLModel;

public class GlifGenerator {

	/**
	 * @param args
	 */
	public static Logger logger = Logger.getLogger(GlifGenerator.class);
	public static String GUIDELINE_NAME = "ICARDEA_GUIDELINE";
	public static String GUIDELINE_INSTANCE_NAME = GUIDELINE_NAME
			+ "_Instance_";
	public static String WSDL_ADDRESS = "WSDL_ADDRESS";
	public static String STRING_DATATYPE = "http://www.w3.org/2001/XMLSchema#string";
	public static String BOOLEAN_DATATYPE = "http://www.w3.org/2001/XMLSchema#boolean";
	public static String INTEGER_DATATYPE = "http://www.w3.org/2001/XMLSchema#int";
	public static String RDF_ID = "rdf:ID";
	public static String RDF_DATATYPE = "rdf:datatype";
	public static String RDF_RESOURCE = "rdf:resource";
	public MedicalCareplan mc;
	public static int count = 0;
	JenaOWLModel owlModel;
	MyFactory myFactory;
	private Concept functionality;
	private Patient_State_Step finalPatientStateStep;
	public HashMap<String, Guideline_Step> guidelineSteps;
	public HashMap<String, Concept> semanticCategories;
	public Properties properties = new Properties();
	public String TOMCAT_HOME = "";

	public GlifGenerator() {
		try {
			properties.load(this.getClass().getClassLoader()
					.getResourceAsStream("icardea.properties"));
			TOMCAT_HOME = properties.getProperty("tomcat.home");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int counter() {
		count++;
		return count;
	}

	private MedicalCareplan getMedicalCareplanFromXML(String filepath) {
		JAXBContext jc;
		MedicalCareplan mc = null;
		try {
			jc = JAXBContext
					.newInstance("tr.com.srdc.icardea.careplanengine.xmlmodel");
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			SchemaFactory factory = SchemaFactory
					.newInstance("http://www.w3.org/2001/XMLSchema");
			File schemaLocation = new File(this.getClass().getClassLoader()
					.getResource("guideline/Careplan.xsd").getFile());

			Schema schema = factory.newSchema(schemaLocation);
			unmarshaller.setSchema(schema);

			mc = (MedicalCareplan) unmarshaller.unmarshal(this.getClass()
					.getClassLoader().getResourceAsStream(filepath));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mc;
	}

	private MedicalCareplan getMedicalCareplanFromXML(String xmlContent,
			boolean isXML) {
		JAXBContext jc;
		MedicalCareplan mc = null;
		try {
			jc = JAXBContext
					.newInstance("tr.com.srdc.icardea.careplanengine.xmlmodel");
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			SchemaFactory factory = SchemaFactory
					.newInstance("http://www.w3.org/2001/XMLSchema");
			File schemaLocation = new File(this.getClass().getClassLoader()
					.getResource("guideline/Careplan.xsd").getFile());

			Schema schema = factory.newSchema(schemaLocation);
			unmarshaller.setSchema(schema);
			ByteArrayInputStream input = new ByteArrayInputStream(
					xmlContent.getBytes());
			mc = (MedicalCareplan) unmarshaller.unmarshal(input);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mc;
	}

	private void printDocument(Document doc) {
		// set up a transformer
		try {
			TransformerFactory transfac = TransformerFactory.newInstance();
			Transformer trans = transfac.newTransformer();
			trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			trans.setOutputProperty(OutputKeys.INDENT, "yes");

			// create string from xml tree
			StringWriter sw = new StringWriter();
			StreamResult result = new StreamResult(sw);
			DOMSource source = new DOMSource(doc);
			trans.transform(source, result);
			String xmlString = sw.toString();

			// print xml
			logger.info("Here's the xml:\n\n" + xmlString);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Concept createConcept(Code code, String attribute) {
		Concept concept = myFactory.createConcept(GUIDELINE_INSTANCE_NAME
				+ counter());
		if (attribute == null) {
			concept.setConcept_id(code.getCode());
		} else {
			concept.setConcept_id(attribute);
		}
		concept.setConcept_name(code.getName());
		concept.setConcept_source(code.getSchemeID());
		return concept;
	}

	private Range createRange(String displayName) {
		Range range = myFactory
				.createRange(GUIDELINE_INSTANCE_NAME + counter());
		range.setDisplay_name(displayName);
		return range;
	}

	private Text_Value createTextValue(String text) {
		Text_Value textValue = myFactory
				.createText_Value(GUIDELINE_INSTANCE_NAME + counter());
		textValue.setText(text);
		return textValue;
	}

	private Criterion createEligibilityCriteria() {
		Variable variable = mc.getBody().getEligibilityCriteria().getVariable();

		Criterion criterion = myFactory.createCriterion(GUIDELINE_INSTANCE_NAME
				+ counter());

		// Event
		Event event = myFactory
				.createEvent(GUIDELINE_INSTANCE_NAME + counter());
		event.setEvent_type("patient_data_avialability");
		event.setName2("ICDDataAvailable");
		// Event END
		criterion.setTriggering_event(event);

		criterion.setSpecification(mc.getBody().getEligibilityCriteria()
				.getEvaluationScript());

		// GetDataAction
		Get_Data_Action getDataAction = myFactory
				.createGet_Data_Action(GUIDELINE_INSTANCE_NAME + counter());

		// SensorEntity
		Sensor_Entity sensorEntity = myFactory
				.createSensor_Entity(GUIDELINE_INSTANCE_NAME + counter());
		sensorEntity.setService_wsdl(WSDL_ADDRESS);
		// Code code = new Code();
		// code.setCode("C1546456");
		// code.setName("LaboratoryResult");
		// code.setSchemeID("UMLS");
		// Concept concept = createConcept(code,null);
		// sensorEntity.setSemantic_category(concept);
		// VariableDataItem
		Variable_Data_Item variableDataItem = myFactory
				.createVariable_Data_Item(GUIDELINE_INSTANCE_NAME + counter());

		List<Code> codes = variable.getConcept();
		Concept concept = createConcept(codes.get(0), null);
		variableDataItem.setConcept(concept);

		// Observation
		Observation observation = myFactory
				.createObservation(GUIDELINE_INSTANCE_NAME + counter());
		observation.setService_cd(concept);
		observation.setDerivation_expression(mc.getBody()
				.getEligibilityCriteria().getVariable().getRefinementScript());

		Range range = createRange("boolean");
		observation.setNormal_range(range);

		Text_Value textValue = createTextValue("valuetobespecified");
		observation.setValue(textValue);
		// Observation END

		variableDataItem.setData_value(observation);
		variableDataItem.setData_model_source_id("USAM");
		variableDataItem.setData_model_class_id("Observation");
		variableDataItem.setName2(variable.getName());
		// VariableDataItem END

		sensorEntity.setOutput(variableDataItem);
		// SensorEntity END

		getDataAction.setData_source_type(sensorEntity);
		getDataAction.setVariable_name(variable.getName());
		getDataAction.setName2("GetStatus");
		// Get_Data_Action END

		criterion.addGet_Data_Items(getDataAction);
		criterion.setName2("EligibleToGuideline");
		return criterion;
	}

	private Observation createObservation(Variable variable, Concept concept) {
		Observation observation = myFactory
				.createObservation(GUIDELINE_INSTANCE_NAME + counter());
		observation.setService_cd(concept);
		if (variable.getRefinementScript() != null) {
			observation
					.setDerivation_expression(variable.getRefinementScript());
		} else if (variable.getRefinementScript() == null
				&& (variable.getConcept() == null || variable.getConcept()
						.isEmpty())) {
			observation.setDerivation_expression("norefinement");
		} else {
			observation
					.setDerivation_expression("function refine(list) {var names=list.toArray(); println(names[0]); return names[0];}");
		}

		Range range = createRange(variable.getType());
		observation.setNormal_range(range);

		Text_Value textValue = createTextValue("valuetobespecified");
		observation.setValue(textValue);
		return observation;
	}

	private Variable_Data_Item createVariableDataItem(Variable variable) {
		Variable_Data_Item variableDataItem = myFactory
				.createVariable_Data_Item(GUIDELINE_INSTANCE_NAME + counter());

		Concept concept = null;
		List<Code> codes = variable.getConcept();

		if (codes == null || codes.size() == 0) {
			String attribute = null;
			if (variable.getDataSource().size() > 1) {
				Code code = variable.getDataSource().get(1);
				attribute = code.getAttribute();
			}
			concept = myFactory.createConcept(GUIDELINE_INSTANCE_NAME
					+ counter());
			if (attribute == null) {
				concept.setConcept_id("C0456148");
			} else {
				concept.setConcept_id(attribute);
			}
			concept.setConcept_name("null");
			concept.setConcept_source("UMLS");

			variableDataItem.setConcept(concept);
			Observation observation = createObservation(variable, concept);
			variableDataItem.setData_value(observation);
		} else if (codes.size() > 0) {
			String attribute = null;
			if (variable.getDataSource().size() > 1) {
				Code code = variable.getDataSource().get(1);
				attribute = code.getAttribute();
			}
			concept = createConcept(codes.get(0), attribute);
			variableDataItem.setConcept(concept);
			Observation observation = createObservation(variable, concept);
			variableDataItem.setData_value(observation);
		}

		variableDataItem.setData_model_source_id("USAM");
		variableDataItem.setData_model_class_id("Observation");
		variableDataItem.setName2("Status");

		return variableDataItem;
	}

	private Sensor_Entity createSensorEntity(Variable variable) {
		Sensor_Entity sensorEntity = myFactory
				.createSensor_Entity(GUIDELINE_INSTANCE_NAME + counter());

		sensorEntity.setService_wsdl(WSDL_ADDRESS);

		Variable_Data_Item variableDataItem = createVariableDataItem(variable);
		sensorEntity.setOutput(variableDataItem);
		if (variable.getDataSource().size() > 1) {
			sensorEntity.setSemantic_category(getSemanticCategory(variable));
		}

		return sensorEntity;
	}

	private Concept getSemanticCategory(Variable variable) {
		String dataSourceName = variable.getDataSource().get(1).getName();
		// if (semanticCategories.get(dataSourceName) == null) {

		Code codeEHRorPHRorCIED = variable.getDataSource().get(0);
		Code code = variable.getDataSource().get(1);
		Concept concept = myFactory.createConcept(GUIDELINE_INSTANCE_NAME
				+ counter());
		concept.setConcept_id(code.getCode());
		concept.setConcept_name(code.getName());
		// concept.setConcept_source(code.getSchemeID());
		concept.setConcept_source(codeEHRorPHRorCIED.getCode());

		semanticCategories.put(dataSourceName, concept);
		logger.info(variable.getName() + " Semantic category code:"
				+ code.getCode() + " Semantic category name:" + code.getName()
				+ " Semantic category data source:"
				+ codeEHRorPHRorCIED.getCode());
		// }
		// return semanticCategories.get(dataSourceName);
		return concept;
	}

	private EHR_Entity createEHREntity(Variable variable) {
		EHR_Entity ehrEntity = myFactory
				.createEHR_Entity(GUIDELINE_INSTANCE_NAME + counter());
		Variable_Data_Item variableDataItem = createVariableDataItem(variable);
		ehrEntity.setOutput(variableDataItem);
		ehrEntity.setSemantic_category(getSemanticCategory(variable));
		return ehrEntity;
	}

	private EHR_Entity createDummyEHREntity(Variable variable) {
		EHR_Entity ehrEntity = myFactory
				.createEHR_Entity(GUIDELINE_INSTANCE_NAME + counter());
		Variable_Data_Item variableDataItem = createVariableDataItem(variable);
		ehrEntity.setOutput(variableDataItem);
		return ehrEntity;
	}

	private Get_Data_Action createGetDataAction(Variable variable) {
		Get_Data_Action getDataAction = myFactory
				.createGet_Data_Action(GUIDELINE_INSTANCE_NAME + counter());

		List<Code> codes = variable.getDataSource();
		if (codes.get(0).getName().equals("Electronic Health Records")
				|| codes.get(0).getName().equals("Health Records, Personal")
				|| codes.get(0).getName().equals("Record of health event")) {
			EHR_Entity ehrEntity = createEHREntity(variable);
			getDataAction.setData_source_type(ehrEntity);
		} else if (codes.get(0).getName().equals("Cardiac implant device")) {
			Sensor_Entity sensorEntity = createSensorEntity(variable);
			getDataAction.setData_source_type(sensorEntity);
		} else if (codes.get(0).getName().equals("Care plan")) {
			EHR_Entity ehrEntity = createDummyEHREntity(variable);
			getDataAction.setData_source_type(ehrEntity);
		} else {
			logger.info("Data Source could not be found:"
					+ codes.get(0).getName());
		}

		getDataAction.setVariable_name(variable.getName());
		getDataAction.setName2(variable.getName());
		return getDataAction;
	}

	private Concept createFunctionality() {
		Concept concept = myFactory.createConcept(GUIDELINE_INSTANCE_NAME
				+ counter());
		concept.setConcept_id("C0557054");
		concept.setConcept_name("Consult");
		concept.setConcept_source("UMLS");
		return concept;
	}

	private Index createIndex() {
		Index index = myFactory
				.createIndex((GUIDELINE_INSTANCE_NAME + counter()));
		index.setIndex(0);
		return index;
	}

	private Text_Value createTextValue() {
		Text_Value textValue = myFactory
				.createText_Value((GUIDELINE_INSTANCE_NAME + counter()));
		textValue.setText("Dummy Text");
		return textValue;
	}

	private Observation createFunctionalObservation() {
		Observation observation = myFactory
				.createObservation(GUIDELINE_INSTANCE_NAME + counter());

		observation.setNormal_range(createRange("string"));
		observation.setValue(createTextValue());
		return observation;
	}

	private Variable_Data_Item createFunctionalVariableDataItem(
			ConsultStep consultStep) {
		Variable_Data_Item variableDataItem = myFactory
				.createVariable_Data_Item(GUIDELINE_INSTANCE_NAME + counter());

		variableDataItem.setName2(consultStep.getID() + "Choice");
		variableDataItem.setData_value(createFunctionalObservation());

		return variableDataItem;
	}

	private Variable_Data_Item createFunctionalVariableDataItem(
			RecommendationStep recommendationStep) {
		Variable_Data_Item variableDataItem = myFactory
				.createVariable_Data_Item(GUIDELINE_INSTANCE_NAME + counter());

		variableDataItem.setName2(recommendationStep.getID() + "Choice");
		variableDataItem.setData_value(createFunctionalObservation());

		return variableDataItem;
	}

	private Medical_Action_Entity createMedicalActionEntity(
			ConsultStep consultStep) {
		Medical_Action_Entity mae = myFactory
				.createMedical_Action_Entity(GUIDELINE_INSTANCE_NAME
						+ counter());
		mae.setFunctionality(functionality);
		Variable_Data_Item vdi = createFunctionalVariableDataItem(consultStep);
		mae.setInput(vdi);
		mae.setOutput(vdi);
		return mae;
	}

	private Medical_Action_Entity createMedicalActionEntity(
			RecommendationStep recommendationStep) {
		Medical_Action_Entity mae = myFactory
				.createMedical_Action_Entity(GUIDELINE_INSTANCE_NAME
						+ counter());
		mae.setFunctionality(functionality);
		Variable_Data_Item vdi = createFunctionalVariableDataItem(recommendationStep);
		mae.setInput(vdi);
		mae.setOutput(vdi);
		return mae;
	}

	private Medically_Oriented_Action_Specification createMedicallyOrientedActionSpecification(
			ConsultStep consultStep) {
		Medically_Oriented_Action_Specification moas = myFactory
				.createMedically_Oriented_Action_Specification(GUIDELINE_INSTANCE_NAME
						+ counter());
		moas.setName2(consultStep.getID() + ":" + consultStep.getName());
		Document doc = consultStep.getDisplay().getAny().getOwnerDocument();
		StringWriter strWriter = new StringWriter();
		XMLSerializer serializer = new XMLSerializer(strWriter,
				new OutputFormat(doc));
		try {
			serializer.serialize(doc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String desc = strWriter.toString();
		desc = desc.substring(desc.indexOf("<HTML>"));
		moas.setDescription(desc);
		moas.setMedical_task(createMedicalActionEntity(consultStep));

		return moas;
	}

	private Medically_Oriented_Action_Specification createMedicallyOrientedActionSpecification(
			WaitStep waitStep) {
		Medically_Oriented_Action_Specification moas = myFactory
				.createMedically_Oriented_Action_Specification(GUIDELINE_INSTANCE_NAME
						+ counter());
		moas.setName2(waitStep.getID() + ":" + waitStep.getName());
		List<Duration> durations = waitStep.getDuration();
		List<tr.com.srdc.icardea.careplanengine.xmlmodel.Event> events = waitStep
				.getEvent();

		String description = "";

		if (durations != null && durations.size() > 0) {
			Duration duration = durations.get(0);
			String amount = duration.getAmount();
			String unit = duration.getUnit();
			description = "Wait for duration:" + amount + ":" + unit;
		} else {
			tr.com.srdc.icardea.careplanengine.xmlmodel.Event event = events
					.get(0);
			List<Code> dataSource = event.getDataSource();
			description = "Wait for event";
			for (int i = dataSource.size() - 1; i >= 0; i--) {
				Code code = event.getDataSource().get(i);
				description += ":" + code.getCode();
			}
		}

		moas.setDescription(description);
		// moas.setMedical_task(createMedicalActionEntity(consultStep));

		return moas;
	}

	private Medically_Oriented_Action_Specification createMedicallyOrientedActionSpecification(
			RecordActionStep recordActionStep) {
		Medically_Oriented_Action_Specification moas = myFactory
				.createMedically_Oriented_Action_Specification(GUIDELINE_INSTANCE_NAME
						+ counter());
		moas.setName2(recordActionStep.getID() + ":"
				+ recordActionStep.getName());
		String description = "Record ";
		Code concept = recordActionStep.getConcept().get(0);
		Code dataSource = recordActionStep.getDataSource().get(0);
		Value value = recordActionStep.getValue();
		description += "WriteTo:" + dataSource.getCode() + ":"
				+ dataSource.getName();
		description += ":Code:" + concept.getCode() + ":" + concept.getName();
		description += ":Value:" + value.getText();
		moas.setDescription(description);
		// moas.setMedical_task(createMedicalActionEntity(consultStep));

		return moas;
	}

	private Medically_Oriented_Action_Specification createMedicallyOrientedActionSpecification(
			RecommendationStep recommendationStep) {
		Medically_Oriented_Action_Specification moas = myFactory
				.createMedically_Oriented_Action_Specification(GUIDELINE_INSTANCE_NAME
						+ counter());
		moas.setName2(recommendationStep.getID() + ":"
				+ recommendationStep.getName());
		Document doc = recommendationStep.getDisplay().getAny()
				.getOwnerDocument();
		StringWriter strWriter = new StringWriter();
		XMLSerializer serializer = new XMLSerializer(strWriter,
				new OutputFormat(doc));
		try {
			serializer.serialize(doc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String desc = strWriter.toString();
		desc = desc.substring(desc.indexOf("<HTML>"));
		moas.setDescription(desc);
		moas.setMedical_task(createMedicalActionEntity(recommendationStep));

		return moas;
	}

	private Criterion createCriterion(Reference ref) {
		Criterion criterion = myFactory.createCriterion(GUIDELINE_INSTANCE_NAME
				+ counter());
		criterion.setName2("DUMMY1");
		criterion.setSpecification(ref.getEvaluationScript());

		return criterion;
	}

	private Case_Condition createDecisionCondition(Reference ref) {
		Case_Condition caseCondition = myFactory
				.createCase_Condition(GUIDELINE_INSTANCE_NAME + counter());
		if (ref.getName() == null) {
			Object o = ref.getRef();
			if (o instanceof ConsultStep) {
				ConsultStep consultStep = (ConsultStep) o;
				caseCondition.setName2(consultStep.getID() + ":"
						+ consultStep.getName());
			} else if (o instanceof DecisionStep) {
				DecisionStep decisionStep = (DecisionStep) o;
				caseCondition.setName2(decisionStep.getID() + ":"
						+ decisionStep.getName());
			} else if (o instanceof RecommendationStep) {
				RecommendationStep recommendationStep = (RecommendationStep) o;
				caseCondition.setName2(recommendationStep.getID() + ":"
						+ recommendationStep.getName());
			} else if (o instanceof FinalStep) {
				FinalStep finalStep = (FinalStep) o;
				caseCondition.setName2(finalStep.getID() + ":"
						+ finalStep.getName());
			} else if (o instanceof StartStep) {
				StartStep startStep = (StartStep) o;
				caseCondition.setName2(startStep.getID() + ":"
						+ startStep.getName());
			} else {
				caseCondition.setName2("DUMMY2");
			}
		} else {
			caseCondition.setName2(ref.getName());
		}
		caseCondition.setCase_value(createCriterion(ref));

		return caseCondition;
	}

	private Decision_Option createDecisionOption(Reference ref) {
		Decision_Option decisionOption = myFactory
				.createDecision_Option(GUIDELINE_INSTANCE_NAME + counter());
		decisionOption.setDisplay_name("DUMMY");
		decisionOption.setName2("DUMMY3");
		decisionOption.setCondition_value(createDecisionCondition(ref));
		decisionOption.setDestination(evaluateReference(ref));
		return decisionOption;
	}

	private Case_Step createCaseStep(Object step) {
		Case_Step caseStep = myFactory.createCase_Step(GUIDELINE_INSTANCE_NAME
				+ counter());

		if (step instanceof ConsultStep) {
			ConsultStep consultStep = (ConsultStep) step;
			caseStep.setName2(consultStep.getID() + ":" + consultStep.getName());
			for (Reference ref : consultStep.getNextStep()) {
				caseStep.addOptions(createDecisionOption(ref));
			}
		} else if (step instanceof DecisionStep) {
			DecisionStep decisionStep = (DecisionStep) step;
			caseStep.setName2(decisionStep.getID() + ":"
					+ decisionStep.getName());
			for (Reference ref : decisionStep.getNextStep()) {
				caseStep.addOptions(createDecisionOption(ref));
			}
		} else if (step instanceof WaitStep) {
			WaitStep waitStep = (WaitStep) step;
			caseStep.setName2(waitStep.getID() + ":" + waitStep.getName());
			for (Reference ref : waitStep.getNextStep()) {
				caseStep.addOptions(createDecisionOption(ref));
			}
		} else if (step instanceof RecordActionStep) {
			RecordActionStep recordActionStep = (RecordActionStep) step;
			caseStep.setName2(recordActionStep.getID() + ":"
					+ recordActionStep.getName());
			for (Reference ref : recordActionStep.getNextStep()) {
				caseStep.addOptions(createDecisionOption(ref));
			}
		}

		// caseStep.setDefault_next_step(finalPatientStateStep);

		return caseStep;
	}

	private Action_Step createMedicalOrientedActionStep(ConsultStep consultStep) {
		Action_Step medicalOrientedActionStep = myFactory
				.createAction_Step(GUIDELINE_INSTANCE_NAME + counter());
		medicalOrientedActionStep.setName2(consultStep.getID() + ":"
				+ consultStep.getName());
		medicalOrientedActionStep
				.addTasks(createMedicallyOrientedActionSpecification(consultStep));

		medicalOrientedActionStep.setNext_step(createCaseStep(consultStep));

		return medicalOrientedActionStep;
	}

	private Action_Step createMedicalOrientedActionStep(WaitStep waitStep) {
		Action_Step medicalOrientedActionStep = myFactory
				.createAction_Step(GUIDELINE_INSTANCE_NAME + counter());
		medicalOrientedActionStep.setName2(waitStep.getID() + ":"
				+ waitStep.getName());
		medicalOrientedActionStep
				.addTasks(createMedicallyOrientedActionSpecification(waitStep));

		medicalOrientedActionStep.setNext_step(createCaseStep(waitStep));

		return medicalOrientedActionStep;
	}

	private Action_Step createMedicalOrientedActionStep(
			RecordActionStep recordActionStep) {
		Action_Step medicalOrientedActionStep = myFactory
				.createAction_Step(GUIDELINE_INSTANCE_NAME + counter());
		medicalOrientedActionStep.setName2(recordActionStep.getID() + ":"
				+ recordActionStep.getName());
		medicalOrientedActionStep
				.addTasks(createMedicallyOrientedActionSpecification(recordActionStep));

		medicalOrientedActionStep
				.setNext_step(createCaseStep(recordActionStep));

		return medicalOrientedActionStep;
	}

	private Guideline_Step evaluateConsultStep(ConsultStep consultStep) {
		Action_Step getDataActionStep = myFactory
				.createAction_Step(GUIDELINE_INSTANCE_NAME + counter());
		getDataActionStep.setName2("GetDataAction");

		ArrayList<Get_Data_Action> conditionalTasks = new ArrayList<Get_Data_Action>();
		for (Variable variable : consultStep.getVariable()) {
			List<Code> codes = variable.getDataSource();
			if (codes.get(0).getName().equals("Care plan")) {
				conditionalTasks.add(createGetDataAction(variable));
			} else {
				getDataActionStep.addTasks(createGetDataAction(variable));
			}
		}
		if (conditionalTasks.size() > 0) {
			Action_Step getConditionalDataActionStep = myFactory
					.createAction_Step(GUIDELINE_INSTANCE_NAME + counter());
			getConditionalDataActionStep.setName2("GetConditionalDataAction");
			for (Get_Data_Action gda : conditionalTasks) {
				getConditionalDataActionStep.addTasks(gda);
			}
			getConditionalDataActionStep
					.setNext_step(createMedicalOrientedActionStep(consultStep));
			getDataActionStep.setNext_step(getConditionalDataActionStep);
		} else {
			if (getDataActionStep.getTasks().size() == 0) {
				return createMedicalOrientedActionStep(consultStep);
			}
			getDataActionStep
					.setNext_step(createMedicalOrientedActionStep(consultStep));
		}
		return getDataActionStep;
	}

	private Guideline_Step evaluateWaitStep(WaitStep waitStep) {
		Action_Step getDataActionStep = myFactory
				.createAction_Step(GUIDELINE_INSTANCE_NAME + counter());
		getDataActionStep.setName2("Wait");

		getDataActionStep
				.setNext_step(createMedicalOrientedActionStep(waitStep));
		return getDataActionStep;
	}

	private Guideline_Step evaluateRecordActionStep(
			RecordActionStep recordActionStep) {
		Action_Step getDataActionStep = myFactory
				.createAction_Step(GUIDELINE_INSTANCE_NAME + counter());
		getDataActionStep.setName2("Record");

		getDataActionStep
				.setNext_step(createMedicalOrientedActionStep(recordActionStep));
		return getDataActionStep;
	}

	private Guideline_Step evaluateFinalStep(FinalStep finalStep) {
		Patient_State_Step patientStateStep = myFactory
				.createPatient_State_Step(GUIDELINE_INSTANCE_NAME + counter());
		patientStateStep.setNew_encounter(false);
		patientStateStep.setDisplay_name("Guideline Finalized");
		return patientStateStep;
	}

	private Guideline_Step evaluateDecisionStep(DecisionStep decisionStep) {
		Action_Step getDataActionStep = myFactory
				.createAction_Step(GUIDELINE_INSTANCE_NAME + counter());
		getDataActionStep.setName2("GetDataAction");

		ArrayList<Get_Data_Action> conditionalTasks = new ArrayList<Get_Data_Action>();
		for (Variable variable : decisionStep.getVariable()) {
			List<Code> codes = variable.getDataSource();
			if (codes.get(0).getName().equals("Care plan")) {
				conditionalTasks.add(createGetDataAction(variable));
			} else {
				getDataActionStep.addTasks(createGetDataAction(variable));
			}
		}
		if (conditionalTasks.size() > 0) {
			Action_Step getConditionalDataActionStep = myFactory
					.createAction_Step(GUIDELINE_INSTANCE_NAME + counter());
			getConditionalDataActionStep.setName2("GetConditionalDataAction");
			for (Get_Data_Action gda : conditionalTasks) {
				getConditionalDataActionStep.addTasks(gda);
			}
			getConditionalDataActionStep
					.setNext_step(createCaseStep(decisionStep));
			getDataActionStep.setNext_step(getConditionalDataActionStep);
		} else {
			getDataActionStep.setNext_step(createCaseStep(decisionStep));
		}
		return getDataActionStep;
	}

	private Alarm_Entity createAlarmEntity(RecommendationStep recommendationStep) {
		Alarm_Entity alarmEntity = myFactory
				.createAlarm_Entity(GUIDELINE_INSTANCE_NAME + counter());
		alarmEntity.setAlarm_threshold(recommendationStep.getUrgency());
		alarmEntity.addRoles("2");
		alarmEntity.setAlarm_message(recommendationStep.getName());
		return alarmEntity;
	}

	private Message_Action createMessageAction(
			RecommendationStep recommendationStep) {
		Message_Action messageAction = myFactory
				.createMessage_Action(GUIDELINE_INSTANCE_NAME + counter());
		messageAction.setName2(recommendationStep.getID()
				+ ":Recommendation Action Message");
		Document doc = recommendationStep.getDisplay().getAny()
				.getOwnerDocument();
		StringWriter strWriter = new StringWriter();
		XMLSerializer serializer = new XMLSerializer(strWriter,
				new OutputFormat(doc));
		try {
			serializer.serialize(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String desc = strWriter.toString();
		desc = desc.substring(desc.indexOf("<HTML>"));

		messageAction.setDescription(desc);
		messageAction.setMessage(createAlarmEntity(recommendationStep));
		return messageAction;
	}

	private Guideline_Step evaluateRecommendationStep(
			RecommendationStep recommendationStep) {
		Action_Step messageActionStep = myFactory
				.createAction_Step(GUIDELINE_INSTANCE_NAME + counter());
		messageActionStep.setName2(recommendationStep.getID() + ":"
				+ recommendationStep.getName());
		messageActionStep.addTasks(createMessageAction(recommendationStep));
		messageActionStep
				.addTasks(createMedicallyOrientedActionSpecification(recommendationStep));

		messageActionStep.setNext_step(evaluateReference(recommendationStep
				.getNextStep().get(0)));

		return messageActionStep;
	}

	private Guideline_Step evaluateReference(Reference reference) {
		Object o = reference.getRef();
		String guidelineID = "";
		if (o instanceof ConsultStep) {
			ConsultStep consultStep = (ConsultStep) o;
			// logger.info(consultStep.getID());
			guidelineID = consultStep.getID();
			if (guidelineSteps.get(guidelineID) == null) {
				guidelineSteps.put(guidelineID,
						evaluateConsultStep(consultStep));
			}
			return guidelineSteps.get(guidelineID);
		} else if (o instanceof DecisionStep) {
			DecisionStep decisionStep = (DecisionStep) o;
			// logger.info(decisionStep.getID());
			guidelineID = decisionStep.getID();
			if (guidelineSteps.get(guidelineID) == null) {
				guidelineSteps.put(guidelineID,
						evaluateDecisionStep(decisionStep));
			}
			return guidelineSteps.get(guidelineID);
		} else if (o instanceof WaitStep) {
			WaitStep waitStep = (WaitStep) o;
			// logger.info(decisionStep.getID());
			guidelineID = waitStep.getID();
			if (guidelineSteps.get(guidelineID) == null) {
				guidelineSteps.put(guidelineID, evaluateWaitStep(waitStep));
			}
			return guidelineSteps.get(guidelineID);
		} else if (o instanceof RecordActionStep) {
			RecordActionStep recodActionStep = (RecordActionStep) o;
			// logger.info(decisionStep.getID());
			guidelineID = recodActionStep.getID();
			if (guidelineSteps.get(guidelineID) == null) {
				guidelineSteps.put(guidelineID,
						evaluateRecordActionStep(recodActionStep));
			}
			return guidelineSteps.get(guidelineID);
		} else if (o instanceof RecommendationStep) {
			RecommendationStep recommendationStep = (RecommendationStep) o;
			// logger.info(recommendationStep.getID());
			guidelineID = recommendationStep.getID();
			if (guidelineSteps.get(guidelineID) == null) {
				guidelineSteps.put(guidelineID,
						evaluateRecommendationStep(recommendationStep));
			}
			return guidelineSteps.get(guidelineID);
		} else if (o instanceof FinalStep) {
			FinalStep finalStep = (FinalStep) o;
			// logger.info(finalStep.getID());
			guidelineID = finalStep.getID();
			if (guidelineSteps.get(guidelineID) == null) {
				guidelineSteps.put(guidelineID, evaluateFinalStep(finalStep));
			}
			return guidelineSteps.get(guidelineID);
		} else {
			logger.info("Unknown Step Element in Algorithm ");
			return null;
		}
	}

	private Patient_State_Step createStartPatientStateStep(StartStep startStep) {
		Patient_State_Step patientStateStep = myFactory
				.createPatient_State_Step(GUIDELINE_INSTANCE_NAME + counter());
		patientStateStep.setDisplay_name("Detected");
		patientStateStep.setName2(startStep.getID() + ":Detected");
		patientStateStep.setNew_encounter(false);

		patientStateStep.setNext_step(evaluateReference(startStep.getNextStep()
				.get(0)));

		return patientStateStep;
	}

	private Patient_State_Step createFinalPatientStateStep(FinalStep finalStep) {
		Patient_State_Step patientStateStep = myFactory
				.createPatient_State_Step(GUIDELINE_INSTANCE_NAME + counter());
		patientStateStep.setDisplay_name("GuidelineFinalized");
		patientStateStep.setName2(finalStep.getID() + ":GuidelineFinalized");
		patientStateStep.setNew_encounter(false);
		return patientStateStep;
	}

	private Algorithm createAlgorithm() {
		guidelineSteps = new HashMap<String, Guideline_Step>();
		semanticCategories = new HashMap<String, Concept>();
		Algorithm algorithm = myFactory.createAlgorithm(GUIDELINE_INSTANCE_NAME
				+ counter());
		algorithm.setName2("Algorithm");

		tr.com.srdc.icardea.careplanengine.xmlmodel.Algorithm inputAlgorithm = mc
				.getBody().getAlgorithm();
		List<Object> steps = inputAlgorithm
				.getStartStepOrFinalStepOrDecisionStep();

		StartStep startStep = null;
		FinalStep finalStep = null;
		for (Object o : steps) {
			if (o instanceof StartStep) {
				startStep = (StartStep) o;
			} else if (o instanceof FinalStep) {
				finalStep = (FinalStep) o;
			}
		}

		finalPatientStateStep = createFinalPatientStateStep(finalStep);
		guidelineSteps.put(finalStep.getID(), finalPatientStateStep);
		Patient_State_Step startPatientStateStep = createStartPatientStateStep(startStep);

		algorithm.setFirst_step(startPatientStateStep);
		return algorithm;
	}

	public void fillOwlModel() {
		myFactory = new MyFactory(owlModel);
		Guideline guideline = myFactory.createGuideline(GUIDELINE_INSTANCE_NAME
				+ counter());
		functionality = createFunctionality();
		guideline.setName2(mc.getName());

		Criterion criterion = createEligibilityCriteria();
		guideline.addEligibility_criteria(criterion);

		Algorithm algorithm = createAlgorithm();
		guideline.setAlgorithm(algorithm);
	}

	public void generateGlifFromXML(String inputCareplanXMLPath,
			String outputCareplanOWLPath) {

		String input = "guideline/GuidelineTemplate.owl";
		try {
			// String output = TOMCAT_HOME +
			// "/webapps/ROOT/icardea/guidelines/icardea/SALKGuideline2.owl";
			String output = TOMCAT_HOME + outputCareplanOWLPath;
			InputStream is = this.getClass().getClassLoader()
					.getResourceAsStream(input);
			owlModel = ProtegeOWL.createJenaOWLModelFromInputStream(is);
			// mc = getMedicalCareplanFromXML("guideline/CareplanUpdated.xml");
			mc = getMedicalCareplanFromXML(inputCareplanXMLPath);
			fillOwlModel();
			Collection errors = new ArrayList();
			owlModel.save(new File(output).toURI(), FileUtils.langXMLAbbrev,
					errors);
			logger.info("File saved with " + errors.size() + " errors to: "+ output);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String generateGlifFromXMLContent(String inputXML, String name,
			String id, String diagramContent) {
		String path = TOMCAT_HOME
				+ "webapps/ROOT/icardea/guidelines/icardea/" + name.replaceAll(" ", "") + "-"
				+ id + ".owl";
		String input = "guideline/GuidelineTemplate.owl";
		String zipPath = TOMCAT_HOME
				+ "webapps/ROOT/icardea/guidelines/icardea/" + name.replaceAll(" ", "") + "-" + id
				+ ".mcpd";
		String xmlPath = TOMCAT_HOME
				+ "webapps/ROOT/icardea/guidelines/icardea/" + name.replaceAll(" ", "") + "-" + id
				+ ".cp";
		String xmlPath1 = TOMCAT_HOME
				+ "webapps/ROOT/icardea/guidelines/icardea/careplan";
		String diagramPath = TOMCAT_HOME
				+ "webapps/ROOT/icardea/guidelines/icardea/" + name.replaceAll(" ", "") + "-" + id
				+ ".dgr";
		String diagramPath1 = TOMCAT_HOME
				+ "webapps/ROOT/icardea/guidelines/icardea/diagram";

		System.out.println(" Writing the definitions to "+ path +"\nXML:\n "+ inputXML + " DIAGRAM CONTENT:\n" + diagramContent);
		try {
			// Create the files first
			FileOutputStream fos = new FileOutputStream(xmlPath);
			fos.write(inputXML.getBytes());
			fos.close();
			fos = new FileOutputStream(xmlPath1);
			fos.write(inputXML.getBytes());
			fos.close();
			fos = new FileOutputStream(diagramPath);
			fos.write(diagramContent.getBytes());
			fos.close();
			fos = new FileOutputStream(diagramPath1);
			fos.write(diagramContent.getBytes());
			fos.close();
			// Create the zip content
			BufferedInputStream origin = null;
			byte data[] = new byte[2048];
			FileOutputStream dest = new FileOutputStream(zipPath);
			ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(
					dest));
			
			ZipEntry zipEntryForXML = new ZipEntry("careplan");
			FileInputStream fi = new FileInputStream(xmlPath1);
			origin = new BufferedInputStream(fi, 2048);
			out.putNextEntry(zipEntryForXML);
			int count;
			while ((count = origin.read(data, 0, 2048)) != -1) {
				out.write(data, 0, count);
			}
			origin.close();
			
			ZipEntry zipEntryForDiagram = new ZipEntry("diagram");
			fi = new FileInputStream(diagramPath1);
			origin = new BufferedInputStream(fi, 2048);
			out.putNextEntry(zipEntryForDiagram);
			while ((count = origin.read(data, 0, 2048)) != -1) {
				out.write(data, 0, count);
			}
			origin.close();
			out.close();

			String output = TOMCAT_HOME + path;
			InputStream is = this.getClass().getClassLoader()
					.getResourceAsStream(input);
			owlModel = ProtegeOWL.createJenaOWLModelFromInputStream(is);
			mc = getMedicalCareplanFromXML(inputXML, true);
			fillOwlModel();
			Collection errors = new ArrayList();
			owlModel.save(new File(output).toURI(), FileUtils.langXMLAbbrev,
					errors);
			logger.info("File saved with " + errors.size() + " errors to"+output);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "http://localhost:8080/icardea/guidelines/icardea/" + name.replaceAll(" ", "")
				+ "-" + id + ".owl";
		return url;
	}

	public static void main(String[] args) {
		GlifGenerator gg = new GlifGenerator();
		gg.generateGlifFromXML(args[0], args[1]);
	}
}
