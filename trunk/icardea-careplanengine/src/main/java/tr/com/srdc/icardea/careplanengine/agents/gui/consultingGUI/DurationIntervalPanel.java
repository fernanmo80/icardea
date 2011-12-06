package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.*;

//~--- JDK imports ------------------------------------------------------------

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class DurationIntervalPanel extends JPanel {
    private DurationEntity minDuration = new DurationEntity();
    private DurationEntity maxDuration = new DurationEntity();
    private JDialog        dialog;
    private JLabel         displayNameLabel;
    private JTextField     displayNameText;
    private JButton        maxDurationButton;
    private JLabel         maxDurationLabel;
    private JButton        minDurationButton;
    private JLabel         minDurationLabel;
    private JButton        okButton;
    private Object         result;

    public DurationIntervalPanel(JDialog dialog, Object obj) {
        this.dialog = dialog;
        result      = obj;
        initializeComponents();
        this.setLayout(null);
    }

    public void fillDuration(DurationEntity duration) {
        DurationDialog dd = new DurationDialog(duration);

        dd.setVisible(true);
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
            minDurationLabel = new JLabel();
            minDurationLabel.setBounds(30, 70, 80, 25);
            minDurationLabel.setText("Min. Duration");
            add(minDurationLabel);
            minDurationButton = new JButton();
            minDurationButton.setBounds(120, 70, 60, 25);
            minDurationButton.setText("FILL");
            minDurationButton.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent arg0) {
                    fillDuration(minDuration);
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
            add(minDurationButton);

            // maxDuration
            maxDurationLabel = new JLabel();
            maxDurationLabel.setBounds(30, 110, 80, 25);
            maxDurationLabel.setText("Max. Duration");
            add(maxDurationLabel);
            maxDurationButton = new JButton();
            maxDurationButton.setBounds(120, 110, 60, 25);
            maxDurationButton.setText("FILL");
            maxDurationButton.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent arg0) {
                    fillDuration(maxDuration);
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
            add(maxDurationButton);

            // okButton
            okButton = new JButton();
            okButton.setText("OK");
            okButton.setBounds(30, 150, 60, 25);
            okButton.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent arg0) {
                    try {
                        DurationIntervalEntity durationInterval = (DurationIntervalEntity) result;

                        durationInterval.setDisplayName(displayNameText.getText());
                        durationInterval.setMinDuration(minDuration);
                        durationInterval.setMaxDuration(maxDuration);
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
