package tr.com.srdc.icardea.careplanengine.alarmSystem;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.alarmSystem.alarmOntology.AlarmMessage;


public class AlarmMessageHandler {

	private static AlarmMessageHandler instance = null;

	public static AlarmMessageHandler getInstance() {
		if(instance == null) {
			instance = new AlarmMessageHandler();
		}
		return instance; 
	}

	public synchronized void action(AlarmMessage message) {
		HPAAlarmHandlerThread handler = new HPAAlarmHandlerThread(message);

		handler.start();
	}
}


//~ Formatted by Jindent --- http://www.jindent.com

