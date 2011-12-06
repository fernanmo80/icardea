package tr.com.srdc.icardea.careplanengine.agents.gui.graph.history;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Vector;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;

public class GuidelineHistoryFrameMouseListener implements MouseListener {
    private JTable                _associatedTable;
    private JTableHeader          _associatedTableHeader;
    private GuidelineHistoryFrame _gHistoryFrame;

    GuidelineHistoryFrameMouseListener(GuidelineHistoryFrame gHistoryFrame, JTable associatedTable) {
        this._gHistoryFrame   = gHistoryFrame;
        this._associatedTable = associatedTable;
    }

    GuidelineHistoryFrameMouseListener(GuidelineHistoryFrame gHistoryFrame, JTableHeader associatedTableHeader) {
        this._gHistoryFrame         = gHistoryFrame;
        this._associatedTableHeader = associatedTableHeader;
    }

    public void mouseClicked(MouseEvent arg0) {
        if (arg0.getComponent() instanceof JTable) {
            int selectedRow = _associatedTable.getSelectedRow();

            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("selected row = " + selectedRow));
            _gHistoryFrame.signalRowSelection(selectedRow);
        } else if (arg0.getComponent() instanceof JTableHeader) {
            int colToSort = _associatedTableHeader.columnAtPoint(arg0.getPoint());

            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("selected col = " + colToSort));

            if (colToSort >= 0) {
                _gHistoryFrame.setColumnToSort(colToSort);
            }
        }
    }

    public void mouseEntered(MouseEvent arg0) {

        // TODO Auto-generated method stub
    }

    public void mouseExited(MouseEvent arg0) {

        // TODO Auto-generated method stub
    }

    public void mousePressed(MouseEvent arg0) {

        // TODO Auto-generated method stub
    }

    public void mouseReleased(MouseEvent arg0) {

        // TODO Auto-generated method stub
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
