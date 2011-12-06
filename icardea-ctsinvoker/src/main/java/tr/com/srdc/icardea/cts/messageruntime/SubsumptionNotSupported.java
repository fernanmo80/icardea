
/**
 * SubsumptionNotSupported.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package tr.com.srdc.icardea.cts.messageruntime;

public class SubsumptionNotSupported extends java.lang.Exception{
    
    private org.hl7.ctsmapi.SubsumptionNotSupported faultMessage;

    
        public SubsumptionNotSupported() {
            super("SubsumptionNotSupported");
        }

        public SubsumptionNotSupported(java.lang.String s) {
           super(s);
        }

        public SubsumptionNotSupported(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SubsumptionNotSupported(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.hl7.ctsmapi.SubsumptionNotSupported msg){
       faultMessage = msg;
    }
    
    public org.hl7.ctsmapi.SubsumptionNotSupported getFaultMessage(){
       return faultMessage;
    }
}
    