package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.DurationIntervalEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.TimeIntervalEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.TimeLiteralEntity;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TimeIntervalPanel extends JPanel {
    private TimeLiteralEntity minTimestamp = new TimeLiteralEntity();
    private TimeLiteralEntity maxTimestamp = new TimeLiteralEntity();
    private JDialog           dialog;
    private JLabel            displayNameLabel;
    private JTextField        displayNameText;
    private JButton           maxTimeStampButton;
    private JLabel            maxTimeStampLabel;
    private JButton           minTimeStampButton;
    private JLabel            minTimeStampLabel;
    private JButton           okButton;
    private Object            result;

    public TimeIntervalPanel(TimeIntervalDialog dialog, Object obj) {
        this.dialog = dialog;
        result      = obj;
        initializeComponents();
        this.setLayout(null);
    }

    private void initializeComponents() {
        try {

            // display name
            displayNameLabel = new JLabel();
            displayNameLabel.setBounds(30, 30, 80, 25);
            displayNameLabel.setText("Display Name");
            add(displayNameLabel);
            displayNameText = new JTextField();
            displayNameText.setBounds(120, 30, 60, 25);
            displayNameText.setText("");
            add(displayNameText);

            // minDuration
            minTimeStampLabel = new JLabel();
            minTimeStampLabel.setBounds(30, 70, 80, 25);
            minTimeStampLabel.setText("Min. Timestamp");
            add(minTimeStampLabel);
            minTimeStampButton = new JButton();
            minTimeStampButton.setBounds(120, 70, 60, 25);
            minTimeStampButton.setText("FILL");
            minTimeStampButton.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent arg0) {
                    TimeLiteralDialog dialog = new TimeLiteralDialog(minTimestamp);

                    dialog.setVisible(true);
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
            add(minTimeStampButton);

            // maxDuration
            maxTimeStampLabel = new JLabel();
            maxTimeStampLabel.setBounds(30, 110, 80, 25);
            maxTimeStampLabel.setText("Max. Timettamp");
            add(maxTimeStampLabel);
            maxTimeStampButton = new JButton();
            maxTimeStampButton.setBounds(120, 110, 60, 25);
            maxTimeStampButton.setText("FILL");
            maxTimeStampButton.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent arg0) {
                    TimeLiteralDialog dialog = new TimeLiteralDialog(maxTimestamp);

                    dialog.setVisible(true);
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
            add(maxTimeStampButton);

            // okButton
            okButton = new JButton();
            okButton.setText("OK");
            okButton.setBounds(30, 150, 60, 25);
            okButton.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent arg0) {
                    try {
                        TimeIntervalEntity timeInterval = (TimeIntervalEntity) result;

                        timeInterval.setDisplayName(displayNameText.getText());
                        timeInterval.setMinTimeStamp(minTimestamp);
                        timeInterval.setMaxTimeStamp(maxTimestamp);
                    } catch (Exception exc) {
                        exc.printStackTrace();
                    }

                    dialog.setVisible(false);
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
            add(okButton);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
