
/**
 * UnknownVocabularyDomain.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package tr.com.srdc.icardea.cts.messageruntime;

public class UnknownVocabularyDomain extends java.lang.Exception{
    
    private org.hl7.ctsmapi.UnknownVocabularyDomain faultMessage;

    
        public UnknownVocabularyDomain() {
            super("UnknownVocabularyDomain");
        }

        public UnknownVocabularyDomain(java.lang.String s) {
           super(s);
        }

        public UnknownVocabularyDomain(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UnknownVocabularyDomain(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.hl7.ctsmapi.UnknownVocabularyDomain msg){
       faultMessage = msg;
    }
    
    public org.hl7.ctsmapi.UnknownVocabularyDomain getFaultMessage(){
       return faultMessage;
    }
}
    