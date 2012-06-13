/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.srdc.icardea.careplanengine.agents.afAgent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.GuidelineAgent;
import tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity;
import tr.com.srdc.icardea.careplanengine.entities.GuidelineEntity;
import tr.com.srdc.icardea.careplanengine.glif.generator.GlifGenerator;

/**
 * 
 * @author yildiray
 */
public class EngineInterface {

	private static Logger logger = Logger.getLogger(EngineInterface.class);
	//private static ArrayList<ConsultMessage> cmq = new ArrayList<ConsultMessage>();
	private static Hashtable<String, ConsultMessage> cmq = new Hashtable();
	//private static ArrayList<MonitoringMessage> mmq = new ArrayList<MonitoringMessage>();
	private static Hashtable<String, MonitoringMessage> mmq = new Hashtable();
	private static Hashtable<String, Hashtable<String, String>> executingCareplans = new Hashtable<String, Hashtable<String,String>>();

	public static synchronized String executeCareplan(String patientID,
			String carePlanID) {
		AssignmentEntity ae = new AssignmentEntity();
		ae.setPatientCode(new Long(patientID));
		ae.setAssignmentID(new Long("111"));
		// TODO: Delete in the future
		ResourceBundle properties = ResourceBundle.getBundle("icardea");
		String username = properties.getString("mysql.username");
		String password = properties.getString("mysql.password");
		String url = properties.getString("mysql.host");
		String jdbcDriver = properties.getString("jdbc.driverClassName");
		String jdbcURL = "jdbc:mysql://" + url + "/final_icardea_repository";
		String careplanURL = "";
		try {
			Class.forName(jdbcDriver).newInstance();
			Connection conn = DriverManager.getConnection(jdbcURL, username,
					password);
			Statement s = conn.createStatement();
			ResultSet resultSet = s
					.executeQuery("select GUIDELINE_URL from guideline_entity where guideline_id = "+ carePlanID);
			
			if (resultSet.next()) {
				careplanURL = resultSet.getString("GUIDELINE_URL");
			}
			s.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO
		logger.info(" $$$ Starting careplan:"+carePlanID+" careplan URL:"+careplanURL + " for patient:"+patientID);
		ae.setProcessedGuidelineURL(careplanURL);
		GuidelineEntity ge = new GuidelineEntity();
		ge.setGuidelineURL(careplanURL);
		ae.setGuidelineEntity(ge);
		String careplanProcessorID = AFAgent.createStandaloneGuidelineAgent(ae).getAID();
		
		Hashtable<String, String> temp = new Hashtable<String, String>();
		temp.put(carePlanID, careplanProcessorID);
		executingCareplans.put(patientID, temp);
		return careplanProcessorID;
	}
	public static synchronized String resumeCareplan(String patientID, String careplanID) {
		Hashtable<String, String> temp = new Hashtable<String, String>();
		temp = executingCareplans.get(patientID);
		return temp.get(careplanID);
		
	}
	
	public static synchronized void abortCareplan(String patientID, String careplanProcessorID) {
		//TODO: Kill the thread with given patientID and careplanProcessorID
		AFAgent.getInstance().abortGuidelineAgent(careplanProcessorID);
		cmq = new Hashtable<String, ConsultMessage>();
		mmq = new Hashtable<String, MonitoringMessage>();
	}

	public static synchronized void processConsultingMessage(
			String consultHTMLString, String careplanProcessorID, String stepID) {
		logger.info(" $$$ Process the Consult Message for Careplan Processor ID:" + careplanProcessorID + " Step ID:" + stepID
				+ " \n " + consultHTMLString);
		/*
		 * ConsultMessage consultMessage = new
		 * ConsultMessage(careplanProcessorID, consultHTMLString);
		 * Flex.addConsultingMessageToQueue(consultMessage);
		 */
		ConsultMessage consultMessage = new ConsultMessage(careplanProcessorID,
				consultHTMLString, stepID);
		//cmq.add(consultMessage);
		cmq.put(careplanProcessorID, consultMessage);
	}

	public static synchronized void informConsultMessage(
			String careplanProcessorID, String result) {
		// result = "The case is VT!";
		logger.info(" $$$ Result from monitoring:" + result + " for careplan processor Id="+ careplanProcessorID);
		result = "<Data> <Observation> <Certainity_OB>0</Certainity_OB> "
				+ "<Normal_Range_OB> <Display_Name_RN>string</Display_Name_RN> </Normal_Range_OB> "
				+ "<Severity_OB>0</Severity_OB> <Text_Value>" + result
				+ "</Text_Value> " + "</Observation> </Data>";
		AFAgent.getInstance().getGuidelineAgent(careplanProcessorID)
				.informConsultMessage(result);
		if(cmq.size() > 0)
			cmq.remove(careplanProcessorID);
		else
			logger.info(" $$$ CMQ Size is less than ZERO");
	}

	public static synchronized void sendMonitoringMessage(
			String careplanProcessorID, String stepID, String status,
			String monitorMessage) {
		logger.info(" $$$ Monitoring Message: Careplan Processor ID:"
				+ careplanProcessorID + " Step ID: " + stepID + " Status:"
				+ status + " Result:" + monitorMessage);
		/*
		 * MonitoringMessage monitoringMessage = new
		 * MonitoringMessage(careplanProcessorID, stepID, status,
		 * monitoringMessage);
		 * Flex.addMonitoringMessageToQueue(monitoringMessage);
		 */
		MonitoringMessage monitoringMessage = new MonitoringMessage(
				careplanProcessorID, stepID, status, monitorMessage);
		//mmq.add(monitoringMessage);
		mmq.put(careplanProcessorID, monitoringMessage);
	}
	public static synchronized void assertMonitoringMessage(String isSuccessful){
		//if(isSuccessful) {
			if(mmq.size() > 0)
				mmq.remove(isSuccessful);
			else
				logger.info(" $$$ MMQ Size is less than ZERO");
		//}
		
	}

	public static synchronized Hashtable<String, MonitoringMessage> receiveMonitoringMessage() {
		return mmq;
	}

	public static synchronized Hashtable<String, ConsultMessage> receiveConsultMessage() {
		return cmq;
	}

}
