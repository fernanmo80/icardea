/*
 * ObservationTextValuePanel.java
 *
 * Created on November 9, 2007, 1:44 PM
 */
package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import org.jdesktop.layout.GroupLayout.ParallelGroup;
import org.jdesktop.layout.GroupLayout.SequentialGroup;

import tr.com.srdc.icardea.careplanengine.agents.monitoringAgent.MonitoringAgent;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.ObservationEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.TextValueEntity;
import edu.stanford.smi.protege.util.BrowserLauncher;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
import org.apache.log4j.Logger;

/**
 * 
 * @author mehmet
 */
public class ObservationTextValuePanel extends javax.swing.JPanel {

	private JFrame parentFrame = null;
	private ObservationEntity observation = null;
	private String targetAID = null;
	private MonitoringAgent agent = null;
	public static Logger logger = Logger.getLogger(ObservationTextValuePanel.class);

	public class HyperListener extends JFrame implements HyperlinkListener {

		@Override
		public void hyperlinkUpdate(HyperlinkEvent event) {
			if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
				try {
					BrowserLauncher.openURL(event.getURL().toString());
					// explanationLabel.setPage(event.getURL());
				} catch (IOException ioe) {
					warnUser("Can't follow link to "
						+ event.getURL().toExternalForm() + ": " + ioe);
				}
			}
		}

		private void warnUser(String message) {
			JOptionPane.showMessageDialog(this, message, "Error",
				JOptionPane.ERROR_MESSAGE);
		}
	}

	/** Creates new form ObservationTextValuePanel */
	public ObservationTextValuePanel() {
		initComponents();
	}

	public String refineConsultSentence(String consultSentence) {
		while (consultSentence.contains("<form action")) {
			int beginIndex, endIndex;
			int beginIndex2, endIndex2;
			beginIndex = consultSentence.indexOf("<form action", 0);
			endIndex = consultSentence.indexOf("</form>", beginIndex) + 7;
			String valueStr = "";
			String form = consultSentence.substring(beginIndex, endIndex);
			int startIndex = 0;
			while (form.indexOf("<input", startIndex) != -1) {
				beginIndex2 = form.indexOf("value=\"", startIndex);
				endIndex2 = form.indexOf("\"/>", beginIndex2);
				String optionName = form.substring(beginIndex2 + 7,
					endIndex2);
				javax.swing.JButton option = new javax.swing.JButton();
				option.setName(optionName);
				option.setText(optionName);
				option.addActionListener(new java.awt.event.ActionListener() {

					public void actionPerformed(java.awt.event.ActionEvent evt) {
						optionChooseActionPerformed(evt);
					}
				});
				options.add(option);
				startIndex = endIndex2;
			}
			consultSentence = consultSentence.replace(consultSentence.substring(beginIndex, endIndex), "");
		}
		int searchIndex = 0;
		while (consultSentence.indexOf("Date: <b>", searchIndex) >= 0) {
			logger.info(consultSentence);
			int beginIndex, endIndex;
			beginIndex = consultSentence.indexOf("Date: <b>", searchIndex) + 9;
			endIndex = beginIndex + 14;
			searchIndex = endIndex;
			String dateString = consultSentence.substring(beginIndex, endIndex);
			Date date = new Date();
			/*SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
			SimpleDateFormat formatter2 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			try {
				date = formatter.parse(dateString);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			consultSentence.replace(consultSentence.substring(beginIndex, endIndex),
				formatter2.format(date));*/
		}
		//System.out.println(consultSentence);
		return consultSentence;
	}

	public ObservationTextValuePanel(JFrame consultingGUI,
		ObservationEntity obs, MonitoringAgent monitoringAgent,
		String senderAID, String consultSentence, String patientName,
		String patientID) {
		parentFrame = consultingGUI;
		observation = obs;
		targetAID = senderAID;
		this.agent = monitoringAgent;
		consultSentence = refineConsultSentence(consultSentence);
		initComponents();

		HTMLEditorKit kit = new HTMLEditorKit();
		explanationTextArea.setEditorKit(kit);

		StyleSheet styleSheet = kit.getStyleSheet();
		styleSheet.addRule("body { background: #FFFFFF; font-size: 10px; font: Verdana, Helvetica, sans-serif; color: #666666; 	margin: 0; background: #F6F5F5; text-align: center; }");
		styleSheet.addRule("img { background: #FAFAFA; border: 1px solid #DCDCDC; }");

		this.explanationTextArea.setText(consultSentence);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed"
	// desc=" Generated Code ">                          
	private void initComponents() {
		upperPanel = new javax.swing.JPanel();
		explanationTextArea = new javax.swing.JEditorPane();

		explanationTextArea.setContentType("text/html");
		upperPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		HyperListener hl = new HyperListener();
		explanationTextArea.addHyperlinkListener(hl);
		explanationTextArea.setEditable(false);
		explanationTextArea.setFont(new java.awt.Font("Bitstream Vera Sans", 1,
			15));

		org.jdesktop.layout.GroupLayout upperPanelLayout = new org.jdesktop.layout.GroupLayout(
			upperPanel);
		upperPanel.setLayout(upperPanelLayout);
		upperPanelLayout.setHorizontalGroup(upperPanelLayout.createParallelGroup().add(explanationTextArea));
		upperPanelLayout.setVerticalGroup(upperPanelLayout.createParallelGroup().add(explanationTextArea));


		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
			this);
		layout.setAutocreateContainerGaps(true);
		layout.setAutocreateGaps(true);

		this.setLayout(layout);

		ParallelGroup parallelGroup = layout.createParallelGroup();
		parallelGroup.add(upperPanel);


		SequentialGroup sequentialGroup = layout.createSequentialGroup();
		for (JButton option : options) {
			sequentialGroup.add(option);
		}
		parallelGroup.add(sequentialGroup);
		layout.setHorizontalGroup(parallelGroup);


		SequentialGroup sequentialGroup2 = layout.createSequentialGroup();
		sequentialGroup2.add(upperPanel);

		ParallelGroup parallelGroup2 = layout.createParallelGroup();
		for (JButton option : options) {
			parallelGroup2.add(option);
		}
		sequentialGroup2.add(parallelGroup2);
		layout.setVerticalGroup(sequentialGroup2);
	}

	private void optionChooseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sendConsultResultActionPerformed
		String result = ((JButton) evt.getSource()).getName();
		TextValueEntity textValueEntity = new TextValueEntity();

		textValueEntity.setText(result);
		observation.setValue(textValueEntity);
		MonitoringAgent.getInstance().informConsultResult(targetAID,
			observation.toDataString());
		parentFrame.dispose();
	}
	// Variables declaration - do not modify//GEN-BEGIN:variables

	private javax.swing.JEditorPane explanationTextArea;
	private ArrayList<javax.swing.JButton> options = new ArrayList<JButton>();;
	private javax.swing.JPanel upperPanel;
	// End of variables declaration//GEN-END:variables
}
