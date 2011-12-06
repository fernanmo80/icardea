package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent;

//~--- non-JDK imports --------------------------------------------------------


//~--- JDK imports ------------------------------------------------------------

import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Administrator
 */
public class GuidelineExecutionUtility {

    // private static GuidelineExecutionUtility instance=new GuidelineExecutionUtility();

    /** Creates a new instance of AgentSRDCUtility */
    public GuidelineExecutionUtility() {}

    // public static GuidelineExecutionUtility getInstance(){return instance;}
    // This method returns a hashtable containing the needed object parameters
    // to execute the JavaScript expression. Parameters are obtained from the globalVariablePool.
    public static Hashtable getJavaScriptExpressionParameters(GuidelineAgent guidelineAgent, String expression) {
        Vector    vector     = JavaScriptExpressionExecuter.getJavaScriptFunctionVariables(expression);
        Hashtable parameters = new Hashtable();

        for (int j = 0; j < vector.size(); j++) {
            Object object = guidelineAgent.getGlobalVariable(vector.elementAt(j).toString());

            parameters.put(vector.elementAt(j).toString(), object);
        }

        return parameters;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
