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
 * @poseidon-object-id [I14fcf14m109d9b01fb5mm5efd]
 */
public class SynchronizationStepHandler {

    /**
     * <p>Does ...</p>
     *
     *
     * @poseidon-object-id [I14fcf14m109d9b01fb5mm5ee9]
     * @param root
     * @param synchronizationStep
     */
    public void handle(GuidelineAgent guidelineAgent, Synchronization_Step synchronizationStep) {

        // your code here
        // TODO: Synchronization Step

        /*
         * Currently, the code below  blocks trace of the algorithm until sufficient
         * number of branches  arrive to the synch. step. In every visit, number of branch arrivals
         * needed to pass this step are put in the hashtable of the GuidelineAgent, decremented by 1
         * when  numberof  needed steps is 1, algorithm can go further.
         */

        // Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("TODO: Synchronization Step");
        if (guidelineAgent.processSynchStep(synchronizationStep)) {}
        else {

            // Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("SYNC STEP COMPLETE");
//          //////    message to monitoring
            Vector<String> messageVector = new Vector<String>();
            messageVector.add(GuidelineHistoryFrame.UPDATE_STATUS);
            messageVector.add(synchronizationStep.getName());
            messageVector.add(StatusInfo.STEP_STATUS_COMMITTED);
            guidelineAgent.messageToMonitoring(messageVector, true);

            new GuidelineStepHandler().handle(guidelineAgent, synchronizationStep.getNext_step());
        }
    }

    /**
     * <p>Does ...</p>
     *
     *
     * @poseidon-object-id [I14fcf14m109d9b01fb5mm5ee3]
     */
    private void evaluateCriteria() {

        // your code here
    }

    // ///   a temporary method to parse how many branches needed to pass this synch. step
    private Integer getBranchCount(Synchronization_Step step) {
        String logicalExpr = step.getContinuation().getLogical_expression_of_guideline_step();

        // '>' and '=' charcters are removed and string is trimmed to obtain Integer
        Integer branchCount = Integer.parseInt(logicalExpr.replace('>', ' ').replace('=', ' ').trim());

        return branchCount;
    }

    /**
     * <p></p>
     *
     *
     * @poseidon-object-id [I14fcf14m109d9b01fb5mm5ef5]
     */
}


//~ Formatted by Jindent --- http://www.jindent.com
