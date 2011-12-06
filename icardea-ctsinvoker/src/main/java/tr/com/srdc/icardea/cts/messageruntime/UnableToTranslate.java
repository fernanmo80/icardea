
/**
 * UnableToTranslate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package tr.com.srdc.icardea.cts.messageruntime;

public class UnableToTranslate extends java.lang.Exception{
    
    private org.hl7.ctsmapi.UnableToTranslate faultMessage;

    
        public UnableToTranslate() {
            super("UnableToTranslate");
        }

        public UnableToTranslate(java.lang.String s) {
           super(s);
        }

        public UnableToTranslate(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UnableToTranslate(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.hl7.ctsmapi.UnableToTranslate msg){
       faultMessage = msg;
    }
    
    public org.hl7.ctsmapi.UnableToTranslate getFaultMessage(){
       return faultMessage;
    }
}
    