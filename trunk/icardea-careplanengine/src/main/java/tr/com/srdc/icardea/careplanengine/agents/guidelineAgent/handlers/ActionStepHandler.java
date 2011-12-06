package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.FactoryRetriever;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.GuidelineAgent;
import tr.com.srdc.icardea.careplanengine.entities.StatusInfo;
import tr.com.srdc.icardea.careplanengine.glmodel.Action_Specification;
import tr.com.srdc.icardea.careplanengine.glmodel.Action_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline;

//~--- JDK imports ------------------------------------------------------------

import java.util.Vector;
import org.apache.log4j.Logger;

/**
 * <p></p>
 *
 *
 * @poseidon-object-id [I14fcf14m109d9b01fb5mm636a]
 */
public class ActionStepHandler {

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I14fcf14m109d9b01fb5mm635a]
	 * @param root
	 * @param actionStep
	 */
	private transient Action_Step actionStep;
	public static Logger logger = Logger.getLogger(ActionStepHandler.class);

	public void handle(GuidelineAgent guidelineAgent, Action_Step actionStep) {

		// your code here
		// TODO: Action Stepin ici dolacak
		Guideline guideline = guidelineAgent.getGuideline();

		this.actionStep = actionStep;

		// // simdilik sadece tasklari listeliyor
		// // mail atiyor
		// sendMessageToAlarm( guidelineAgent);
		Vector tasksList = FactoryRetriever.retrieveTasks(guidelineAgent.getGuidelineURI(), actionStep);
		int listSize = tasksList.size();

		for (int i = 0; i < listSize; ++i) {
			Action_Specification currentActSpec = (Action_Specification) tasksList.get(i);
			logger.info("CURRENT ACTION SPEC NAME:" + currentActSpec.getName2());
			new ActionSpecificationHandler().handle(guidelineAgent, actionStep, currentActSpec);
		}

		Vector<String> messageVector = new Vector<String>();
		messageVector.add(GuidelineHistoryFrame.UPDATE_STATUS);
		messageVector.add(actionStep.getName());
		messageVector.add(StatusInfo.STEP_STATUS_COMMITTED);
		guidelineAgent.messageToMonitoring(messageVector, true);

		if (actionStep.hasNext_step()) {
			new GuidelineStepHandler().handle(guidelineAgent, actionStep.getNext_step());
		}
	}
}


//~ Formatted by Jindent --- http://www.jindent.com

