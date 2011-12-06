package tr.com.srdc.icardea.careplanengine.agents.gui.graph.history;

import com.adobe.acrobat.Viewer;
import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import prefuse.data.Node;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.GuidelineGraph;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.ShapeConstants;
import tr.com.srdc.icardea.careplanengine.alarmSystem.AlarmDatabaseConnection;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

/*
 * TO-DO List
 * 	1) 	the keywords used in expressions such as
 * 		event.getHistoryData().get("RESULT");
 * 		will be bound to a common vocabulary.
 * 
 */
public class MonitoringReport {

	/* a class hierarch may do better here
	 */
	private class Decision implements Comparable {

		public final String NOT_SET = "Default Step";
		private Node decisionNode;
		private int criterionsReceived;
		private boolean conflictingStatus;
		private String criterionSatisfied;
		private long time;

		public Decision(Node decisionNode) {
			setDecisionNode(decisionNode);
			criterionsReceived = 0;
			conflictingStatus = false;

			criterionSatisfied = NOT_SET;
		}

		public void setDecisionNode(Node decisionNode) {
			this.decisionNode = decisionNode;
		}

		public Node getDecisionNode() {
			return this.decisionNode;
		}

		public void processEvent(StyledText event) {
			criterionsReceived = criterionsReceived + 1;

			String decisionResult = ((String) event.getHistoryData().get("RESULT")).trim();
			if (decisionResult.equalsIgnoreCase("true")) {
				if (criterionSatisfied == NOT_SET) {
					criterionSatisfied = event.getShortDescription();
					time = event.getTime();
				} else {
					// more than one criterion has returned TRUE!!!
					conflictingStatus = true;
				}
			} else if (decisionResult.equalsIgnoreCase("false")) {
			} else {
				// something must have gone COMPLETELY WRONG!
				conflictingStatus = true;
			}
		}

		public long getTime() {
			return time;
		}

		public String getDecisionReport() {
			String resultString = "";
//			if (criterionsReceived == decisionNode.getChildCount() - 1  && conflictingStatus == false )
//			{
			// resultString += "Decision Step : " + decisionNode.getString(GuidelineGraph.LABEL) + "\n";
			// resultString += "Criterion Selected : " + criterionSatisfied + "\n";

			String criterionShortName = criterionSatisfied;
			if (criterionShortName.contains("(")) {
				int cutIndex = criterionShortName.indexOf("(");
				criterionShortName = criterionShortName.substring(0, cutIndex);
				criterionShortName = criterionShortName.trim();
			}

			resultString += "\"" + decisionNode.getString(GuidelineGraph.LABEL) + "\"" + " decision ";
			resultString += "step has been evaluated favoring \"" + criterionShortName + "\".";
//			}
//			else
//			{
//				resultString += "Decision Step : " + decisionNode.getString(GuidelineGraph.LABEL) + "\n";
//				resultString += "Criterion Selected : " + criterionSatisfied + "\n";
//				resultString += "ERROR \n";
//				resultString += "criterionsReceived = " + criterionsReceived + "\n";
//				resultString += "node child count = " + decisionNode.getChildCount() + "\n";
//				if (conflictingStatus)
//				{
//					resultString += "conflictingStatus = true";
//				}
//
//			}
			return resultString;
		}

		public int compareTo(Object arg0) {
			if (arg0 instanceof Decision) {
				Decision rhs = (Decision) arg0;
				if (time > rhs.time) {
					return 1;
				} else if (time == rhs.time) {
					return 0;
				} else if (time < rhs.time) {
					return -1;
				}
			}
			throw new ClassCastException();
		}
	}

	private class Action implements Comparable {

		private String actionName;
		private Node associatedNode;
		private long time;

		public Action(Node associatedNode) {
			this.associatedNode = associatedNode;
			actionName = this.associatedNode.getString(GuidelineGraph.LABEL);
		}

		public void processEvent(StyledText event) {
			time = event.getTime();
		}

		public long getTime() {
			return time;
		}

		public String getActionName() {
			return actionName;
		}

		public int compareTo(Object arg0) {
			if (arg0 instanceof Action) {
				Action rhs = (Action) arg0;
				return actionName.compareTo(rhs.actionName);
			}
			throw new ClassCastException();
		}
	}

	private class EntityValues implements Comparable {

		public final String UNDEFINED = "UNDEFINED";
		public final String BOOLEAN_TYPE = "BOOLEAN";
		public final String NUMERIC_TYPE = "NUMERIC";
		public final String DATE_TYPE = "DATE";
		public final String TEXT_TYPE = "TEXT";
		private String entityName;
		private String entityType;
		private Vector<Object> values;
		private boolean typeConflict;
		private long initialTime;
		private long finalTime;

		public EntityValues(String entityName) {
			this.entityName = entityName;
			entityType = UNDEFINED;
			values = new Vector<Object>();
			typeConflict = false;
		}

		public long getInitialTime() {
			return initialTime;
		}

		public long getFinalTime() {
			return finalTime;
		}

		public Vector<Object> getValues() {
			return values;
		}

		public String getType() {
			return entityType;
		}

		/* only works for NUMERIC_TYPE */
		public float findMin() {
			Float min = Float.POSITIVE_INFINITY;
			if (entityType.equals(NUMERIC_TYPE)) {
				Iterator valuesItr = values.iterator();
				while (valuesItr.hasNext()) {
					Float curVal = (Float) valuesItr.next();
					if (curVal.compareTo(min) < 0) {
						min = curVal;
					}
				}
			}
			return min;
		}

		/* only works for NUMERIC_TYPE */
		public float findMax() {
			Float max = Float.NEGATIVE_INFINITY;
			if (entityType.equals(NUMERIC_TYPE)) {
				Iterator valuesItr = values.iterator();
				while (valuesItr.hasNext()) {
					Float curVal = (Float) valuesItr.next();
					if (curVal.compareTo(max) > 0) {
						max = curVal;
					}
				}
			}
			return max;
		}

		/* only works for NUMERIC_TYPE */
		public float findAvg() {
			float total = 0;
			if (entityType.equals(NUMERIC_TYPE)) {
				Iterator valuesItr = values.iterator();
				while (valuesItr.hasNext()) {
					Float curVal = (Float) valuesItr.next();
					total = total + curVal.floatValue();
				}
				return total / values.size();
			}
			return 0;
		}

		public void processEvent(StyledText event) {
			String valueStr = "";
			String wholeValue = "";
			try {
				valueStr = parseXML((String) event.getHistoryData().get("TRANSFORMED_VALUE_XML"));
				valueStr = removeExtras(valueStr);

				// if it is the first time a value is inserted
				// for this entity, its type should be set
				// first
				if (entityType.equals(UNDEFINED)) {
					wholeValue = (String) event.getHistoryData().get("VALUE_XML");
					if (wholeValue.contains("PatientBirthDate")) {
						entityType = DATE_TYPE;
					} else {
						entityType = obtainType(valueStr);
					}

					initialTime = event.getTime();
				}

				finalTime = event.getTime();

//				if (entityType.equals(obtainType(valueStr)))
//				{
				if (entityType.equals(BOOLEAN_TYPE)) {
					if (valueStr.equalsIgnoreCase("true")) {
						values.add(Boolean.TRUE);
					} else {
						values.add(Boolean.FALSE);
					}
				} else if (entityType.equals(NUMERIC_TYPE)) {
					values.add(Float.parseFloat(valueStr));
				} else if (entityType.equals(DATE_TYPE)) {
					SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
					SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
					String date = format2.format(format1.parse(valueStr));
					values.add(date);
				} else if (entityType.equals(TEXT_TYPE)) {
					values.add(valueStr);
				}
//				}
				// on all other cases assume TEXT_TYPE
//				else
//				{
//					entityType = TEXT_TYPE;
//					typeConflict = true;
//					values.add( valueStr );
//				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		public String parseXML(String presentableXML) throws ParserConfigurationException, SAXException, IOException {
			ByteArrayInputStream inputStream =
				new ByteArrayInputStream(presentableXML.getBytes());

			DocumentBuilderFactory dBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dBuilderFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputStream);

			Element docElement = doc.getDocumentElement();
			NodeList presentablePairs = docElement.getElementsByTagName("Presentable_Pair");

			for (int i = 0; i < presentablePairs.getLength(); i++) {
				org.w3c.dom.Node curNode = presentablePairs.item(i);

				// just in case!
				if (curNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
					Element curPresentablePair = (Element) curNode;

					org.w3c.dom.Node nameNode = curPresentablePair.getElementsByTagName("Name").item(0);
					org.w3c.dom.Node valueNode = curPresentablePair.getElementsByTagName("Value").item(0);

					if (nameNode.getTextContent().contains("Index Value")
						|| nameNode.getTextContent().contains("Text Value")) {
						return valueNode.getTextContent();
					}
				}
			}
			return "";
		}

		private String removeExtras(String value) {
			if (value.contains(":")) {
				int cutIndex = (value.indexOf(":")) + 1;
				value = value.substring(cutIndex);
			}

			if (value.contains("with precision")) {
				int cutIndex = (value.indexOf("with precision")) - 1;
				value = value.substring(0, cutIndex);
			}

			value = value.trim();
			return value;
		}

		private String obtainType(String value) {
			// the precedence is IMPORTANT			
			if (value.equalsIgnoreCase("true")
				|| value.equalsIgnoreCase("false")) {
				return BOOLEAN_TYPE;
			}
			try {
				Float.parseFloat(value);
				return NUMERIC_TYPE;
			} catch (NumberFormatException ex) {
				return TEXT_TYPE;
			}
		}

		public Vector<String> getHeaderRow(String type) {
			Vector<String> result = new Vector<String>();
			if (type.equals(NUMERIC_TYPE)) {
				result.add("Name");
				result.add("Min");
				result.add("Max");
				result.add("Avg");
				result.add("Recording interval");
			} else if (type.equals(BOOLEAN_TYPE)) {
				result.add("Name");
				result.add("Value(s)");
			} else {
				result.add("Name");
				result.add("Value");
			}
			return result;
		}

		public Vector<String> getRow() {
			Vector<String> result = new Vector<String>();
			if (entityType.equals(NUMERIC_TYPE)) {
				result.add(entityName);
				result.add("" + findMin());
				result.add("" + findMax());
				result.add("" + findAvg());
				result.add(convert2StyledDate(getInitialTime()) + " - " + convert2StyledDate(getFinalTime()));
			} else if (entityType.equals(BOOLEAN_TYPE)) {
				result.add(entityName);
				/*
				int trueCount = 0;
				int falseCount = 0;

				Iterator valuesItr = values.iterator();
				while (valuesItr.hasNext()){
				Boolean curValue = (Boolean) valuesItr.next();
				if (curValue.booleanValue() == true){
				trueCount++;
				}
				else if (curValue.booleanValue() == false){
				falseCount++;
				}
				}
				
				result.add("" + trueCount);
				result.add("" + falseCount);*/

				StringBuffer buffer = new StringBuffer();
				boolean firstTime = true;
				Iterator valuesItr = values.iterator();
				while (valuesItr.hasNext()) {
					Boolean curValue = (Boolean) valuesItr.next();
					if (firstTime) {
						firstTime = false;
					} else {
						buffer.append(", ");
					}

					buffer.append(curValue);
				}
				result.add(buffer.toString());
			} else {

				result.add(entityName);

				String rStr = "";
				// to remove the duplicates
				HashSet hs = new HashSet(values);
				Iterator itr = hs.iterator();
				while (itr.hasNext()) {
					rStr += ", " + itr.next();
				}
				rStr = rStr.replaceFirst(", ", "");

				result.add(rStr);
			}
			return result;
		}

		/*public String getReport ()
		{
		String result = "";
		result += entityName + "\n";
		if (entityType.equals(NUMERIC_TYPE)){
		result += "min : " + findMin() + "\n";
		result += "max : " + findMax() + "\n";
		result += "avg : " + findAvg() + "\n";
		}
		else if (entityType.equals(BOOLEAN_TYPE)){
		int trueCount = 0;
		int falseCount = 0;

		Iterator valuesItr = values.iterator();
		while (valuesItr.hasNext()){
		Boolean curValue = (Boolean) valuesItr.next();
		if (curValue.booleanValue() == true){
		trueCount++;
		}
		else if (curValue.booleanValue() == false){
		falseCount++;
		}
		}
		result += "true : " + trueCount + "\n";
		result += "false : " + falseCount + "\n";
		}
		else{
		Iterator valuesItr = values.iterator();
		while (valuesItr.hasNext()){
		result += "val : " + valuesItr.next() + "\n";
		}
		}
		return result;
		}*/
		public int compareTo(Object arg0) {
			if (arg0 instanceof EntityValues) {
				EntityValues rhs = (EntityValues) arg0;
				return entityName.compareTo(rhs.entityName);
			}
			throw new ClassCastException();
		}
	}

	private class Recommendation implements Comparable {

		private String recommendationName;
		private String dosageQuantity;
		private String route;
		private long time;

		public Recommendation(String recommendationName) {
			this.recommendationName = recommendationName;
			dosageQuantity = "";
			route = "";
		}

		public void processEvent(StyledText event) {
			try {
				String presentableXML = (String) event.getHistoryData().get("TRANSFORMED_INPUT_XML");
				obtainValuesFromXML(presentableXML);
				time = event.getTime();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		public long getTime() {
			return time;
		}

		public void obtainValuesFromXML(String presentableXML) throws ParserConfigurationException, SAXException, IOException {
			ByteArrayInputStream inputStream =
				new ByteArrayInputStream(presentableXML.getBytes());

			DocumentBuilderFactory dBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dBuilderFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputStream);

			Element docElement = doc.getDocumentElement();
			NodeList presentablePairs = docElement.getElementsByTagName("Presentable_Pair");

			for (int i = 0; i < presentablePairs.getLength(); i++) {
				org.w3c.dom.Node curNode = presentablePairs.item(i);

				// just in case!
				if (curNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
					Element curPresentablePair = (Element) curNode;

					org.w3c.dom.Node nameNode = curPresentablePair.getElementsByTagName("Name").item(0);
					org.w3c.dom.Node valueNode = curPresentablePair.getElementsByTagName("Value").item(0);

					if (nameNode.getTextContent().contains("Dosage Quantity")) {
						dosageQuantity = valueNode.getTextContent();
						if (dosageQuantity.contains("Value :")) {
							int cutIndex = dosageQuantity.indexOf("Value :");
							cutIndex = cutIndex + 7;
							dosageQuantity = dosageQuantity.substring(cutIndex);
						}
					}

					if (nameNode.getTextContent().contains("Route")) {
						route = valueNode.getTextContent();
					}
				}
			}
		}

		public String getRecommendationReport() {
			String result = "";
			result += recommendationName + " \t\t " + convert2StyledDate(time);
			if (!dosageQuantity.equals("")) {
				result += "\n \t\t\t Dosage Quantity : " + dosageQuantity;
			}
			if (!route.equals("")) {
				result += "\n \t\t\t Route : " + route;
			}
			return result;
		}

		public int compareTo(Object arg0) {
			if (arg0 instanceof Recommendation) {
				Recommendation rhs = (Recommendation) arg0;

				if (time > rhs.time) {
					return 1;
				} else if (time == rhs.time) {
					return 0;
				} else if (time < rhs.time) {
					return -1;
				}
			}
			throw new ClassCastException();
		}
	}

	private class Alarm implements Comparable {

		private int urgency;
		private String content;
		private long time;

		public Alarm() {
		}

		public void processEvent(StyledText event) {
			String urgencyStr = (String) event.getHistoryData().get("ALARM_URGENCY");
			urgency = Integer.parseInt(urgencyStr);

			content = (String) event.getHistoryData().get("ALARM_CONTENT");

			time = event.getTime();
		}

		public long getTime() {
			return time;
		}

		public String getAlarmReport() {
			String result = "";
			result += "ALARM : " + content
				+ " with urgency " + urgency + " (" + AlarmDatabaseConnection.getUrgencyName(urgency) + ")\n";
			return result;
		}

		public int compareTo(Object arg0) {
			if (arg0 instanceof Alarm) {
				Alarm rhs = (Alarm) arg0;

				if (time > rhs.time) {
					return 1;
				} else if (time == rhs.time) {
					return 0;
				} else if (time < rhs.time) {
					return -1;
				}
			}
			throw new ClassCastException();
		}

		public Vector<String> getRow() {
			Vector<String> row = new Vector<String>();
			row.add(convert2StyledDate(getTime()));
			row.add(content);
			row.add(urgency + " (" + AlarmDatabaseConnection.getUrgencyName(urgency) + ")\n");

			return row;
		}
	}

	public class PageNumbersWatermark extends PdfPageEventHelper {

		public PdfPTable table;
		/** The Graphic state */
		public PdfGState gstate;
		/** A template that will hold the total number of pages. */
		public PdfTemplate tpl;
		/** The font that will be used. */
		public BaseFont helv;

		public void onOpenDocument(PdfWriter writer, com.lowagie.text.Document document) {
			try {
				// initialization of the header table
				//headerImage = Image.getInstance("logo.gif");
				table = new PdfPTable(2);
				Phrase p = new Phrase();
				Chunk ck = new Chunk("lowagie.com\n", new Font(Font.TIMES_ROMAN, 16, Font.BOLDITALIC, Color.blue));
				p.add(ck);
				ck = new Chunk("Ghent\nBelgium", new Font(Font.HELVETICA, 12, Font.NORMAL, Color.darkGray));
				p.add(ck);
				table.getDefaultCell().setBackgroundColor(Color.yellow);
				table.getDefaultCell().setBorderWidth(0);
				table.addCell(p);
				table.getDefaultCell().setHorizontalAlignment(com.lowagie.text.Element.ALIGN_RIGHT);
				//table.addCell(new Phrase(new Chunk(headerImage, 0, 0)));
				// initialization of the Graphic State
				gstate = new PdfGState();
				gstate.setFillOpacity(0.3f);
				gstate.setStrokeOpacity(0.3f);
				// initialization of the template
				tpl = writer.getDirectContent().createTemplate(100, 100);
				tpl.setBoundingBox(new Rectangle(-20, -20, 100, 100));
				// initialization of the font
				helv = BaseFont.createFont("Helvetica", BaseFont.WINANSI, false);
			} catch (Exception e) {
				throw new ExceptionConverter(e);
			}
		}

		public void onEndPage(PdfWriter writer, com.lowagie.text.Document document) {
			PdfContentByte cb = writer.getDirectContent();
			cb.saveState();
			// write the headertable
			table.setTotalWidth(document.right() - document.left());
			table.writeSelectedRows(0, -1, document.left(), document.getPageSize().getHeight() - 50, cb);
			// compose the footer
			String text = "Page " + writer.getPageNumber() + " of ";
			float textSize = helv.getWidthPoint(text, 8);
			float textBase = document.bottom();
			cb.beginText();
			cb.setFontAndSize(helv, 8);
			// for odd pagenumbers, show the footer at the left
			if ((writer.getPageNumber() & 1) == 1) {
				cb.setTextMatrix(document.left(), textBase);
				cb.showText(text);
				cb.endText();
				cb.addTemplate(tpl, document.left() + textSize, textBase);
			} // for even numbers, show the footer at the right
			else {
				float adjust = helv.getWidthPoint("0", 8);
				cb.setTextMatrix(document.right() - textSize - adjust, textBase);
				cb.showText(text);
				cb.endText();
				cb.addTemplate(tpl, document.right() - adjust, textBase);
			}
			cb.saveState();
			// draw a Rectangle around the page
			cb.setColorStroke(Color.orange);
			cb.setLineWidth(2);
			cb.rectangle(20, 20, document.getPageSize().getWidth() - 40, document.getPageSize().getHeight() - 40);
			cb.stroke();
			cb.restoreState();
		}

		public void onStartPage(PdfWriter writer, com.lowagie.text.Document document) {
		}

		public void onCloseDocument(PdfWriter writer, com.lowagie.text.Document document) {
			tpl.beginText();
			tpl.setFontAndSize(helv, 8);
			tpl.setTextMatrix(0, 0);
			tpl.showText("" + (writer.getPageNumber() - 1));
			tpl.endText();
		}
	}
	private String guidelineName;
	private String patientID;
	private String patientName;
	private long startTime;
	private long endTime;
	private Hashtable<Node, Decision> decisionsTaken;
	private Hashtable<Node, Action> actionsTaken;
	private Hashtable<String, EntityValues> entities;
	private Hashtable<String, EntityValues> ehrEntities;
	private Hashtable<String, Recommendation> recommendations;
	private Hashtable<Node, Alarm> alarmsIssued;
	public static Font bold = new Font(Font.TIMES_ROMAN, 10, Font.BOLD);
	public static Font boldItalic = new Font(Font.TIMES_ROMAN, 10, Font.BOLDITALIC);
	public static Font normal = new Font(Font.TIMES_ROMAN, 10, Font.NORMAL);
	public static Font underlined = new Font(Font.TIMES_ROMAN, 10, Font.UNDERLINE);

	public MonitoringReport(String guidelineName, String patientID, String patientName) {
		this.guidelineName = guidelineName;
		this.patientID = patientID;
		this.patientName = patientName;

		decisionsTaken = new Hashtable<Node, Decision>();
		actionsTaken = new Hashtable<Node, Action>();
		entities = new Hashtable<String, EntityValues>();
		ehrEntities = new Hashtable<String, EntityValues>();
		recommendations = new Hashtable<String, Recommendation>();
		alarmsIssued = new Hashtable<Node, Alarm>();
	}

	public String getGuidelineName() {
		return guidelineName;
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public String getPatientID() {
		return patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public String getSensorsInvolved() {
		String result = "";

		List keyList = Collections.list(entities.keys());
		Collections.sort(keyList);
		Enumeration sortedEnum = Collections.enumeration(keyList);

		while (sortedEnum.hasMoreElements()) {
			result += ", " + sortedEnum.nextElement();
		}
		result = result.replaceFirst(", ", "");
		return result;
	}

	public void insertHistoryEvent(Node associatedNode, StyledText event) {
		// the following condition needs to be modified
		// i.e. the user has to be given this option
		if (guidelineName.equalsIgnoreCase(((String) event.getHistoryData().get("GUIDELINE_ID")))) {
			// endTime = event.getTime();
		} else {
		}

		endTime = event.getTime();

		if (associatedNode != null) {
			// decision made
			if (event.getType() == GuidelineHistoryFrame.CASE_STEP_STYLE_TYPE) {
				if (!decisionsTaken.containsKey(associatedNode)) {
					decisionsTaken.put(associatedNode, new Decision(associatedNode));
				}
				decisionsTaken.get(associatedNode).processEvent(event);
			} else {
				// we have to keep track of all the actions performed
				// (usually as a consequence of a decision)

				if (associatedNode.getInt(GuidelineGraph.TYPE) == ShapeConstants.ACTION_STEP
					|| associatedNode.getInt(GuidelineGraph.TYPE) == ShapeConstants.MACRO_ACTION_STEP) {
					if (!actionsTaken.containsKey(associatedNode)) {
						actionsTaken.put(associatedNode, new Action(associatedNode));
					}
					actionsTaken.get(associatedNode).processEvent(event);
				}

				// sensor ws, consult
				if (event.getType() == GuidelineHistoryFrame.SENSOR_STYLE_TYPE
					|| event.getType() == GuidelineHistoryFrame.CONSULT_STYLE_TYPE) {
					String name = event.getShortDescription();
					if (!entities.containsKey(name)) {
						entities.put(name, new EntityValues(name));
					}
					entities.get(name).processEvent(event);
				} else if (event.getType() == GuidelineHistoryFrame.ACTION_STEP_DATA_STYLE_TYPE) {
					String name = event.getShortDescription();
					if (!ehrEntities.containsKey(name)) {
						ehrEntities.put(name, new EntityValues(name));
					}
					ehrEntities.get(name).processEvent(event);
				} // medical ws
				else if (event.getType() == GuidelineHistoryFrame.ACTION_STEP_WS_STYLE_TYPE) {
					String name = event.getShortDescription();
					if (!recommendations.containsKey(name)) {
						recommendations.put(name, new Recommendation(name));
					}
					recommendations.get(name).processEvent(event);
				} // alarm
				else if (event.getType() == GuidelineHistoryFrame.ACTION_STEP_ALARM_STYLE_TYPE) {
					if (!alarmsIssued.containsKey(associatedNode)) {
						alarmsIssued.put(associatedNode, new Alarm());
					}
					alarmsIssued.get(associatedNode).processEvent(event);
				}
			}
		} // the associated node is null
		// but we have to check whether
		// this is due to an eligibility 
		// check.
		else {
			if (event.getType() == GuidelineHistoryFrame.CASE_STEP_STYLE_TYPE
				&& // the following condition needs to be modified
				// i.e. the user has to be given this option
				guidelineName.equalsIgnoreCase(((String) event.getHistoryData().get("GUIDELINE_ID")))
				&& event.getShortDescription().contains("Eligible")
				|| event.getShortDescription().contains("eligible")) {
				startTime = event.getTime();
			}
		}
	}

	public void generatePDFReport(String filename) {
		// step 1: creation of a document-object
		com.lowagie.text.Document document = new com.lowagie.text.Document();
		try {
			String dirPath = filename.substring(0, filename.lastIndexOf('/'));
			File directory = new File(dirPath);
			directory.mkdirs();

			PdfWriter writer = PdfWriter.getInstance(document,
				new FileOutputStream(filename));

			//writer.setPageEvent(new PageNumbersWatermark());

			document.open();
			Paragraph p1 = new Paragraph("Patient Monitoring Summary \n " + guidelineName,
				new Font(Font.TIMES_ROMAN, 14, Font.BOLD, new Color(0, 0, 255)));
			p1.setAlignment(Paragraph.ALIGN_CENTER);
			document.add(p1);

			Paragraph p2 = new Paragraph();
			p2.setAlignment(Paragraph.ALIGN_LEFT);

			p2.add(new Chunk("Patient ID : ", bold));
			p2.add(new Chunk(getPatientID() + "\n", normal));

			p2.add(new Chunk("Monitoring Start Date/Time : ", bold));
			p2.add(new Chunk(convert2StyledDate(getStartTime()) + "\n", normal));

			p2.add(new Chunk("Monitoring End Date/Time : ", bold));
			p2.add(new Chunk(convert2StyledDate(getEndTime()) + "\n", normal));

			p2.add(new Chunk("Parameters Involved : ", bold));
			p2.add(new Chunk(getSensorsInvolved() + "\n", normal));

			document.add(p2);


			document.add(new Paragraph("\n\n"));
			document.add(new Paragraph("EXECUTION SUMMARY", underlined));

			Paragraph executionSummaryParagraph = new Paragraph();
			executionSummaryParagraph.setIndentationLeft(50);
			executionSummaryParagraph.add(new Chunk("The monitoring process has been governed by"
				+ " mainly the following guideline execution decisions:", normal));
			document.add(executionSummaryParagraph);
			List decisionsList = Collections.list(decisionsTaken.elements());
			Collections.sort(decisionsList);
			Iterator<Decision> decisionsListItr = decisionsList.iterator();
			while (decisionsListItr.hasNext()) {
				Decision curDecision = decisionsListItr.next();
				Paragraph curDecisionParagraph = new Paragraph("* " + curDecision.getDecisionReport(), normal);
				curDecisionParagraph.setIndentationLeft(70);
				document.add(curDecisionParagraph);
			}

			document.add(new Paragraph("\n"));
			Paragraph actionsParagraph = new Paragraph();
			actionsParagraph.setIndentationLeft(50);
			actionsParagraph.add(new Chunk("Consequently, the following actions have been performed:", normal));
			document.add(actionsParagraph);

			List actionsList = Collections.list(actionsTaken.elements());
			Collections.sort(actionsList);
			Iterator<Action> actionsListItr = actionsList.iterator();
			while (actionsListItr.hasNext()) {
				Action curAction = actionsListItr.next();
				Paragraph curActionParagraph = new Paragraph("- " + curAction.getActionName(), normal);
				curActionParagraph.setIndentationLeft(70);
				document.add(curActionParagraph);
			}

			document.add(new Paragraph("\n\n"));
			document.add(new Paragraph("ALERTS", underlined));
			PdfPTable alertsTable = new PdfPTable(3);
			alertsTable.setSpacingBefore(20);

			PdfPCell headerCellCol1 = new PdfPCell(new Paragraph("Date/Time", boldItalic));
			headerCellCol1.setGrayFill(0.8f);
			PdfPCell headerCellCol2 = new PdfPCell(new Paragraph("Type of Alert", boldItalic));
			headerCellCol2.setGrayFill(0.8f);
			PdfPCell headerCellCol3 = new PdfPCell(new Paragraph("Urgency", boldItalic));
			headerCellCol3.setGrayFill(0.8f);

			alertsTable.addCell(headerCellCol1);
			alertsTable.addCell(headerCellCol2);
			alertsTable.addCell(headerCellCol3);

			List alarmsList = Collections.list(alarmsIssued.elements());
			Collections.sort(alarmsList);
			Iterator<Alarm> alarmsListItr = alarmsList.iterator();
			while (alarmsListItr.hasNext()) {
				Alarm curAlarm = alarmsListItr.next();
				Vector<String> curRow = curAlarm.getRow();
				Iterator<String> curRowItr = curRow.iterator();
				while (curRowItr.hasNext()) {
					alertsTable.addCell(new PdfPCell(new Paragraph(curRowItr.next(), normal)));
				}
			}
			document.add(alertsTable);

			document.add(new Paragraph("\n\n"));
			document.add(new Paragraph("EHR Summary", underlined));
			appendEntityTablesIntoDocument(ehrEntities, document);

			document.add(new Paragraph("\n\n"));
			document.add(new Paragraph("CIED VALUES", underlined));
			appendEntityTablesIntoDocument(entities, document);

			document.add(new Paragraph("\n\n"));
			document.add(new Paragraph("PRESCRIPTIONS / RECOMMENDATIONS", underlined));

			List recommendationsList = Collections.list(recommendations.elements());
			Collections.sort(recommendationsList);
			Iterator<Recommendation> recommendationsListItr = recommendationsList.iterator();
			while (recommendationsListItr.hasNext()) {
				Recommendation curRecommendation = recommendationsListItr.next();
				Paragraph curPar = new Paragraph("* " + curRecommendation.getRecommendationReport(), normal);
				curPar.setIndentationLeft(75);
				document.add(curPar);
			}
			// step 5: we close the document
			document.close();
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
	}

	private void appendEntityTablesIntoDocument(Hashtable<String, EntityValues> entities,
		com.lowagie.text.Document document) throws DocumentException {
		List entitiesList = Collections.list(entities.elements());
		Collections.sort(entitiesList);

		PdfPTable sensorsTable_NUMERIC = null;
		PdfPTable sensorsTable_BOOLEAN = null;
		PdfPTable sensorsTable_TEXT = null;

		boolean sensorsTable_NUMERIC_filled = false;
		boolean sensorsTable_BOOLEAN_filled = false;
		boolean sensorsTable_TEXT_filled = false;

		boolean firstIteration = true;
		Iterator<EntityValues> entitiesListItr = entitiesList.iterator();
		while (entitiesListItr.hasNext()) {
			EntityValues curEntity = entitiesListItr.next();

			// this is rather a dirty approach
			// make all these private classes public a.s.a.p. !!!				
			if (firstIteration) {

				Vector<String> headerRow_NUMERIC = curEntity.getHeaderRow(curEntity.NUMERIC_TYPE);
				sensorsTable_NUMERIC = new PdfPTable(headerRow_NUMERIC.size());
				sensorsTable_NUMERIC.setSpacingBefore(20);

				Iterator<String> headerRow_NUMERIC_Itr = headerRow_NUMERIC.iterator();
				while (headerRow_NUMERIC_Itr.hasNext()) {
					PdfPCell curHeaderCell = new PdfPCell(new Paragraph(headerRow_NUMERIC_Itr.next(), boldItalic));
					curHeaderCell.setGrayFill(0.8f);
					sensorsTable_NUMERIC.addCell(curHeaderCell);
				}

				Vector<String> headerRow_BOOLEAN = curEntity.getHeaderRow(curEntity.BOOLEAN_TYPE);
				sensorsTable_BOOLEAN = new PdfPTable(headerRow_BOOLEAN.size());
				sensorsTable_BOOLEAN.setSpacingBefore(20);

				Iterator<String> headerRow_BOOLEAN_Itr = headerRow_BOOLEAN.iterator();
				while (headerRow_BOOLEAN_Itr.hasNext()) {
					PdfPCell curHeaderCell = new PdfPCell(new Paragraph(headerRow_BOOLEAN_Itr.next(), boldItalic));
					curHeaderCell.setGrayFill(0.8f);
					sensorsTable_BOOLEAN.addCell(curHeaderCell);
				}

				Vector<String> headerRow_TEXT = curEntity.getHeaderRow(curEntity.TEXT_TYPE);
				sensorsTable_TEXT = new PdfPTable(headerRow_TEXT.size());
				sensorsTable_TEXT.setSpacingBefore(20);

				Iterator<String> headerRow_TEXT_Itr = headerRow_TEXT.iterator();
				while (headerRow_TEXT_Itr.hasNext()) {
					PdfPCell curHeaderCell = new PdfPCell(new Paragraph(headerRow_TEXT_Itr.next(), boldItalic));
					curHeaderCell.setGrayFill(0.8f);
					sensorsTable_TEXT.addCell(curHeaderCell);
				}

				firstIteration = false;
			}

			Vector<String> curRow = curEntity.getRow();
			Iterator<String> curRowItr = curRow.iterator();
			while (curRowItr.hasNext()) {
				if (curEntity.getType().equals(curEntity.NUMERIC_TYPE)) {
					sensorsTable_NUMERIC_filled = true;
					sensorsTable_NUMERIC.addCell(new PdfPCell(new Paragraph(curRowItr.next(), normal)));
				} else if (curEntity.getType().equals(curEntity.BOOLEAN_TYPE)) {
					sensorsTable_BOOLEAN_filled = true;
					sensorsTable_BOOLEAN.addCell(new PdfPCell(new Paragraph(curRowItr.next(), normal)));
				} else if (curEntity.getType().equals(curEntity.TEXT_TYPE)
					|| curEntity.getType().equals(curEntity.DATE_TYPE)) {
					sensorsTable_TEXT_filled = true;
					sensorsTable_TEXT.addCell(new PdfPCell(new Paragraph(curRowItr.next(), normal)));
				}
			}
		}

		if (sensorsTable_NUMERIC_filled) {
			document.add(sensorsTable_NUMERIC);
		}
		if (sensorsTable_TEXT_filled) {
			document.add(sensorsTable_TEXT);
		}
		if (sensorsTable_BOOLEAN_filled) {
			document.add(sensorsTable_BOOLEAN);
		}

	}

	public void displayReport(GuidelineGraph guidelineGraph) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss");

		Date startDate = new Date(startTime);
		String startDateStr = dateFormat.format(startDate);

		Date endDate = new Date(endTime);
		String endDateStr = dateFormat.format(endDate);

		String filename = "./temp/" + patientID + "/PatientMonitoringSummary_" + guidelineName.replace(" ", "_")
			+ startDateStr + "_" + endDateStr + "_" + dateFormat.format(new Date()) + ".pdf";

		generatePDFReport(filename);

		int value = JOptionPane.showConfirmDialog(null,
			"Patient Monitoring Summary has been generated at location \n"
			+ filename.replaceFirst(".", "<ICARDEA_HOME>") + "\n"
			+ "Do you want to view it now?");
		if (value == JOptionPane.YES_OPTION) {
			if (!showInDefaultApplication(filename)) {
				showInBuiltinViewer(filename, guidelineGraph);
			}
		}
	}

	public static boolean showInDefaultApplication(String file) {
		//minimizes the app
//        if (frame != null)
//            frame.setExtendedState(JFrame.ICONIFIED);

		String os = System.getProperty("os.name").toLowerCase();
		Runtime rt = Runtime.getRuntime();
		try {
			if (os.indexOf("win") >= 0) {
				String[] cmd = new String[4];
				cmd[0] = "cmd.exe";
				cmd[1] = "/C";
				cmd[2] = "start";
				cmd[3] = file;
				rt.exec(cmd);
			} else if (os.indexOf("mac") >= 0) {
				rt.exec("open " + file);
			} else {
				return false;
			}
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	private void showInBuiltinViewer(String filename, GuidelineGraph guidelineGraph) {
		JFrame frame = new JFrame("PDF Viewer");
		frame.setLayout(new BorderLayout());

		try {
			final Viewer viewer = new Viewer(false);
			final InputStream input = new FileInputStream(new File(filename));
			viewer.setDocumentInputStream(input);
			viewer.activate();

			viewer.setProperty("Default_Page_Layout", "SinglePage");
			viewer.setProperty("Default_Zoom_Type", "FitPage");
			viewer.setProperty("Default_Magnification", "100");

			viewer.zoomTo(1.0);

			viewer.setPreferredSize(new Dimension(800, 600));

			frame.addWindowListener(new WindowAdapter() {

				public void windowClosed(WindowEvent e) {
					viewer.deactivate();
				}
			});

			frame.add(viewer, BorderLayout.CENTER);
			frame.pack();
			frame.setLocationRelativeTo(guidelineGraph);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveReportSilently() {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss");

		Date startDate = new Date(startTime);
		String startDateStr = dateFormat.format(startDate);

		Date endDate = new Date(endTime);
		String endDateStr = dateFormat.format(endDate);

		String filename = "./pdfreports/" + patientName + " (" + patientID + ")/" + guidelineName.replace(" ", "_")
			+ startDateStr + "_" + endDateStr + ".pdf";

		generatePDFReport(filename);

	}

	public String convert2StyledDate(long time) {
		Date date = new Date(time);
		SimpleDateFormat dateFormat = new SimpleDateFormat("'['EEE, d MMM yyyy HH:mm:ss']'");
		return dateFormat.format(date);
	}
}
