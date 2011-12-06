package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.entities.StatusInfo;
import tr.com.srdc.icardea.careplanengine.glmodel.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.Vector;

/**
 * <p></p>
 *
 *
 * @poseidon-object-id [I14fcf14m109d9b01fb5mm5fd7]
 */
public class PatientStateStepHandler {

    /**
     * <p>Does ...</p>
     *
     *
     * @poseidon-object-id [I14fcf14m109d9b01fb5mm5fca]
     * @param guidelineAgent
     * @param patientStateStep
     */
    public void handle(GuidelineAgent guidelineAgent, Patient_State_Step patientStateStep) {
        try {

            // TODO:  PatientStateStep'te yapilacaklar
//          //////    message to monitoring
            Vector<String> messageVector = new Vector<String>();
            messageVector.add(GuidelineHistoryFrame.UPDATE_STATUS);
            messageVector.add(patientStateStep.getName());
            messageVector.add(StatusInfo.STEP_STATUS_COMMITTED);
            guidelineAgent.messageToMonitoring(messageVector, true);

            // calls  handler for the next step
            if (patientStateStep.hasNext_step()) {
                new GuidelineStepHandler().handle(guidelineAgent, patientStateStep.getNext_step());
            } else if (!guidelineAgent.isSubguideline()) {
                messageVector = new Vector<String>();
                // execution of the guideline is completed for one cycle.
                // inform monitoring gui about this, and make sure that it will prepare a new panel for the new cycle
                messageVector.add(GuidelineHistoryFrame.CYCLE_COMPLETED);
                guidelineAgent.messageToMonitoring(messageVector);
            } else {    // it is a subguideline
                guidelineAgent.messageToMonitoring(null);
            }

	    if (!guidelineAgent.showGUI) {
			String stepID = patientStateStep.getName2().split(":")[0];
			tr.com.srdc.icardea.careplanengine.agents.afAgent.EngineInterface.sendMonitoringMessage(guidelineAgent.getAID(), stepID, "FINISHED", "" );
			tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers.SendHL7Message.send(guidelineAgent);
		}

//          guidelineAgent.messageToMonitoring(null);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
