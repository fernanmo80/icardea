package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.DurationIntervalEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.PhysicalQuantityEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.RangeEntity;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class RangePanel extends JPanel {
    private PhysicalQuantityEntity lowerBound = new PhysicalQuantityEntity();
    private PhysicalQuantityEntity upperBound = new PhysicalQuantityEntity();
    private JDialog                dialog;
    private JLabel                 displayNameLabel;
    private JTextField             displayNameText;
    private JButton                lowerBoundButton;
    private JLabel                 lowerBoundLabel;
    private JButton                okButton;
    private Object                 result;
    private JButton                upperBoundButton;
    private JLabel                 upperBoundLabel;

    public RangePanel(JDialog dialog, Object obj) {
        result      = obj;
        this.dialog = dialog;
        initializeComponents();
        this.setLayout(null);
    }

    private void fillPQ(PhysicalQuantityEntity pq) {
        PQDialog dialog = new PQDialog(pq);

        dialog.setVisible(true);
        dialog.dispose();
    }

    private void initializeComponents() {
        try {

            // display name
            displayNameLabel = new JLabel();
            displayNameLabel.setBounds(30, 30, 80, 25);
            displayNameLabel.setText("Display Name");
            add(displayNameLabel);
            displayNameText = new JTextField();
            displayNameText.setBounds(120, 30, 80, 25);
            displayNameText.setText("");
            add(displayNameText);

            // lowerBound
            lowerBoundLabel = new JLabel();
            lowerBoundLabel.setBounds(30, 70, 80, 25);
            lowerBoundLabel.setText("Lower");
            add(lowerBoundLabel);
            lowerBoundButton = new JButton();
            lowerBoundButton.setBounds(120, 70, 80, 25);
            lowerBoundButton.setText("FILL");
            lowerBoundButton.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent arg0) {
                    fillPQ(lowerBound);
                }
                public void mousePressed(MouseEvent arg0) {}
                public void mouseReleased(MouseEvent arg0) {}
                public void mouseEntered(MouseEvent arg0) {}
                public void mouseExited(MouseEvent arg0) {}
            });
            add(lowerBoundButton);

            // upperBound
            upperBoundLabel = new JLabel();
            upperBoundLabel.setBounds(30, 110, 80, 25);
            upperBoundLabel.setText("Upper");
            add(upperBoundLabel);
            upperBoundButton = new JButton();
            upperBoundButton.setBounds(120, 110, 80, 25);
            upperBoundButton.setText("FILL");
            upperBoundButton.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent arg0) {
                    fillPQ(upperBound);
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
            add(upperBoundButton);

            // okButton
            okButton = new JButton();
            okButton.setText("OK");
            okButton.setBounds(30, 150, 80, 25);
            okButton.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent arg0) {
                    try {
                        RangeEntity range = (RangeEntity) result;

                        range.setDisplayName(displayNameText.getText());
                        range.setLowerBound(lowerBound);
                        range.setUpperBound(upperBound);
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
