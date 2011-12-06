
/**
 * VocabRuntimeOperationsServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
        package tr.com.srdc.icardea.cts.vocabruntime;

        

        /*
        *  VocabRuntimeOperationsServiceStub java implementation
        */

        
        public class VocabRuntimeOperationsServiceStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("VocabRuntimeOperationsService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[9];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "getServiceName"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "getServiceVersion"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "lookupCodeSystemInfo"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "getServiceDescription"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "areCodesRelated"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "getSupportedCodeSystems"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "getCTSVersion"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "lookupDesignation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "isConceptIdValid"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"org.hl7.ctsvapi.UnknownCodeSystem");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault6"),"tr.com.srdc.icardea.cts.vocabruntime.CodeSystemNameIdMismatch");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault6"),"tr.com.srdc.icardea.cts.vocabruntime.CodeSystemNameIdMismatch");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault6"),"org.hl7.ctsvapi.CodeSystemNameIdMismatch");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownRelationshipCode");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownRelationshipCode");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"org.hl7.ctsvapi.UnknownRelationshipCode");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault4"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownRelationQualifier");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault4"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownRelationQualifier");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault4"),"org.hl7.ctsvapi.UnknownRelationQualifier");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault2"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownConceptCode");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault2"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownConceptCode");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault2"),"org.hl7.ctsvapi.UnknownConceptCode");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"org.hl7.ctsvapi.UnknownCodeSystem");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault5"),"tr.com.srdc.icardea.cts.vocabruntime.TimeoutError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault5"),"tr.com.srdc.icardea.cts.vocabruntime.TimeoutError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault5"),"org.hl7.ctsvapi.TimeoutError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault7"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownLanguageCode");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault7"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownLanguageCode");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault7"),"org.hl7.ctsvapi.UnknownLanguageCode");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault2"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownConceptCode");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault2"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownConceptCode");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault2"),"org.hl7.ctsvapi.UnknownConceptCode");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"org.hl7.ctsvapi.UnknownCodeSystem");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault8"),"tr.com.srdc.icardea.cts.vocabruntime.NoApplicableDesignationFound");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault8"),"tr.com.srdc.icardea.cts.vocabruntime.NoApplicableDesignationFound");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault8"),"org.hl7.ctsvapi.NoApplicableDesignationFound");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"org.hl7.ctsvapi.UnknownCodeSystem");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"org.hl7.ctsvapi.UnexpectedError");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public VocabRuntimeOperationsServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public VocabRuntimeOperationsServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public VocabRuntimeOperationsServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://195.142.27.167:8080/axis2/services/VocabRuntimeOperationsService/" );
                
    }

    /**
     * Default Constructor
     */
    public VocabRuntimeOperationsServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("http://195.142.27.167:8080/axis2/services/VocabRuntimeOperationsService/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public VocabRuntimeOperationsServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsService#getServiceName
                     * @param getServiceName
                    
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.GetServiceNameResponse getServiceName(

                            org.hl7.ctsvapi.GetServiceName getServiceName)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:RuntimeOperations:getServiceNameRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getServiceName,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                    "getServiceName")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.hl7.ctsvapi.GetServiceNameResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsvapi.GetServiceNameResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsService#getServiceVersion
                     * @param getServiceVersion
                    
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.GetServiceVersionResponse getServiceVersion(

                            org.hl7.ctsvapi.GetServiceVersion getServiceVersion)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:RuntimeOperations:getServiceVersionRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getServiceVersion,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                    "getServiceVersion")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.hl7.ctsvapi.GetServiceVersionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsvapi.GetServiceVersionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsService#lookupCodeSystemInfo
                     * @param lookupCodeSystemInfo
                    
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem : 
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.CodeSystemNameIdMismatch : 
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.LookupCodeSystemInfoResponse lookupCodeSystemInfo(

                            org.hl7.ctsvapi.LookupCodeSystemInfo lookupCodeSystemInfo)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem
                        ,tr.com.srdc.icardea.cts.vocabruntime.CodeSystemNameIdMismatch
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:RuntimeOperations:lookupCodeSystemInfoRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    lookupCodeSystemInfo,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                    "lookupCodeSystemInfo")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.hl7.ctsvapi.LookupCodeSystemInfoResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsvapi.LookupCodeSystemInfoResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.CodeSystemNameIdMismatch){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.CodeSystemNameIdMismatch)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsService#getServiceDescription
                     * @param getServiceDescription
                    
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.GetServiceDescriptionResponse getServiceDescription(

                            org.hl7.ctsvapi.GetServiceDescription getServiceDescription)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:RuntimeOperations:getServiceDescriptionRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getServiceDescription,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                    "getServiceDescription")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.hl7.ctsvapi.GetServiceDescriptionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsvapi.GetServiceDescriptionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsService#areCodesRelated
                     * @param areCodesRelated
                    
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnknownRelationshipCode : 
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnknownRelationQualifier : 
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnknownConceptCode : 
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem : 
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.AreCodesRelatedResponse areCodesRelated(

                            org.hl7.ctsvapi.AreCodesRelated areCodesRelated)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnknownRelationshipCode
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnknownRelationQualifier
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnknownConceptCode
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:RuntimeOperations:areCodesRelatedRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    areCodesRelated,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                    "areCodesRelated")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.hl7.ctsvapi.AreCodesRelatedResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsvapi.AreCodesRelatedResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnknownRelationshipCode){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnknownRelationshipCode)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnknownRelationQualifier){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnknownRelationQualifier)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnknownConceptCode){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnknownConceptCode)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsService#getSupportedCodeSystems
                     * @param getSupportedCodeSystems
                    
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.TimeoutError : 
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.GetSupportedCodeSystemsResponse getSupportedCodeSystems(

                            org.hl7.ctsvapi.GetSupportedCodeSystems getSupportedCodeSystems)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.vocabruntime.TimeoutError
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:RuntimeOperations:getSupportedCodeSystemsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getSupportedCodeSystems,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                    "getSupportedCodeSystems")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.hl7.ctsvapi.GetSupportedCodeSystemsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsvapi.GetSupportedCodeSystemsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.TimeoutError){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.TimeoutError)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsService#getCTSVersion
                     * @param getCTSVersion
                    
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.GetCTSVersionResponse getCTSVersion(

                            org.hl7.ctsvapi.GetCTSVersion getCTSVersion)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:RuntimeOperations:getCTSVersionRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getCTSVersion,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                    "getCTSVersion")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.hl7.ctsvapi.GetCTSVersionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsvapi.GetCTSVersionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsService#lookupDesignation
                     * @param lookupDesignation
                    
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnknownLanguageCode : 
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnknownConceptCode : 
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem : 
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError : 
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.NoApplicableDesignationFound : 
                     */

                    

                            public  org.hl7.ctsvapi.LookupDesignationResponse lookupDesignation(

                            org.hl7.ctsvapi.LookupDesignation lookupDesignation)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnknownLanguageCode
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnknownConceptCode
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError
                        ,tr.com.srdc.icardea.cts.vocabruntime.NoApplicableDesignationFound{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:RuntimeOperations:lookupDesignationRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    lookupDesignation,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                    "lookupDesignation")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.hl7.ctsvapi.LookupDesignationResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsvapi.LookupDesignationResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnknownLanguageCode){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnknownLanguageCode)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnknownConceptCode){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnknownConceptCode)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.NoApplicableDesignationFound){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.NoApplicableDesignationFound)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see tr.com.srdc.icardea.cts.vocabruntime.VocabRuntimeOperationsService#isConceptIdValid
                     * @param isConceptIdValid
                    
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem : 
                     * @throws tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.IsConceptIdValidResponse isConceptIdValid(

                            org.hl7.ctsvapi.IsConceptIdValid isConceptIdValid)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem
                        ,tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:RuntimeOperations:isConceptIdValidRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    isConceptIdValid,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                    "isConceptIdValid")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.hl7.ctsvapi.IsConceptIdValidResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsvapi.IsConceptIdValidResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnknownCodeSystem)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.vocabruntime.UnexpectedError)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
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

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://195.142.27.167:8080/axis2/services/VocabRuntimeOperationsService/
        
        private static final javax.xml.bind.JAXBContext wsContext;
        static {
            javax.xml.bind.JAXBContext jc;
            jc = null;
            try {
				jc = javax.xml.bind.JAXBContext.newInstance(
            org.hl7.ctsvapi.GetServiceName.class,
                        org.hl7.ctsvapi.GetServiceNameResponse.class,
                        org.hl7.ctsvapi.UnexpectedError.class,
                        org.hl7.ctsvapi.GetServiceVersion.class,
                        org.hl7.ctsvapi.GetServiceVersionResponse.class,
                        org.hl7.ctsvapi.LookupCodeSystemInfo.class,
                        org.hl7.ctsvapi.LookupCodeSystemInfoResponse.class,
                        org.hl7.ctsvapi.UnknownCodeSystem.class,
                        org.hl7.ctsvapi.CodeSystemNameIdMismatch.class,
                        org.hl7.ctsvapi.GetServiceDescription.class,
                        org.hl7.ctsvapi.GetServiceDescriptionResponse.class,
                        org.hl7.ctsvapi.AreCodesRelated.class,
                        org.hl7.ctsvapi.AreCodesRelatedResponse.class,
                        org.hl7.ctsvapi.UnknownRelationshipCode.class,
                        org.hl7.ctsvapi.UnknownRelationQualifier.class,
                        org.hl7.ctsvapi.UnknownConceptCode.class,
                        org.hl7.ctsvapi.GetSupportedCodeSystems.class,
                        org.hl7.ctsvapi.GetSupportedCodeSystemsResponse.class,
                        org.hl7.ctsvapi.TimeoutError.class,
                        org.hl7.ctsvapi.GetCTSVersion.class,
                        org.hl7.ctsvapi.GetCTSVersionResponse.class,
                        org.hl7.ctsvapi.LookupDesignation.class,
                        org.hl7.ctsvapi.LookupDesignationResponse.class,
                        org.hl7.ctsvapi.UnknownLanguageCode.class,
                        org.hl7.ctsvapi.NoApplicableDesignationFound.class,
                        org.hl7.ctsvapi.IsConceptIdValid.class,
                        org.hl7.ctsvapi.IsConceptIdValidResponse.class
				);
            }
            catch ( javax.xml.bind.JAXBException ex ) {
                System.err.println("Unable to create JAXBContext: " + ex.getMessage());
                ex.printStackTrace(System.err);
                Runtime.getRuntime().exit(-1);
            }
            finally {
                wsContext = jc;
			}
        }

        

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.GetServiceName param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.GetServiceName.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "getServiceName");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "getServiceName", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.GetServiceName param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.GetServiceNameResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.GetServiceNameResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "getServiceNameResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "getServiceNameResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.GetServiceNameResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.UnexpectedError param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.UnexpectedError.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "fault1");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault1", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.UnexpectedError param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.GetServiceVersion param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.GetServiceVersion.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "getServiceVersion");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "getServiceVersion", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.GetServiceVersion param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.GetServiceVersionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.GetServiceVersionResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "getServiceVersionResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "getServiceVersionResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.GetServiceVersionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.LookupCodeSystemInfo param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.LookupCodeSystemInfo.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "lookupCodeSystemInfo");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "lookupCodeSystemInfo", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.LookupCodeSystemInfo param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.LookupCodeSystemInfoResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.LookupCodeSystemInfoResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "lookupCodeSystemInfoResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "lookupCodeSystemInfoResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.LookupCodeSystemInfoResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.UnknownCodeSystem param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.UnknownCodeSystem.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "fault3");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault3", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.UnknownCodeSystem param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.CodeSystemNameIdMismatch param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.CodeSystemNameIdMismatch.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "fault6");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault6", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.CodeSystemNameIdMismatch param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.GetServiceDescription param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.GetServiceDescription.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "getServiceDescription");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "getServiceDescription", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.GetServiceDescription param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.GetServiceDescriptionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.GetServiceDescriptionResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "getServiceDescriptionResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "getServiceDescriptionResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.GetServiceDescriptionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.AreCodesRelated param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.AreCodesRelated.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "areCodesRelated");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "areCodesRelated", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.AreCodesRelated param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.AreCodesRelatedResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.AreCodesRelatedResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "areCodesRelatedResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "areCodesRelatedResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.AreCodesRelatedResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.UnknownRelationshipCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.UnknownRelationshipCode.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "fault");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.UnknownRelationshipCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.UnknownRelationQualifier param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.UnknownRelationQualifier.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "fault4");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault4", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.UnknownRelationQualifier param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.UnknownConceptCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.UnknownConceptCode.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "fault2");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault2", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.UnknownConceptCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.GetSupportedCodeSystems param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.GetSupportedCodeSystems.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "getSupportedCodeSystems");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "getSupportedCodeSystems", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.GetSupportedCodeSystems param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.GetSupportedCodeSystemsResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.GetSupportedCodeSystemsResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "getSupportedCodeSystemsResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "getSupportedCodeSystemsResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.GetSupportedCodeSystemsResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.TimeoutError param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.TimeoutError.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "fault5");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault5", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.TimeoutError param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.GetCTSVersion param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.GetCTSVersion.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "getCTSVersion");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "getCTSVersion", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.GetCTSVersion param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.GetCTSVersionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.GetCTSVersionResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "getCTSVersionResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "getCTSVersionResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.GetCTSVersionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.LookupDesignation param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.LookupDesignation.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "lookupDesignation");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "lookupDesignation", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.LookupDesignation param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.LookupDesignationResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.LookupDesignationResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "lookupDesignationResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "lookupDesignationResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.LookupDesignationResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.UnknownLanguageCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.UnknownLanguageCode.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "fault7");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault7", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.UnknownLanguageCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.NoApplicableDesignationFound param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.NoApplicableDesignationFound.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "fault8");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault8", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.NoApplicableDesignationFound param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.IsConceptIdValid param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.IsConceptIdValid.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "isConceptIdValid");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "isConceptIdValid", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.IsConceptIdValid param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.IsConceptIdValidResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.IsConceptIdValidResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "isConceptIdValidResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "isConceptIdValidResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.IsConceptIdValidResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
            return factory.getDefaultEnvelope();
        }

        private java.lang.Object fromOM (
            org.apache.axiom.om.OMElement param,
            java.lang.Class type,
            java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{
            try {
                javax.xml.bind.JAXBContext context = wsContext;
                javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();

                return unmarshaller.unmarshal(param.getXMLStreamReaderWithoutCaching(), type).getValue();
            } catch (javax.xml.bind.JAXBException bex){
                throw org.apache.axis2.AxisFault.makeFault(bex);
            }
        }

        class JaxbRIDataSource implements org.apache.axiom.om.OMDataSource {
            /**
             * Bound object for output.
             */
            private final Object outObject;

            /**
             * Bound class for output.
             */
            private final Class outClazz;

            /**
             * Marshaller.
             */
            private final javax.xml.bind.Marshaller marshaller;

            /**
             * Namespace
             */
            private String nsuri;

            /**
             * Local name
             */
            private String name;

            /**
             * Constructor from object and marshaller.
             *
             * @param obj
             * @param marshaller
             */
            public JaxbRIDataSource(Class clazz, Object obj, javax.xml.bind.Marshaller marshaller, String nsuri, String name) {
                this.outClazz = clazz;
                this.outObject = obj;
                this.marshaller = marshaller;
                this.nsuri = nsuri;
                this.name = name;
            }

            public void serialize(java.io.OutputStream output, org.apache.axiom.om.OMOutputFormat format) throws javax.xml.stream.XMLStreamException {
                try {
                    marshaller.marshal(new javax.xml.bind.JAXBElement(
                            new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), output);
                } catch (javax.xml.bind.JAXBException e) {
                    throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
                }
            }

            public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat format) throws javax.xml.stream.XMLStreamException {
                try {
                    marshaller.marshal(new javax.xml.bind.JAXBElement(
                            new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), writer);
                } catch (javax.xml.bind.JAXBException e) {
                    throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
                }
            }

            public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                try {
                    marshaller.marshal(new javax.xml.bind.JAXBElement(
                            new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), xmlWriter);
                } catch (javax.xml.bind.JAXBException e) {
                    throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
                }
            }

            public javax.xml.stream.XMLStreamReader getReader() throws javax.xml.stream.XMLStreamException {
                try {
                    javax.xml.bind.JAXBContext context = wsContext;
                    org.apache.axiom.om.impl.builder.SAXOMBuilder builder = new org.apache.axiom.om.impl.builder.SAXOMBuilder();
                    javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                    marshaller.marshal(new javax.xml.bind.JAXBElement(
                            new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), builder);

                    return builder.getRootElement().getXMLStreamReader();
                } catch (javax.xml.bind.JAXBException e) {
                    throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
                }
            }
        }
        
    
   }
   