package tr.com.srdc.icardea.careplanengine.agents.gui.graph.history;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import tr.com.srdc.icardea.careplanengine.alarmSystem.AlarmDatabaseConnection;

//~--- JDK imports ------------------------------------------------------------

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Hashtable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * User: mehmet olduz [mehmet@srdc.metu.edu.tr]
 * Date: Aug 17, 2006
 * Time: 5:54:46 PM
 */
public class StyledText implements Comparable {
    private String    guidelineID;
    private Hashtable historyData;
    private int       sequenceNumber;
    private long      time;
    private int       type;

    public StyledText(Hashtable historyData, int type, long time) {
        this.historyData = historyData;
        this.type        = type;
        this.time        = time;
    }

    /* TO-BE-IMPLEMENTED */

    // We are changing the functionality
    // of this function.. Based on the
    // data stored in historyData, the
    // text is processed/extracted.
    public String getText(boolean displayAdvanced) {
        int    type = this.type;
        String text = "";

        try {

            // Decision Made
            if (type == GuidelineHistoryFrame.CASE_STEP_STYLE_TYPE) {

                // text = "\n expression : " + historyData.get("EXPRESSION");
                text += "\n--------------------------------------------------------------\n";
                text += "\n function name : " + historyData.get("NAME");
                text += "\n description :\n\t" + historyData.get("DESCRIPTION");
                text += "\n--------------------------------------------------------------\n";
                text += "\n input arguments:\n";

                String inputArgs = (String) historyData.get("ARGUMENT_VALUES");

                inputArgs = "\n" + inputArgs;
                inputArgs = inputArgs.replace("\n", "\n\t");
                text      += inputArgs;

                if (displayAdvanced == true) {
                    text += "\n--------------------------------------------------------------\n";
                    text += "\n body :\n\n" + historyData.get("FUNCTION_BODY");
                }

                text += "\n--------------------------------------------------------------\n";
                text += "\n result description :\n" + historyData.get("RETURN_DESCRIPTION");
                text += "\n result : " + historyData.get("RESULT");
            }

            // EHR Data, Consult, Sensor WS
            else if ((type == GuidelineHistoryFrame.ACTION_STEP_DATA_STYLE_TYPE)
                     || (type == GuidelineHistoryFrame.CONSULT_STYLE_TYPE)
                     || (type == GuidelineHistoryFrame.SENSOR_STYLE_TYPE)) {
                if (displayAdvanced == true) {
                    text = "\n variable : " + historyData.get("VARIABLE_NAME");
                    text += "\n value :\n" + indentXMLString((String) historyData.get("VALUE_XML"));
                } else if (displayAdvanced == false) {
                    text = "\n variable : " + historyData.get("VARIABLE_NAME");
                    text += "\n details :\n" + parseAndDisplay((String) historyData.get("TRANSFORMED_VALUE_XML"));
                }
            }

            // Waiting
            else if (type == GuidelineHistoryFrame.ACTION_STEP_WAIT_STYLE_TYPE) {
                text = "\n wait amount : " + historyData.get("WAIT_AMOUNT");
            }

            // Medical WS
            else if (type == GuidelineHistoryFrame.ACTION_STEP_WS_STYLE_TYPE) {
                if (displayAdvanced == true) {
                    text = "\n operation : " + historyData.get("OPERATION_NAME");
                    text += "\n input : " + indentXMLString((String) historyData.get("INPUT_XML"));
                } else if (displayAdvanced == false) {
                    text = "\n operation : " + historyData.get("OPERATION_NAME");
                    text += "\n input :\n" + parseAndDisplay((String) historyData.get("TRANSFORMED_INPUT_XML"));
                }
            }

            // ALARM
            else if (type == GuidelineHistoryFrame.ACTION_STEP_ALARM_STYLE_TYPE) {
                String urgency = (String) historyData.get("ALARM_URGENCY");

                text = "\n urgency : " + urgency + " ("
                       + AlarmDatabaseConnection.getUrgencyName(Integer.parseInt(urgency)) + ")";
                text += "\n content : " + historyData.get("ALARM_CONTENT");
            } else if (type == GuidelineHistoryFrame.NEW_CYCLE_STYLE_TYPE) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MMM-dd, HH:mm:ss");
                String           date             = simpleDateFormat.format(new Date(time));

                text = "The guideline execution cycle has been completed on " + date;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return text;
    }

    public Hashtable getHistoryData() {
        return this.historyData;
    }

    public void setHistoryData(Hashtable historyData) {
        this.historyData = historyData;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeString() {
        String str = null;

        switch (this.type) {
        case GuidelineHistoryFrame.CASE_STEP_STYLE_TYPE :
            str = "DECISION MADE";

            break;

        case GuidelineHistoryFrame.ACTION_STEP_DATA_STYLE_TYPE :
            str = "EHR DATA";

            break;

        case GuidelineHistoryFrame.CONSULT_STYLE_TYPE :
            str = "CONSULT";

            break;

        case GuidelineHistoryFrame.SENSOR_STYLE_TYPE :
            str = "SENSOR WS";

            break;

        case GuidelineHistoryFrame.ACTION_STEP_WAIT_STYLE_TYPE :
            str = "WAITING";

            break;

        case GuidelineHistoryFrame.ACTION_STEP_WS_STYLE_TYPE :
            str = "MEDICAL WS";

            break;

        case GuidelineHistoryFrame.ACTION_STEP_ALARM_STYLE_TYPE :
            str = "ALARM";

            break;

        case GuidelineHistoryFrame.NEW_CYCLE_STYLE_TYPE :
            str = "*****";

            break;

        default :
            str = "N/A";
        }

        return str;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getShortDescription() {
        String str = (String) historyData.get("SHORT_DESCRIPTION");

        if (str != null) {
            return str;
        } else {
            return "N/A";
        }
    }

    public String getGuidelineID() {
        String str = (String) historyData.get("GUIDELINE_ID");

        if (str != null) {
            return str;
        } else {
            return "N/A";
        }
    }

    public int compareTo(Object arg0) {

        // for the future, you have
        // to get the sorting criteria
        // from another class
        int retVal = -1;

        if (arg0 instanceof StyledText) {
            StyledText styledText = (StyledText) arg0;

            if (this.type < styledText.type) {
                retVal = -1;
            } else if (this.type == styledText.type) {
                retVal = 0;
            } else if (this.type > styledText.type) {
                retVal = 1;
            }
        } else {
            throw new ClassCastException();
        }

        return retVal;
    }

    public static String parseAndDisplay(String presentableXML)
            throws ParserConfigurationException, SAXException, IOException {
        ByteArrayInputStream   inputStream      = new ByteArrayInputStream(presentableXML.getBytes());
        String                 result           = "";
        DocumentBuilderFactory dBuilderFactory  = DocumentBuilderFactory.newInstance();
        DocumentBuilder        dBuilder         = dBuilderFactory.newDocumentBuilder();
        Document               doc              = dBuilder.parse(inputStream);
        Element                docElement       = doc.getDocumentElement();
        NodeList               presentablePairs = docElement.getElementsByTagName("Presentable_Pair");

        for (int i = 0; i < presentablePairs.getLength(); i++) {
            Node curNode = presentablePairs.item(i);

            // just in case!
            if (curNode.getNodeType() == Node.ELEMENT_NODE) {
                Element curPresentablePair = (Element) curNode;
                Node    nameNode           = curPresentablePair.getElementsByTagName("Name").item(0);
                Node    valueNode          = curPresentablePair.getElementsByTagName("Value").item(0);

                result += "\n\t" + nameNode.getTextContent() + " : " + valueNode.getTextContent();
            }
        }

        return result;
    }

    private String indentXMLString(String xmlString)
            throws SAXException, IOException, ParserConfigurationException, TransformerFactoryConfigurationError,
                   TransformerException {
        Document XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(
                              new InputSource(new StringReader(xmlString)));
        Transformer transformer = TransformerFactory.newInstance().newTransformer();

        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        StreamResult         result          = new StreamResult(new StringWriter());
        StringBuffer         xmlStringBuffer = new StringBuffer(xmlString);
        ByteArrayInputStream inputStream     = new ByteArrayInputStream(xmlStringBuffer.toString().getBytes("UTF-8"));
        StreamSource         source          = new StreamSource(inputStream);

        transformer.transform(source, result);

        return result.getWriter().toString();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
