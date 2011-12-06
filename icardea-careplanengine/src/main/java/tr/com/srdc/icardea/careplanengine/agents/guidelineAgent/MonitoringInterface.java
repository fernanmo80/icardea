/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent;

import java.util.Vector;
import tr.com.srdc.icardea.careplanengine.agents.afAgent.AFAgent;
import tr.com.srdc.icardea.careplanengine.agents.communication.ontology.consultingOntology.ConsultingMessage;
import tr.com.srdc.icardea.careplanengine.agents.monitoringAgent.MonitoringAgent;
import tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity;
import tr.com.srdc.icardea.careplanengine.glmodel.impl.DefaultGuideline;

/**
 *
 * @author ibrahim
 */
public class MonitoringInterface {
	private MonitoringAgent monitoringAgent;
	private GuidelineAgent myAgent;
	private boolean showGUI = true;

	public MonitoringInterface(GuidelineAgent myAgent, boolean showGUI) {
		this.showGUI = showGUI;
		this.myAgent = myAgent;
		this.monitoringAgent = MonitoringAgent.getInstance(showGUI);
	}

	public MonitoringInterface(GuidelineAgent myAgent) {
		this.myAgent = myAgent;
		this.monitoringAgent = MonitoringAgent.getInstance();
	}
	// STATIC FONKSYONLAR MONITORING TARAFINDA CAGIRILANLAR
	public static void informConsultMessage(String guidelineAgentID, String result) {
		AFAgent.getInstance().getGuidelineAgent(guidelineAgentID).informConsultMessage(result);
	}

	public static void createGuidelineAgent(AssignmentEntity assignment) {
		AFAgent.getInstance().createGuidelineAgent(assignment);
	}

	public String generateSubguidelineKey(AssignmentEntity assignmentEntity, DefaultGuideline defaultGuideline) {
		return monitoringAgent.getMonitoring_gui().generateSubguidelineKey(assignmentEntity, defaultGuideline);
	}

	public String processMessageVector(String aID, Vector<String> messageVector) {
		return monitoringAgent.processMessageVector(aID, messageVector);
	}

	public void processConsultingMessage(ConsultingMessage consultingMessage, String aID) {
		monitoringAgent.processConsultingMessage(consultingMessage, aID);
	}

}
