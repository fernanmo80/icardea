
/**
 * BadlyFormedMatchText.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package tr.com.srdc.icardea.cts.messageruntime;

public class BadlyFormedMatchText extends java.lang.Exception{
    
    private org.hl7.ctsmapi.BadlyFormedMatchText faultMessage;

    
        public BadlyFormedMatchText() {
            super("BadlyFormedMatchText");
        }

        public BadlyFormedMatchText(java.lang.String s) {
           super(s);
        }

        public BadlyFormedMatchText(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public BadlyFormedMatchText(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.hl7.ctsmapi.BadlyFormedMatchText msg){
       faultMessage = msg;
    }
    
    public org.hl7.ctsmapi.BadlyFormedMatchText getFaultMessage(){
       return faultMessage;
    }
}
    