package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent;

import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import tr.com.srdc.icardea.careplanengine.agents.communication.ontology.consultingOntology.ConsultingMessage;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import tr.com.srdc.icardea.careplanengine.agents.afAgent.EngineInterface;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers.GuidelineHandler;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity;
import tr.com.srdc.icardea.careplanengine.entities.GEHistory;
import tr.com.srdc.icardea.careplanengine.entities.GEHistoryHeader;
import tr.com.srdc.icardea.careplanengine.glmodel.Data_Item;
import tr.com.srdc.icardea.careplanengine.glmodel.Data_Item_List;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline;
import tr.com.srdc.icardea.careplanengine.glmodel.InstanceFactory;
import tr.com.srdc.icardea.careplanengine.glmodel.Synchronization_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.impl.DefaultGuideline;
import tr.com.srdc.icardea.careplanengine.icardeaRepository.GEHistoryRepository;

/**
 * <p></p>
 *
 * @poseidon-object-id [Ia0f8fddm109d522e9f0mm55cf]
 */
public class GuidelineAgent extends Thread {

	/**
	 * <p>Does ...</p>
	 *
	 * @poseidon-object-id [Ia0f8fddm109d522e9f0mm55bc]
	 * @param assignment
	 */
	// This hash table is the Global Variable Pool.
	private Hashtable globalVariablePool = new Hashtable<String, Object>();
	/* Synch Table is used in synchronization steps not to re-process
	 * previously visited steps
	 */
	private Hashtable<String, Integer> synchTable = new Hashtable<String, Integer>();
	private Guideline guideline;
	private String guidelineURI;
	private String patientID;
	private String guideineID;
	private boolean isSubguideline = false;
	//    private boolean isLoop = false;
	private GuidelineAgent parentGuidelineAgent = null;
	private Guideline subguideline = null;
	private AssignmentEntity assignmentEntity = null;
	private Date lastMessageTime = null;
	private Long lastSessionID = 0L;
	private String guidelineAgentID = null;
	private MonitoringInterface monitoringInterface = null;
	private String monitoringPanelID = null;
	public boolean showGUI = true;

	public String getAID() {
		return guidelineAgentID;
	}

	// It is called when engine needs to be executed standalone
	public GuidelineAgent(String guidelineAgentID, String guidelineURI, AssignmentEntity assignmentEntity, Boolean isSubguideline, Guideline subguideline, Long lastSessionID, GuidelineAgent parentGuidelineAgent, boolean showGUI) {
		this.guidelineAgentID = guidelineAgentID;

		this.showGUI = showGUI;
		monitoringInterface = new MonitoringInterface(this, showGUI);

		this.parentGuidelineAgent = parentGuidelineAgent;

		setGuidelineURI(guidelineURI);
		this.setAssignmentEntity(assignmentEntity);
		this.setPatientID("" + assignmentEntity.getPatientEntity().getPcode());
		this.setGuideineID("" + assignmentEntity.getGuidelineEntity().getGuidelineID());
		this.isSubguideline = isSubguideline;
		this.parentGuidelineAgent = parentGuidelineAgent;
		this.subguideline = subguideline;

		/* if(!isSubguideline) {
		lastSessionID = GEHistoryRepository.storeGEHistoryHeader(new GEHistoryHeader(assignmentEntity.getAssignmentID(),new Date()));
		}
		else */
		if (isSubguideline) {
			lastSessionID = lastSessionID;
		}

		if (isSubguideline) {
			monitoringPanelID = monitoringInterface.generateSubguidelineKey(assignmentEntity, (DefaultGuideline) subguideline);
			Vector<String> messageVector = new Vector<String>();
			//messageVector.add(monitoringPanelID);
			messageVector.add(GuidelineHistoryFrame.SUBGUIDELINE_STARTING);
			messageVector.add("" + assignmentEntity.getGuidelineEntity().getGuidelineID());
			messageToMonitoring(messageVector);
		} else {
			if (assignmentEntity.getAssignmentID() != null) {
				monitoringPanelID = assignmentEntity.getAssignmentID().toString();
			}
		}
	}

	public GuidelineAgent(String guidelineAgentID, String guidelineURI, AssignmentEntity assignmentEntity,
		Boolean isSubguideline, Guideline subguideline,
		Long lastSessionID, GuidelineAgent parentGuidelineAgent) {
		this.guidelineAgentID = guidelineAgentID;

		monitoringInterface = new MonitoringInterface(this);

		this.parentGuidelineAgent = parentGuidelineAgent;

		setGuidelineURI(guidelineURI);
		this.setAssignmentEntity(assignmentEntity);
		this.setPatientID("" + assignmentEntity.getPatientEntity().getPcode());
		this.setGuideineID("" + assignmentEntity.getGuidelineEntity().getGuidelineID());
		this.isSubguideline = isSubguideline;
		this.parentGuidelineAgent = parentGuidelineAgent;
		this.subguideline = subguideline;

		/* if(!isSubguideline) {
		lastSessionID = GEHistoryRepository.storeGEHistoryHeader(new GEHistoryHeader(assignmentEntity.getAssignmentID(),new Date()));
		}
		else */
		if (isSubguideline) {
			lastSessionID = lastSessionID;
		}

		if (isSubguideline) {
			monitoringPanelID = monitoringInterface.generateSubguidelineKey(assignmentEntity, (DefaultGuideline) subguideline);
			Vector<String> messageVector = new Vector<String>();
			//messageVector.add(monitoringPanelID);
			messageVector.add(GuidelineHistoryFrame.SUBGUIDELINE_STARTING);
			messageVector.add("" + assignmentEntity.getGuidelineEntity().getGuidelineID());
			messageToMonitoring(messageVector);
		} else {
			if (assignmentEntity.getAssignmentID() != null) {
				monitoringPanelID = assignmentEntity.getAssignmentID().toString();
			}
		}

	}
	/*
	 * Methods related to synch. table
	 */

	/*
	 * method below returns true as long as there are branches to be completed to proceed from the synch. step
	 * when all the brachs are done, method returns false the synch. step proceeds.
	 */
	public synchronized boolean processSynchStep(Synchronization_Step step) {


		if (isStepVisitedBefore(step)) {

			Logger.getLogger(this.getClass()).log(Level.DEBUG, (" Visited before "));

			Integer branchesWaiting = getKeyFromSynchTable(step);
			if (branchesWaiting == 1) {

				removeKeyFromSynchTable(step);
				Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Synch Step:COMPLETED"));
				return false;
			} else {
				putStepToTable(step, branchesWaiting - 1);
				Logger.getLogger(this.getClass()).log(Level.DEBUG, ("branches waiting:" + (branchesWaiting - 1)));
				return true;

			}

		} else {
			String continuation = step.getContinuation().getLogical_expression_of_guideline_step().toString().replace('>', ' ').replace('=', ' ').trim();

			Integer val = Integer.parseInt(continuation);
			if (val > 1) {
				/*
				 * normal case that has more than 1 branches to synchronize
				 *
				 */
				putStepToTable(step, val - 1);

				Logger.getLogger(this.getClass()).log(Level.DEBUG, ("First Visit:Added to Table"));
				return true;
			} /*
			 * extra caution for the abnormal case that might happen that a synch. step which is waiting fr 1 step only
			 */ else {
				return false;
			}
		}

	}

	public synchronized void putStepToTable(Synchronization_Step step, Integer val) {
		try {
			synchTable.put(step.getName2(), val);
			Logger.getLogger(this.getClass()).log(Level.DEBUG, ("INSERTED SUCCESSFULLY"));
			Logger.getLogger(this.getClass()).log(Level.DEBUG, (step.getName2() + synchTable.get(step.getName2())));

		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

	public synchronized Integer getKeyFromSynchTable(Synchronization_Step step) {
		return (Integer) synchTable.get(step.getName2());
	}

	public synchronized boolean isStepVisitedBefore(Synchronization_Step step) {
		return synchTable.containsKey(step.getName2());
	}

	public synchronized void removeKeyFromSynchTable(Synchronization_Step step) {
		synchTable.remove(step.getName2());

	}

	private void initialize(Guideline gl) {

		guideline = gl;

		Data_Item dataItem;

		synchTable = new Hashtable<String, Integer>();

		// Initialize the global variable pool.

		Data_Item_List dataItemList = gl.getData_items();

		Vector dataItems = FactoryRetriever.retrieveDataItems(this.getGuidelineURI(), dataItemList);

		if (dataItems != null) {

			Iterator i = dataItems.iterator();

			for (; i.hasNext();) {
				dataItem = (Data_Item) i.next();
				Logger.getLogger(this.getClass()).log(Level.DEBUG, (dataItem.getName() + " " + dataItem.getName2()));
				globalVariablePool.put(dataItem.getName2(), (Data_Item) dataItem);
			}
		}

		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Finished building the globalVariablePool from Data_Item_List"));

	}

	/**
	 * <p>Does ...</p>
	 * 
	 * @poseidon-object-id [Ia0f8fddm109d522e9f0mm5577]
	 * @param variable 
	 */
	public void storeGlobalVariable(String variable, Object value) {
		//System.out.println("Global Variable Pool:" + globalVariablePool);
		variable = variable.replaceAll("-", "");
		globalVariablePool.put(variable, value);
	}

	public Object getGlobalVariable(String variable) {
		System.gc();
		/*Enumeration keys = globalVariablePool.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			Logger.getLogger(this.getClass()).log(Level.INFO, ("Global Variable Pool has key:" + key));
		}*/
		while (!globalVariablePool.containsKey(variable)) {
			try {
				Logger.getLogger(this.getClass()).log(Level.INFO, ("WAITING FOR MISSING VARIABLE '" + variable + "'"));
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		return globalVariablePool.get(variable);
	}

	public void removeGlobalVariable(String variable) {
		globalVariablePool.remove(variable);
	}

	public void clearGlobalVariablePool() {
		globalVariablePool.clear();
	}

	public Guideline getGuideline() {
		return guideline;
	}

	public String getGuidelineURI() {
		return guidelineURI;
	}

	public void setGuidelineURI(String guidelineURI) {
		this.guidelineURI = guidelineURI;
	}

	// TO BE CHANGED according to showGUI...
	public void messageToMonitoring(Vector<String> messageVector) {
		messageToMonitoring(messageVector, false);
		//if (!showGUI) {
		//EngineInterface.sendMonitoringMessage(getAID(), messageVector.elementAt(1), messageVector.elementAt(2), patientID);
		//}
	}

	public void messageToMonitoring(Vector<String> messageVector, boolean isCompletionStatusMessage) {
		if (isCompletionStatusMessage) {
			//arrangeTime();
		}
		if (messageVector == null) {
			Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Burasi icin msj"));
			if (isSubguideline) {
				informParentGuidelineAboutCompletion();
			} else {
			}
		} else {
			messageVector.add(0, monitoringPanelID);
			messageVector.add("" + new Date().getTime());
			String shouldTerminate = monitoringInterface.processMessageVector(this.getAID(), messageVector);

			GEHistory geHistory = new GEHistory();
			geHistory.setSubguidelineID(monitoringPanelID);
			geHistory.setSessionID(lastSessionID);
			geHistory.setMessageReceivedTime(new Date());
			for (int i = 1; i < messageVector.size() - 1; i++) {
				switch (i) {
					case 1:
						geHistory.setCol1(messageVector.elementAt(1));
						break;
					case 2:
						geHistory.setCol2(messageVector.elementAt(2));
						break;
					case 3:
						geHistory.setCol3(messageVector.elementAt(3));
						break;
					case 4:
						geHistory.setCol4(messageVector.elementAt(4));
						break;
					case 5:
						geHistory.setCol5(messageVector.elementAt(5));
						break;
					case 6:
						geHistory.setCol6(messageVector.elementAt(6));
						break;
					case 7:
						geHistory.setCol7(messageVector.elementAt(7));
						break;
					case 8:
						geHistory.setCol8(messageVector.elementAt(8));
						break;
					case 9:
						geHistory.setCol9(messageVector.elementAt(9));
						break;
				}
			}

			GEHistoryRepository.storeGEHistory(geHistory);
			if (shouldTerminate.trim().equalsIgnoreCase("true")) {
				interrupt();
			}
		}
	}
	// INTERFACE TO MONITORING START
	private Object lock = new Object();
	public String consultMessage = null;

	public String processConsultingMessage(String stepID, ConsultingMessage consultingMessage) {
		Logger.getLogger(this.getClass()).log(Level.INFO, " Show GUI = " + showGUI);
		if (showGUI) {
			monitoringInterface.processConsultingMessage(consultingMessage, this.getAID());
		} else {
			EngineInterface.processConsultingMessage(consultingMessage.getConsultSentence(), this.getAID(), stepID);
		}
		try {
			synchronized (lock) {
				lock.wait();
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		return consultMessage;
	}

	public void informConsultMessage(String command) {
		synchronized (lock) {
			Logger.getLogger(this.getClass()).log(Level.INFO, " Result = " + command);
			consultMessage = command;
			lock.notify();
		}
	}

	// INTERFACE TO MONITORING END
	public void inform(String command) {
		synchronized (lock) {
			lock.notify();
		}
	}

	public void waitForSubguideline() throws InterruptedException {
		synchronized (lock) {
			lock.wait();
		}
	}

	private void informParentGuidelineAboutCompletion() {
		if (!isSubguideline) {
			return;
		}
		parentGuidelineAgent.inform("Subguideline finished executing");
	}

	/**
	 * Put a delaying time between steps in order to make the guideline flow more user friendly
	 */
	public void arrangeTime() {
	}

	/** this part is commented out since threads are active to implement parallel steps[itasyurt 5.04.06]
	 * /////////////  to append parallely running sub-behaviours  to
	 * public void addParallelSubBehaviour(Behaviour b) {
	 *
	 * mainBehaviour.addSubBehaviour(b);
	 * }
	 */
	public int getCount() {
		return this.globalVariablePool.size();
	}

	public boolean isSubguideline() {
		return isSubguideline;
	}

	public void run() {
		try {
			System.out.println("GUIDELINE RUN START");
			if (!isSubguideline) {
				lastSessionID = GEHistoryRepository.storeGEHistoryHeader(new GEHistoryHeader(assignmentEntity.getAssignmentID(), new Date()));
			}

			String uri = getGuidelineURI();
			System.out.println(" $$$ URI:" + uri);
			InstanceFactory instanceFactory = InstanceFactory.getInstance(uri);
			clearGlobalVariablePool();

			Vector<Guideline> guidelinesVec;

			guidelinesVec = instanceFactory.createGuidelines();

			DefaultGuideline gl;

			gl = (DefaultGuideline) guidelinesVec.get(0);

			initialize(gl);
			//                if(gl.hasIntention()){
			//                    String intention = gl.getIntention();
			//                    isLoop = (intention!=null) && intention.trim().equalsIgnoreCase("LOOP");
			//                }

			new GuidelineHandler().handle(this, gl);
			//                isFirstCycle = false;
			//                long sleeptime = 5 * 1000;
			//                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Waiting " + (sleeptime/1000) + " seconds before next execution of guideline");
			//                Thread.sleep(sleeptime);
			System.out.println("GUIDELINE RUN END");
		} catch (Exception exc) {
			exc.printStackTrace();

		}

	}

	public String getGuideineID() {
		return guideineID;
	}

	public void setGuideineID(String guideineID) {
		this.guideineID = guideineID;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public AssignmentEntity getAssignmentEntity() {
		return assignmentEntity;
	}

	public void setAssignmentEntity(AssignmentEntity assignmentEntity) {
		this.assignmentEntity = assignmentEntity;
	}

	/**
	 * @return the lastSessionID
	 */
	public Long getLastSessionID() {
		return lastSessionID;
	}

	/**
	 * @param lastSessionID the lastSessionID to set
	 */
	public void setLastSessionID(Long lastSessionID) {
		this.lastSessionID = lastSessionID;
	}
	//    public boolean isFirstCycle() {
	//        return isFirstCycle;
	//    }

	public void storeGlobalVariableObjectValue(String variable_name, Object object) {
		globalVariablePool.put(variable_name + "-Object", object);
	}

	public Object getGlobalVariableObjectValue(String variable) {
		System.gc();
		/*Enumeration keys = globalVariablePool.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			Logger.getLogger(this.getClass()).log(Level.INFO, ("Global Variable Pool has key:" + key));
		}*/
		while (!globalVariablePool.containsKey(variable + "-Object")) {
			try {
				Logger.getLogger(this.getClass()).log(Level.INFO, ("WAITING FOR MISSING VARIABLE '" + variable + "-Object" + "'"));
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		return globalVariablePool.get(variable + "-Object");
	}
}
