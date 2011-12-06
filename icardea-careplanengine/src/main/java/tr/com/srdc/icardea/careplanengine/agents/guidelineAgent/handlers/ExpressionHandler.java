package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.FactoryRetriever;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.GuidelineAgent;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.JavaScriptExpressionExecuter;
import tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageEntity;
import tr.com.srdc.icardea.careplanengine.glmodel.*;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline_Step;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
//~--- JDK imports ------------------------------------------------------------


import java.util.Hashtable;
import java.util.Iterator;

/* Gunes ALUC, SRDC, 05 June 2007 *******************/
/*  extension to enable the Monitoring Agent/GUI ****/
/*  view the values with which the javascript *******/
/*  function is called. *****************************/
import java.util.Set;
import java.util.Vector;

/* END-OF-EXTENSION *********************************/
/**
 * <p></p>
 *
 *
 * @poseidon-object-id [Ia0f8fddm109d522e9f0mm5482]
 */
public class ExpressionHandler {

	/**
	 * <p>Does ...</p>
	 * @param guidelineStep
	 *
	 *
	 * @poseidon-object-id [I14fcf14m109d9b01fb5mm5d82]
	 * @param parentGuidelineStepName
	 * @param expression
	 * @param guidelineURI
	 */
	public Object handle(GuidelineAgent agent, Guideline_Step guidelineStep, String expression, String guidelineURI) {
		MonitoringMessageEntity messageEntity;

		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Expression Handler: " + expression));

		// TODO: Message to Monitoring in the beginning

		/*
		 *  messageEntity = new MonitoringMessageEntity();
		 *  if (guidelineStep != null) {
		 *  messageEntity.setName(guidelineStep.getName2());
		 *  }
		 *  else {
		 *  messageEntity.setName("Eligibility Handler Expression");
		 *  }
		 *  messageEntity.setType("Expression Handler");
		 *  messageEntity.setMonitoringInfo("Starting expression handler.");
		 */

		// Send the message.

		Hashtable parameters = JavaScriptExpressionExecuter.getJavaScriptExpressionParameters(agent,
			expression);
		JavaScriptExpressionExecuter executer = new JavaScriptExpressionExecuter(guidelineURI);
		System.out.println("EXpression:" + expression);
		Object result = executer.executeExpression(expression, parameters);

		// TODO:
		// Add a monitoring message. AND send it [ts].
		// messageEntity.setMonitoringInfo("Finishing expression handler. Result of the expression is: " + result);

		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("SCRIPT RESULT!!!!:" + result));

		// / [itasyurt 17.08.06] temporary monitoring message  passing method
		// TODO: Change it or die!!!
		Vector<String> messageVector = new Vector<String>();
		messageVector.add(GuidelineHistoryFrame.EXPRESSION_EVALUATED);
		try {
			messageVector.add(guidelineStep.getName());
		} catch (Exception exc) {
			messageVector.add("Eligibility");
		}
		messageVector.add(expression);
		messageVector.add("" + result);

		/* Gunes ALUC, SRDC, 05 June 2007 ****************** */
		/* extension to enable the Monitoring Agent/GUI *** */
		/* view the values with which the javascript ****** */
		/* function is called. **************************** */
		Set parametersSet = parameters.keySet();
		Iterator parametersItr = parametersSet.iterator();
		String nameValuePairs = "";

		while (parametersItr.hasNext()) {
			String argumentName = (String) parametersItr.next();
			Object object = parameters.get(argumentName);
			String valueStr = "";

			if (object instanceof Observation) {
				Observation obs = (Observation) object;

				if (obs.hasValue()) {
					Observation_Value val = FactoryRetriever.retrieveObservationValue(agent.getGuidelineURI(),
						obs.getValue());

					if (val instanceof Text_Value) {
						valueStr = ((Text_Value) val).getText();
					} else if (val instanceof Index) {
						valueStr = new String(Float.toString((((Index) val).getIndex())));
					}
				}
				System.out.println("VALUESTR:****" + valueStr + "****");
				nameValuePairs = nameValuePairs + argumentName + " : " + valueStr + " \n ";
			}
		}

		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("=== current value of input arguments ====="));
		Logger.getLogger(this.getClass()).log(Level.DEBUG, (nameValuePairs));
		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("=========================================="));
		messageVector.add(nameValuePairs);

		/* END-OF-EXTENSION ******************************** */
		agent.messageToMonitoring(messageVector);

		return result;
	}
}
//~ Formatted by Jindent --- http://www.jindent.com

