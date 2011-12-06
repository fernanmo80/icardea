
/*
* TableTransferHandler.java
*
* Created on April 7, 2006, 5:32 PM
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
 */
package tr.com.srdc.icardea.careplanengine.agents.gui.dataaccess;

//~--- JDK imports ------------------------------------------------------------

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;

import java.io.IOException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mehmet olduz
 */
public class TableTransferHandler extends TransferHandler {
    DataFlavor dataFlavor = new DataFlavor(DnDObject.class, "Mapper Data Flavor");

    protected Transferable createTransferable(JComponent c) {
        return null;
    }

    public int getSourceActions(JComponent c) {
        return COPY_OR_MOVE;
    }

    public boolean importData(JComponent c, Transferable t) {
        if (canImport(c, t.getTransferDataFlavors())) {
            try {
                DnDObject         object = (DnDObject) t.getTransferData(dataFlavor);
                JTable            target = (JTable) c;
                DefaultTableModel model  = (DefaultTableModel) target.getModel();
                int               index  = target.getSelectedRow();

                if (index < 0) {
                    JOptionPane.showMessageDialog(null, "No row is selected!");

                    return false;
                }

//              if (index < 0) {
//                  model.addRow(new String[]{null, null});
//                  index = model.getRowCount()-1;
//              }else if(index == target.getRowCount()-1){
//                  model.addRow(new String[]{null, null});
//              }

                setValueOfCell(model, object, index);

                return true;
            } catch (UnsupportedFlavorException ufe) {}
            catch (IOException ioe) {}
        }

        return false;
    }

    private void setValueOfCell(DefaultTableModel model, DnDObject object, int row) {
        int     column   = 0;
        boolean isSource = isSource(object.getType());

        if (isSource) {
            column = 0;
        } else {
            column = 1;
        }

        if (model.getValueAt(row, column) != null) {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to override the old value?");

            if (response != JOptionPane.OK_OPTION) {
                return;
            }
        }

        model.setValueAt(object, row, column);
    }

    private boolean isSource(int type) {
        return (type == DnDObject.MOA_ACTION_NODE) || (type == DnDObject.EHR_DATA_ACTION_NODE)
               || (type == DnDObject.SENSOR_DATA_ACTION_NODE);
    }

    public boolean canImport(JComponent c, DataFlavor[] flavors) {
        for (int i = 0; i < flavors.length; i++) {
            if (dataFlavor.equals(flavors[i])) {
                return true;
            }
        }

        return false;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
