
/**
 * NoApplicableDesignationFound.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package tr.com.srdc.icardea.cts.messageruntime;

public class NoApplicableDesignationFound extends java.lang.Exception{
    
    private org.hl7.ctsmapi.NoApplicableDesignationFound faultMessage;

    
        public NoApplicableDesignationFound() {
            super("NoApplicableDesignationFound");
        }

        public NoApplicableDesignationFound(java.lang.String s) {
           super(s);
        }

        public NoApplicableDesignationFound(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NoApplicableDesignationFound(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.hl7.ctsmapi.NoApplicableDesignationFound msg){
       faultMessage = msg;
    }
    
    public org.hl7.ctsmapi.NoApplicableDesignationFound getFaultMessage(){
       return faultMessage;
    }
}
    