package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.glmodel.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.*;

/**
 * <p></p>
 *
 *
 */
public class ChoiceStepHandler {

	/**
	 * <p>Does ...</p>
	 *
	 * @param Root
	 * @param decisionStep
	 */
	public void handle(GuidelineAgent guidelineAgent, Choice_Step choiceStep) {

		// TODO: choice step'in ici
		// rule in rule outlara gore, optionlardan birisini sececek
		// fakat su anda random birini seciyor
		// The decision_detail attribute may have a subguideline.
		// If there is, according to GLIF specs, it should be executed
		// before the decision criterion of this step
		if (choiceStep.getDecision_detail() != null) {

			// create a new guideline handler
			// decision_detai's type is Nestable in fact, but it is casted to Guideline
			// TODO: If necessary, Macro case will also be handled.
			Nestable nestable = FactoryRetriever.retrieveNestable(guidelineAgent.getGuidelineURI(),
				choiceStep.getDecision_detail());

			if (nestable instanceof Guideline) {
				new GuidelineHandler().handle(guidelineAgent, (Guideline) nestable);
			} else if (nestable instanceof Macro) {
				// TODO: if necessary, it will be implemented.
			}
		}

		try {
			ArrayList optionsList = (ArrayList) choiceStep.getOptions();
			int listSize = optionsList.size();

			/*
			 *   for(int i=0;i<listSize;++i) {
			 *           //Logger.getLogger(this.getClass()).log(Level.DEBUG, (optionsList.get(i).getClass().getName());
			 *           Decision_Option  currentOption = (Decision_Option) optionsList.get(i);
			 *           Logger.getLogger(this.getClass()).log(Level.DEBUG, (currentOption.getDestination().getClass().getName());
			 *
			 *   }
			 */
			Random rand = new Random();
			Guideline_Step nextStep = ((Decision_Option) optionsList.get((rand.nextInt(listSize)))).getDestination();

			// there some Decision_Step instances (in GLIF examples) which have null Destinations,
			// so we have to be sure that our random gives us a complete one.
			// TODO: In our instances, we will not let it. There this code will be removed.
			while (nextStep == null) {
				nextStep = ((Decision_Option) optionsList.get((rand.nextInt(listSize)))).getDestination();
			}

			new GuidelineStepHandler().handle(guidelineAgent, nextStep);
		} catch (Exception exc) {
			exc.printStackTrace();
		}

		//
	}
}


//~ Formatted by Jindent --- http://www.jindent.com

