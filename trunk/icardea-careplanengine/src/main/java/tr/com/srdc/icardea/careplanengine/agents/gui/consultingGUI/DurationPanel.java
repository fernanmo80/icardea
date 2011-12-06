package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.ConceptEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.DurationEntity;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DurationPanel extends JPanel {
    private JDialog    dialog;
    private JLabel     displayNameLabel;
    private JTextField displayNameText;
    private JLabel     encodingLanguageLabel;
    private JTextField encodingLanguageText;
    private JButton    okButton;
    private Object     result;
    private JLabel     specificationLabel;
    private JTextField specificationText;

    public DurationPanel(DurationDialog dialog, Object obj) {
        this.dialog = dialog;
        result      = obj;
        initializeComponents();
        this.setLayout(null);
    }

    private void initializeComponents() {
        try {

            // encodingLanguage
            displayNameLabel = new JLabel();
            displayNameLabel.setText("Display Name");
            displayNameLabel.setBounds(30, 30, 80, 25);
            add(displayNameLabel);
            displayNameText = new JTextField();
            displayNameText.setText("");
            displayNameText.setBounds(170, 30, 80, 25);
            add(displayNameText);

            // specification
            specificationLabel = new JLabel();
            specificationLabel.setText("Specification");
            specificationLabel.setBounds(30, 70, 100, 25);
            add(specificationLabel);
            specificationText = new JTextField();
            specificationText.setText("");
            specificationText.setBounds(170, 70, 80, 25);
            add(specificationText);

            // encodingLanguage
            encodingLanguageLabel = new JLabel();
            encodingLanguageLabel.setText("Encoding Lang.");
            encodingLanguageLabel.setBounds(30, 110, 100, 25);
            add(encodingLanguageLabel);
            encodingLanguageText = new JTextField();
            encodingLanguageText.setText("");
            encodingLanguageText.setBounds(170, 110, 80, 25);
            add(encodingLanguageText);

            // OK Button and its evetn
            okButton = new JButton();
            okButton.setText("OK");
            okButton.setBounds(30, 150, 100, 25);
            add(okButton);
            okButton.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent arg0) {
                    try {

                        // Logger.getLogger(this.getClass()).log(Level.DEBUG, (((.setVisible(false));
                        dialog.setVisible(false);

                        DurationEntity duration = (DurationEntity) result;

                        duration.setDisplayName(displayNameText.getText());
                        duration.setSpecification(specificationText.getText());
                        duration.setEncodingLanguage(encodingLanguageText.getText());
                    } catch (Exception exc) {
                        exc.printStackTrace();
                    }
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
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
