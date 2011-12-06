
/**
 * CodeMappingOperationsServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
        package tr.com.srdc.icardea.cts.codemapping;

        

        /*
        *  CodeMappingOperationsServiceStub java implementation
        */

        
        public class CodeMappingOperationsServiceStub extends org.apache.axis2.client.Stub
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
     _service = new org.apache.axis2.description.AxisService("CodeMappingOperationsService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[6];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "getServiceName"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "getServiceVersion"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "getSupportedMaps"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "getServiceDescription"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "getCTSVersion"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI", "mapConceptCode"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.codemapping.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.codemapping.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.codemapping.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.codemapping.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.codemapping.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.codemapping.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.codemapping.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.codemapping.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.codemapping.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.codemapping.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"org.hl7.ctsvapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.codemapping.AmbiguousMapRequest");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"tr.com.srdc.icardea.cts.codemapping.AmbiguousMapRequest");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault1"),"org.hl7.ctsvapi.AmbiguousMapRequest");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"tr.com.srdc.icardea.cts.codemapping.MapNameTargetMismatch");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"tr.com.srdc.icardea.cts.codemapping.MapNameTargetMismatch");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault3"),"org.hl7.ctsvapi.MapNameTargetMismatch");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault5"),"tr.com.srdc.icardea.cts.codemapping.UnableToMap");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault5"),"tr.com.srdc.icardea.cts.codemapping.UnableToMap");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault5"),"org.hl7.ctsvapi.UnableToMap");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault2"),"tr.com.srdc.icardea.cts.codemapping.MapNameSourceMismatch");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault2"),"tr.com.srdc.icardea.cts.codemapping.MapNameSourceMismatch");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault2"),"org.hl7.ctsvapi.MapNameSourceMismatch");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault7"),"tr.com.srdc.icardea.cts.codemapping.UnknownMapName");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault7"),"tr.com.srdc.icardea.cts.codemapping.UnknownMapName");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault7"),"org.hl7.ctsvapi.UnknownMapName");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault6"),"tr.com.srdc.icardea.cts.codemapping.UnknownConceptCode");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault6"),"tr.com.srdc.icardea.cts.codemapping.UnknownConceptCode");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault6"),"org.hl7.ctsvapi.UnknownConceptCode");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault4"),"tr.com.srdc.icardea.cts.codemapping.MappingNotAvailable");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault4"),"tr.com.srdc.icardea.cts.codemapping.MappingNotAvailable");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault4"),"org.hl7.ctsvapi.MappingNotAvailable");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault8"),"tr.com.srdc.icardea.cts.codemapping.UnknownCodeSystem");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault8"),"tr.com.srdc.icardea.cts.codemapping.UnknownCodeSystem");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault8"),"org.hl7.ctsvapi.UnknownCodeSystem");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.codemapping.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"tr.com.srdc.icardea.cts.codemapping.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fault"),"org.hl7.ctsvapi.UnexpectedError");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public CodeMappingOperationsServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public CodeMappingOperationsServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
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
    public CodeMappingOperationsServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://195.142.27.167:8080/axis2/services/CodeMappingOperationsService/" );
                
    }

    /**
     * Default Constructor
     */
    public CodeMappingOperationsServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("http://195.142.27.167:8080/axis2/services/CodeMappingOperationsService/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public CodeMappingOperationsServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see tr.com.srdc.icardea.cts.codemapping.CodeMappingOperationsService#getServiceName
                     * @param getServiceName
                    
                     * @throws tr.com.srdc.icardea.cts.codemapping.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.GetServiceNameResponse getServiceName(

                            org.hl7.ctsvapi.GetServiceName getServiceName)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.codemapping.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:CodeMappingOperations:getServiceNameRequest");
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.codemapping.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.codemapping.CodeMappingOperationsService#getServiceVersion
                     * @param getServiceVersion
                    
                     * @throws tr.com.srdc.icardea.cts.codemapping.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.GetServiceVersionResponse getServiceVersion(

                            org.hl7.ctsvapi.GetServiceVersion getServiceVersion)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.codemapping.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:CodeMappingOperations:getServiceVersionRequest");
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.codemapping.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.codemapping.CodeMappingOperationsService#getSupportedMaps
                     * @param getSupportedMaps
                    
                     * @throws tr.com.srdc.icardea.cts.codemapping.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.GetSupportedMapsResponse getSupportedMaps(

                            org.hl7.ctsvapi.GetSupportedMaps getSupportedMaps)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.codemapping.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:CodeMappingOperations:getSupportedMapsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getSupportedMaps,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                    "getSupportedMaps")));
                                                
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
                                             org.hl7.ctsvapi.GetSupportedMapsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsvapi.GetSupportedMapsResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.codemapping.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.codemapping.CodeMappingOperationsService#getServiceDescription
                     * @param getServiceDescription
                    
                     * @throws tr.com.srdc.icardea.cts.codemapping.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.GetServiceDescriptionResponse getServiceDescription(

                            org.hl7.ctsvapi.GetServiceDescription getServiceDescription)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.codemapping.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:CodeMappingOperations:getServiceDescriptionRequest");
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.codemapping.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.codemapping.CodeMappingOperationsService#getCTSVersion
                     * @param getCTSVersion
                    
                     * @throws tr.com.srdc.icardea.cts.codemapping.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.GetCTSVersionResponse getCTSVersion(

                            org.hl7.ctsvapi.GetCTSVersion getCTSVersion)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.codemapping.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:CodeMappingOperations:getCTSVersionRequest");
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.codemapping.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.codemapping.CodeMappingOperationsService#mapConceptCode
                     * @param mapConceptCode
                    
                     * @throws tr.com.srdc.icardea.cts.codemapping.AmbiguousMapRequest : 
                     * @throws tr.com.srdc.icardea.cts.codemapping.MapNameTargetMismatch : 
                     * @throws tr.com.srdc.icardea.cts.codemapping.UnableToMap : 
                     * @throws tr.com.srdc.icardea.cts.codemapping.MapNameSourceMismatch : 
                     * @throws tr.com.srdc.icardea.cts.codemapping.UnknownMapName : 
                     * @throws tr.com.srdc.icardea.cts.codemapping.UnknownConceptCode : 
                     * @throws tr.com.srdc.icardea.cts.codemapping.MappingNotAvailable : 
                     * @throws tr.com.srdc.icardea.cts.codemapping.UnknownCodeSystem : 
                     * @throws tr.com.srdc.icardea.cts.codemapping.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsvapi.MapConceptCodeResponse mapConceptCode(

                            org.hl7.ctsvapi.MapConceptCode mapConceptCode)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.codemapping.AmbiguousMapRequest
                        ,tr.com.srdc.icardea.cts.codemapping.MapNameTargetMismatch
                        ,tr.com.srdc.icardea.cts.codemapping.UnableToMap
                        ,tr.com.srdc.icardea.cts.codemapping.MapNameSourceMismatch
                        ,tr.com.srdc.icardea.cts.codemapping.UnknownMapName
                        ,tr.com.srdc.icardea.cts.codemapping.UnknownConceptCode
                        ,tr.com.srdc.icardea.cts.codemapping.MappingNotAvailable
                        ,tr.com.srdc.icardea.cts.codemapping.UnknownCodeSystem
                        ,tr.com.srdc.icardea.cts.codemapping.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSVAPI:CodeMappingOperations:mapConceptCodeRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    mapConceptCode,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                    "mapConceptCode")));
                                                
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
                                             org.hl7.ctsvapi.MapConceptCodeResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsvapi.MapConceptCodeResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.AmbiguousMapRequest){
                          throw (tr.com.srdc.icardea.cts.codemapping.AmbiguousMapRequest)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.MapNameTargetMismatch){
                          throw (tr.com.srdc.icardea.cts.codemapping.MapNameTargetMismatch)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.UnableToMap){
                          throw (tr.com.srdc.icardea.cts.codemapping.UnableToMap)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.MapNameSourceMismatch){
                          throw (tr.com.srdc.icardea.cts.codemapping.MapNameSourceMismatch)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.UnknownMapName){
                          throw (tr.com.srdc.icardea.cts.codemapping.UnknownMapName)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.UnknownConceptCode){
                          throw (tr.com.srdc.icardea.cts.codemapping.UnknownConceptCode)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.MappingNotAvailable){
                          throw (tr.com.srdc.icardea.cts.codemapping.MappingNotAvailable)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.UnknownCodeSystem){
                          throw (tr.com.srdc.icardea.cts.codemapping.UnknownCodeSystem)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.codemapping.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.codemapping.UnexpectedError)ex;
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
     //http://195.142.27.167:8080/axis2/services/CodeMappingOperationsService/
        
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
                        org.hl7.ctsvapi.GetSupportedMaps.class,
                        org.hl7.ctsvapi.GetSupportedMapsResponse.class,
                        org.hl7.ctsvapi.GetServiceDescription.class,
                        org.hl7.ctsvapi.GetServiceDescriptionResponse.class,
                        org.hl7.ctsvapi.GetCTSVersion.class,
                        org.hl7.ctsvapi.GetCTSVersionResponse.class,
                        org.hl7.ctsvapi.MapConceptCode.class,
                        org.hl7.ctsvapi.MapConceptCodeResponse.class,
                        org.hl7.ctsvapi.AmbiguousMapRequest.class,
                        org.hl7.ctsvapi.MapNameTargetMismatch.class,
                        org.hl7.ctsvapi.UnableToMap.class,
                        org.hl7.ctsvapi.MapNameSourceMismatch.class,
                        org.hl7.ctsvapi.UnknownMapName.class,
                        org.hl7.ctsvapi.UnknownConceptCode.class,
                        org.hl7.ctsvapi.MappingNotAvailable.class,
                        org.hl7.ctsvapi.UnknownCodeSystem.class
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
                                                                        "fault");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault", namespace);
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

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.GetSupportedMaps param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.GetSupportedMaps.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "getSupportedMaps");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "getSupportedMaps", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.GetSupportedMaps param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.GetSupportedMapsResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.GetSupportedMapsResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "getSupportedMapsResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "getSupportedMapsResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.GetSupportedMapsResponse param, boolean optimizeContent)
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

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.MapConceptCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.MapConceptCode.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "mapConceptCode");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "mapConceptCode", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.MapConceptCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.MapConceptCodeResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.MapConceptCodeResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSVAPI",
                                                                        "mapConceptCodeResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "mapConceptCodeResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.MapConceptCodeResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.AmbiguousMapRequest param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.AmbiguousMapRequest.class,
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

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.AmbiguousMapRequest param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.MapNameTargetMismatch param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.MapNameTargetMismatch.class,
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

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.MapNameTargetMismatch param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.UnableToMap param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.UnableToMap.class,
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

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.UnableToMap param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.MapNameSourceMismatch param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.MapNameSourceMismatch.class,
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

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.MapNameSourceMismatch param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.UnknownMapName param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.UnknownMapName.class,
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

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.UnknownMapName param, boolean optimizeContent)
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
                                                                        "fault6");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault6", namespace);
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

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsvapi.MappingNotAvailable param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsvapi.MappingNotAvailable.class,
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

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsvapi.MappingNotAvailable param, boolean optimizeContent)
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
                                                                        "fault8");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSVAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault8", namespace);
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
   