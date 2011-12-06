package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

//~--- non-JDK imports --------------------------------------------------------
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.*;
import tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageEntity;
import tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageType;
import tr.com.srdc.icardea.careplanengine.glmodel.*;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * <p></p>
 *
 *
 *
 */
public class GetDataActionHandler {

	/**
	 * <p>Does ...</p>
	 *
	 *
	 *
	 * @param root
	 * @param getDataAction
	 */
	public void handle(GuidelineAgent guidelineAgent, Guideline_Step guidelineStep, Get_Data_Action getDataAction) {

		// your code here
		try {
			MonitoringMessageEntity messageEntity = null;

			// Logger.getLogger(this.getClass()).log(Level.INFO, ("GetDataAction:"+ getDataAction.getName2());
			// TODO:Message to Monitoring in the beginning
			// Logger.getLogger(this.getClass()).log(Level.INFO, ("TODO:Message to Monitoring in the beginning");

			if (guidelineStep != null) {
				messageEntity = new MonitoringMessageEntity();
				messageEntity.setStepName(guidelineStep.getName2());
				messageEntity.setType(MonitoringMessageType.getGetDataActionType());

				// messageEntity.setMonitoringInfo("Entered GetDataAction");
			}
			if (guidelineStep != null)
				System.out.println("GUIDELINE STEP NAME:" + guidelineStep.getName2());

			Logger.getLogger(this.getClass()).log(Level.INFO, ("Variable Name:" + getDataAction.getVariable_name()));

			// TODO: handle EMR or Sensor Entity, put the results in global variable pool
			Data_Entity dataEntity = FactoryRetriever.retrieveEntity(guidelineAgent.getGuidelineURI(),
				getDataAction.getData_source_type());

			if (dataEntity instanceof EHR_Entity) {
				Logger.getLogger(this.getClass()).log(Level.INFO, ("TODO:Handle EMR Entity"));

				RetrieveEHRHandler ehrHandler = new RetrieveEHRHandler();

				ehrHandler.retrieveEHRData(guidelineAgent, guidelineStep, (EHR_Entity) dataEntity, getDataAction);
			} else if (dataEntity instanceof Sensor_Entity) {
				Logger.getLogger(this.getClass()).log(Level.INFO, ("TODO:Handle Sensor_Entity"));

				SensorHandler sensorHandler = new SensorHandler();

				// / burasi void mi olacak??

				/* Data_Item dataItem= */
				sensorHandler.retrieveSensorData(guidelineAgent, guidelineStep, (Sensor_Entity) dataEntity,
					getDataAction);

				// guidelineAgent.storeGlobalVariable(dataItem.getName2(),dataItem);
			}

			// TODO:Message to Monitoring at the end
			// Logger.getLogger(this.getClass()).log(Level.INFO, ("TODO:Message to Monitoring at the end");
			if (guidelineStep != null) {
				messageEntity.setStepName(guidelineStep.getName2());
				messageEntity.setType(MonitoringMessageType.getGetDataActionType());
				messageEntity.setMonitoringInfo("Exiting GetDataAction");
			}

			// else there is no GuidelineStep associated with the caller. For
			// example, it may be an EligibilityCriteria.
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}


//~ Formatted by Jindent --- http://www.jindent.com

