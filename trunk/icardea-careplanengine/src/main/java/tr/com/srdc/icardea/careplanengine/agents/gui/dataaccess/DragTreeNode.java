
/*
* Created on April 7, 2006, 2:34 PM
*
* TODO To change the template for this generated file go to
* Window - Preferences - Java - Code Style - Code Templates
 */
package tr.com.srdc.icardea.careplanengine.agents.gui.dataaccess;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.glmodel.Subguideline_Action;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author mehmet olduz
 *
 * This tree node is used by the DragTree instances to present
 * the properties of a concept
 *
 */
public class DragTreeNode extends DefaultMutableTreeNode {
    private int type = -1;

    public DragTreeNode(Object obj, int nodeType) {
        super(obj);
        type = nodeType;
    }

    public String toString() {
        if ((type == DnDObject.ROOT_NODE) || (type == DnDObject.UNDEFINED_NODE)) {
            return super.toString();
        }

        Object userObject = this.getUserObject();

        if (type == DnDObject.SUB_GUIDELINE_ROOT) {
            return "[ SUB GUIDELINE ] " + ((Subguideline_Action) userObject).getName2();
        }

        return userObject.toString();
    }

    public int getType() {
        return type;
    }

    public boolean isTransferable() {
        return (type == DnDObject.EHR_SERVICE) || (type == DnDObject.MOA_SERVICE) || (type == DnDObject.SENSOR_SERVICE);

        /*
         *       type==DnDObject.EHR_DATA_ACTION_NODE ||
         *       type==DnDObject.MOA_ACTION_NODE ||
         *       type==DnDObject.SENSOR_DATA_ACTION_NODE;
         */
    }

    public boolean isGuidelineAction() {
        return (type == DnDObject.EHR_DATA_ACTION_NODE) || (type == DnDObject.MOA_ACTION_NODE)
               || (type == DnDObject.SENSOR_DATA_ACTION_NODE);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
