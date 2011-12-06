
/**
 *              Author                  Date
 *              ---------               ------------
 *              METU_SRDC               January 2006
 *
 *              Description
 *              -----------
 *
 *              Individual2Object class is responsible for specifying
 *              the Protege OWL file, the class of this file and the instance
 *              of that class to convert the instance to java object.
 *
 *              Individual2Object class provides a frame for the selection
 *
 *
 *
 */
package tr.com.srdc.icardea.careplanengine.agents.gui.graph;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.glmodel.Configuration;
import tr.com.srdc.icardea.careplanengine.glmodel.InstanceFactory;
import tr.com.srdc.icardea.careplanengine.glmodel.impl.DefaultGuideline;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import java.util.Vector;

import javax.swing.*;

/**
 * This is a temporary class for testing Guideline Graph
 */
@SuppressWarnings("serial")
public class Individual2ObjectFrame extends JFrame implements WindowListener {
    private GuidelineMonitoringPanel guidelineMonitoringPanel              = null;
    private JTextField               mClassListField                       = null;
    private JPanel                   mContentPanePanel                     = null;
    private JButton                  mConvertSelectedInstance2ObjectButton = null;
    private JComboBox                mIndividualListComboBox               = null;
    private InstanceFactory          mInstanceFactory                      = null;
    private JButton                  mLoadURIButton                        = null;
    private JTextField               mURITextField                         = null;

    /**
     * This is the default constructor
     */
    public Individual2ObjectFrame(GuidelineMonitoringPanel guidelineMonitoringPanel) {
        super();
        this.guidelineMonitoringPanel = guidelineMonitoringPanel;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initialize();
        loadOntology();
    }

    /**
     *
     * @param aCB
     * @param aList
     *
     * This method simply assigns a string list to the
     * content of a combo box
     *
     */
    private void fillComboBox(JComboBox aCB, Vector<String> aList) {
        aCB.removeAllItems();

        for (int i = 0; i < aList.size(); i++) {
            aCB.addItem(aList.elementAt(i));
        }
    }

    /**
     * This method initializes mIndividualListComboBox
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getMIndividualListComboBox() {
        if (mIndividualListComboBox == null) {
            mIndividualListComboBox = new JComboBox();
            mIndividualListComboBox.setBounds(new java.awt.Rectangle(228, 103, 168, 25));
            mIndividualListComboBox.setEditable(false);
        }

        return mIndividualListComboBox;
    }

    /**
     * This method initializes mClassListField
     *
     * @return javax.swing.JTextField
     */
    private JTextField getMClassField() {
        if (mClassListField == null) {
            mClassListField = new JTextField();
            mClassListField.setEditable(false);
            mClassListField.setBounds(new java.awt.Rectangle(8, 103, 200, 25));
        }

        return mClassListField;
    }

    /**
     * This method initializes mURITextField
     * Temproraly, default text in this text field
     * is assigned
     *
     * @return javax.swing.JTextField
     */
    private JTextField getMURITextField() {
        if (mURITextField == null) {
            mURITextField = new JTextField();
            mURITextField.setBounds(new java.awt.Rectangle(8, 42, 283, 20));

//          URL url = getClass().getClassLoader().getResource("owl/coughOWL.owl");
            mURITextField.setText("http://localhost/gl/scubGL1v10.owl");
        }

        return mURITextField;
    }

    private JButton getMConvertSelectedInstance2ObjectButton() {
        if (mConvertSelectedInstance2ObjectButton == null) {
            mConvertSelectedInstance2ObjectButton = new JButton();
            mConvertSelectedInstance2ObjectButton.setText("Draw Guideline");
            mConvertSelectedInstance2ObjectButton.setBounds(new java.awt.Rectangle(262, 183, 133, 28));
            mConvertSelectedInstance2ObjectButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    drawGuideline();
                }
            });
        }

        return mConvertSelectedInstance2ObjectButton;
    }

    public void drawGuideline() {
        if (mIndividualListComboBox.getSelectedItem() != null) {
            String aClassName       = Configuration.GUIDELINE_CLASSNAME_IN_OWL;
            String anIndividualName = (String) mIndividualListComboBox.getSelectedItem();
            Object lObject          = mInstanceFactory.createIndividual(aClassName, anIndividualName);

            if (lObject != null) {
                if (lObject instanceof DefaultGuideline) {
                    DefaultGuideline guideline = (DefaultGuideline) lObject;
                    String           uri       = mURITextField.getText().trim();

                    guidelineMonitoringPanel.drawGuideline(guideline, uri);
                }
            }
        }
    }

    /**
     * This method initializes mLoadURIButton
     *
     * @return javax.swing.JButton
     */
    private JButton getMLoadURIButton() {
        if (mLoadURIButton == null) {
            mLoadURIButton = new JButton();
            mLoadURIButton.setBounds(new java.awt.Rectangle(301, 42, 94, 20));
            mLoadURIButton.setText("Load OWL");
            mLoadURIButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    loadOntology();
                    mIndividualListComboBox.setSelectedIndex(0);
                    drawGuideline();
                }
            });
        }

        return mLoadURIButton;
    }

    private void loadOntology() {
        String uri = mURITextField.getText().trim();

        mInstanceFactory = InstanceFactory.getInstance(uri);
        mClassListField.setText(Configuration.GUIDELINE_CLASSNAME_IN_OWL + " of "
                                + uri.substring(uri.lastIndexOf("/") + 1));
        fillComboBox(mIndividualListComboBox,
                     mInstanceFactory.getIndividualNames(Configuration.GUIDELINE_CLASSNAME_IN_OWL));
    }

    /**
     * This method initializes this frame
     *
     *
     */
    private void initialize() {
        this.setSize(450, 300);
        this.setContentPane(getMContentPanePanel());
        this.setTitle("OWL2JavaObjectModel");
    }

    /**
     * This method initializes mContentPanePanel
     *
     * @return javax.swing.JPanel
     */
    private JPanel getMContentPanePanel() {
        if (mContentPanePanel == null) {
            JLabel mIndividualsLabel = new JLabel();

            mIndividualsLabel.setBounds(new java.awt.Rectangle(228, 82, 71, 16));
            mIndividualsLabel.setText("Instances");

            JLabel mOWLClassesLabel = new JLabel();

            mOWLClassesLabel.setBounds(new java.awt.Rectangle(9, 84, 157, 16));
            mOWLClassesLabel.setText("Guideline Class");

            JLabel mURILabel = new JLabel();

            mURILabel.setBounds(new java.awt.Rectangle(10, 23, 58, 16));
            mURILabel.setText("URI");
            mContentPanePanel = new JPanel();
            mContentPanePanel.setLayout(null);
            mContentPanePanel.add(getMIndividualListComboBox(), null);
            mContentPanePanel.add(getMClassField(), null);
            mContentPanePanel.add(getMURITextField(), null);

//          mContentPanePanel.add(getMNewInstanceButton(), null);
            mContentPanePanel.add(getMConvertSelectedInstance2ObjectButton(), null);
            mContentPanePanel.add(getMLoadURIButton(), null);
            mContentPanePanel.add(mURILabel, null);
            mContentPanePanel.add(mOWLClassesLabel, null);
            mContentPanePanel.add(mIndividualsLabel, null);
        }

        return mContentPanePanel;
    }

    public void windowOpened(WindowEvent arg0) {}

    public void windowClosing(WindowEvent arg0) {
        System.exit(0);
    }

    public void windowClosed(WindowEvent arg0) {
        this.dispose();
    }

    public void windowIconified(WindowEvent arg0) {}

    public void windowDeiconified(WindowEvent arg0) {}

    public void windowActivated(WindowEvent arg0) {}

    public void windowDeactivated(WindowEvent arg0) {}
}


//~ Formatted by Jindent --- http://www.jindent.com
