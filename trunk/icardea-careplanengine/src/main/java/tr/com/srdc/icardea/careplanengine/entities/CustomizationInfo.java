
/*
* Created on Jul 5, 2006
 */
package tr.com.srdc.icardea.careplanengine.entities;

/**
 * @author mustafa
 * modified by IPA
 *
 */
public class CustomizationInfo {
    private int    cid;
    private String expression;
    private String importance;
    private String message;

    public CustomizationInfo() {}

    /**
     * @param importance
     * @param message
     * @param expression
     */
    public CustomizationInfo(String importance, String message, String expression) {
        this.importance = importance;
        this.message    = message;
        this.expression = expression;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
