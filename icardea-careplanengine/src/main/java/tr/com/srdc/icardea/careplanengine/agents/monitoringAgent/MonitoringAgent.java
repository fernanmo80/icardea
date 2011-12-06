package tr.com.srdc.icardea.careplanengine.agents.monitoringAgent;

import java.awt.Dimension;
import java.io.IOException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.util.Vector;
import java.util.HashMap;
import java.io.StringReader;

import javax.swing.*;

import org.apache.xerces.parsers.DOMParser;
import org.xml.sax.InputSource;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import tr.com.srdc.icardea.careplanengine.agents.communication.ontology.consultingOntology.ConsultingMessage;
import tr.com.srdc.icardea.careplanengine.agents.gui.MonitoringGUI;
import tr.com.srdc.icardea.careplanengine.agents.gui.PatientPanel;
import tr.com.srdc.icardea.careplanengine.agents.gui.SwingWorker;
import tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI.MedicationPanel;
import tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI.ObservationTextValuePanel;
import tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI.ObservationIndexValuePanel;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.MonitoringInterface;
import tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity;
import tr.com.srdc.icardea.careplanengine.entities.GEHistory;
import tr.com.srdc.icardea.careplanengine.entities.GEHistoryHeader;
import tr.com.srdc.icardea.careplanengine.entities.HistoryAssignmentEntity;
import tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageEntity;
import tr.com.srdc.icardea.careplanengine.entities.StatusInfo;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.ObservationEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.MedicationEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.TextValueEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.IndexEntity;
import tr.com.srdc.icardea.careplanengine.icardeaRepository.GEHistoryRepository;
import tr.com.srdc.icardea.careplanengine.icardeaRepository.AssignmentRepository;

/**
 * <p></p>
 *
 *
 * @poseidon-object-id [Im5d7883afm109d4db7131mm4eb1]
 */
public class MonitoringAgent {

	public static final int EXECUTE_GUIDELINE = 0;
	public static final int SEND_CONSULTING_RESULT = 1;
	public static final int TERMINATE_GUIDELINE_EXECUTION = 2;
	private static HashMap<String, Boolean> tobeTerminateds = new HashMap<String, Boolean>();
	private MonitoringGUI monitoring_gui = null;
	public static Logger logger = Logger.getLogger(MonitoringAgent.class);

	public MonitoringGUI getMonitoring_gui() {
		return monitoring_gui;
	}
	private static MonitoringAgent instance = null;
	public boolean showGUI = true;

	private MonitoringAgent(boolean showGUI) {
		this.showGUI = showGUI;
		
		setup();
	}

	public static MonitoringAgent getInstance(boolean showGUI) {
		if (instance == null) {
			instance = new MonitoringAgent(showGUI);
		}
		return instance;
	}

	public static MonitoringAgent getInstance() {
		if (instance == null) {
			instance = new MonitoringAgent(true);
		}
		return instance;
	}

	protected void setup() {
		try {
			UIManager.setLookAndFeel(new com.jgoodies.looks.windows.WindowsLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		try {
			monitoring_gui = new MonitoringGUI(this);
			if (showGUI) {
				monitoring_gui.setVisible(true);
			}
			initialize();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void initialize() throws Exception {
		//monitoring_gui.showProgressDialog("Retrieving patient-guideline assignments...");
		retrieveAssignments();
		initExecutedGuidelineTable();
		monitoring_gui.hideProgressDialog();
	}

	public Vector<AssignmentEntity> retrieveAssignments() {
		Vector<AssignmentEntity> assignments = AssignmentRepository.retrieveApprovedAssignmentEntities();

		monitoring_gui.updateAssignmentList(assignments);

		return assignments;
	}

	protected Vector<HistoryAssignmentEntity> retrieveExecutedAssignments() {
		Vector<GEHistoryHeader> headers = GEHistoryRepository.retrieveAllGEHistoryHeaders();
		Vector<HistoryAssignmentEntity> executedAssignments = GEHistoryRepository.retrieveAssignmentEntitiesByID(headers);
		return executedAssignments;
	}

	public void initExecutedGuidelineTable() {
		Vector<HistoryAssignmentEntity> assignments = retrieveExecutedAssignments();
		monitoring_gui.updateExecutedAssignmentsList(assignments);
	}

	//TODO: [OG] set parameters of this function
	public void executeGuideline(final AssignmentEntity assignment) throws Exception {
		if (assignment == null) {
			throw new Exception("Selected assignment is null. Cannot perform guideline execution!");
		}

		if (assignment.getStatus() == StatusInfo.GUIDELINE_STATUS_APPROVED_CODE) {
			Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Executing Guideline..."));
			MonitoringInterface.createGuidelineAgent(assignment);
		}
	}

	public void suspendGuidelineExecution(final AssignmentEntity assignment) throws Exception {
		if (assignment == null) {
			throw new Exception("Selected assignment is null. Cannot perform guideline execution!");
		}

		tobeTerminateds.put(assignment.getAssignmentID().toString(), true);
	}

	public void executeHistoryGuideline(HistoryAssignmentEntity historyAssignmentEntity) {
		BackgroundWorker worker = new BackgroundWorker(historyAssignmentEntity);
		worker.start();
	}

	public void showObservationGUI(ObservationEntity obs, String guidelineAgent,
		String inputName, String consultSentence,
		String patientName, String patientID) {
		JFrame consultingGUI = new JFrame();
		consultingGUI.setTitle("Observation Consulting Window for " + inputName);
		//consultingGUI.setBounds(10,10,600,600);
		JPanel observationPanel;
		if (obs.getValue() instanceof TextValueEntity) {
//            new ObservationPanel(consultingGUI,obs,this,senderAID);
			logger.info("***********TextValueEntity*********");
			observationPanel = new ObservationTextValuePanel(consultingGUI, obs, this, guidelineAgent,
				consultSentence, patientName, patientID);
		} else if (obs.getValue() instanceof IndexEntity) {
			logger.info("***********IndexEntity*********");
			observationPanel = new ObservationIndexValuePanel(consultingGUI, obs, this, guidelineAgent,
				consultSentence, patientName, patientID);
		} else {
			logger.info("***********else*********");
//            JOptionPane.showMessageDialog(null, "NOT textvalue NOT indexvalue");
			observationPanel = new JPanel();
		}

		JScrollPane scrollBar = new JScrollPane(observationPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		consultingGUI.setContentPane(scrollBar);
		consultingGUI.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		consultingGUI.pack();
		consultingGUI.setLocationRelativeTo(monitoring_gui.getMainTabbedPane());
		consultingGUI.setVisible(true);
		consultingGUI.pack();
	}

	public void showMedicationGUI(MedicationEntity med, String guidelineAgent, String inputName) {
		JFrame consultingGUI = new JFrame();

		consultingGUI.setTitle("Medication Consulting Window for " + inputName);
		consultingGUI.setBounds(10, 10, 600, 600);
		consultingGUI.setContentPane(new MedicationPanel(consultingGUI, med, this, guidelineAgent));
		consultingGUI.setVisible(true);
	}

	public void informConsultResult(String guidelineAgent, String result) {
		MonitoringInterface.informConsultMessage(guidelineAgent, result);
	}
	/**
	 * <p>Represents ...</p>
	 *
	 *
	 * @poseidon-object-id [Im5d7883afm109d4db7131mm4e99]
	 * @return
	 */
	MonitoringMessageEntity monitoringMessage;

	public MonitoringMessageEntity getMonitoringMessage() {
		return monitoringMessage;
	}

	/**
	 * <p>Represents ...</p>
	 *
	 *
	 * @poseidon-object-id [Im5d7883afm109d4db7131mm4e91]
	 * @param monitoringMessage
	 */
	public void setMonitoringMessage(MonitoringMessageEntity monitoringMessage) {
		this.monitoringMessage = monitoringMessage;
	}

	Object showHistoryExecutionInBackground(HistoryAssignmentEntity historyAssignmentEntity) {

		Vector<GEHistory> historyElements = GEHistoryRepository.retrieveGEHistoryBySessionID(historyAssignmentEntity.getSessionID());
		try {
			int counter = 0;
			Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Size " + (historyElements.size())));
			while (counter < historyElements.size()) {
				GEHistory currentHistoryEntity = historyElements.elementAt(counter);
				Vector<String> stepInfo = currentHistoryEntity.history2content();
				/*	for (int j = 0; j < stepInfo.size(); j++) {
				String s = stepInfo.elementAt(j);
				Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("--" + s);
				}
				 */
				Logger.getLogger(this.getClass()).log(Level.DEBUG, ("i " + counter));
				String sessionID = stepInfo.get(0);
				String isStatus = stepInfo.get(1);
				String guidelineStep = stepInfo.get(2);
				PatientPanel patientPanel = monitoring_gui.getHistoryGraphs().get(sessionID);
				if (patientPanel.historyState) {
					if (stepInfo.size() > 3) {
						String info = stepInfo.get(3);
						if (isStatus.equals(GuidelineHistoryFrame.UPDATE_STATUS)) {
							monitoring_gui.updateHistoryStatus(sessionID, guidelineStep, info);
						} else if (isStatus.equals(GuidelineHistoryFrame.DISPLAY_INFO)) {
							monitoring_gui.displayHistoryInfo(sessionID, guidelineStep, info, stepInfo.get(4));
						} else if (isStatus.equals(GuidelineHistoryFrame.SUBGUIDELINE_STARTING)) {
							monitoring_gui.showHistorySubguideline(sessionID, stepInfo.elementAt(stepInfo.size() - 2), true);
						} else {
							monitoring_gui.addHistoryHistoryEvent(sessionID, stepInfo);
						}
					}
					if (Thread.interrupted()) {
						throw new InterruptedException();
					}

					Thread.sleep(1);
					counter++;
				}
			}
		} catch (InterruptedException e) {

			return "Interrupted";  // SwingWorker.get() returns this
		}
		return "All Done";         // or this
	}

	public synchronized String processMessageVector(String guidelineAgent, Vector<String> stepInfo) {
		String assignmentID = stepInfo.get(0);
		String isStatus = stepInfo.get(1);
		String guidelineStep = stepInfo.get(2);
		if (isStatus.equals(GuidelineHistoryFrame.UPDATE_STATUS)) {
			monitoring_gui.updateStatus(assignmentID, guidelineStep, stepInfo.get(3));
		} else if (isStatus.equals(GuidelineHistoryFrame.DISPLAY_INFO)) {
			monitoring_gui.displayInfo(assignmentID, guidelineStep, stepInfo.get(3), stepInfo.get(4));
		} else if (isStatus.equals(GuidelineHistoryFrame.SUBGUIDELINE_STARTING)) {
			monitoring_gui.showSubguideline(assignmentID, true);
			// do the syncronization
//                                send(msg.createReply());
		} else if (isStatus.equals(GuidelineHistoryFrame.CYCLE_COMPLETED)) {
			monitoring_gui.cycleCompleted(assignmentID, stepInfo.get(2));
			monitoring_gui.addHistoryEvent(assignmentID, stepInfo);
		} else if (isStatus.equals(GuidelineHistoryFrame.NEW_CYCLE_STARTING)) {
			monitoring_gui.newCycleStarting(assignmentID, stepInfo.get(2));
		} else {
			monitoring_gui.addHistoryEvent(assignmentID, stepInfo);
//                                }
		}
		boolean shouldExit = tobeTerminateds.containsKey(assignmentID);
		if (shouldExit) {
			tobeTerminateds.remove(assignmentID);
		}

		return "" + shouldExit;
	}

	public synchronized void processConsultingMessage(ConsultingMessage message, String guidelineAgent) {
		DOMParser parser = new DOMParser();
		try {
			parser.parse(new InputSource(new StringReader(message.getMessageContent())));
		} catch (SAXException ex) {
		} catch (IOException ex) {
		}
		Document doc = parser.getDocument();
		Node root = doc.getFirstChild();

		if (root.getNodeName().equals("Observation")) {
			ObservationEntity obs = new ObservationEntity();
			obs.fromXmlElement((Element) root);
			showObservationGUI(obs, guidelineAgent, message.getInputName(), message.getConsultSentence(),
				message.getPatientName(), message.getPatientID());
		} else if (root.getNodeName().equals("Medication")) {
			MedicationEntity med = new MedicationEntity();
			med.fromXmlElement((Element) root);
			showMedicationGUI(med, guidelineAgent, message.getInputName());
		}
	}

	public class BackgroundWorker extends SwingWorker {

		private HistoryAssignmentEntity temp;

		BackgroundWorker(HistoryAssignmentEntity historyAssignment) {
			temp = historyAssignment;
		}

		public Object construct() {
			return showHistoryExecutionInBackground(temp);
		}

		public void finished() {
		}
	}
}
