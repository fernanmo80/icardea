package tr.com.srdc.icardea.careplanengine.agents.gui.util;

//~--- JDK imports ------------------------------------------------------------

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class IndeterminateProgressPanel extends JPanel {
    private final JLabel lab       = new JLabel();
    private String       labelText = "";
    private JDialog      parent;
    private JProgressBar progressBar;

    public IndeterminateProgressPanel(final JDialog progressDialog, final String labText) {
        super();
        this.parent = progressDialog;
        setOpaque(true);
        setBackground(Color.LIGHT_GRAY);
        labelText = labText;
        init();
    }

    public void setLabelText(final String labText) {
        this.labelText = labText;
    }

    public String getLabelText() {
        return labelText;
    }

    public void stop(final boolean sendToInvoker) {
        progressBar.setValue(progressBar.getMaximum());
        parent.dispose();
    }

    public void setIndeterminate(boolean indeterminate) {
        progressBar.setIndeterminate(true);
    }

    private void init() {
        setLayout(new BorderLayout());
        lab.setText(labelText);

        Font f = new Font("SansSerif", Font.BOLD, 10);

        lab.setFont(f);
        lab.setForeground(Color.BLUE);
        lab.setOpaque(true);
        lab.setBackground(Color.WHITE);
        lab.setBorder(BorderFactory.createEmptyBorder(2, 2, 0, 2));
        progressBar = new JProgressBar();
        progressBar.setValue(0);
        progressBar.setBackground(Color.WHITE);
        progressBar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

//      progressBar.setPreferredSize(new Dimension(300,10));
//      progressBar.setMaximumSize(new Dimension(300,10));
        progressBar.setForeground(Color.ORANGE);
        progressBar.setIndeterminate(true);
        progressBar.setBorder(BorderFactory.createEmptyBorder(0, 2, 2, 2));

//      progressPanel.add(progressBar);
        this.add(lab, BorderLayout.CENTER);
        this.add(progressBar, BorderLayout.SOUTH);

//      add(outerPanel);
        this.repaint();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
