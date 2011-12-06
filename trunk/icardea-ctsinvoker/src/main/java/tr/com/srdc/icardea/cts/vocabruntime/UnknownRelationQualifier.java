
/**
 * UnknownRelationQualifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package tr.com.srdc.icardea.cts.vocabruntime;

public class UnknownRelationQualifier extends java.lang.Exception{
    
    private org.hl7.ctsvapi.UnknownRelationQualifier faultMessage;

    
        public UnknownRelationQualifier() {
            super("UnknownRelationQualifier");
        }

        public UnknownRelationQualifier(java.lang.String s) {
           super(s);
        }

        public UnknownRelationQualifier(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UnknownRelationQualifier(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.hl7.ctsvapi.UnknownRelationQualifier msg){
       faultMessage = msg;
    }
    
    public org.hl7.ctsvapi.UnknownRelationQualifier getFaultMessage(){
       return faultMessage;
    }
}
    