package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.glmodel.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.Vector;
import org.apache.log4j.Logger;

/**
 * <p></p>
 *
 *
 * @poseidon-object-id [I14fcf14m109d9b01fb5mm63b4]
 */
public class ActionSpecificationHandler {

    /**
     * <p>Does ...</p>
     *
     *
     * @poseidon-object-id [I14fcf14m109d9b01fb5mm63ab]
     * @param parentGuidelineStepName
     * @param actionSpecification
     */

	public static Logger logger = Logger.getLogger(ActionSpecificationHandler.class);
	
    public void handle(GuidelineAgent guidelineAgent, Guideline_Step guidelineStep,
                       Action_Specification actionSpecification) {

        // Logger.getLogger(this.getClass()).log(Level.DEBUG, ("[TaskType: "+actionSpecification.getClass().getName()+"]");
        // TODO: SubguidelineAction handler
        try {
            Vector<String> messageVector = new Vector<String>();

            messageVector.add(GuidelineHistoryFrame.DISPLAY_INFO);
            messageVector.add(guidelineStep.getName());
            messageVector.add(actionSpecification.getName());
            messageVector.add(actionSpecification.getName2());
            guidelineAgent.messageToMonitoring(messageVector);
            logger.info("ACTION TASK NAME:" + actionSpecification.getName2());
            if (actionSpecification instanceof Assignment_Action) {
                new AssignmentActionHandler().handle(guidelineAgent, guidelineStep,
                        (Assignment_Action) actionSpecification);
            } else if (actionSpecification instanceof Get_Data_Action) {
                new GetDataActionHandler().handle(guidelineAgent, guidelineStep, (Get_Data_Action) actionSpecification);
            } else if (actionSpecification instanceof Medically_Oriented_Action_Specification) {
                new MedicallyOrientedActionHandler().handle(guidelineAgent, guidelineStep,
                        (Medically_Oriented_Action_Specification) actionSpecification);
            } else if (actionSpecification instanceof Message_Action) {
                new MessageActionHandler().handle(guidelineAgent, guidelineStep, (Message_Action) actionSpecification);
            } else if (actionSpecification instanceof Subguideline_Action) {
                new SubguidelineActionHandler().handle(guidelineAgent, guidelineStep,
                        (Subguideline_Action) actionSpecification);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
