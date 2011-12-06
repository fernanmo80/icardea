package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import tr.com.srdc.icardea.careplanengine.agents.monitoringAgent.MonitoringAgent;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.ConceptEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.DurationIntervalEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.MedicationEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.PhysicalQuantityEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.RangeEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.SymbolEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.TimeIntervalEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.TimeLiteralEntity;

public class MedicationPanel extends JPanel {

	private JFrame parentFrame;
	private MedicationEntity medication;
	private JLabel activityTimeLabel;
	private JButton activityTimeButton;
	private JLabel bodySiteCdLabel;
	private JButton bodySiteCdButton;
	protected TimeIntervalEntity activityTime = new TimeIntervalEntity();
	protected ConceptEntity bodySiteCd = new ConceptEntity();
	private JLabel checkDoseQuantityLabel;
	private JButton checkDoseQuantityButton;
	protected PhysicalQuantityEntity checkDoseQuantity = new PhysicalQuantityEntity();
	private JLabel confidentialityLabel;
	private JTextField confidentialityText;
	private JLabel criticalDurationLabel;
	private JButton criticalDurationButton;
	protected DurationIntervalEntity criticalDuration = new DurationIntervalEntity();
	private JLabel criticalTimeLabel;
	private JButton criticalTimeButton;
	protected TimeIntervalEntity criticalTime = new TimeIntervalEntity();
	private JLabel dosageQuantityLabel;
	private JButton dosageQuantityButton;
	protected PhysicalQuantityEntity dosageQuantity = new PhysicalQuantityEntity();
	private JLabel doseformCdLabel;
	private JTextField doseFormCdText;
	private JLabel interpretationLabel;
	private JTextField interpretationText;
	private JLabel idLabel;
	private JTextField idText;
	private JLabel normalRangeLabel;
	private JButton normalRangeButton;
	protected RangeEntity normalRange = new RangeEntity();
	private JLabel moodCdLabel;
	private JTextField moodCdText;
	private JButton methodCdButton;
	private JLabel methodCdLabel;
	protected ConceptEntity methodCd = new ConceptEntity();
	private JLabel rateQuantityLabel;
	private JButton rateQuantityButton;
	protected PhysicalQuantityEntity rateQuantity = new PhysicalQuantityEntity();
	private JLabel recordingTimeLabel;
	private JButton recordingTimeButton;
	protected TimeLiteralEntity recordingTime = new TimeLiteralEntity();
	private JLabel serviceCdLabel;
	private JButton serviceCdButton;
	protected ConceptEntity serviceCd = new ConceptEntity();
	private JLabel statusCdLabel;
	private JTextField statusCdText;
	private JLabel strengthQuantityLabel;
	private JButton strengthQuantityButton;
	protected PhysicalQuantityEntity strengthQuantity = new PhysicalQuantityEntity();
	private JLabel routeCdLabel;
	private JTextField routeCdText;
	private JButton sendButton;
	private MonitoringAgent agent;
	private String targetAID;

	public MedicationPanel(JFrame comp, MedicationEntity me, MonitoringAgent agent, String targetAID) {

		this.parentFrame = comp;
		this.medication = me;
		this.agent = agent;
		this.targetAID = targetAID;
		initializeComponents();
		this.setLayout(null);
	}

	private void initializeComponents() {
		int firstColumnStart = 10;
		int secondColumnStart = 120;

		int thirdColumnStart = 250;
		int fourthColumnStart = thirdColumnStart + 110;


//Activity Time 

		activityTimeLabel = new JLabel();
		add(activityTimeLabel);
		activityTimeLabel.setBounds(firstColumnStart, 30, 100, 30);
		activityTimeLabel.setText("Activity Time");
		activityTimeButton = new JButton();
		add(activityTimeButton);
		activityTimeButton.setBounds(secondColumnStart, 30, 60, 25);
		activityTimeButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				TimeIntervalDialog dialog = new TimeIntervalDialog(activityTime);
				dialog.setVisible(true);
				medication.setActivityTime(activityTime);
				dialog.dispose();


			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});
		activityTimeButton.setText("FILL");


		//BodySiteCd 


		bodySiteCdLabel = new JLabel();
		add(bodySiteCdLabel);
		bodySiteCdLabel.setBounds(firstColumnStart, 70, 100, 30);
		bodySiteCdLabel.setText("Body Site Cd");
		bodySiteCdButton = new JButton();
		add(bodySiteCdButton);
		bodySiteCdButton.setBounds(secondColumnStart, 70, 60, 25);
		bodySiteCdButton.setText("FILL");
		bodySiteCdButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {


				fillConcept(bodySiteCd);
				medication.setBodySiteCd(bodySiteCd);



			}

			public void mousePressed(MouseEvent arg0) {
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

// checkDoseQuantity		
		checkDoseQuantityLabel = new JLabel();
		checkDoseQuantityLabel.setText("Check Dose Qty.");
		checkDoseQuantityLabel.setBounds(firstColumnStart, 110, 100, 30);
		add(checkDoseQuantityLabel);

		checkDoseQuantityButton = new JButton();
		checkDoseQuantityButton.setText("FILL");
		checkDoseQuantityButton.setBounds(secondColumnStart, 110, 60, 25);
		add(checkDoseQuantityButton);
		checkDoseQuantityButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				fillPQ(checkDoseQuantity);
				medication.setCheckDoseQuantity(checkDoseQuantity);

			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});
//confidentiality

		confidentialityLabel = new JLabel();
		add(confidentialityLabel);
		confidentialityLabel.setBounds(firstColumnStart, 150, 100, 30);
		confidentialityLabel.setText("Confdentiality");
		confidentialityText = new JTextField();
		add(confidentialityText);
		confidentialityText.setBounds(secondColumnStart, 150, 60, 25);
		confidentialityText.setText("");

//critical duration

		criticalDurationLabel = new JLabel();
		add(criticalDurationLabel);
		criticalDurationLabel.setBounds(firstColumnStart, 190, 100, 30);
		criticalDurationLabel.setText("Critical Duration");

		criticalDurationButton = new JButton();
		add(criticalDurationButton);
		criticalDurationButton.setBounds(secondColumnStart, 190, 60, 25);
		criticalDurationButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {

				DurationIntervalDialog d = new DurationIntervalDialog(criticalDuration);
				d.setVisible(true);
				d.dispose();
				medication.setCriticalDuration(criticalDuration);


			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});
		criticalDurationButton.setText("FILL");

//		criticalTime
		criticalTimeLabel = new JLabel();
		add(criticalTimeLabel);
		criticalTimeLabel.setBounds(firstColumnStart, 230, 100, 30);
		criticalTimeLabel.setText("Critical Time");
		criticalTimeButton = new JButton();

		add(criticalTimeButton);
		criticalTimeButton.setBounds(secondColumnStart, 230, 60, 25);
		criticalTimeButton.setText("FILL");
		criticalTimeButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {

				TimeIntervalDialog dialog = new TimeIntervalDialog(criticalTime);
				dialog.setVisible(true);
				medication.setCriticalTime(criticalTime);
				dialog.dispose();


			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		//dosageQuantity

		dosageQuantityLabel = new JLabel();
		dosageQuantityLabel.setText("Dosage Qty.");
		dosageQuantityLabel.setBounds(firstColumnStart, 270, 100, 30);
		add(dosageQuantityLabel);

		dosageQuantityButton = new JButton();
		dosageQuantityButton.setText("FILL");
		dosageQuantityButton.setBounds(secondColumnStart, 270, 60, 25);
		dosageQuantityButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {

				fillPQ(dosageQuantity);
				medication.setDosageQuantity(dosageQuantity);

			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		add(dosageQuantityButton);


// doseform cd

		doseformCdLabel = new JLabel();
		doseformCdLabel.setText("Dose Form Cd");
		doseformCdLabel.setBounds(firstColumnStart, 310, 100, 30);
		add(doseformCdLabel);

		doseFormCdText = new JTextField();
		doseFormCdText.setBounds(secondColumnStart, 310, 60, 25);
		add(doseFormCdText);



//id

		idLabel = new JLabel();
		add(idLabel);
		idLabel.setBounds(firstColumnStart, 350, 100, 30);
		idLabel.setText("Id");

		idText = new JTextField();
		add(idText);
		idText.setBounds(secondColumnStart, 350, 60, 25);
		idText.setText("");

//interpretation

		interpretationLabel = new JLabel();
		add(interpretationLabel);
		interpretationLabel.setBounds(thirdColumnStart, 30, 100, 30);
		interpretationLabel.setText("Interpretation");

		interpretationText = new JTextField();
		add(interpretationText);
		interpretationText.setBounds(fourthColumnStart, 30, 60, 25);
		interpretationText.setText("");

//Method Cd

		methodCdLabel = new JLabel();
		add(methodCdLabel);
		methodCdLabel.setBounds(thirdColumnStart, 70, 100, 30);
		methodCdLabel.setText("Method Cd");

		methodCdButton = new JButton();
		add(methodCdButton);
		methodCdButton.setBounds(fourthColumnStart, 70, 60, 25);
		methodCdButton.setText("FILL");
		methodCdButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				fillConcept(methodCd);
				medication.setMethodCd(methodCd);


			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

//moodCd

		moodCdLabel = new JLabel();
		add(moodCdLabel);
		moodCdLabel.setBounds(thirdColumnStart, 110, 100, 30);
		moodCdLabel.setText("Mood Cd");

		moodCdText = new JTextField();
		add(moodCdText);
		moodCdText.setBounds(fourthColumnStart, 110, 60, 25);
		moodCdText.setText("");


// rateQuantity	
		rateQuantityLabel = new JLabel();
		rateQuantityLabel.setText("Rate Qty.");
		rateQuantityLabel.setBounds(thirdColumnStart, 150, 100, 30);
		add(rateQuantityLabel);

		rateQuantityButton = new JButton();
		rateQuantityButton.setText("FILL");
		rateQuantityButton.setBounds(fourthColumnStart, 150, 60, 25);
		add(rateQuantityButton);
		rateQuantityButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {

				fillPQ(rateQuantity);
				medication.setDosageQuantity(rateQuantity);

			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});


//recordingTime

		recordingTimeLabel = new JLabel();
		add(recordingTimeLabel);
		recordingTimeLabel.setBounds(thirdColumnStart, 190, 100, 30);
		recordingTimeLabel.setText("Recording Time");

		recordingTimeButton = new JButton();
		add(recordingTimeButton);
		recordingTimeButton.setBounds(fourthColumnStart, 190, 60, 25);
		recordingTimeButton.setText("FILL");
		recordingTimeButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				new TimeLiteralDialog(recordingTime).setVisible(true);
				medication.setRecordingTime(recordingTime);

			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		// route cd
		routeCdLabel = new JLabel();
		add(routeCdLabel);
		routeCdLabel.setBounds(thirdColumnStart, 230, 100, 30);
		routeCdLabel.setText("Route Cd");

		routeCdText = new JTextField();
		add(routeCdText);
		routeCdText.setBounds(fourthColumnStart, 230, 60, 25);


//serviceCd

		serviceCdLabel = new JLabel();
		add(serviceCdLabel);
		serviceCdLabel.setBounds(thirdColumnStart, 270, 100, 30);
		serviceCdLabel.setText("Service Cd");

		serviceCdButton = new JButton();
		add(serviceCdButton);
		serviceCdButton.setBounds(fourthColumnStart, 270, 60, 25);
		serviceCdButton.setText("FILL");
		serviceCdButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				fillConcept(serviceCd);
				medication.setServiceCd(serviceCd);


			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

//		 Status Cd
		statusCdLabel = new JLabel();
		add(statusCdLabel);
		statusCdLabel.setBounds(thirdColumnStart, 310, 100, 30);
		statusCdLabel.setText("Status Cd");

		statusCdText = new JTextField();
		add(statusCdText);
		statusCdText.setBounds(fourthColumnStart, 310, 60, 25);




//		 strengthQuantity	
		strengthQuantityLabel = new JLabel();
		strengthQuantityLabel.setText("Strength Qty.");
		strengthQuantityLabel.setBounds(thirdColumnStart, 350, 100, 30);
		add(strengthQuantityLabel);

		strengthQuantityButton = new JButton();
		strengthQuantityButton.setText("FILL");
		strengthQuantityButton.setBounds(fourthColumnStart, 350, 60, 25);
		add(strengthQuantityButton);
		strengthQuantityButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {

				fillPQ(strengthQuantity);
				medication.setDosageQuantity(strengthQuantity);

			}

			public void mousePressed(MouseEvent arg0) {
			}

			public void mouseReleased(MouseEvent arg0) {
			}

			public void mouseEntered(MouseEvent arg0) {
			}

			public void mouseExited(MouseEvent arg0) {
			}
		});


		// sendButton

		sendButton = new JButton();

		sendButton.setBounds(firstColumnStart, 390, 100, 50);
		sendButton.setText("Send");
		sendButton.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent arg0) {
				/// filling symbol entities
				///
				try {
					SymbolEntity se = new SymbolEntity();
					se.setSymbolValue(confidentialityText.getText());
					medication.setConfidentialityCd(se);


				} catch (Exception exc) {
					exc.printStackTrace();
				}
				try {
					SymbolEntity se = new SymbolEntity();
					se.setSymbolValue(doseFormCdText.getText());
					medication.setDoseFormCd(se);


				} catch (Exception exc) {
					exc.printStackTrace();
				}

				try {
					SymbolEntity se = new SymbolEntity();
					se.setSymbolValue(interpretationText.getText());
					medication.setInterpretationCd(se);


				} catch (Exception exc) {
					exc.printStackTrace();
				}

				try {
					SymbolEntity se = new SymbolEntity();
					se.setSymbolValue(moodCdText.getText());
					medication.setMoodCd(se);


				} catch (Exception exc) {
					exc.printStackTrace();
				}

				try {
					SymbolEntity se = new SymbolEntity();
					se.setSymbolValue(routeCdText.getText());
					medication.setRouteCd(se);


				} catch (Exception exc) {
					exc.printStackTrace();
				}

				try {
					SymbolEntity se = new SymbolEntity();
					se.setSymbolValue(statusCdText.getText());
					medication.setStatusCd(se);


				} catch (Exception exc) {
					exc.printStackTrace();
				}
				/// filling string  fields 
				///

				try {
					medication.setId(idText.getText());



				} catch (Exception exc) {
					exc.printStackTrace();

				}
				try {
					MonitoringAgent.getInstance().informConsultResult(targetAID, medication.toDataString());
					parentFrame.dispose();

				} catch (Exception exc) {
					exc.printStackTrace();

				}

			}

			public void mousePressed(MouseEvent arg0) {
			}

			public void mouseReleased(MouseEvent arg0) {
			}

			public void mouseEntered(MouseEvent arg0) {
			}

			public void mouseExited(MouseEvent arg0) {
			}
		});
		add(sendButton);









	}

	protected void fillPQ(PhysicalQuantityEntity pq) {
		PQDialog pqd = new PQDialog(pq);
		pqd.setVisible(true);

	}

	protected void fillConcept(ConceptEntity concept) {
		ConceptDialog cf = new ConceptDialog(concept);
		cf.setVisible(true);
		cf.dispose();
	}
}
