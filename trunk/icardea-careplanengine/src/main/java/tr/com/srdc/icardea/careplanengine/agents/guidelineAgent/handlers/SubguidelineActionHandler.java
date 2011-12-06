package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


import tr.com.srdc.icardea.careplanengine.agents.afAgent.AFAgent;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.FactoryRetriever;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.GuidelineAgent;
import tr.com.srdc.icardea.careplanengine.entities.StatusInfo;
import tr.com.srdc.icardea.careplanengine.glmodel.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.Vector;

/**
 * <p></p>
 *
 *
 * @poseidon-object-id [I14fcf14m109d9b01fb5mm5efb]
 */
public class SubguidelineActionHandler {

	/**
	 * <p>Does ...</p>
	 *
	 * @param guidelineAgent
	 * @param subguidelineAction
	 */
	public void handle(GuidelineAgent guidelineAgent, Guideline_Step guidelineStep,
		Subguideline_Action subguidelineAction) {
		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Name of Subguideline_Action: " + subguidelineAction.getName2()));
		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Description of Subguideline_Action: " + subguidelineAction.getDescription()));
		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Intention of Subguideline_Action: " + subguidelineAction.getIntention()));

		// create a new guideline handler
		// action_detail's type is Nestable in fact, but it is casted to Guideline
		String subguidelineUrl;
		Nestable nestable = subguidelineAction.getAction_detail();

		if (nestable != null) {
			subguidelineUrl = guidelineAgent.getGuidelineURI();
			nestable = FactoryRetriever.retrieveNestable(guidelineAgent.getGuidelineURI(), nestable);
		} else {
			subguidelineUrl = subguidelineAction.getDescription();
			nestable = FactoryRetriever.getGuideline(subguidelineUrl, subguidelineAction.getName2());
		}

		Vector<String> messageVector = new Vector<String>();
		messageVector.add(GuidelineHistoryFrame.UPDATE_STATUS);
		messageVector.add(nestable.getName());
		messageVector.add(StatusInfo.STEP_STATUS_RUNNING);
		guidelineAgent.messageToMonitoring(messageVector, true);

		if (nestable instanceof Guideline) {
			GuidelineAgent subguidelineAgent = AFAgent.createGuidelineAgent(guidelineAgent.getAssignmentEntity(),
				true, guidelineAgent.getAID(),
				(Guideline) nestable, subguidelineUrl, guidelineAgent.getLastSessionID());
			subguidelineAgent.start();
			try {
				guidelineAgent.waitForSubguideline();
			} catch (InterruptedException ex) {
			}

			messageVector.clear();
			messageVector.add(GuidelineHistoryFrame.UPDATE_STATUS);
			messageVector.add(nestable.getName());
			messageVector.add(StatusInfo.STEP_STATUS_COMMITTED);
			guidelineAgent.messageToMonitoring(messageVector, false);

			// execution of the guideline is completed for one cycle.
			// inform monitoring gui about this, and make sure that it will prepare a new panel for the new cycle
			messageVector.clear();
			messageVector.add(GuidelineHistoryFrame.CYCLE_COMPLETED);
			guidelineAgent.messageToMonitoring(messageVector);
		} else if (nestable instanceof Macro) {
			// TODO: if necessary, it will be implemented.
		}
	}
}


//~ Formatted by Jindent --- http://www.jindent.com

