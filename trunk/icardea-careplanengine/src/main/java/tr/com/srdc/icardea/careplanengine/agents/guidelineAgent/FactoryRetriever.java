package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.glmodel.*;
import tr.com.srdc.icardea.careplanengine.glmodel.impl.DefaultGuideline;

//~--- JDK imports ------------------------------------------------------------

import java.util.Vector;

public class FactoryRetriever {

	/**
	 * @param args
	 */
//  public static final String TEMP_SCUBGL = "http://144.122.230.15/gl/SCUBGuidelineDemo.owl";
	public static Guideline_Step retrieveStep(String uri, Guideline_Step aGuidelineStep) {

		// Logger.getLogger(this.getClass()).log(Level.DEBUG, (guideline.toString());
//      String uri="file:///"+System.getProperty("user.dir").replace('\\','/')+uriend;
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getStep(aGuidelineStep);

		// it was unnecessary to get all the steps and search using Name2, the code above is simple
		// also handles the steps having same names

		/*
		 * Vector guidelineSteps = instanceFactory.getAlgoSteps(guideline);
		 * try {
		 * int size= guidelineSteps.size();
		 * //Logger.getLogger(this.getClass()).log(Level.DEBUG, (size);
		 * for(int i=0;i<size;++i) {
		 *     DefaultGuideline_Step currentStep=(DefaultGuideline_Step) guidelineSteps.get(i);
		 *     if (currentStep.getName2().equals(aGuidelineStep.getName2())) {
		 *
		 *         return currentStep;
		 *
		 *
		 *     }
		 * }
		 *
		 * }
		 * catch(Exception exc) {
		 *     exc.printStackTrace();
		 *
		 * }
		 *
		 * return null;
		 */
	}

	public static Vector retrieveTasks(String uri, Action_Step actionStep) {

//      String uri="file:///"+System.getProperty("user.dir").replace('\\','/')+uriend;
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getActionTasks(actionStep);
	}

	public static Medical_Action_Entity retrieveMedicalActionEntity(String uri, Medical_Action_Entity maEntity) {

//      String uri="file:///"+System.getProperty("user.dir").replace('\\','/')+uriend;
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getMedicalActionEntity(maEntity);
	}

	public static Vector retrieveEligibilityCriteria(String uri, Guideline guideline) {

//      String uri="file:///"+System.getProperty("user.dir").replace('\\','/')+uriend;
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getEligibilityCriteria(guideline);
	}

	public static Data_Entity retrieveEntity(String uri, Data_Entity dataEntity) {

//      String uri="file:///"+System.getProperty("user.dir").replace('\\','/')+uriend;
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getEntity(dataEntity);
	}

	public static Nestable retrieveNestable(String uri, Nestable nestable) {

//      String uri="file:///"+System.getProperty("user.dir").replace('\\','/')+uriend;
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getNestable(nestable);
	}

	// Static method to retrieve the data item value of a data item. [ts]
	public static Object retrieveDataItemValue(String uri, Data_Item dataItem) {

//      String uri="file:///"+System.getProperty("user.dir").replace('\\','/')+uriend;
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getDataItemValue(dataItem);
	}

	// Static method to retrieve the data item list object. [ts]
	public static Vector retrieveDataItems(String uri, Data_Item_List dataItemList) {

//      String uri="file:///"+System.getProperty("user.dir").replace('\\','/')+uriend;
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getDataItems(dataItemList);
	}

	// // retrieves the instance of a Data_Item
	public static Data_Item retrieveDataItem(String uri, Data_Item dataItem) {

//      String uri="file:///"+System.getProperty("user.dir").replace('\\','/')+uriend;
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getDataItem(dataItem);
	}

	// / retrieves the Observation_Value instance [itasyurt 24.04.06]
	public static Observation_Value retrieveObservationValue(String uri, Observation_Value val) {

//      String uri="file:///"+System.getProperty("user.dir").replace('\\','/')+uriend;
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getObservationValue(val);
	}

	public static String retrieveDisplayName(String uri, String uniqueName) {

//      String uri="file:///"+System.getProperty("user.dir").replace('\\','/')+uriend;
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getDisplayName(uniqueName);
	}

	public static Case_Condition retrieveCase_condition(String uri, Decision_Option option) {

//      String uri="file:///"+System.getProperty("user.dir").replace('\\','/')+uriend;
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getObservationValue(option);
	}

	public static Guideline_Expression retrieveExpression(String uri, Guideline_Expression expr) {
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);

		return instanceFactory.getConditionValue(expr);
	}

	public static DefaultGuideline getGuideline(String uri, String guidelineName) {
		System.out.println("******************************************");
		System.out.println(uri + "***" + guidelineName);
		InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);
		DefaultGuideline guideline = null;
		Vector<Guideline> guidelines = instanceFactory.createGuidelines();
		System.out.println(guidelines.size());
		for (int i = 0; i < guidelines.size(); i++) {
			Guideline guideline1 = guidelines.elementAt(i);
			System.out.println(" Available guidelines:" + guideline1.getName());

			if (guideline1.getName().equals(guidelineName)) {
				guideline = (DefaultGuideline) guideline1;

				break;
			}
		}
		if (guideline == null) {
			System.out.println("GuideLine is NULL!!");
		}
		return guideline;
	}
}


//~ Formatted by Jindent --- http://www.jindent.com
