package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.GuidelineAgent;
import tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageEntity;
import tr.com.srdc.icardea.careplanengine.glmodel.*;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * <p></p>
 *
 *
 * @poseidon-object-id [I14fcf14m109d9b01fb5mm5da0]
 */
public class LetExpressionHandler {

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I14fcf14m109d9b01fb5mm5d3a]
	 * @param parentGuidelineStepName
	 * @param letExpression
	 */
	public void handle(GuidelineAgent guidelineAgent, Guideline_Step guidelineStep, Let_Expression letExpression) {
		MonitoringMessageEntity messageEntity;

		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Let Expression:" + letExpression.getName2()));

		// TODO: Message to Monitoring in the beginning
		messageEntity = new MonitoringMessageEntity();

		if (guidelineStep != null) {
			messageEntity.setStepName(guidelineStep.getName2());
		} else {
			messageEntity.setStepName(letExpression.getName2());
		}

		messageEntity.setType("Let Expression");
		messageEntity.setMonitoringInfo("Starting executing a let expression.");

		// The expression is evaluated through ExpressionHandler
		String expression = letExpression.getExpression_string();
		ExpressionHandler expressionHandler = new ExpressionHandler();
		Object result = expressionHandler.handle(guidelineAgent, guidelineStep, expression,
			guidelineAgent.getGuidelineURI());

		guidelineAgent.storeGlobalVariable(letExpression.getIdentifier(), result);

		// TODO
		// Monitoring message indicating the result is sent.
		messageEntity.setMonitoringInfo("Exiting LetExpression");

		// else there is no GuidelineStep associated with the caller. For
		// example, it may be an EligibilityCriteria.
	}
}


//~ Formatted by Jindent --- http://www.jindent.com

