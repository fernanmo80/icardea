
/**
 * QualifiersNotSupported.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package tr.com.srdc.icardea.cts.messageruntime;

public class QualifiersNotSupported extends java.lang.Exception{
    
    private org.hl7.ctsmapi.QualifiersNotSupported faultMessage;

    
        public QualifiersNotSupported() {
            super("QualifiersNotSupported");
        }

        public QualifiersNotSupported(java.lang.String s) {
           super(s);
        }

        public QualifiersNotSupported(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public QualifiersNotSupported(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.hl7.ctsmapi.QualifiersNotSupported msg){
       faultMessage = msg;
    }
    
    public org.hl7.ctsmapi.QualifiersNotSupported getFaultMessage(){
       return faultMessage;
    }
}
    