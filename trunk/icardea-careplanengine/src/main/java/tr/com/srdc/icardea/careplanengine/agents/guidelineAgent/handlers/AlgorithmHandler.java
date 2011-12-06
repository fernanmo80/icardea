package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.glmodel.*;

//~--- JDK imports ------------------------------------------------------------


/**
 * <p></p>
 *
 *
 * @poseidon-object-id [I14fcf14m109d9b01fb5mm62e6]
 */
public class AlgorithmHandler {

    /**
     * <p>Does ...</p>
     *
     * @poseidon-object-id [I14fcf14m109d9b01fb5mm62b7]
     * @param root
     * @param algorithm
     */
    public void handle(GuidelineAgent guidelineAgent, Algorithm algorithm) {

        // Get the first step of the guideline and passes to GuidelineStepHandler.
        GuidelineStepHandler guidelineStepHandler = new GuidelineStepHandler();
        
        guidelineStepHandler.handle(guidelineAgent, algorithm.getFirst_step());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
