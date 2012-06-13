package tr.com.srdc.icardea.careplanengine.agents.afAgent;

import java.util.Hashtable;
import java.util.UUID;


import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.GuidelineAgent;
import tr.com.srdc.icardea.careplanengine.agents.monitoringAgent.MonitoringAgent;
import tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity;
//import tr.edu.metu.srdc.icardea.util.EntityManager;
import tr.com.srdc.icardea.careplanengine.entities.GuidelineEntity;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline;

/**
 * <p></p>
 *
 *
 * @poseidon-object-id [I8b7250m109bbca6579mm7220]
 */
public class AFAgent {

	private static AFAgent afAgentInstance = null;
	private static Hashtable<String, GuidelineAgent> guidelineAgents = new Hashtable();
	private static boolean showGUI = true;

	private AFAgent() {
		if (showGUI) {
			setup();
		}
	}

	public static AFAgent getInstance() {
		if (afAgentInstance == null) {
			afAgentInstance = new AFAgent();
		}
		return afAgentInstance;
	}

	private void setup() {
		MonitoringAgent.getInstance();
	}

	public static GuidelineAgent createGuidelineAgent(AssignmentEntity assignment) {
		return createGuidelineAgent(assignment, false, null, null, null, 0L);
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm7226]
	 * @param assignment
	 */
	public GuidelineAgent getGuidelineAgent(String key) {
		return guidelineAgents.get(key);
	}
	
	public void abortGuidelineAgent(String key){
		guidelineAgents.get(key).interrupt();
		guidelineAgents.remove(key);
	}

	public static GuidelineAgent createGuidelineAgent(AssignmentEntity assignment,
		boolean isSubguideline, String parentGuidelineAgent,
		Guideline subguideline, String url, Long lastSessionID) {
		try {
			String agentName = UUID.randomUUID().toString();
			String temp = assignment.getProcessedGuidelineURL();
			if (isSubguideline) {
				temp = url;
			}

			GuidelineAgent parent = null;
			if (parentGuidelineAgent != null) {
				parent = guidelineAgents.get(agentName);
			}
			GuidelineAgent guidelineAgent = new GuidelineAgent(agentName, temp, assignment,
				isSubguideline, subguideline, lastSessionID, parent);
			guidelineAgent.start();
			guidelineAgents.put(agentName, guidelineAgent);
			return guidelineAgent;
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return null;
	}

	public static GuidelineAgent createStandaloneGuidelineAgent(AssignmentEntity assignment) {
		try {
			showGUI = false;
			String agentName = UUID.randomUUID().toString();
			String guidelineURL = assignment.getProcessedGuidelineURL();
			GuidelineAgent guidelineAgent = new GuidelineAgent(agentName, guidelineURL, assignment, false, null, 0L, null, showGUI);
			guidelineAgent.start();
			guidelineAgents.put(agentName, guidelineAgent);
			return guidelineAgent;
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return null;
	}
	
	

	public static void main(String argv[]) {
		AFAgent.getInstance();
		/*AssignmentEntity ae = new AssignmentEntity();
		ae.setPatientCode(new Long("149202063491"));
		ae.setAssignmentID(new Long("111"));
		ae.setProcessedGuidelineURL("http://localhost:8080/icardea/guidelines/icardea/SALKGuidelineVT.owl");
		GuidelineEntity ge = new GuidelineEntity();
		ge.setGuidelineURL("http://localhost:8080/icardea/guidelines/icardea/SALKGuidelineVT.owl");
		ae.setGuidelineEntity(ge);
		createStandaloneGuidelineAgent(ae);*/
	}
}
