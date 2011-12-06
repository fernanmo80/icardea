
/**
 * CodeSystemNameIdMismatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package tr.com.srdc.icardea.cts.vocabruntime;

public class CodeSystemNameIdMismatch extends java.lang.Exception{
    
    private org.hl7.ctsvapi.CodeSystemNameIdMismatch faultMessage;

    
        public CodeSystemNameIdMismatch() {
            super("CodeSystemNameIdMismatch");
        }

        public CodeSystemNameIdMismatch(java.lang.String s) {
           super(s);
        }

        public CodeSystemNameIdMismatch(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public CodeSystemNameIdMismatch(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.hl7.ctsvapi.CodeSystemNameIdMismatch msg){
       faultMessage = msg;
    }
    
    public org.hl7.ctsvapi.CodeSystemNameIdMismatch getFaultMessage(){
       return faultMessage;
    }
}
    