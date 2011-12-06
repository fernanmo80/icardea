
/**
 * UnknownConceptCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package tr.com.srdc.icardea.cts.messageruntime;

public class UnknownConceptCode extends java.lang.Exception{
    
    private org.hl7.ctsmapi.UnknownConceptCode faultMessage;

    
        public UnknownConceptCode() {
            super("UnknownConceptCode");
        }

        public UnknownConceptCode(java.lang.String s) {
           super(s);
        }

        public UnknownConceptCode(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UnknownConceptCode(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.hl7.ctsmapi.UnknownConceptCode msg){
       faultMessage = msg;
    }
    
    public org.hl7.ctsmapi.UnknownConceptCode getFaultMessage(){
       return faultMessage;
    }
}
    