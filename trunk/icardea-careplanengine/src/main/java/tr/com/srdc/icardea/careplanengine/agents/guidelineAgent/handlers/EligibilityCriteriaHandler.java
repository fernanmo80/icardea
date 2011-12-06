package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageEntity;
import tr.com.srdc.icardea.careplanengine.glmodel.*;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
//~--- JDK imports ------------------------------------------------------------

import java.util.Collection;
import java.util.Iterator;

/**
 * <p></p>
 *
 *
 */
public class EligibilityCriteriaHandler {

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @param parentStepName
	 * @param eligibityCriteria
	 * @return TODO
	 */
	public static Logger logger = Logger.getLogger(EligibilityCriteriaHandler.class);
	public Boolean handle(GuidelineAgent guidelineAgent, Guideline_Step guidelineStep, Criterion eligibilityCriteria) {
		MonitoringMessageEntity messageEntity;
		logger.info("ELIGIBILTY HANDLE START");
		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Eligibility Criteria:" + eligibilityCriteria.getName2()));

		// TODO: Message to Monitoring in the beginning
		messageEntity = new MonitoringMessageEntity();

		if (guidelineStep != null) {
			messageEntity.setStepName(guidelineStep.getName2());
		} else {
			messageEntity.setStepName(eligibilityCriteria.getName2());
		}

		messageEntity.setType("Eligibility Criteria");
		messageEntity.setMonitoringInfo("Starting eligibility check.");

		// First get the needed getDataAction array from the Criterion.
		Collection getDataActions = eligibilityCriteria.getGet_Data_Items();

		// Create an instance of the GetDataActionHandler.
		GetDataActionHandler getDataActionHandler = new GetDataActionHandler();

		// For each getDataAction, call the handler.
		for (Iterator i = getDataActions.iterator(); i.hasNext();) {
			getDataActionHandler.handle(guidelineAgent, guidelineStep, (Get_Data_Action) i.next());
		}

		// Get let expressions and execute them.
		Collection letExpressions = eligibilityCriteria.getLet_expressions();

		// For each letExpression, call the letExpressionHandler.
		LetExpressionHandler letExpressionHandler = new LetExpressionHandler();

		for (Iterator i = letExpressions.iterator(); i.hasNext();) {
			letExpressionHandler.handle(guidelineAgent, guidelineStep, (Let_Expression) i.next());
		}

		ExpressionHandler expressionHandler = new ExpressionHandler();
		Boolean result = (Boolean) expressionHandler.handle(guidelineAgent, guidelineStep,
			eligibilityCriteria.getSpecification(),
			guidelineAgent.getGuidelineURI());

		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("The result of the eligibility criteria is: " + result));

		// TODO:
		// A monitoring message has to be sent now.
		messageEntity.setMonitoringInfo("Finishing eligibility check. The result is: " + result);

		// TODO:
		// Result needs to returned. But, which result? ExpressionHandler's???
		// How is Eligibility Criteria going to return its outcome? Either it will get it from
		// expression handler and pass it on to GuidelineHandler or a better to store it in the
		// global variable pool of the GuidelineAgent and check it after calling
		// EligibilityCriteriaHandler.
		logger.info("ELIGIBILTY HANDLE END");
		return result;
	}
}
//~ Formatted by Jindent --- http://www.jindent.com

