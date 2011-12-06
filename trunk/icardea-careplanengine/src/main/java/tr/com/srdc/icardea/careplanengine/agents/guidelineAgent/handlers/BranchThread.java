
/// ibrahim 27.03.06
package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.glmodel.*;

public class BranchThread extends Thread {
    private GuidelineAgent guidelineAgent;

    /**
     * @param  threads created by BranchStep
     *
     *  current guidelineAgent and next Guideline_Step are parameters
     */
    private Guideline_Step guidelineStep;

    public BranchThread(GuidelineAgent agent, Guideline_Step step) {
        super();
        guidelineStep  = step;
        guidelineAgent = agent;
    }

    public void run() {
        try {

            // Logger.getLogger(this.getClass()).log(Level.DEBUG, ("BRANCH Step: New Thread Created");
            new GuidelineStepHandler().handle(guidelineAgent, guidelineStep);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
