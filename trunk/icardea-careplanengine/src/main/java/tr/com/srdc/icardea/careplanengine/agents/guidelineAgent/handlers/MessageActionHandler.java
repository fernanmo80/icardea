package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.GuidelineAgent;
import tr.com.srdc.icardea.careplanengine.alarmSystem.alarmOntology.*;
import tr.com.srdc.icardea.careplanengine.entities.*;
import tr.com.srdc.icardea.careplanengine.glmodel.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import org.apache.log4j.Logger;

import tr.com.srdc.icardea.careplanengine.alarmSystem.AlarmMessageHandler;

/**
 * <p></p>
 *
 *
 */
public class MessageActionHandler {

	public static Logger logger = Logger.getLogger(MessageActionHandler.class);

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @param messageAction
	 */
	public void handle(GuidelineAgent guidelineAgent, Guideline_Step guidelineStep, Message_Action messageAction) {
		if (!guidelineAgent.showGUI) {
			String stepID = messageAction.getName2().split(":")[0];
			tr.com.srdc.icardea.careplanengine.agents.afAgent.EngineInterface.sendMonitoringMessage(guidelineAgent.getAID(), stepID, "FINISHED", "" );
		}

		/*
		 * Extracting content from trhe alarm entity
		 */
		Alarm_Entity alarmEntity = messageAction.getMessage();
		String urgency = alarmEntity.getAlarm_threshold();
		
		String content = urgency.equals("2")?messageAction.getDescription():alarmEntity.getAlarm_message();
		
		Collection roles = alarmEntity.getRoles();
		Iterator it = roles.iterator();

		/*
		 *
		 *
		 */
		AlarmMessage alarmMessage = new AlarmMessage();
		MessageContent messageContent = new MessageContent();

		// Sets Patient Info
		PatientInfo patientInfo = new PatientInfo();
		AssignmentEntity assignmentEntity = guidelineAgent.getAssignmentEntity();

		patientInfo.setAssignmentID("" + assignmentEntity.getAssignmentID());
		patientInfo.setPatientName(assignmentEntity.getPatientEntity().getName());
		patientInfo.setPatientID("" + assignmentEntity.getPatientEntity().getPcode());
		patientInfo.setGuidelineID(guidelineAgent.getGuideineID());

		// Sets Message Content
		messageContent.setContent(content);
		messageContent.setUrgency(Integer.parseInt(urgency));

		try {

			while (it.hasNext()) {

				// sets role
				messageContent.setRole((String) it.next());

				alarmMessage.setPatientInfo(patientInfo);
				alarmMessage.setMessageContent(messageContent);
				logger.info("___Trying to send message...");
				String alarmMessageString = "";
				AlarmMessageHandler.getInstance().action(alarmMessage);
				logger.info("___Message Sending has Finished");
				Vector<String> messageVector = new Vector<String>();
				messageVector.add(GuidelineHistoryFrame.ALARM_GENERATED);
				messageVector.add(guidelineStep.getName());
				messageVector.add(urgency);
				messageVector.add(content);
				guidelineAgent.messageToMonitoring(messageVector);
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		if (!guidelineAgent.showGUI) {
			String stepID = messageAction.getName2().split(":")[0];
			//tr.com.srdc.icardea.careplanengine.agents.afAgent.EngineInterface.sendMonitoringMessage(guidelineAgent.getAID(), stepID, "FINISHED", "" );
		}
	}
}


//~ Formatted by Jindent --- http://www.jindent.com
