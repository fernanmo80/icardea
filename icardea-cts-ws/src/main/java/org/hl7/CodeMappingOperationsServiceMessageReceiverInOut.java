
/**
 * CodeMappingOperationsServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
        package org.hl7;

        /**
        *  CodeMappingOperationsServiceMessageReceiverInOut message receiver
        */

        public class CodeMappingOperationsServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CodeMappingOperationsServiceSkeleton skel = (CodeMappingOperationsServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

        

            if("getServiceName".equals(methodName)){
                
                org.hl7.GetServiceNameResponse getServiceNameResponse1 = null;
	                        org.hl7.GetServiceName wrappedParam =
                                                             (org.hl7.GetServiceName)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.hl7.GetServiceName.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceNameResponse1 =
                                                   
                                                   
                                                         skel.getServiceName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceNameResponse1, false);
                                    } else 

            if("getServiceVersion".equals(methodName)){
                
                org.hl7.GetServiceVersionResponse getServiceVersionResponse3 = null;
	                        org.hl7.GetServiceVersion wrappedParam =
                                                             (org.hl7.GetServiceVersion)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.hl7.GetServiceVersion.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceVersionResponse3 =
                                                   
                                                   
                                                         skel.getServiceVersion(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceVersionResponse3, false);
                                    } else 

            if("getSupportedMaps".equals(methodName)){
                
                org.hl7.GetSupportedMapsResponse getSupportedMapsResponse5 = null;
	                        org.hl7.GetSupportedMaps wrappedParam =
                                                             (org.hl7.GetSupportedMaps)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.hl7.GetSupportedMaps.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSupportedMapsResponse5 =
                                                   
                                                   
                                                         skel.getSupportedMaps(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSupportedMapsResponse5, false);
                                    } else 

            if("getServiceDescription".equals(methodName)){
                
                org.hl7.GetServiceDescriptionResponse getServiceDescriptionResponse7 = null;
	                        org.hl7.GetServiceDescription wrappedParam =
                                                             (org.hl7.GetServiceDescription)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.hl7.GetServiceDescription.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceDescriptionResponse7 =
                                                   
                                                   
                                                         skel.getServiceDescription(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceDescriptionResponse7, false);
                                    } else 

            if("getCTSVersion".equals(methodName)){
                
                org.hl7.GetCTSVersionResponse getCTSVersionResponse9 = null;
	                        org.hl7.GetCTSVersion wrappedParam =
                                                             (org.hl7.GetCTSVersion)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.hl7.GetCTSVersion.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCTSVersionResponse9 =
                                                   
                                                   
                                                         skel.getCTSVersion(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCTSVersionResponse9, false);
                                    } else 

            if("mapConceptCode".equals(methodName)){
                
                org.hl7.MapConceptCodeResponse mapConceptCodeResponse11 = null;
	                        org.hl7.MapConceptCode wrappedParam =
                                                             (org.hl7.MapConceptCode)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.hl7.MapConceptCode.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               mapConceptCodeResponse11 =
                                                   
                                                   
                                                         skel.mapConceptCode(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), mapConceptCodeResponse11, false);
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (AmbiguousMapRequest e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"fault1");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            /*if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }*/
            throw f;
            }
         catch (UnableToMap e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"fault5");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            /*if (e.getFaultMessage() != null){
            f.setDetail(toOM(e.getFaultMessage(),false));
        }*/
            throw f;
            }
         catch (MapNameTargetMismatch e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"fault3");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            /*if (e.getFaultMessage() != null){
            f.setDetail(toOM(e.getFaultMessage(),false));
        }*/
            throw f;
            }
         catch (UnknownMapName e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"fault7");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            /*if (e.getFaultMessage() != null){
            f.setDetail(toOM(e.getFaultMessage(),false));
        }*/
            throw f;
            }
         catch (MapNameSourceMismatch e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"fault2");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            /*if (e.getFaultMessage() != null){
            f.setDetail(toOM(e.getFaultMessage(),false));
        }*/
            throw f;
            }
         catch (UnknownConceptCode e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"fault6");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            /*if (e.getFaultMessage() != null){
            f.setDetail(toOM(e.getFaultMessage(),false));
        }*/
            throw f;
            }
         catch (MappingNotAvailable e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"fault4");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            /*if (e.getFaultMessage() != null){
            f.setDetail(toOM(e.getFaultMessage(),false));
        }*/
            throw f;
            }
         catch (UnknownCodeSystem e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"fault8");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            /*if (e.getFaultMessage() != null){
            f.setDetail(toOM(e.getFaultMessage(),false));
        }*/
            throw f;
            }
         catch (UnexpectedError e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"fault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            /*if (e.getFaultMessage() != null){
            f.setDetail(toOM(e.getFaultMessage(),false));
        }*/
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.GetServiceName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.GetServiceName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.GetServiceNameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.GetServiceNameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.Fault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.Fault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.GetServiceVersion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.GetServiceVersion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.GetServiceVersionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.GetServiceVersionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.GetSupportedMaps param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.GetSupportedMaps.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.GetSupportedMapsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.GetSupportedMapsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.GetServiceDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.GetServiceDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.GetServiceDescriptionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.GetServiceDescriptionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.GetCTSVersion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.GetCTSVersion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.GetCTSVersionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.GetCTSVersionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.MapConceptCode param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.MapConceptCode.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.MapConceptCodeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.MapConceptCodeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.Fault1 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.Fault1.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.Fault3 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.Fault3.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.Fault5 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.Fault5.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.Fault2 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.Fault2.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.Fault7 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.Fault7.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.Fault6 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.Fault6.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.Fault4 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.Fault4.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.hl7.Fault8 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.hl7.Fault8.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.GetServiceNameResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.hl7.GetServiceNameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.hl7.GetServiceNameResponse wrapgetServiceName(){
                                org.hl7.GetServiceNameResponse wrappedElement = new org.hl7.GetServiceNameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.GetServiceVersionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.hl7.GetServiceVersionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.hl7.GetServiceVersionResponse wrapgetServiceVersion(){
                                org.hl7.GetServiceVersionResponse wrappedElement = new org.hl7.GetServiceVersionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.GetSupportedMapsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.hl7.GetSupportedMapsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.hl7.GetSupportedMapsResponse wrapgetSupportedMaps(){
                                org.hl7.GetSupportedMapsResponse wrappedElement = new org.hl7.GetSupportedMapsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.GetServiceDescriptionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.hl7.GetServiceDescriptionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.hl7.GetServiceDescriptionResponse wrapgetServiceDescription(){
                                org.hl7.GetServiceDescriptionResponse wrappedElement = new org.hl7.GetServiceDescriptionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.GetCTSVersionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.hl7.GetCTSVersionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.hl7.GetCTSVersionResponse wrapgetCTSVersion(){
                                org.hl7.GetCTSVersionResponse wrappedElement = new org.hl7.GetCTSVersionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.MapConceptCodeResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.hl7.MapConceptCodeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.hl7.MapConceptCodeResponse wrapmapConceptCode(){
                                org.hl7.MapConceptCodeResponse wrappedElement = new org.hl7.MapConceptCodeResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.hl7.GetServiceName.class.equals(type)){
                
                           return org.hl7.GetServiceName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.GetServiceNameResponse.class.equals(type)){
                
                           return org.hl7.GetServiceNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault.class.equals(type)){
                
                           return org.hl7.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.GetServiceVersion.class.equals(type)){
                
                           return org.hl7.GetServiceVersion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.GetServiceVersionResponse.class.equals(type)){
                
                           return org.hl7.GetServiceVersionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault.class.equals(type)){
                
                           return org.hl7.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.GetSupportedMaps.class.equals(type)){
                
                           return org.hl7.GetSupportedMaps.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.GetSupportedMapsResponse.class.equals(type)){
                
                           return org.hl7.GetSupportedMapsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault.class.equals(type)){
                
                           return org.hl7.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.GetServiceDescription.class.equals(type)){
                
                           return org.hl7.GetServiceDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.GetServiceDescriptionResponse.class.equals(type)){
                
                           return org.hl7.GetServiceDescriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault.class.equals(type)){
                
                           return org.hl7.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.GetCTSVersion.class.equals(type)){
                
                           return org.hl7.GetCTSVersion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.GetCTSVersionResponse.class.equals(type)){
                
                           return org.hl7.GetCTSVersionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault.class.equals(type)){
                
                           return org.hl7.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.MapConceptCode.class.equals(type)){
                
                           return org.hl7.MapConceptCode.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.MapConceptCodeResponse.class.equals(type)){
                
                           return org.hl7.MapConceptCodeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault1.class.equals(type)){
                
                           return org.hl7.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault3.class.equals(type)){
                
                           return org.hl7.Fault3.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault5.class.equals(type)){
                
                           return org.hl7.Fault5.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault2.class.equals(type)){
                
                           return org.hl7.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault7.class.equals(type)){
                
                           return org.hl7.Fault7.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault6.class.equals(type)){
                
                           return org.hl7.Fault6.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault4.class.equals(type)){
                
                           return org.hl7.Fault4.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault8.class.equals(type)){
                
                           return org.hl7.Fault8.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.hl7.Fault.class.equals(type)){
                
                           return org.hl7.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    