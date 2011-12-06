package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.entities.*;
import tr.com.srdc.icardea.careplanengine.glmodel.*;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * <p></p>
 *
 *
 *
 */
public class AssignmentActionHandler {

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @param root
	 * @param assignmentAction
	 */
	public void handle(GuidelineAgent guidelineAgent, Guideline_Step guidelineStep,
		Assignment_Action assignmentAction) {
		try {
			MonitoringMessageEntity messageEntity;

			// TODO:Send Monitoring message In the beginning, change the Monitoring info
			Logger.getLogger(this.getClass()).log(Level.DEBUG, ("TODO:Send Monitoring message in the beginning"));
			messageEntity = new MonitoringMessageEntity();
			messageEntity.setStepName(guidelineStep.getName2());
			messageEntity.setType(MonitoringMessageType.getAssignmentActionType());
			messageEntity.setMonitoringInfo("Entered assignment");

			// TODO: Process the expression, put the data  int the pool
			Logger.getLogger(this.getClass()).log(Level.DEBUG, ("TODO:Process the expression, put the data  in the pool"));
			Logger.getLogger(this.getClass()).log(Level.DEBUG, (assignmentAction.getExpression().getSpecification()));

			// TODO: Monitoring Message at the end, get the assigment
			Logger.getLogger(this.getClass()).log(Level.DEBUG, ("TODO:Send Monitoring message at the end"));
			messageEntity = new MonitoringMessageEntity();
			messageEntity.setStepName(guidelineStep.getName2());
			messageEntity.setType(MonitoringMessageType.getAssignmentActionType());
			messageEntity.setMonitoringInfo("x is assigned to y");
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}


//~ Formatted by Jindent --- http://www.jindent.com

