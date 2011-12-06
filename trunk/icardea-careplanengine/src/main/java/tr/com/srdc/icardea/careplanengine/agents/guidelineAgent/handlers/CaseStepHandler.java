package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.GuidelineGraph;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.entities.StatusInfo;
import tr.com.srdc.icardea.careplanengine.glmodel.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import org.apache.log4j.Logger;

/**
 * <p></p>
 *
 *
 * @poseidon-object-id [I14fcf14m109d9b01fb5mm5d9d]
 */
public class CaseStepHandler {

	public static Logger logger = Logger.getLogger(CaseStepHandler.class);

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I14fcf14m109d9b01fb5mm5d8c]
	 * @param Root
	 * @param caseStep
	 */
	public void handle(GuidelineAgent guidelineAgent, Case_Step caseStep) {

		// TODO: case step'in ici
		// rule in rule outlara gore, optionlardan birisini sececek
		// fakat su anda random birini seciyor
		// The decision_detail attribute may have a subguideline.
		// If there is, according to GLIF specs, it should be executed
		// before the decision criterion of this step
		if (caseStep.getDecision_detail() != null) {

			// create a new guideline handler
			// decision_detai's type is Nestable in fact, but it is casted to Guideline
			// TODO: If necessary, Macro case will also be handled.
			Nestable nestable = FactoryRetriever.retrieveNestable(guidelineAgent.getGuidelineURI(),
				caseStep.getDecision_detail());

			if (nestable instanceof Guideline) {
				new GuidelineHandler().handle(guidelineAgent, (Guideline) nestable);
			} else if (nestable instanceof Macro) {
				// TODO: if necessary, it will be implemented.
			}
		}

		// //////message to monitoring
		Vector<String> messageVector = new Vector<String>();
		messageVector.add(GuidelineHistoryFrame.UPDATE_STATUS);
		messageVector.add(caseStep.getName());
		messageVector.add(StatusInfo.STEP_STATUS_COMMITTED);
		guidelineAgent.messageToMonitoring(messageVector, true);

		try {
			logger.info("CASE STEP START");
			ArrayList optionsList = (ArrayList) caseStep.getOptions();
			int listSize = optionsList.size();

			// ///
			ExpressionHandler expressionHandler = new ExpressionHandler();
			Guideline_Step nextStep = null;

			for (int i = 0; i < listSize; ++i) {
				Decision_Option opt = (Decision_Option) optionsList.get(i);
				Case_Condition cond = FactoryRetriever.retrieveCase_condition(guidelineAgent.getGuidelineURI(),
					opt);
				Guideline_Expression expr = cond.getCase_value();
				Criterion cr =
					(Criterion) FactoryRetriever.retrieveExpression(guidelineAgent.getGuidelineURI(), expr);

				messageVector = new Vector<String>();
				messageVector.add(GuidelineHistoryFrame.UPDATE_STATUS);
				messageVector.add(opt.getName());
				messageVector.add(StatusInfo.STEP_STATUS_RUNNING);
				guidelineAgent.messageToMonitoring(messageVector);

				Collection getDataItems = cr.getGet_Data_Items();
				Iterator it = getDataItems.iterator();

				while (it.hasNext()) {
					Get_Data_Action gda = (Get_Data_Action) it.next();

					new GetDataActionHandler().handle(guidelineAgent, caseStep, gda);
				}
				logger.info("SPECIFICATION:" + cr.getSpecification());
				Boolean result = new Boolean(true);
				if (cr.getSpecification() != null) {
					result = (Boolean) expressionHandler.handle(guidelineAgent, caseStep, cr.getSpecification(),
						guidelineAgent.getGuidelineURI());
				}
				logger.info("BOOL RESULT:" + result);

				Collection expressions = cr.getLet_expressions();

				if (expressions != null) {
					for (Iterator iterator = expressions.iterator(); iterator.hasNext();) {
						Let_Expression expression = (Let_Expression) iterator.next();
						String toBeDeleteds = expression.getIdentifier();
						String variables[] = toBeDeleteds.split(",");

						for (int j = 0; j < variables.length; j++) {
							String variable = variables[j].trim();

//                          Logger.getLogger(this.getClass()).log(Level.DEBUG, (":::::variable:: %" + variable+"%");
							guidelineAgent.removeGlobalVariable(variable);
						}
					}
				}

				if (result) {
					nextStep = ((Decision_Option) optionsList.get(i)).getDestination();
					messageVector = new Vector<String>();
					messageVector.add(GuidelineHistoryFrame.UPDATE_STATUS);
					messageVector.add(opt.getName());
					messageVector.add(StatusInfo.STEP_STATUS_COMMITTED);
					guidelineAgent.messageToMonitoring(messageVector, true);

					break;
				} else {
					messageVector = new Vector<String>();
					messageVector.add(GuidelineHistoryFrame.UPDATE_STATUS);
					messageVector.add(opt.getName());
					messageVector.add(StatusInfo.STEP_STATUS_ABORTED);
					guidelineAgent.messageToMonitoring(messageVector, true);
				}
			}

			/*
			 *   Random rand = new Random();
			 *   Guideline_Step nextStep =  ((Decision_Option)optionsList.get((rand.nextInt(listSize)))).getDestination();
			 */

			// there some Decision_Step instances (in GLIF examples) which have null Destinations,
			// so we have to be sure that our random gives us a complete one.
			// TODO: In our instances, we will not let it. There this code will be removed.
			while (nextStep == null) {
				nextStep = caseStep.getDefault_next_step();
				messageVector = new Vector<String>();
				messageVector.add(GuidelineHistoryFrame.UPDATE_STATUS);
				messageVector.add(caseStep.getName() + GuidelineGraph.DEFAULT_STEP_POSTFIX);
				messageVector.add(StatusInfo.STEP_STATUS_COMMITTED);
				guidelineAgent.messageToMonitoring(messageVector, true);
			}

			new GuidelineStepHandler().handle(guidelineAgent, nextStep);
		} catch (Exception exc) {
			exc.printStackTrace();
		}

		//
	}
}
//~ Formatted by Jindent --- http://www.jindent.com

