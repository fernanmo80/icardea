package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.glmodel.*;
import tr.com.srdc.icardea.careplanengine.glmodel.impl.*;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
//~--- JDK imports ------------------------------------------------------------

import java.util.Vector;

/**
 * <p></p>
 *
 *
 * @poseidon-object-id [I14fcf14m109d9b01fb5mm606d]
 */
public class GuidelineHandler {

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I14fcf14m109d9b01fb5mm6018]
	 * @param root
	 * @param guideline
	 */
	// TODO: Guideline'a guideline agent'dan da ulasilabiliyor, ikisi gereksiz , duzeltilebilir
	public void handle(GuidelineAgent guidelineAgent, Guideline guideline) {

		// your code here
		try {

			// handles eligibility criteria
			Vector eligibilityList;

			eligibilityList = (Vector) FactoryRetriever.retrieveEligibilityCriteria(guidelineAgent.getGuidelineURI(),
				guideline);

			int listSize = eligibilityList.size();

			for (int i = 0; i < listSize; ++i) {
				DefaultCriterion criterion;

				criterion = (DefaultCriterion) eligibilityList.get(i);

				EligibilityCriteriaHandler eligibilityHandler = new EligibilityCriteriaHandler();

				// TODO: Use the result of evaluating the eligibility criteria.
				Boolean result = eligibilityHandler.handle(guidelineAgent, null, criterion);
				System.out.println("Result of evaluation:" + result);
				if (!result) {
					Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Eligibility Criteria failed to be fulfilled."));
					Logger.getLogger(this.getClass()).log(Level.DEBUG, ("GuidelineAgent stopping now."));

					return;
				}

				Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Eligibility:" + criterion.getName2()));
				Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Result of the criteria is: " + result));
			}

			// handles algorithm
//          if(!guidelineAgent.isSubguideline()){
//            if(!guidelineAgent.isFirstCycle()){
//                Vector<String> monitoringMessage = new Vector<String>();
//                monitoringMessage.add(GuidelineHistoryFrame.NEW_CYCLE_STARTING);
//                guidelineAgent.messageToMonitoring(monitoringMessage);
//            }
//            }
			System.out.println("ALGORITHM HANDLE START");
			DefaultAlgorithm guidelineAlgorithm;

			guidelineAlgorithm = (DefaultAlgorithm) guideline.getAlgorithm();

			AlgorithmHandler algorithmHandler = new AlgorithmHandler();

			algorithmHandler.handle(guidelineAgent, guidelineAlgorithm);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}


//~ Formatted by Jindent --- http://www.jindent.com

