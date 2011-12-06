package tr.com.srdc.icardea.careplanengine.agents.gui.dataaccess;

/**
 * @author mehmet olduz
 *
 * The object which is used by the DnD operations between Concept Tree and Map Tree
 * The object holds the Object of the concept and the tree type which may be source or target
 *
 */
public class DnDObject {
    public static final int ACTION_STEP_NODE = 7;
    public static final int BRANCH_NODE      = 8;
    public static final int CASE_STEP        = 10;

    // Attention: the type should be 1, 2, 3 for "EHR", "Medical", "Sensor" respectively.
    public static final int EHR_DATA_ACTION_NODE    = 1;
    public static final int ELIGIBILITY_NODE        = 6;
    public static final int GUIDELINE_NODE          = 5;
    public static final int LEFT_SIDE_DIFFERENCE    = 100;
    public static final int MOA_ACTION_NODE         = 2;
    public static final int ROOT_NODE               = 0;
    public static final int SENSOR_DATA_ACTION_NODE = 3;
    public static final int SUB_GUIDELINE_ROOT      = 4;
    public static final int SYNCRONIZATION_STEP     = 9;
    public static final int UNDEFINED_NODE          = -1;
    public static final int SENSOR_SERVICE          = LEFT_SIDE_DIFFERENCE + 3;
    public static final int MOA_SERVICE             = LEFT_SIDE_DIFFERENCE + 2;
    public static final int EHR_SERVICE             = LEFT_SIDE_DIFFERENCE + 1;
    private Object          object                  = null;
    private int             type                    = -1;

    public DnDObject(Object obj, int type) {
        object    = obj;
        this.type = type;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object obj) {
        object = obj;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String toString() {
        return object.toString();
    }

    public boolean equals(Object object) {
        if (object instanceof DnDObject) {
            DnDObject dndObject = (DnDObject) object;

            return getObject().equals(dndObject.getObject()) && (getType() == dndObject.getType());
        }

        return super.equals(object);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
