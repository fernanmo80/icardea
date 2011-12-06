package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent;

//~--- non-JDK imports --------------------------------------------------------

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.mozilla.javascript.*;

import tr.com.srdc.icardea.careplanengine.glmodel.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class JavaScriptExpressionExecuter {
	public static Logger logger = Logger.getLogger(JavaScriptExpressionExecuter.class);
    /** Creates a new instance of JavaScriptExpressionExecuter */
    private String guidelineURI;

    public JavaScriptExpressionExecuter(String guidelineURI) {
        this.guidelineURI = guidelineURI;
    }

    public Object executeExpression(String expression, Hashtable parameters) {
        Vector variables = JavaScriptExpressionExecuter.getJavaScriptFunctionVariables(expression);
        
        // The expressions are going to be written in JavaScript.
        // They will have the form "function f(par1, par2, ...)"
        // We add a call to the function under its definition.
        // The format of the overhead is shown below...

        /**
         *
         * Here comes the description to be
         * displayed to the doctor. What the
         * function does is presented here...
         *
         * @param SystolicBP    e.g. The pressure at which this sound is
         *                      first heard is the systolic blood pressure..
         *
         * @param AsthmaStatus  ...
         *
         * @return              What does it mean to return true/false?
         *
         */
        // skip the comment part and then find the functionname;
        int overhead = expression.indexOf("*/");

        if (overhead >= 0) {
            overhead = expression.indexOf("function", overhead + 2);
        }

        String functionCall = expression.substring(expression.indexOf(" ", overhead), expression.indexOf("(") + 1);

        expression = expression + "\n" + functionCall.trim();

        for (int i = 0; i < variables.size(); i++) {
            expression = expression + variables.elementAt(i) + ",";
        }

        if (expression.charAt(expression.length() - 1) == ',') {
            expression = expression.substring(0, expression.length() - 1);
        }

        expression = expression + ");";

        // Add the import statement for the Factory Retriever.
        expression = "importPackage(Packages.tr.com.srdc.icardea.careplanengine.agents.guidelineAgent)\n"
                     + "importPackage(Packages.tr.com.srdc.icardea.careplanengine.glmodel)\n" + expression;
        logger.info("EXPression" + expression);
        return executeJS(expression, parameters);
    }

    @SuppressWarnings("unused")
    private Object executeJS(String s, Hashtable parameters) {
        Context cx = Context.enter();

        try {
            String key        = null;
            Object value      = null;
            Object wrappedOut = null;

            // Scriptable scope = cx.initStandardObjects();
            // Scope is set so as to use FactoryRetriever's static methods.
            Scriptable  scope   = new ImporterTopLevel(cx);
            Enumeration keyEnum = parameters.keys();

            while (keyEnum.hasMoreElements()) {
                key   = (String) keyEnum.nextElement();
                value = parameters.get(key);
                logger.info("KEY&VALUE" + key + "&" + value);
                Observation_Value obsValue = null;

                if (value instanceof Data_Item) {
                    value = FactoryRetriever.retrieveDataItemValue(guidelineURI, (Data_Item) value);
                    ((Observation) value).setValue(FactoryRetriever.retrieveObservationValue(guidelineURI,
                            ((Observation) value).getValue()));
                    obsValue = ((Observation) value).getValue();
                } else if (value instanceof Observation) {
                    Observation obs = (Observation) value;

                    if (obs.hasValue()) {
                        obsValue = FactoryRetriever.retrieveObservationValue(guidelineURI, obs.getValue());
                        obs.setValue(obsValue);
                    }
                }

                wrappedOut = Context.javaToJS(value, scope);
                ScriptableObject.putProperty(scope, key, wrappedOut);
            }

            // Add a global variable "out" that is a JavaScript reflection
            // of System.out. Just to be able to print inside a JavaScript
            // using "out.println(String)" etc.
            wrappedOut = Context.javaToJS(System.out, scope);
            ScriptableObject.putProperty(scope, "out", wrappedOut);

            Object result = null;
            logger.info("The string to be executed is: " + s);
            try {
                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("The string to be executed is: " + s));
                result = cx.evaluateString(scope, s, "<cmd>", 1, null);
            } catch (JavaScriptException e) {
                e.printStackTrace();
            }

            // The result can be an Object, String,
            // Return result as a java object.
            if (result instanceof NativeJavaObject) {
                return ((NativeJavaObject) result).unwrap();
            } else {
                return result;
            }
        } finally {
            Context.exit();
        }
    }

    public static String getFunctionCall(String expression) {
        String fcall;

        fcall = expression.substring(expression.indexOf(" ") + 1, expression.indexOf(")") + 1);

        return fcall;
    }

    public static Vector getJavaScriptFunctionVariables(String f) {
        Vector vector     = new Vector();
        int    beginIndex = f.indexOf('(') + 1;
        int    endIndex   = f.indexOf(',');
        int    tempIndex  = f.indexOf(')');

        while (true) {
            if ((beginIndex == tempIndex) || (beginIndex == tempIndex + 1)
                    || f.substring(beginIndex, tempIndex).trim().equals("")) {
                break;
            }

            if ((endIndex == -1) || (endIndex > tempIndex)) {
                endIndex = tempIndex;
            }

            try {
                String var = f.substring(beginIndex, endIndex).trim();

                if ((var != null) &&!var.equals("")) {
                    vector.add(var);
                } else {
                    break;
                }
            } catch (Exception e) {
                return vector;
            }

            beginIndex = endIndex + 1;
            endIndex   = f.indexOf(',', beginIndex);
        }

        return vector;
    }

    // This method returns a hashtable containing the needed object parameters
    // to execute the JavaScript expression. Parameters are obtained from the globalVariablePool.
    public static Hashtable getJavaScriptExpressionParameters(GuidelineAgent guidelineAgent, String expression) {
        Vector    variables  = JavaScriptExpressionExecuter.getJavaScriptFunctionVariables(expression);
        Hashtable parameters = new Hashtable();
        String    variableName;

        for (int j = 0; j < variables.size(); j++) {
            variableName = variables.elementAt(j).toString();
            logger.info("VARIABLE NAME:" + variableName);
            Object object = guidelineAgent.getGlobalVariable(variableName);
            logger.info("VARIABLE OBJECT:" + object);
            // Below should never happen, all the needed "Data_Item"s for the
            // script will be inserted to the globalVariablePool at the initialization
            // of the GuidelineAgent.
            while (object == null) {

                // Then the parameter is not in the globalVariablePool
                // Create an object and insert it to the pool.
                try {
                    Thread.sleep(5000);
                    object = guidelineAgent.getGlobalVariable(variableName);
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }


//            if (object instanceof Observation) {
//                Observation obs = (Observation) object;
//
//                if (obs.hasValue()) {
//                    Observation_Value val = FactoryRetriever.retrieveObservationValue(guidelineAgent.getGuidelineURI(),
//                                                obs.getValue());
//
//                    if (val instanceof Text_Value) {
//                    } else if (val instanceof Index) {
//                    }
//                }
//            }

            parameters.put(variableName, object);
        }

        return parameters;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
