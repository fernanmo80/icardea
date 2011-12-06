
/**
 * UnknownRelationshipCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package tr.com.srdc.icardea.cts.vocabruntime;

public class UnknownRelationshipCode extends java.lang.Exception{
    
    private org.hl7.ctsvapi.UnknownRelationshipCode faultMessage;

    
        public UnknownRelationshipCode() {
            super("UnknownRelationshipCode");
        }

        public UnknownRelationshipCode(java.lang.String s) {
           super(s);
        }

        public UnknownRelationshipCode(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UnknownRelationshipCode(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.hl7.ctsvapi.UnknownRelationshipCode msg){
       faultMessage = msg;
    }
    
    public org.hl7.ctsvapi.UnknownRelationshipCode getFaultMessage(){
       return faultMessage;
    }
}
    