
/**
 * MapNameSourceMismatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package tr.com.srdc.icardea.cts.codemapping;

public class MapNameSourceMismatch extends java.lang.Exception{
    
    private org.hl7.ctsvapi.MapNameSourceMismatch faultMessage;

    
        public MapNameSourceMismatch() {
            super("MapNameSourceMismatch");
        }

        public MapNameSourceMismatch(java.lang.String s) {
           super(s);
        }

        public MapNameSourceMismatch(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MapNameSourceMismatch(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.hl7.ctsvapi.MapNameSourceMismatch msg){
       faultMessage = msg;
    }
    
    public org.hl7.ctsvapi.MapNameSourceMismatch getFaultMessage(){
       return faultMessage;
    }
}
    