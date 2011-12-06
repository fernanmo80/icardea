package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.entities.StatusInfo;
import tr.com.srdc.icardea.careplanengine.glmodel.*;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
//~--- JDK imports ------------------------------------------------------------

import java.util.*;

/**
 * <p></p>
 *
 */
public class GuidelineStepHandler {

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @param parentGuidelineStepName
	 * @param nextGuidelineStep
	 */
	public static Logger logger = Logger.getLogger(GuidelineStepHandler.class);
	public void handle(GuidelineAgent guidelineAgent, Guideline_Step aGuidelineStep) {
		Guideline_Step nextGuidelineStep = FactoryRetriever.retrieveStep(guidelineAgent.getGuidelineURI(),
			aGuidelineStep);

		if (nextGuidelineStep == null) {

			//
			Logger.getLogger(this.getClass()).log(Level.DEBUG, ("null step"));
			
			return;
		}

		try {
			// Thread.sleep(500);
		} catch (Exception exc) {
			exc.printStackTrace();
		}

		Vector<String> messageVector = new Vector<String>();
		messageVector.add(GuidelineHistoryFrame.UPDATE_STATUS);
		messageVector.add(nextGuidelineStep.getName());
		messageVector.add(StatusInfo.STEP_STATUS_RUNNING);
		guidelineAgent.messageToMonitoring(messageVector);

		try {
			// Random random = new Random();
			// Thread.sleep(700+ random.nextInt(2000));
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		if (nextGuidelineStep instanceof Action_Step) {
			ActionStepHandler actionStepHandler = new ActionStepHandler();
			logger.info("ACTION HANDLE START");
			actionStepHandler.handle(guidelineAgent, (Action_Step) nextGuidelineStep);
		} else if (nextGuidelineStep instanceof Branch_Step) {
			BranchStepHandler branchStepHandler = new BranchStepHandler();
			logger.info("BRANCH HANDLE START");
			branchStepHandler.handle(guidelineAgent, (Branch_Step) nextGuidelineStep);
		} // GuidelineExpression???
		else if (nextGuidelineStep instanceof Patient_State_Step) {
			PatientStateStepHandler patientStateStepHandler = new PatientStateStepHandler();
			logger.info("PSS HANDLE START");
			patientStateStepHandler.handle(guidelineAgent, (Patient_State_Step) nextGuidelineStep);
		} else if (nextGuidelineStep instanceof Synchronization_Step) {
			SynchronizationStepHandler synchronizationStepHandler = new SynchronizationStepHandler();
			logger.info("SYNCHRONIZATION HANDLE START");
			synchronizationStepHandler.handle(guidelineAgent, (Synchronization_Step) nextGuidelineStep);
		} // .
		// I am continuing the code anyway.
		else if (nextGuidelineStep instanceof Choice_Step) {
			ChoiceStepHandler choiceStepHandler = new ChoiceStepHandler();
			logger.info("CHOICE HANDLE START");
			choiceStepHandler.handle(guidelineAgent, (Choice_Step) nextGuidelineStep);
		} else if (nextGuidelineStep instanceof Case_Step) {
			CaseStepHandler caseStepHandler = new CaseStepHandler();
			logger.info("CASE HANDLE START");
			caseStepHandler.handle(guidelineAgent, (Case_Step) nextGuidelineStep);
		}
	}
}


//~ Formatted by Jindent --- http://www.jindent.com

