package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.entities.StatusInfo;
import tr.com.srdc.icardea.careplanengine.glmodel.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.ArrayList;
import java.util.Vector;

/**
 * <p></p>
 *
 *
 * @poseidon-object-id [I14fcf14m109d9b01fb5mm617a]
 */
public class BranchStepHandler {

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I14fcf14m109d9b01fb5mm616e]
	 * @param guidelineAgent
	 * @param branchStep
	 */
	public void handle(GuidelineAgent guidelineAgent, Branch_Step branchStep) {

		// your code here
		// TODO: Handle Branches
		// / gets if the  branchs are parallel or not
		String orderConstraintString = branchStep.getOrder_constraint();
		ArrayList branches = (ArrayList) branchStep.getBranches();
		int listSize = branches.size();

		// ////// message to monitoring
		Vector<String> messageVector = new Vector<String>();
		messageVector.add(GuidelineHistoryFrame.UPDATE_STATUS);
		messageVector.add(branchStep.getName());
		messageVector.add(StatusInfo.STEP_STATUS_COMMITTED);
		guidelineAgent.messageToMonitoring(messageVector, true);

		// / parallel steps are added as new threads
		for (int i = 0; i < listSize; ++i) {
			Guideline_Step nextStep = (Guideline_Step) branches.get(i);

			// guidelineAgent.addParallelSubBehaviour(currentBehaviour);
			BranchThread currentThread = new BranchThread(guidelineAgent, nextStep);

			currentThread.run();
		}
	}
}


//~ Formatted by Jindent --- http://www.jindent.com

