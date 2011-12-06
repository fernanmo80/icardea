
/*
* Created on April 7, 2006, 2:34 PM
*
* TODO To change the template for this generated file go to
* Window - Preferences - Java - Code Style - Code Templates
 */
package tr.com.srdc.icardea.careplanengine.agents.gui.dataaccess;

//~--- JDK imports ------------------------------------------------------------

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;

import java.io.IOException;

/**
 * @author mehmet olduz
 *
 * Transferable encapsulates the Object Flavor and data encapsulation code
 */
public class TransferableObject implements Transferable {
    private static DataFlavor dndTransferableObjectFlavor = null;
    private DnDObject         object                      = null;

    public TransferableObject(DnDObject obj) {
        object                      = obj;
        dndTransferableObjectFlavor = new DataFlavor(DnDObject.class, "Mapper Data Flavor");
    }

    /*
     *  (non-Javadoc)
     * @see java.awt.datatransfer.Transferable#getTransferDataFlavors()
     */
    public DataFlavor[] getTransferDataFlavors() {
        return new DataFlavor[] { dndTransferableObjectFlavor };
    }

    /*
     *  (non-Javadoc)
     * @see java.awt.datatransfer.Transferable#isDataFlavorSupported(java.awt.datatransfer.DataFlavor)
     */
    public boolean isDataFlavorSupported(DataFlavor flavor) {
        if (flavor.equals(dndTransferableObjectFlavor)) {
            return true;
        }

        return false;
    }

    /*
     *  (non-Javadoc)
     * @see java.awt.datatransfer.Transferable#getTransferData(java.awt.datatransfer.DataFlavor)
     */
    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        if (flavor.equals(dndTransferableObjectFlavor)) {
            return object;
        }

        return null;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
