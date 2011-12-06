
/**
 * ConsentManagerImplServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
        package tr.com.srdc.icardea.consenteditor.webservice;

        /**
        *  ConsentManagerImplServiceMessageReceiverInOut message receiver
        */

        public class ConsentManagerImplServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ConsentManagerImplServiceSkeleton skel = (ConsentManagerImplServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

        

            if("getResources".equals(methodName)){
                
                tr.com.srdc.icardea.consenteditor.webservice.GetResourcesResponse getResourcesResponse1 = null;
	                        tr.com.srdc.icardea.consenteditor.webservice.GetResources wrappedParam =
                                                             (tr.com.srdc.icardea.consenteditor.webservice.GetResources)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    tr.com.srdc.icardea.consenteditor.webservice.GetResources.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getResourcesResponse1 =
                                                   
                                                   
                                                         skel.getResources(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getResourcesResponse1, false);
                                    } else 

            if("getDecision".equals(methodName)){
                
                tr.com.srdc.icardea.consenteditor.webservice.GetDecisionResponse getDecisionResponse3 = null;
	                        tr.com.srdc.icardea.consenteditor.webservice.GetDecision wrappedParam =
                                                             (tr.com.srdc.icardea.consenteditor.webservice.GetDecision)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    tr.com.srdc.icardea.consenteditor.webservice.GetDecision.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDecisionResponse3 =
                                                   
                                                   
                                                         skel.getDecision(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDecisionResponse3, false);
                                    } else 

            if("generateRequest".equals(methodName)){
                
                tr.com.srdc.icardea.consenteditor.webservice.GenerateRequestResponse generateRequestResponse5 = null;
	                        tr.com.srdc.icardea.consenteditor.webservice.GenerateRequest wrappedParam =
                                                             (tr.com.srdc.icardea.consenteditor.webservice.GenerateRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    tr.com.srdc.icardea.consenteditor.webservice.GenerateRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               generateRequestResponse5 =
                                                   
                                                   
                                                         skel.generateRequest(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), generateRequestResponse5, false);
                                    } else 

            if("getSubjects".equals(methodName)){
                
                tr.com.srdc.icardea.consenteditor.webservice.GetSubjectsResponse getSubjectsResponse7 = null;
	                        tr.com.srdc.icardea.consenteditor.webservice.GetSubjects wrappedParam =
                                                             (tr.com.srdc.icardea.consenteditor.webservice.GetSubjects)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    tr.com.srdc.icardea.consenteditor.webservice.GetSubjects.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSubjectsResponse7 =
                                                   
                                                   
                                                         skel.getSubjects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSubjectsResponse7, false);
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(tr.com.srdc.icardea.consenteditor.webservice.GetResources param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.com.srdc.icardea.consenteditor.webservice.GetResources.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.com.srdc.icardea.consenteditor.webservice.GetResourcesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.com.srdc.icardea.consenteditor.webservice.GetResourcesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.com.srdc.icardea.consenteditor.webservice.GetDecision param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.com.srdc.icardea.consenteditor.webservice.GetDecision.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.com.srdc.icardea.consenteditor.webservice.GetDecisionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.com.srdc.icardea.consenteditor.webservice.GetDecisionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.com.srdc.icardea.consenteditor.webservice.GenerateRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.com.srdc.icardea.consenteditor.webservice.GenerateRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.com.srdc.icardea.consenteditor.webservice.GenerateRequestResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.com.srdc.icardea.consenteditor.webservice.GenerateRequestResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.com.srdc.icardea.consenteditor.webservice.GetSubjects param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.com.srdc.icardea.consenteditor.webservice.GetSubjects.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(tr.com.srdc.icardea.consenteditor.webservice.GetSubjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(tr.com.srdc.icardea.consenteditor.webservice.GetSubjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, tr.com.srdc.icardea.consenteditor.webservice.GetResourcesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(tr.com.srdc.icardea.consenteditor.webservice.GetResourcesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private tr.com.srdc.icardea.consenteditor.webservice.GetResourcesResponse wrapgetResources(){
                                tr.com.srdc.icardea.consenteditor.webservice.GetResourcesResponse wrappedElement = new tr.com.srdc.icardea.consenteditor.webservice.GetResourcesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, tr.com.srdc.icardea.consenteditor.webservice.GetDecisionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(tr.com.srdc.icardea.consenteditor.webservice.GetDecisionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private tr.com.srdc.icardea.consenteditor.webservice.GetDecisionResponse wrapgetDecision(){
                                tr.com.srdc.icardea.consenteditor.webservice.GetDecisionResponse wrappedElement = new tr.com.srdc.icardea.consenteditor.webservice.GetDecisionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, tr.com.srdc.icardea.consenteditor.webservice.GenerateRequestResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(tr.com.srdc.icardea.consenteditor.webservice.GenerateRequestResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private tr.com.srdc.icardea.consenteditor.webservice.GenerateRequestResponse wrapgenerateRequest(){
                                tr.com.srdc.icardea.consenteditor.webservice.GenerateRequestResponse wrappedElement = new tr.com.srdc.icardea.consenteditor.webservice.GenerateRequestResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, tr.com.srdc.icardea.consenteditor.webservice.GetSubjectsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(tr.com.srdc.icardea.consenteditor.webservice.GetSubjectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private tr.com.srdc.icardea.consenteditor.webservice.GetSubjectsResponse wrapgetSubjects(){
                                tr.com.srdc.icardea.consenteditor.webservice.GetSubjectsResponse wrappedElement = new tr.com.srdc.icardea.consenteditor.webservice.GetSubjectsResponse();
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
        
                if (tr.com.srdc.icardea.consenteditor.webservice.GetResources.class.equals(type)){
                
                           return tr.com.srdc.icardea.consenteditor.webservice.GetResources.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (tr.com.srdc.icardea.consenteditor.webservice.GetResourcesResponse.class.equals(type)){
                
                           return tr.com.srdc.icardea.consenteditor.webservice.GetResourcesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (tr.com.srdc.icardea.consenteditor.webservice.GetDecision.class.equals(type)){
                
                           return tr.com.srdc.icardea.consenteditor.webservice.GetDecision.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (tr.com.srdc.icardea.consenteditor.webservice.GetDecisionResponse.class.equals(type)){
                
                           return tr.com.srdc.icardea.consenteditor.webservice.GetDecisionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (tr.com.srdc.icardea.consenteditor.webservice.GenerateRequest.class.equals(type)){
                
                           return tr.com.srdc.icardea.consenteditor.webservice.GenerateRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (tr.com.srdc.icardea.consenteditor.webservice.GenerateRequestResponse.class.equals(type)){
                
                           return tr.com.srdc.icardea.consenteditor.webservice.GenerateRequestResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (tr.com.srdc.icardea.consenteditor.webservice.GetSubjects.class.equals(type)){
                
                           return tr.com.srdc.icardea.consenteditor.webservice.GetSubjects.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (tr.com.srdc.icardea.consenteditor.webservice.GetSubjectsResponse.class.equals(type)){
                
                           return tr.com.srdc.icardea.consenteditor.webservice.GetSubjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    