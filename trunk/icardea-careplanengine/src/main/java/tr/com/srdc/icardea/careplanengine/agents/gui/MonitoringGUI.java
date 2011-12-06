package tr.com.srdc.icardea.careplanengine.agents.gui;

import tr.com.srdc.icardea.careplanengine.agents.gui.graph.ShowSubguidelineEvent;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.ShowSubguidelineEventListener;
import tr.com.srdc.icardea.careplanengine.agents.gui.util.IndeterminateProgressDialog;
import tr.com.srdc.icardea.careplanengine.agents.gui.util.ProgressBarListener;
import tr.com.srdc.icardea.careplanengine.agents.gui.util.TimeBasedProgressDialog;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.FactoryRetriever;
import tr.com.srdc.icardea.careplanengine.agents.monitoringAgent.MonitoringAgent;
import tr.com.srdc.icardea.careplanengine.entities.*;
import tr.com.srdc.icardea.careplanengine.glmodel.impl.DefaultGuideline;
import tr.com.srdc.icardea.careplanengine.icardeaRepository.AssignmentRepository;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.*;

/**
 * <p></p>
 *
 *
 * @poseidon-object-id [I8b7250m109bbca6579mm7190]
 */
public class MonitoringGUI extends javax.swing.JFrame implements ProgressBarListener, ShowSubguidelineEventListener {

	private MonitoringAgent myAgent = null;
	private Vector<AssignmentEntity> assignments = null;
	private Vector<HistoryAssignmentEntity> executedAssignments = null;
	private TimeBasedProgressDialog timeBasedProgressDialog = null;
//	private PatientPanel lastPatient = null; // = new PatientPanel();
	private Hashtable<String, PatientPanel> guidelineGraphs = new Hashtable<String, PatientPanel>();
	private Hashtable<String, PatientPanel> historyGraphs = new Hashtable<String, PatientPanel>();
	private Hashtable<String, ShowSubguidelineEvent> showSubguideline = new Hashtable<String, ShowSubguidelineEvent>();
	private IndeterminateProgressDialog progressDialog = null;
//	private Hashtable<String, PatientPanel> subguidelineMap = new Hashtable<String, PatientPanel>();
	private static MonitoringGUI instance = null;
	public static long ONE_HOUR = 1000 * 60 * 60;

	public static MonitoringGUI getInstance() {
		return instance;
	}

	/**
	 * Creates new form AFGUI
	 */
	public MonitoringGUI(MonitoringAgent ma) {
		super("Monitoring GUI");
		instance = this;
		myAgent = ma;
		initComponents();
		this.setLocationRelativeTo(null);
		mainTabbedPane.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent mouseEvent) {
				int selectedIndex = mainTabbedPane.getSelectedIndex();
				if (mouseEvent.getClickCount() == 2 && selectedIndex > 0) {   //do not close the first tab
					((PatientPanel) mainTabbedPane.getComponentAt(selectedIndex)).setIndex(-1);
					mainTabbedPane.remove(selectedIndex);
					for (int i = selectedIndex; i < mainTabbedPane.getTabCount(); i++) {
						((PatientPanel) mainTabbedPane.getComponentAt(i)).setIndex(i);
					}
				}
			}
		});

		pairTable.getSelectionModel().addListSelectionListener(
			new ListSelectionListener() {

				public void valueChanged(ListSelectionEvent listSelectionEvent) {
					if (listSelectionEvent.getValueIsAdjusting()) {
						return;
					}

					ListSelectionModel lsm = (ListSelectionModel) listSelectionEvent.getSource();
					if (lsm.isSelectionEmpty()) {
						//no rows are selected
					} else {
						int selectedRow = lsm.getMinSelectionIndex();
						updatePatientInformationFields(assignments.get(selectedRow));
					}
				}

				private void updatePatientInformationFields(AssignmentEntity assignmentEntity) {
					PatientEntity pe = assignmentEntity.getPatientEntity();
					String patientID = pe.getPcode().toString();
					String patientName = pe.getName();
					String gender = pe.getGender();
					Date birthDate = pe.getBirthDate();
					int age = (int) (((new Date().getTime() - birthDate.getTime()) / ONE_HOUR)
						/ (24 * 365));
					GuidelineEntity ge = assignmentEntity.getGuidelineEntity();
					String guidelineID = "" + ge.getGuidelineID();
					String title = ge.getTitle();
					String version = ge.getVersion();

					ImageIcon image = new ImageIcon(this.getClass().getClassLoader().getResource("images/patient/" + patientID + ".jpg"));

					pIdField.setText(patientID);
					pNameField.setText(patientName);
					pAgeField.setText(age + "");
					pGenderField.setText(gender);

					gIdField.setText(guidelineID);
					gTitleField.setText(title);
					gVersionField.setText(version);
					photoLabel.setIcon(image);
					photoLabel.setText("");
				}
			});




		historyTable.getSelectionModel().addListSelectionListener(
			new ListSelectionListener() {

				public void valueChanged(ListSelectionEvent listSelectionEvent) {
					if (listSelectionEvent.getValueIsAdjusting()) {
						return;
					}

					ListSelectionModel lsm = (ListSelectionModel) listSelectionEvent.getSource();
					if (lsm.isSelectionEmpty()) {
						//no rows are selected
					} else {
						int selectedRow = lsm.getMinSelectionIndex();
						updatePatientInformationFields(executedAssignments.get(selectedRow));
					}
				}

				private void updatePatientInformationFields(HistoryAssignmentEntity assignmentEntity) {
					PatientEntity pe = assignmentEntity.getPatientEntity();
					String patientID = pe.getPcode().toString();
					String patientName = pe.getName();
					String gender = pe.getGender();
					Date birthDate = pe.getBirthDate();
					int age = (int) (((new Date().getTime() - birthDate.getTime()) / ONE_HOUR)
						/ (24 * 365));
					GuidelineEntity ge = assignmentEntity.getGuidelineEntity();
					String guidelineID = "" + ge.getGuidelineID();
					String title = ge.getTitle();
					String version = ge.getVersion();

					ImageIcon image = new ImageIcon(this.getClass().getClassLoader().getResource("images/patient/" + patientID + ".jpg"));

					pIdField.setText(patientID);
					pNameField.setText(patientName);
					pAgeField.setText(age + "");
					pGenderField.setText(gender);

					gIdField.setText(guidelineID);
					gTitleField.setText(title);
					gVersionField.setText(version);
					photoLabel.setIcon(image);
					photoLabel.setText("");
				}
			});


	}
	/*
	public MonitoringGUI() {
	initComponents();
	}*/

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc=" Generated Code ">
	private void initComponents() {
		mainTabbedPane = new javax.swing.JTabbedPane();
		mainPanel = new javax.swing.JPanel();
		pairPanel = new javax.swing.JPanel();
		filterPairComboBox = new javax.swing.JComboBox();
		selectThePairLabel = new javax.swing.JLabel();
		pairTableScrollPane = new javax.swing.JScrollPane();
		pairTable = new javax.swing.JTable();
		startExecutionButton = new javax.swing.JButton();
		recheckButton = new javax.swing.JButton();
		removeButton = new javax.swing.JButton();
		summaryPanel = new javax.swing.JPanel();
		patientSummaryPanel = new javax.swing.JPanel();
		pIdLabel = new javax.swing.JLabel();
		pNameLabel = new javax.swing.JLabel();
		pAgeLabel = new javax.swing.JLabel();
		pGenderLabel = new javax.swing.JLabel();
		pDetailsButton = new javax.swing.JButton();
		pIdField = new javax.swing.JTextField();
		pNameField = new javax.swing.JTextField();
		pGenderField = new javax.swing.JTextField();
		pAgeField = new javax.swing.JTextField();
		jPanel1 = new javax.swing.JPanel();
		photoLabel = new javax.swing.JLabel();
		guidelineSummaryPanelExt = new javax.swing.JPanel();
		flowchartButton = new javax.swing.JButton();
		gDetailedInfoLabel = new javax.swing.JLabel();
		gTitleLabel = new javax.swing.JLabel();
		gVersionLabel = new javax.swing.JLabel();
		gIdLabel = new javax.swing.JLabel();
		gIdField = new javax.swing.JTextField();
		gVersionField = new javax.swing.JTextField();
		gDetailedInfoScrollPane = new javax.swing.JScrollPane();
		gDetailedInfoArea = new javax.swing.JTextArea();
		titleScroll = new javax.swing.JScrollPane();
		gTitleField = new javax.swing.JTextArea();

		//05_06_2007 begin
		historyPanel = new javax.swing.JPanel();
		historyTableScrollPane = new javax.swing.JScrollPane();
		historyTable = new javax.swing.JTable();
		startHistoryExecutionButton = new javax.swing.JButton();
		recheckHistoryButton = new javax.swing.JButton();
		//05_06_2007 end

		menuBar = new javax.swing.JMenuBar();
		fileMenu = new javax.swing.JMenu();
		exitMenuItem = new javax.swing.JMenuItem();
		helpMenu = new javax.swing.JMenu();
		aboutMenuItem = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		pairPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient - Guideline Pairs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10)));
		filterPairComboBox.setFont(new java.awt.Font("Tahoma", 0, 10));
		filterPairComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"All pairs", "Currently executing pairs", "Ready to execute pairs", "Waiting for data assignment pairs"}));
		filterPairComboBox.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {
				filterPairComboBoxActionPerformed(evt);
			}
		});

		selectThePairLabel.setFont(new java.awt.Font("Tahoma", 0, 10));
		selectThePairLabel.setText("Select the Guideline - Patient pairs you want to view: ");

		pairTable.setFont(new java.awt.Font("Tahoma", 0, 10));
		pairTable.setModel(new javax.swing.table.DefaultTableModel(
			new Object[][]{},
			new String[]{
				"Status", "Patient Name", "GL Title", "Description", "Approved by", "Assign. Time", "Approv.Time", "Exec.Time"
			}) {

			boolean[] canEdit = new boolean[]{
				false, false, false, false, false, false, false, false
			};

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		pairTableScrollPane.setViewportView(pairTable);

		startExecutionButton.setFont(new java.awt.Font("Tahoma", 0, 10));
		startExecutionButton.setText("Open Guideline");
		startExecutionButton.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {
				startExecutionButtonActionPerformed(evt);
			}
		});

		recheckButton.setFont(new java.awt.Font("Tahoma", 0, 10));
		recheckButton.setText("Recheck Assignments");
		recheckButton.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {
				recheckButtonActionPerformed(evt);
			}
		});

		removeButton.setFont(new java.awt.Font("Tahoma", 0, 10));
		removeButton.setText("Remove Assignment");
		removeButton.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {
				removeButtonActionPerformed(evt);
			}
		});

		org.jdesktop.layout.GroupLayout pairPanelLayout = new org.jdesktop.layout.GroupLayout(pairPanel);
		pairPanel.setLayout(pairPanelLayout);
		pairPanelLayout.setHorizontalGroup(
			pairPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(pairPanelLayout.createSequentialGroup().addContainerGap().add(pairPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(pairTableScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE).add(pairPanelLayout.createSequentialGroup().add(selectThePairLabel).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(filterPairComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).add(org.jdesktop.layout.GroupLayout.TRAILING, pairPanelLayout.createSequentialGroup().add(removeButton).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(recheckButton).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(startExecutionButton))).addContainerGap()));
		pairPanelLayout.setVerticalGroup(
			pairPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(pairPanelLayout.createSequentialGroup().add(pairPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(selectThePairLabel).add(filterPairComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(pairTableScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(pairPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(startExecutionButton).add(recheckButton).add(removeButton)).addContainerGap()));

		summaryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10)));
		patientSummaryPanel.setBackground(new java.awt.Color(255, 255, 255));
		patientSummaryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Health Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10)));
		patientSummaryPanel.setFont(new java.awt.Font("Tahoma", 0, 10));
		pIdLabel.setFont(new java.awt.Font("Tahoma", 0, 10));
		pIdLabel.setText("Patient ID: ");

		pNameLabel.setFont(new java.awt.Font("Tahoma", 0, 10));
		pNameLabel.setText("Name: ");

		pAgeLabel.setFont(new java.awt.Font("Tahoma", 0, 10));
		pAgeLabel.setText("Age: ");

		pGenderLabel.setFont(new java.awt.Font("Tahoma", 0, 10));
		pGenderLabel.setText("Gender: ");

		pDetailsButton.setFont(new java.awt.Font("Tahoma", 0, 10));
		pDetailsButton.setText("Details...");
		pDetailsButton.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {
				pDetailsButtonActionPerformed(evt);
			}
		});

		pIdField.setEditable(false);

		pNameField.setEditable(false);

		pGenderField.setEditable(false);

		pAgeField.setEditable(false);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		photoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		photoLabel.setText("NO IMAGE");

		org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(photoLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(photoLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE));

		org.jdesktop.layout.GroupLayout patientSummaryPanelLayout = new org.jdesktop.layout.GroupLayout(patientSummaryPanel);
		patientSummaryPanel.setLayout(patientSummaryPanelLayout);
		patientSummaryPanelLayout.setHorizontalGroup(
			patientSummaryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(patientSummaryPanelLayout.createSequentialGroup().add(patientSummaryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(pAgeLabel).add(pIdLabel).add(pNameLabel).add(pGenderLabel)).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(patientSummaryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false).add(pAgeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).add(pIdField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE).add(pNameField).add(pGenderField)).addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).add(pDetailsButton).add(org.jdesktop.layout.GroupLayout.TRAILING, patientSummaryPanelLayout.createSequentialGroup().addContainerGap(36, Short.MAX_VALUE).add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).add(33, 33, 33)));
		patientSummaryPanelLayout.setVerticalGroup(
			patientSummaryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(patientSummaryPanelLayout.createSequentialGroup().add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(patientSummaryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(pIdLabel).add(pIdField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(patientSummaryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(pNameLabel).add(pNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(patientSummaryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(pGenderLabel).add(pGenderField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(patientSummaryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(pAgeLabel).add(pAgeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).add(30, 30, 30).add(pDetailsButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()));

		guidelineSummaryPanelExt.setBackground(new java.awt.Color(255, 255, 255));
		guidelineSummaryPanelExt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guideline Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10)));
		flowchartButton.setFont(new java.awt.Font("Tahoma", 0, 10));
		flowchartButton.setText("Flow Chart");
		flowchartButton.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {
				flowchartButtonActionPerformed(evt);
			}
		});

		gDetailedInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 10));
		gDetailedInfoLabel.setText("Detailed Information: ");

		gTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 10));
		gTitleLabel.setText("Title: ");

		gVersionLabel.setFont(new java.awt.Font("Tahoma", 0, 10));
		gVersionLabel.setText("Version: ");

		gIdLabel.setFont(new java.awt.Font("Tahoma", 0, 10));
		gIdLabel.setText("Guideline ID: ");

		gIdField.setEditable(false);

		gVersionField.setEditable(false);

		gDetailedInfoArea.setColumns(20);
		gDetailedInfoArea.setEditable(false);
		gDetailedInfoArea.setLineWrap(true);
		gDetailedInfoArea.setRows(5);
		gDetailedInfoScrollPane.setViewportView(gDetailedInfoArea);

		gTitleField.setColumns(18);
		gTitleField.setEditable(false);
		gTitleField.setLineWrap(true);
		gTitleField.setRows(2);
		titleScroll.setViewportView(gTitleField);

		org.jdesktop.layout.GroupLayout guidelineSummaryPanelExtLayout = new org.jdesktop.layout.GroupLayout(guidelineSummaryPanelExt);
		guidelineSummaryPanelExt.setLayout(guidelineSummaryPanelExtLayout);
		guidelineSummaryPanelExtLayout.setHorizontalGroup(
			guidelineSummaryPanelExtLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(guidelineSummaryPanelExtLayout.createSequentialGroup().add(guidelineSummaryPanelExtLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(flowchartButton).add(org.jdesktop.layout.GroupLayout.TRAILING, guidelineSummaryPanelExtLayout.createSequentialGroup().add(guidelineSummaryPanelExtLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(gVersionLabel).add(gIdLabel)).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(guidelineSummaryPanelExtLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING).add(org.jdesktop.layout.GroupLayout.LEADING, guidelineSummaryPanelExtLayout.createSequentialGroup().add(gIdField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)).add(org.jdesktop.layout.GroupLayout.LEADING, gVersionField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))).add(guidelineSummaryPanelExtLayout.createSequentialGroup().add(gTitleLabel).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(titleScroll, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)).add(gDetailedInfoLabel).add(org.jdesktop.layout.GroupLayout.TRAILING, guidelineSummaryPanelExtLayout.createSequentialGroup().addContainerGap().add(gDetailedInfoScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))).addContainerGap()));
		guidelineSummaryPanelExtLayout.setVerticalGroup(
			guidelineSummaryPanelExtLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(guidelineSummaryPanelExtLayout.createSequentialGroup().add(guidelineSummaryPanelExtLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(gIdLabel).add(gIdField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(guidelineSummaryPanelExtLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(gVersionLabel).add(gVersionField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(guidelineSummaryPanelExtLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(gTitleLabel).add(titleScroll, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(gDetailedInfoLabel).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(gDetailedInfoScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 46, Short.MAX_VALUE).add(flowchartButton)));

		org.jdesktop.layout.GroupLayout summaryPanelLayout = new org.jdesktop.layout.GroupLayout(summaryPanel);
		summaryPanel.setLayout(summaryPanelLayout);
		summaryPanelLayout.setHorizontalGroup(
			summaryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(guidelineSummaryPanelExt, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).add(patientSummaryPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		summaryPanelLayout.setVerticalGroup(
			summaryPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(summaryPanelLayout.createSequentialGroup().add(patientSummaryPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(guidelineSummaryPanelExt, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		historyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Previously Executed Guidelines", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10)));
		historyTable.setFont(new java.awt.Font("Tahoma", 0, 10));
		historyTable.setModel(new javax.swing.table.DefaultTableModel(
			new Object[][]{},
			new String[]{
				"Session", "Status", "Patient Name", "GL Title", "Description", "Approved by", "Assign. Time", "Approv.Time", "Exec.Time"
			}) {

			boolean[] canEdit = new boolean[]{
				false, false, false, false, false, false, false, false, false
			};

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		historyTableScrollPane.setViewportView(historyTable);

		startHistoryExecutionButton.setFont(new java.awt.Font("Tahoma", 0, 10));
		startHistoryExecutionButton.setText("Show Guideline");
		startHistoryExecutionButton.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {
				startHistoryExecutionButtonActionPerformed(evt);
			}
		});

		recheckHistoryButton.setFont(new java.awt.Font("Tahoma", 0, 10));
		recheckHistoryButton.setText("Refresh");
		recheckHistoryButton.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {
				recheckHistoryButtonActionPerformed(evt);
			}
		});

		org.jdesktop.layout.GroupLayout historyPanelLayout = new org.jdesktop.layout.GroupLayout(historyPanel);
		historyPanel.setLayout(historyPanelLayout);
		historyPanelLayout.setHorizontalGroup(
			historyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(historyPanelLayout.createSequentialGroup().addContainerGap().add(historyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(historyTableScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE).add(org.jdesktop.layout.GroupLayout.TRAILING, historyPanelLayout.createSequentialGroup().add(recheckHistoryButton).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(startHistoryExecutionButton))).addContainerGap()));
		historyPanelLayout.setVerticalGroup(
			historyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(historyPanelLayout.createSequentialGroup().add(19, 19, 19).add(historyTableScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(historyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(startHistoryExecutionButton).add(recheckHistoryButton)).addContainerGap()));

		org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
		mainPanel.setLayout(mainPanelLayout);
		mainPanelLayout.setHorizontalGroup(
			mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(org.jdesktop.layout.GroupLayout.TRAILING, mainPanelLayout.createSequentialGroup().addContainerGap().add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(pairPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).add(historyPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(summaryPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).addContainerGap()));
		mainPanelLayout.setVerticalGroup(
			mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(mainPanelLayout.createSequentialGroup().addContainerGap().add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(mainPanelLayout.createSequentialGroup().add(pairPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(historyPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).add(summaryPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap()));
		mainTabbedPane.addTab("Assignments Panel", mainPanel);

		fileMenu.setText("File");
		exitMenuItem.setText("Exit");
		exitMenuItem.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitMenuItemActionPerformed(evt);
			}
		});

		fileMenu.add(exitMenuItem);

		menuBar.add(fileMenu);

		helpMenu.setText("Help");
		aboutMenuItem.setText("About");
		aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {
				aboutMenuItemActionPerformed(evt);
			}
		});

		helpMenu.add(aboutMenuItem);

		menuBar.add(helpMenu);

		setJMenuBar(menuBar);

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(mainTabbedPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE));
		layout.setVerticalGroup(
			layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(mainTabbedPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE));
		pack();
	}// </editor-fold>

	private void recheckHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recheckHistoryButtonActionPerformed

		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Pressed Refresh Button"));
		DefaultTableModel tableModel = (DefaultTableModel) historyTable.getModel();
		//tableModel.setDataVector(null, null);

		for (int i = 0; i < tableModel.getRowCount(); i++) {
			tableModel.removeRow(i);
		}
		myAgent.initExecutedGuidelineTable();

	}//GEN-LAST:event_recheckHistoryButtonActionPerformed

	private void startHistoryExecutionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startHistoryExecutionButtonActionPerformed
		int selectedRow = historyTable.getSelectedRow();
		if (selectedRow == -1) {
			JOptionPane.showMessageDialog(this, "No assignment is selected!");
			return;
		}
		HistoryAssignmentEntity selectedAssignment = executedAssignments.get(selectedRow);
		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("History Selected Row = " + selectedRow));

		GuidelineEntity guidelineEntity = selectedAssignment.getGuidelineEntity();

		String uri = selectedAssignment.getProcessedGuidelineURL();
		String guidelineName = guidelineEntity.getInternalGuideline();
		DefaultGuideline defaultGuideline = FactoryRetriever.getGuideline(uri, guidelineName);


		addGuidelineTab(defaultGuideline, selectedAssignment.getProcessedGuidelineURL(), selectedAssignment, false, true);


	}
	// Variables declaration - do not modify
	//
	//
	private javax.swing.JButton startHistoryExecutionButton;
	private javax.swing.JButton recheckHistoryButton;
	private javax.swing.JPanel historyPanel;
	private javax.swing.JTable historyTable;
	private javax.swing.JScrollPane historyTableScrollPane;
	private javax.swing.JMenuItem aboutMenuItem;
	private javax.swing.JMenuItem exitMenuItem;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JComboBox filterPairComboBox;
	private javax.swing.JButton flowchartButton;
	private javax.swing.JTextArea gDetailedInfoArea;
	private javax.swing.JLabel gDetailedInfoLabel;
	private javax.swing.JScrollPane gDetailedInfoScrollPane;
	private javax.swing.JTextField gIdField;
	private javax.swing.JLabel gIdLabel;
	private javax.swing.JTextArea gTitleField;
	private javax.swing.JLabel gTitleLabel;
	private javax.swing.JTextField gVersionField;
	private javax.swing.JLabel gVersionLabel;
	private javax.swing.JPanel guidelineSummaryPanelExt;
	private javax.swing.JMenu helpMenu;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel mainPanel;
	private javax.swing.JTabbedPane mainTabbedPane;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JTextField pAgeField;
	private javax.swing.JLabel pAgeLabel;
	private javax.swing.JButton pDetailsButton;
	private javax.swing.JTextField pGenderField;
	private javax.swing.JLabel pGenderLabel;
	private javax.swing.JTextField pIdField;
	private javax.swing.JLabel pIdLabel;
	private javax.swing.JTextField pNameField;
	private javax.swing.JLabel pNameLabel;
	private javax.swing.JPanel pairPanel;
	private javax.swing.JTable pairTable;
	private javax.swing.JScrollPane pairTableScrollPane;
	private javax.swing.JPanel patientSummaryPanel;
	private javax.swing.JLabel photoLabel;
	private javax.swing.JButton recheckButton;
	private javax.swing.JButton removeButton;
	private javax.swing.JLabel selectThePairLabel;
	private javax.swing.JButton startExecutionButton;
	private javax.swing.JPanel summaryPanel;
	private javax.swing.JScrollPane titleScroll;
	// End of variables declaration

	private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void pDetailsExecButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void filterPairComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void flowchartButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void pDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		int selectedRow = pairTable.getSelectedRow();
		if (selectedRow == -1) {
			JOptionPane.showMessageDialog(this, "No assignment is selected!");
			return;
		}
		int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this assignment?");
		if (result == JOptionPane.OK_OPTION) {
			AssignmentEntity selectedAssignment = assignments.get(selectedRow);
			Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Selected Row = " + selectedRow));
			selectedAssignment.setActive("false");
			for (Object o : selectedAssignment.getSensorsSetInfos()) {
				SensorsSetInfo sensorsSetInfo = (SensorsSetInfo) o;
				sensorsSetInfo.setAvailable(true);
//                SensorsSetRepository.updateSensorsSetInfo(sensorsSetInfo);
			}
			AssignmentRepository.updateAssignmentEntity(selectedAssignment);
			if (selectedAssignment.getGuidelineEntity().getGuidelineID() == 2) {
				long pid = selectedAssignment.getPatientEntity().getPcode();
				Vector relatedAssignments = AssignmentRepository.getAssociateAssignmentsOfAPatient(pid);
				for (int i = 0; i < relatedAssignments.size(); i++) {
					AssignmentEntity entity = (AssignmentEntity) relatedAssignments.elementAt(i);
					entity.setActive("false");
					AssignmentRepository.updateAssignmentEntity(entity);
				}
			}

			//SensorDB_Service sensorDBService = new SensorDB_ServiceLocator();
			try {

				ResourceBundle resourceBundle = ResourceBundle.getBundle("conf.icardea");
				String ws_address = resourceBundle.getString("sensordb_ws_address");
				URL endpoint = new java.net.URL(ws_address);
				//SensorDB_PortType sensordb = sensorDBService.getSensorDBSOAP(endpoint);

				Iterator sensorSetInfos = selectedAssignment.getSensorsSetInfos().iterator();
				SensorsSetInfo ssi = (SensorsSetInfo) sensorSetInfos.next();
				//sensordb.removeSensorAssignment(ssi.getSid());
			} catch (Exception e) {
				e.printStackTrace();
			}
			// update the list
			myAgent.retrieveAssignments();
		}
	}

	private void recheckButtonActionPerformed(java.awt.event.ActionEvent evt) {
		myAgent.retrieveAssignments();
	}

	private void startExecutionButtonActionPerformed(java.awt.event.ActionEvent evt) {
		int selectedRow = pairTable.getSelectedRow();
		if (selectedRow == -1) {
			JOptionPane.showMessageDialog(this, "No assignment is selected!");
			return;
		}
		AssignmentEntity selectedAssignment = assignments.get(selectedRow);
		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Selected Row = " + selectedRow));
		//FIXME: [OG] the necessary field must be selected

		//        String patientName = (String)pairTable.getModel().getValueAt(selectedRow, 1);

		GuidelineEntity guidelineEntity = selectedAssignment.getGuidelineEntity();

		String uri = selectedAssignment.getProcessedGuidelineURL();
		String guidelineName = guidelineEntity.getInternalGuideline();
		DefaultGuideline defaultGuideline = FactoryRetriever.getGuideline(uri, guidelineName);


		addGuidelineTab(defaultGuideline, selectedAssignment.getProcessedGuidelineURL(), selectedAssignment, false, false);

	}

	public PatientPanel addGuidelineTab(DefaultGuideline guideline, String guidelineURI, AssignmentEntity selectedAssignment, boolean isSubguideline, boolean isHistory) {
		if (isHistory) {
			int index = mainTabbedPane.getTabCount();
			HistoryAssignmentEntity historyAsg = (HistoryAssignmentEntity) selectedAssignment;
			String sessionID = historyAsg.getSessionID().toString();
			PatientPanel lastPatient = new PatientPanel(guideline, guidelineURI, selectedAssignment, index, isSubguideline, isHistory, sessionID);
			if (!isSubguideline) {
				historyGraphs.put(historyAsg.getSessionID().toString(), lastPatient);
			}

			String tabName = selectedAssignment.getPatientEntity().toString() + "-" + selectedAssignment.getGuidelineEntity().getTitle();
			mainTabbedPane.addTab(tabName, lastPatient);
			mainTabbedPane.setSelectedIndex(index);
			return lastPatient;

		} else {
			int index = mainTabbedPane.getTabCount();
			PatientPanel lastPatient = guidelineGraphs.get(selectedAssignment.getAssignmentID().toString());
			if (lastPatient != null) {
				if (lastPatient.getIndex() == -1) {
					mainTabbedPane.addTab(lastPatient.getAssignmentEntity().getPatientEntity().toString(), lastPatient);
					lastPatient.setIndex(index);
					mainTabbedPane.setSelectedIndex(index);
				} else {
					mainTabbedPane.setSelectedIndex(lastPatient.getIndex());
				}
			} else {
				lastPatient = new PatientPanel(guideline, guidelineURI, selectedAssignment, index, isSubguideline, isHistory, null);
				String tabName = selectedAssignment.getPatientEntity().toString() + "-" + selectedAssignment.getGuidelineEntity().getTitle();
				mainTabbedPane.addTab(tabName, lastPatient);
				mainTabbedPane.setSelectedIndex(index);
				if (!isSubguideline) {
					guidelineGraphs.put(selectedAssignment.getAssignmentID().toString(), lastPatient);
				}
			}

			return lastPatient;
		}
	}

	public void modifyGuidelineExecutionStatus(AssignmentEntity selectedAssignment, int requestType) {
		try {
			if (requestType == MonitoringAgent.TERMINATE_GUIDELINE_EXECUTION) {
				MonitoringAgent.getInstance().suspendGuidelineExecution(selectedAssignment);
			} else if (requestType == MonitoringAgent.EXECUTE_GUIDELINE) {
				MonitoringAgent.getInstance().executeGuideline(selectedAssignment);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public PatientPanel addAssociatedGuidelines(Vector associatedAssignments) {
		PatientPanel patientPanelCGM4 = null;
		int selectedIndex = mainTabbedPane.getSelectedIndex();
		for (int i = 0; i < associatedAssignments.size(); i++) {
			AssignmentEntity entity = (AssignmentEntity) associatedAssignments.elementAt(i);
			GuidelineEntity guidelineEntity = entity.getGuidelineEntity();

			String uri = entity.getProcessedGuidelineURL();
			String guidelineName = guidelineEntity.getInternalGuideline();
			DefaultGuideline defaultGuideline = FactoryRetriever.getGuideline(uri, guidelineName);
			PatientPanel patientPanel = addGuidelineTab(defaultGuideline, entity.getProcessedGuidelineURL(), entity, false, false);
			patientPanel.setAssociatedGuidelineStarted();
			if (guidelineEntity.getGuidelineID() == 4) {
				patientPanelCGM4 = patientPanel;
			}
		}
		mainTabbedPane.setSelectedIndex(selectedIndex);
		return patientPanelCGM4;
	}

	public void startHistoryExecution(HistoryAssignmentEntity historyAssignmentEntity) {
		myAgent.executeHistoryGuideline(historyAssignmentEntity);
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm71fa]
	 * @param filterPatientData
	 * @return
	 */
	public AssignmentEntity[] listAssignments(PatientEntity filterPatientData) {
		// your code here
		return null;
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm71f2]
	 * @return
	 */
	public AssignmentEntity selectGuidelinePatientPair() {
		// your code here
		return null;
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm71e8]
	 * @param guidelineInstance
	 */
	public void presentGuideline(GuidelineEntity guidelineInstance) {
		// your code here
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm71e0]
	 */
	public void selectNode() {
		// your code here
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm71d8]
	 */
	public void saveInstance() {
		// your code here
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm71d0]
	 * @return
	 */
	public ServiceEntity selectService() {
		// your code here
		return null;
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm71c8]
	 * @return
	 */
	public String selectAgent() {
		// your code here
		return null;
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I60936e01m109d4d258d3mm5025]
	 * @return
	 */
	public String selectObjectReference() {
		// your code here
		return null;
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm71b8]
	 * @return
	 */
	public boolean validateGuidelineInstance() {
		// your code here
		return false;
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm71ae]
	 * @param filterPatientData
	 * @return
	 */
	public PatientEntity listPatients(PatientEntity filterPatientData) {
		// your code here
		return null;
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm71a6]
	 */
	public void startGuidelineExecution() {
		// your code here
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm719e]
	 * @return
	 */
	public AssignmentEntity selectAssignment() {
		// your code here
		return null;
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm7196]
	 */
	public void repaint() {
		// your code here
	}

	public void updateStatus(String assignmentID, String guidelineStep, String info) {
		PatientPanel patientPanel = guidelineGraphs.get(assignmentID);
		//        Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("INDEX------>"+patientPanel.getIndex());
		if (patientPanel != null) {
			patientPanel.updateStatus(guidelineStep, info);
		}
	}

	public void updateHistoryStatus(final String sessionID, final String guidelineStep, final String info) {
		Runnable doUpdateHistoryStatus = new Runnable() {

			public void run() {
				PatientPanel patientPanel = historyGraphs.get(sessionID);
				patientPanel.updateStatus(guidelineStep, info);
			}
		};
		SwingUtilities.invokeLater(doUpdateHistoryStatus);
	}

	public void displayHistoryInfo(final String sessionID, final String guidelineStep, final String info, final String displayName) {
		Runnable doDisplayHistoryInfo = new Runnable() {

			public void run() {
				PatientPanel patientPanel = historyGraphs.get(sessionID);
				patientPanel.displayInfo(guidelineStep, info, displayName);
			}
		};
		SwingUtilities.invokeLater(doDisplayHistoryInfo);
	}

	public void addHistoryHistoryEvent(final String sessionID, final Vector<String> stepInfo) {
		Runnable doAddHistoryHistoryEvent = new Runnable() {

			public void run() {
				PatientPanel patientPanel = historyGraphs.get(sessionID);
				patientPanel.addHistoryEvent(stepInfo);
			}
		};
		SwingUtilities.invokeLater(doAddHistoryHistoryEvent);
	}

	public void showHistorySubguideline(final String sessionID, final String assignmentID, final boolean isStarting) {
		Runnable doShowHistorySubguideline = new Runnable() {

			public void run() {
				String key = MonitoringGUI.generateSubguidelineSessionKey(sessionID, assignmentID);
				PatientPanel patientPanel = historyGraphs.get(key);
				/*	if(patientPanel != null){
				if(patientPanel.getIndex()<1){
				int index = mainTabbedPane.getTabCount();
				patientPanel.setIndex(index);
				mainTabbedPane.addTab(patientPanel.getAssignmentEntity().getPatientEntity().toString(), patientPanel);
				mainTabbedPane.setSelectedIndex(index);
				}else
				mainTabbedPane.setSelectedIndex(patientPanel.getIndex());
				}
				else*/ {    //this means the subguideline panel we are looking for has not been created
					ShowSubguidelineEvent event = showSubguideline.get(key);

					patientPanel = addGuidelineTab(event.getSubguideline(),
						event.getGuidelineURI(), event.getAssignmentEntity(), true, true);

					/* Gunes ALUC, SRDC, 19 June 2007 *******************/
					patientPanel.setOriginatorPatientPanel(event.getParentPatientPanel());
					event.getParentPatientPanel().setIncubatedPatientPanel(patientPanel);
					/* END-OF-EXTENSION *********************************/

					historyGraphs.put(key, patientPanel);

					///IMPORTANT:
					// MainPanel id is overriden by subguideline panel
					// if main guideline execution requires to turn back to main panel after subguideline execution is
					// completed, then either
					// 1) A turn back message could be defined with the main panel id OR 
					// 2) Subguideline may keep track of his main panel, then turn back automatically to the main panel 
					//    and mean time update the historygraph hashtable.

					historyGraphs.put(sessionID, patientPanel);
				}
				patientPanel.guidelineStarted();
			}
		};
		SwingUtilities.invokeLater(doShowHistorySubguideline);
	}

	public void displayInfo(String assignmentID, String guidelineStep, String info, String displayName) {
		PatientPanel patientPanel = guidelineGraphs.get(assignmentID);
		if (patientPanel != null) {
			patientPanel.displayInfo(guidelineStep, info, displayName);
		}
	}

	public void addHistoryEvent(String assignmentID, Vector<String> stepInfo) {
		PatientPanel patientPanel = guidelineGraphs.get(assignmentID);
		if (patientPanel != null) {
			patientPanel.addHistoryEvent(stepInfo);
		}
	}

	public void progressTerminatedExternally() {
		//todo: [olduz] do whatever needed when the progress is interrupted
	}

	public void prepareSubguideline(ShowSubguidelineEvent event, String id, boolean flag) {

		String key = generateSubguidelineKey(event.getAssignmentEntity(), event.getSubguideline());
		if (flag) {
			key = generateSubguidelineSessionKey(id, key);
		}
		showSubguideline.put(key, event);
	}

	public void showSubguideline(String key) {
		showSubguideline(key, false);
	}

	public void showSubguideline(String key, boolean isStarting) {
		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("::::::::::::::::::::KEY:::::" + key));
		PatientPanel patientPanel = guidelineGraphs.get(key);
		if (patientPanel != null) {
			if (patientPanel.getIndex() < 1) {
				int index = mainTabbedPane.getTabCount();
				patientPanel.setIndex(index);
				mainTabbedPane.addTab(patientPanel.getAssignmentEntity().getPatientEntity().toString(), patientPanel);
				mainTabbedPane.setSelectedIndex(index);
			} else {
				mainTabbedPane.setSelectedIndex(patientPanel.getIndex());
			}
		} else {    //this means the subguideline panel we are looking for has not been created
			ShowSubguidelineEvent event = showSubguideline.get(key);

			patientPanel = addGuidelineTab(event.getSubguideline(),
				event.getGuidelineURI(), event.getAssignmentEntity(), true, false);

			/* Gunes ALUC, SRDC, 19 June 2007 *******************/
			patientPanel.setOriginatorPatientPanel(event.getParentPatientPanel());
			event.getParentPatientPanel().setIncubatedPatientPanel(patientPanel);
			/* END-OF-EXTENSION *********************************/
			guidelineGraphs.put(key, patientPanel);
		}
		patientPanel.guidelineStarted();
	}

	public static String generateSubguidelineKey(AssignmentEntity assignmentEntity, DefaultGuideline guideline) {
		return assignmentEntity.getAssignmentID() + guideline.getName();
	}

	public static String generateSubguidelineSessionKey(String sessionID, String panelID) {
		return sessionID + "#" + panelID;
	}

	public void cycleCompleted(String assignmentID, String completionDate) {
		if(myAgent.showGUI) {
		DefaultGuideline defaultGuideline = guidelineGraphs.get(assignmentID).getGuideline();
//        if(defaultGuideline.hasIntention() && defaultGuideline.getIntention().equalsIgnoreCase("LOOP")){
//            progressDialog = new IndeterminateProgressDialog(this, "Waiting for the next execution...");
//            Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("Waiting for the next execution...");
//        }else{
		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Completed guideline execution."));
//        }

		PatientPanel activePatientPanel = guidelineGraphs.get(assignmentID);
		//activePatientPanel.getGuidelineMonitoringPanel().cycleCompleted();
		activePatientPanel.cycleCompleted();
//        PatientPanel oldPanel = guidelineGraphs.get(assignmentID);
//
//        guidelineGraphs.remove(assignmentID);
//
//        int index = mainTabbedPane.getTabCount();
//        PatientPanel lastPatient = new PatientPanel(
//                oldPanel.getGuideline(),
//                oldPanel.getGuidelineURI(),
//                oldPanel.getAssignmentEntity(),
//                index,
//                false,
//                false,
//                null);
//
//		mainTabbedPane.addTab(oldPanel.getAssignmentEntity().getPatientEntity().toString(), lastPatient);
//		mainTabbedPane.setSelectedIndex(index);
//
//		guidelineGraphs.put(oldPanel.getAssignmentEntity().getAssignmentID().toString(), lastPatient);
		}
	}

	public void newCycleStarting(String assignmentID, String completionDate) {
		if (progressDialog != null) {
			progressDialog.stopProgressBar();
			progressDialog = null;
		}
		PatientPanel activePatientPanel = guidelineGraphs.get(assignmentID);
		activePatientPanel.getGuidelineMonitoringPanel().clearPreviousData();
	}

	/**
	 * <p></p>
	 *
	 *
	 * @poseidon-object-id [I8b7250m109bbca6579mm7200]
	 */
	public class Service {
	}

	public void updateExecutedAssignmentsList(Vector<HistoryAssignmentEntity> assignments2) {//vector od AssignmentConcept objects
		this.executedAssignments = assignments2;
		DefaultTableModel tableModel = (DefaultTableModel) historyTable.getModel();
		Vector dataVector = new Vector();
		for (int i = 0; i < assignments2.size(); i++) {
			Vector tmp = new Vector();
			HistoryAssignmentEntity assignment = assignments2.get(i);
			PatientEntity pe = assignment.getPatientEntity();
			if (pe == null) {
				Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Invalid Patient Reference. Skipping..."));
				//continue;
			}
			/*else{
			String de = pe.getName();
			if(de == null)
			Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("Demographics Entity is null");
			else{
			Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("Patient is " + pe.toString());
			
			Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("Patient is " + de);
			}
			}*/
			GuidelineEntity ge = assignment.getGuidelineEntity();
			if (ge == null) {
				Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Invalid Guideline Reference. Skipping..."));
				//continue;
			}
			/*else{
			Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("Guideline Title = " + ge.getTitle());
			}*/
			tmp.add(assignment.getSessionID());
			tmp.add(StatusInfo.getStatus(assignment.getStatus()));
			tmp.add(assignment.getPatientEntity().getName());
			tmp.add(assignment.getGuidelineEntity().getTitle());
			tmp.add("Description " + i);//
			tmp.add(assignment.getApprovedBy().getFullName());
			tmp.add(assignment.getAssignmentDate());
			tmp.add(assignment.getApprovalDate());
			tmp.add(assignment.getStartToExecutionDate());

			dataVector.add(tmp);
		}

		Vector<String> columns = new Vector<String>();
		columns.add("Session");
		columns.add("Status");
		columns.add("Patient Name");
		columns.add("GL Title");
		columns.add("Description");
		columns.add("Approved by");
		columns.add("Assign. Time");
		columns.add("Approv. Time");
		columns.add("Exec.Time");
		tableModel.setDataVector(dataVector, columns);
	}

	/**
	 * <p>Does ...</p>
	 *
	 *
	 *
	 */
	public void updateAssignmentList(Vector<AssignmentEntity> assignments) {//vector od AssignmentConcept objects
		this.assignments = assignments;
		DefaultTableModel tableModel = (DefaultTableModel) pairTable.getModel();
		Vector dataVector = new Vector();
		for (int i = 0; i < assignments.size(); i++) {
			Vector tmp = new Vector();
			AssignmentEntity assignment = assignments.get(i);

			PatientEntity pe = assignment.getPatientEntity();
			if (pe == null) {
				Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Invalid Patient Reference. Skipping..."));
				//continue;
			}
			/*else{
			String de = pe.getName();
			if(de == null)
			Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("Demographics Entity is null");
			else{
			
			Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("Patient is " + pe.toString());
			
			Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("Patient is " + de);
			}
			}*/
			GuidelineEntity ge = assignment.getGuidelineEntity();
			if (ge == null) {
				Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Invalid Guideline Reference. Skipping..."));
				//continue;
			}
			/* else{
			Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("Guideline Title = " + ge.getTitle());
			}*/
			tmp.add(StatusInfo.getStatus(assignment.getStatus()));
			if(assignment.getPatientEntity() != null)
			tmp.add(assignment.getPatientEntity().getName());
			if(assignment.getGuidelineEntity() != null)
			tmp.add(assignment.getGuidelineEntity().getTitle());
			tmp.add("Description " + i);//
			if(assignment.getApprovedBy() != null)
			tmp.add(assignment.getApprovedBy().getFullName());
			tmp.add(assignment.getAssignmentDate());
			tmp.add(assignment.getApprovalDate());
			tmp.add(assignment.getStartToExecutionDate());
			dataVector.add(tmp);
		}
		//		Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, ("16");
		Vector<String> columns = new Vector<String>();
		columns.add("Status");
		columns.add("Patient Name");
		columns.add("GL Title");
		columns.add("Description");
		columns.add("Approved by");
		columns.add("Assign. Time");
		columns.add("Approv. Time");
		columns.add("Exec.Time");
		tableModel.setDataVector(dataVector, columns);
	}

	public void showProgressDialog(final String title) {
		timeBasedProgressDialog = new TimeBasedProgressDialog(this, title);

	}

	public void hideProgressDialog() {
		if (timeBasedProgressDialog != null) {
			Logger.getLogger(this.getClass()).log(Level.DEBUG, ("hidingg"));
			timeBasedProgressDialog.stopProgressBar();
			//            progressDialog.setVisible(false);
			//            progressDialog.dispose();
			this.pack();
		}
	}

	public static void main(String[] args) {
		new MonitoringGUI(null).setVisible(true);
	}

	public Hashtable<String, PatientPanel> getHistoryGraphs() {
		return historyGraphs;
	}

	public JTabbedPane getMainTabbedPane() {
		return mainTabbedPane;
	}
}
