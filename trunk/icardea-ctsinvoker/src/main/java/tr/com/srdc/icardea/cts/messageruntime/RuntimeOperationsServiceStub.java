
/**
 * RuntimeOperationsServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
        package tr.com.srdc.icardea.cts.messageruntime;

        

        /*
        *  RuntimeOperationsServiceStub java implementation
        */

        
        public class RuntimeOperationsServiceStub extends org.apache.axis2.client.Stub
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
     _service = new org.apache.axis2.description.AxisService("RuntimeOperationsService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[15];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "getServiceDescription"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "lookupValueSetExpansion"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "expandValueSetExpansionContext"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "getSupportedMatchAlgorithms"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "subsumes"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "getServiceVersion"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "fillInDetails"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "getCTSVersion"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "validateCode"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "getServiceName"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "validateTranslation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "getSupportedVocabularyDomains"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "areEquivalent"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "translateCode"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI", "getHL7ReleaseVersion"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault13"),"tr.com.srdc.icardea.cts.messageruntime.UnknownLanguage");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault13"),"tr.com.srdc.icardea.cts.messageruntime.UnknownLanguage");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault13"),"org.hl7.ctsmapi.UnknownLanguage");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault9"),"tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault9"),"tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault9"),"org.hl7.ctsmapi.UnknownApplicationContextCode");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault10"),"tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault10"),"tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault10"),"org.hl7.ctsmapi.UnknownVocabularyDomain");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault11"),"tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault11"),"tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault11"),"org.hl7.ctsmapi.NoApplicableValueSet");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault6"),"tr.com.srdc.icardea.cts.messageruntime.TimeoutError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault6"),"tr.com.srdc.icardea.cts.messageruntime.TimeoutError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault6"),"org.hl7.ctsmapi.TimeoutError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault15"),"tr.com.srdc.icardea.cts.messageruntime.InvalidExpansionContext");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault15"),"tr.com.srdc.icardea.cts.messageruntime.InvalidExpansionContext");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault15"),"org.hl7.ctsmapi.InvalidExpansionContext");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault6"),"tr.com.srdc.icardea.cts.messageruntime.TimeoutError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault6"),"tr.com.srdc.icardea.cts.messageruntime.TimeoutError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault6"),"org.hl7.ctsmapi.TimeoutError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault"),"tr.com.srdc.icardea.cts.messageruntime.SubsumptionNotSupported");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault"),"tr.com.srdc.icardea.cts.messageruntime.SubsumptionNotSupported");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault"),"org.hl7.ctsmapi.SubsumptionNotSupported");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault1"),"tr.com.srdc.icardea.cts.messageruntime.QualifiersNotSupported");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault1"),"tr.com.srdc.icardea.cts.messageruntime.QualifiersNotSupported");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault1"),"org.hl7.ctsmapi.QualifiersNotSupported");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault2"),"tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault2"),"tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault2"),"org.hl7.ctsmapi.UnknownConceptCode");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault3"),"tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault3"),"tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault3"),"org.hl7.ctsmapi.UnknownCodeSystem");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault4"),"tr.com.srdc.icardea.cts.messageruntime.UnrecognizedQualifier");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault4"),"tr.com.srdc.icardea.cts.messageruntime.UnrecognizedQualifier");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault4"),"org.hl7.ctsmapi.UnrecognizedQualifier");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault13"),"tr.com.srdc.icardea.cts.messageruntime.UnknownLanguage");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault13"),"tr.com.srdc.icardea.cts.messageruntime.UnknownLanguage");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault13"),"org.hl7.ctsmapi.UnknownLanguage");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault2"),"tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault2"),"tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault2"),"org.hl7.ctsmapi.UnknownConceptCode");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault3"),"tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault3"),"tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault3"),"org.hl7.ctsmapi.UnknownCodeSystem");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault14"),"tr.com.srdc.icardea.cts.messageruntime.NoApplicableDesignationFound");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault14"),"tr.com.srdc.icardea.cts.messageruntime.NoApplicableDesignationFound");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault14"),"org.hl7.ctsmapi.NoApplicableDesignationFound");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault9"),"tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault9"),"tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault9"),"org.hl7.ctsmapi.UnknownApplicationContextCode");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault10"),"tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault10"),"tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault10"),"org.hl7.ctsmapi.UnknownVocabularyDomain");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault11"),"tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault11"),"tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault11"),"org.hl7.ctsmapi.NoApplicableValueSet");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault9"),"tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault9"),"tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault9"),"org.hl7.ctsmapi.UnknownApplicationContextCode");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault10"),"tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault10"),"tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault10"),"org.hl7.ctsmapi.UnknownVocabularyDomain");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault7"),"tr.com.srdc.icardea.cts.messageruntime.UnknownMatchAlgorithm");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault7"),"tr.com.srdc.icardea.cts.messageruntime.UnknownMatchAlgorithm");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault7"),"org.hl7.ctsmapi.UnknownMatchAlgorithm");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault8"),"tr.com.srdc.icardea.cts.messageruntime.BadlyFormedMatchText");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault8"),"tr.com.srdc.icardea.cts.messageruntime.BadlyFormedMatchText");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault8"),"org.hl7.ctsmapi.BadlyFormedMatchText");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault6"),"tr.com.srdc.icardea.cts.messageruntime.TimeoutError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault6"),"tr.com.srdc.icardea.cts.messageruntime.TimeoutError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault6"),"org.hl7.ctsmapi.TimeoutError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault"),"tr.com.srdc.icardea.cts.messageruntime.SubsumptionNotSupported");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault"),"tr.com.srdc.icardea.cts.messageruntime.SubsumptionNotSupported");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault"),"org.hl7.ctsmapi.SubsumptionNotSupported");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault1"),"tr.com.srdc.icardea.cts.messageruntime.QualifiersNotSupported");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault1"),"tr.com.srdc.icardea.cts.messageruntime.QualifiersNotSupported");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault1"),"org.hl7.ctsmapi.QualifiersNotSupported");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault2"),"tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault2"),"tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault2"),"org.hl7.ctsmapi.UnknownConceptCode");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault3"),"tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault3"),"tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault3"),"org.hl7.ctsmapi.UnknownCodeSystem");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault4"),"tr.com.srdc.icardea.cts.messageruntime.UnrecognizedQualifier");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault4"),"tr.com.srdc.icardea.cts.messageruntime.UnrecognizedQualifier");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault4"),"org.hl7.ctsmapi.UnrecognizedQualifier");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault9"),"tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault9"),"tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault9"),"org.hl7.ctsmapi.UnknownApplicationContextCode");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault10"),"tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault10"),"tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault10"),"org.hl7.ctsmapi.UnknownVocabularyDomain");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault12"),"tr.com.srdc.icardea.cts.messageruntime.UnableToTranslate");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault12"),"tr.com.srdc.icardea.cts.messageruntime.UnableToTranslate");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault12"),"org.hl7.ctsmapi.UnableToTranslate");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault3"),"tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault3"),"tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault3"),"org.hl7.ctsmapi.UnknownCodeSystem");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"tr.com.srdc.icardea.cts.messageruntime.UnexpectedError");
              faultMessageMap.put( new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","fault5"),"org.hl7.ctsmapi.UnexpectedError");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public RuntimeOperationsServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public RuntimeOperationsServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
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
    public RuntimeOperationsServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://195.142.27.167:8080/axis2/services/RuntimeOperationsService/" );
                
    }

    /**
     * Default Constructor
     */
    public RuntimeOperationsServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("http://195.142.27.167:8080/axis2/services/RuntimeOperationsService/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public RuntimeOperationsServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#getServiceDescription
                     * @param getServiceDescription
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.GetServiceDescriptionResponse getServiceDescription(

                            org.hl7.ctsmapi.GetServiceDescription getServiceDescription)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:getServiceDescriptionRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getServiceDescription,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
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
                                             org.hl7.ctsmapi.GetServiceDescriptionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.GetServiceDescriptionResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#lookupValueSetExpansion
                     * @param lookupValueSetExpansion
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownLanguage : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.TimeoutError : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.LookupValueSetExpansionResponse lookupValueSetExpansion(

                            org.hl7.ctsmapi.LookupValueSetExpansion lookupValueSetExpansion)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownLanguage
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain
                        ,tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet
                        ,tr.com.srdc.icardea.cts.messageruntime.TimeoutError
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:lookupValueSetExpansionRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    lookupValueSetExpansion,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                    "lookupValueSetExpansion")));
                                                
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
                                             org.hl7.ctsmapi.LookupValueSetExpansionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.LookupValueSetExpansionResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownLanguage){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownLanguage)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet){
                          throw (tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.TimeoutError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.TimeoutError)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#expandValueSetExpansionContext
                     * @param expandValueSetExpansionContext
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.InvalidExpansionContext : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.TimeoutError : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.ExpandValueSetExpansionContextResponse expandValueSetExpansionContext(

                            org.hl7.ctsmapi.ExpandValueSetExpansionContext expandValueSetExpansionContext)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.InvalidExpansionContext
                        ,tr.com.srdc.icardea.cts.messageruntime.TimeoutError
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:expandValueSetExpansionContextRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    expandValueSetExpansionContext,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                    "expandValueSetExpansionContext")));
                                                
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
                                             org.hl7.ctsmapi.ExpandValueSetExpansionContextResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.ExpandValueSetExpansionContextResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.InvalidExpansionContext){
                          throw (tr.com.srdc.icardea.cts.messageruntime.InvalidExpansionContext)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.TimeoutError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.TimeoutError)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#getSupportedMatchAlgorithms
                     * @param getSupportedMatchAlgorithms
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.GetSupportedMatchAlgorithmsResponse getSupportedMatchAlgorithms(

                            org.hl7.ctsmapi.GetSupportedMatchAlgorithms getSupportedMatchAlgorithms)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:getSupportedMatchAlgorithmsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getSupportedMatchAlgorithms,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                    "getSupportedMatchAlgorithms")));
                                                
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
                                             org.hl7.ctsmapi.GetSupportedMatchAlgorithmsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.GetSupportedMatchAlgorithmsResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#subsumes
                     * @param subsumes
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.SubsumptionNotSupported : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.QualifiersNotSupported : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnrecognizedQualifier : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.SubsumesResponse subsumes(

                            org.hl7.ctsmapi.Subsumes subsumes)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.SubsumptionNotSupported
                        ,tr.com.srdc.icardea.cts.messageruntime.QualifiersNotSupported
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem
                        ,tr.com.srdc.icardea.cts.messageruntime.UnrecognizedQualifier
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:subsumesRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    subsumes,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                    "subsumes")));
                                                
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
                                             org.hl7.ctsmapi.SubsumesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.SubsumesResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.SubsumptionNotSupported){
                          throw (tr.com.srdc.icardea.cts.messageruntime.SubsumptionNotSupported)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.QualifiersNotSupported){
                          throw (tr.com.srdc.icardea.cts.messageruntime.QualifiersNotSupported)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnrecognizedQualifier){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnrecognizedQualifier)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#getServiceVersion
                     * @param getServiceVersion
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.GetServiceVersionResponse getServiceVersion(

                            org.hl7.ctsmapi.GetServiceVersion getServiceVersion)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:getServiceVersionRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getServiceVersion,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
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
                                             org.hl7.ctsmapi.GetServiceVersionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.GetServiceVersionResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#fillInDetails
                     * @param fillInDetails
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownLanguage : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.NoApplicableDesignationFound : 
                     */

                    

                            public  org.hl7.ctsmapi.FillInDetailsResponse fillInDetails(

                            org.hl7.ctsmapi.FillInDetails fillInDetails)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownLanguage
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError
                        ,tr.com.srdc.icardea.cts.messageruntime.NoApplicableDesignationFound{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:fillInDetailsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    fillInDetails,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                    "fillInDetails")));
                                                
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
                                             org.hl7.ctsmapi.FillInDetailsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.FillInDetailsResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownLanguage){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownLanguage)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.NoApplicableDesignationFound){
                          throw (tr.com.srdc.icardea.cts.messageruntime.NoApplicableDesignationFound)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#getCTSVersion
                     * @param getCTSVersion
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.GetCTSVersionResponse getCTSVersion(

                            org.hl7.ctsmapi.GetCTSVersion getCTSVersion)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:getCTSVersionRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getCTSVersion,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
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
                                             org.hl7.ctsmapi.GetCTSVersionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.GetCTSVersionResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#validateCode
                     * @param validateCode
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.ValidateCodeResponse validateCode(

                            org.hl7.ctsmapi.ValidateCode validateCode)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain
                        ,tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:validateCodeRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    validateCode,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                    "validateCode")));
                                                
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
                                             org.hl7.ctsmapi.ValidateCodeResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.ValidateCodeResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet){
                          throw (tr.com.srdc.icardea.cts.messageruntime.NoApplicableValueSet)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#getServiceName
                     * @param getServiceName
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.GetServiceNameResponse getServiceName(

                            org.hl7.ctsmapi.GetServiceName getServiceName)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:getServiceNameRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getServiceName,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
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
                                             org.hl7.ctsmapi.GetServiceNameResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.GetServiceNameResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#validateTranslation
                     * @param validateTranslation
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.ValidateTranslationResponse validateTranslation(

                            org.hl7.ctsmapi.ValidateTranslation validateTranslation)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:validateTranslationRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    validateTranslation,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                    "validateTranslation")));
                                                
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
                                             org.hl7.ctsmapi.ValidateTranslationResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.ValidateTranslationResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#getSupportedVocabularyDomains
                     * @param getSupportedVocabularyDomains
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownMatchAlgorithm : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.BadlyFormedMatchText : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.TimeoutError : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.GetSupportedVocabularyDomainsResponse getSupportedVocabularyDomains(

                            org.hl7.ctsmapi.GetSupportedVocabularyDomains getSupportedVocabularyDomains)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownMatchAlgorithm
                        ,tr.com.srdc.icardea.cts.messageruntime.BadlyFormedMatchText
                        ,tr.com.srdc.icardea.cts.messageruntime.TimeoutError
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:getSupportedVocabularyDomainsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getSupportedVocabularyDomains,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                    "getSupportedVocabularyDomains")));
                                                
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
                                             org.hl7.ctsmapi.GetSupportedVocabularyDomainsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.GetSupportedVocabularyDomainsResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownMatchAlgorithm){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownMatchAlgorithm)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.BadlyFormedMatchText){
                          throw (tr.com.srdc.icardea.cts.messageruntime.BadlyFormedMatchText)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.TimeoutError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.TimeoutError)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#areEquivalent
                     * @param areEquivalent
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.SubsumptionNotSupported : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.QualifiersNotSupported : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnrecognizedQualifier : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.AreEquivalentResponse areEquivalent(

                            org.hl7.ctsmapi.AreEquivalent areEquivalent)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.SubsumptionNotSupported
                        ,tr.com.srdc.icardea.cts.messageruntime.QualifiersNotSupported
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem
                        ,tr.com.srdc.icardea.cts.messageruntime.UnrecognizedQualifier
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:areEquivalentRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    areEquivalent,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                    "areEquivalent")));
                                                
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
                                             org.hl7.ctsmapi.AreEquivalentResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.AreEquivalentResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.SubsumptionNotSupported){
                          throw (tr.com.srdc.icardea.cts.messageruntime.SubsumptionNotSupported)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.QualifiersNotSupported){
                          throw (tr.com.srdc.icardea.cts.messageruntime.QualifiersNotSupported)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownConceptCode)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnrecognizedQualifier){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnrecognizedQualifier)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#translateCode
                     * @param translateCode
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnableToTranslate : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem : 
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.TranslateCodeResponse translateCode(

                            org.hl7.ctsmapi.TranslateCode translateCode)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain
                        ,tr.com.srdc.icardea.cts.messageruntime.UnableToTranslate
                        ,tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:translateCodeRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    translateCode,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                    "translateCode")));
                                                
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
                                             org.hl7.ctsmapi.TranslateCodeResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.TranslateCodeResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownApplicationContextCode)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownVocabularyDomain)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnableToTranslate){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnableToTranslate)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnknownCodeSystem)ex;
                        }
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
                     * @see tr.com.srdc.icardea.cts.messageruntime.RuntimeOperationsService#getHL7ReleaseVersion
                     * @param getHL7ReleaseVersion
                    
                     * @throws tr.com.srdc.icardea.cts.messageruntime.UnexpectedError : 
                     */

                    

                            public  org.hl7.ctsmapi.GetHL7ReleaseVersionResponse getHL7ReleaseVersion(

                            org.hl7.ctsmapi.GetHL7ReleaseVersion getHL7ReleaseVersion)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,tr.com.srdc.icardea.cts.messageruntime.UnexpectedError{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("urn://hl7.org/CTSMAPI:RuntimeOperations:getHL7ReleaseVersionRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getHL7ReleaseVersion,
                                                    optimizeContent(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                    "getHL7ReleaseVersion")));
                                                
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
                                             org.hl7.ctsmapi.GetHL7ReleaseVersionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.hl7.ctsmapi.GetHL7ReleaseVersionResponse)object;
                                   
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
                        
                        if (ex instanceof tr.com.srdc.icardea.cts.messageruntime.UnexpectedError){
                          throw (tr.com.srdc.icardea.cts.messageruntime.UnexpectedError)ex;
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
     //http://195.142.27.167:8080/axis2/services/RuntimeOperationsService/
        
        private static final javax.xml.bind.JAXBContext wsContext;
        static {
            javax.xml.bind.JAXBContext jc;
            jc = null;
            try {
				jc = javax.xml.bind.JAXBContext.newInstance(
            org.hl7.ctsmapi.GetServiceDescription.class,
                        org.hl7.ctsmapi.GetServiceDescriptionResponse.class,
                        org.hl7.ctsmapi.UnexpectedError.class,
                        org.hl7.ctsmapi.LookupValueSetExpansion.class,
                        org.hl7.ctsmapi.LookupValueSetExpansionResponse.class,
                        org.hl7.ctsmapi.UnknownLanguage.class,
                        org.hl7.ctsmapi.UnknownApplicationContextCode.class,
                        org.hl7.ctsmapi.UnknownVocabularyDomain.class,
                        org.hl7.ctsmapi.NoApplicableValueSet.class,
                        org.hl7.ctsmapi.TimeoutError.class,
                        org.hl7.ctsmapi.ExpandValueSetExpansionContext.class,
                        org.hl7.ctsmapi.ExpandValueSetExpansionContextResponse.class,
                        org.hl7.ctsmapi.InvalidExpansionContext.class,
                        org.hl7.ctsmapi.GetSupportedMatchAlgorithms.class,
                        org.hl7.ctsmapi.GetSupportedMatchAlgorithmsResponse.class,
                        org.hl7.ctsmapi.Subsumes.class,
                        org.hl7.ctsmapi.SubsumesResponse.class,
                        org.hl7.ctsmapi.SubsumptionNotSupported.class,
                        org.hl7.ctsmapi.QualifiersNotSupported.class,
                        org.hl7.ctsmapi.UnknownConceptCode.class,
                        org.hl7.ctsmapi.UnknownCodeSystem.class,
                        org.hl7.ctsmapi.UnrecognizedQualifier.class,
                        org.hl7.ctsmapi.GetServiceVersion.class,
                        org.hl7.ctsmapi.GetServiceVersionResponse.class,
                        org.hl7.ctsmapi.FillInDetails.class,
                        org.hl7.ctsmapi.FillInDetailsResponse.class,
                        org.hl7.ctsmapi.NoApplicableDesignationFound.class,
                        org.hl7.ctsmapi.GetCTSVersion.class,
                        org.hl7.ctsmapi.GetCTSVersionResponse.class,
                        org.hl7.ctsmapi.ValidateCode.class,
                        org.hl7.ctsmapi.ValidateCodeResponse.class,
                        org.hl7.ctsmapi.GetServiceName.class,
                        org.hl7.ctsmapi.GetServiceNameResponse.class,
                        org.hl7.ctsmapi.ValidateTranslation.class,
                        org.hl7.ctsmapi.ValidateTranslationResponse.class,
                        org.hl7.ctsmapi.GetSupportedVocabularyDomains.class,
                        org.hl7.ctsmapi.GetSupportedVocabularyDomainsResponse.class,
                        org.hl7.ctsmapi.UnknownMatchAlgorithm.class,
                        org.hl7.ctsmapi.BadlyFormedMatchText.class,
                        org.hl7.ctsmapi.AreEquivalent.class,
                        org.hl7.ctsmapi.AreEquivalentResponse.class,
                        org.hl7.ctsmapi.TranslateCode.class,
                        org.hl7.ctsmapi.TranslateCodeResponse.class,
                        org.hl7.ctsmapi.UnableToTranslate.class,
                        org.hl7.ctsmapi.GetHL7ReleaseVersion.class,
                        org.hl7.ctsmapi.GetHL7ReleaseVersionResponse.class
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

        

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetServiceDescription param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetServiceDescription.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getServiceDescription");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getServiceDescription", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetServiceDescription param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetServiceDescriptionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetServiceDescriptionResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getServiceDescriptionResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getServiceDescriptionResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetServiceDescriptionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.UnexpectedError param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.UnexpectedError.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault5");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault5", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.UnexpectedError param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.LookupValueSetExpansion param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.LookupValueSetExpansion.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "lookupValueSetExpansion");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "lookupValueSetExpansion", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.LookupValueSetExpansion param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.LookupValueSetExpansionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.LookupValueSetExpansionResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "lookupValueSetExpansionResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "lookupValueSetExpansionResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.LookupValueSetExpansionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.UnknownLanguage param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.UnknownLanguage.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault13");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault13", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.UnknownLanguage param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.UnknownApplicationContextCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.UnknownApplicationContextCode.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault9");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault9", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.UnknownApplicationContextCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.UnknownVocabularyDomain param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.UnknownVocabularyDomain.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault10");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault10", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.UnknownVocabularyDomain param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.NoApplicableValueSet param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.NoApplicableValueSet.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault11");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault11", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.NoApplicableValueSet param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.TimeoutError param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.TimeoutError.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault6");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault6", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.TimeoutError param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.ExpandValueSetExpansionContext param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.ExpandValueSetExpansionContext.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "expandValueSetExpansionContext");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "expandValueSetExpansionContext", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.ExpandValueSetExpansionContext param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.ExpandValueSetExpansionContextResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.ExpandValueSetExpansionContextResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "expandValueSetExpansionContextResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "expandValueSetExpansionContextResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.ExpandValueSetExpansionContextResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.InvalidExpansionContext param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.InvalidExpansionContext.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault15");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault15", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.InvalidExpansionContext param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetSupportedMatchAlgorithms param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetSupportedMatchAlgorithms.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getSupportedMatchAlgorithms");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getSupportedMatchAlgorithms", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetSupportedMatchAlgorithms param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetSupportedMatchAlgorithmsResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetSupportedMatchAlgorithmsResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getSupportedMatchAlgorithmsResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getSupportedMatchAlgorithmsResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetSupportedMatchAlgorithmsResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.Subsumes param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.Subsumes.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "subsumes");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "subsumes", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.Subsumes param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.SubsumesResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.SubsumesResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "subsumesResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "subsumesResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.SubsumesResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.SubsumptionNotSupported param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.SubsumptionNotSupported.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.SubsumptionNotSupported param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.QualifiersNotSupported param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.QualifiersNotSupported.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault1");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault1", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.QualifiersNotSupported param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.UnknownConceptCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.UnknownConceptCode.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault2");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault2", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.UnknownConceptCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.UnknownCodeSystem param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.UnknownCodeSystem.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault3");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault3", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.UnknownCodeSystem param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.UnrecognizedQualifier param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.UnrecognizedQualifier.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault4");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault4", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.UnrecognizedQualifier param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetServiceVersion param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetServiceVersion.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getServiceVersion");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getServiceVersion", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetServiceVersion param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetServiceVersionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetServiceVersionResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getServiceVersionResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getServiceVersionResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetServiceVersionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.FillInDetails param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.FillInDetails.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fillInDetails");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fillInDetails", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.FillInDetails param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.FillInDetailsResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.FillInDetailsResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fillInDetailsResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fillInDetailsResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.FillInDetailsResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.NoApplicableDesignationFound param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.NoApplicableDesignationFound.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault14");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault14", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.NoApplicableDesignationFound param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetCTSVersion param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetCTSVersion.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getCTSVersion");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getCTSVersion", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetCTSVersion param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetCTSVersionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetCTSVersionResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getCTSVersionResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getCTSVersionResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetCTSVersionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.ValidateCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.ValidateCode.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "validateCode");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "validateCode", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.ValidateCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.ValidateCodeResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.ValidateCodeResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "validateCodeResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "validateCodeResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.ValidateCodeResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetServiceName param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetServiceName.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getServiceName");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getServiceName", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetServiceName param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetServiceNameResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetServiceNameResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getServiceNameResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getServiceNameResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetServiceNameResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.ValidateTranslation param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.ValidateTranslation.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "validateTranslation");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "validateTranslation", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.ValidateTranslation param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.ValidateTranslationResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.ValidateTranslationResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "validateTranslationResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "validateTranslationResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.ValidateTranslationResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetSupportedVocabularyDomains param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetSupportedVocabularyDomains.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getSupportedVocabularyDomains");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getSupportedVocabularyDomains", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetSupportedVocabularyDomains param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetSupportedVocabularyDomainsResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetSupportedVocabularyDomainsResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getSupportedVocabularyDomainsResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getSupportedVocabularyDomainsResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetSupportedVocabularyDomainsResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.UnknownMatchAlgorithm param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.UnknownMatchAlgorithm.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault7");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault7", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.UnknownMatchAlgorithm param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.BadlyFormedMatchText param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.BadlyFormedMatchText.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault8");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault8", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.BadlyFormedMatchText param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.AreEquivalent param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.AreEquivalent.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "areEquivalent");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "areEquivalent", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.AreEquivalent param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.AreEquivalentResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.AreEquivalentResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "areEquivalentResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "areEquivalentResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.AreEquivalentResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.TranslateCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.TranslateCode.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "translateCode");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "translateCode", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.TranslateCode param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.TranslateCodeResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.TranslateCodeResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "translateCodeResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "translateCodeResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.TranslateCodeResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.UnableToTranslate param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.UnableToTranslate.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "fault12");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "fault12", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.UnableToTranslate param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetHL7ReleaseVersion param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetHL7ReleaseVersion.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getHL7ReleaseVersion");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getHL7ReleaseVersion", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetHL7ReleaseVersion param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(org.hl7.ctsmapi.GetHL7ReleaseVersionResponse param, boolean optimizeContent)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( org.hl7.ctsmapi.GetHL7ReleaseVersionResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        "urn://hl7.org/CTSMAPI",
                                                                        "getHL7ReleaseVersionResponse");
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("urn://hl7.org/CTSMAPI",
                                                                           null);
                        return factory.createOMElement(source, "getHL7ReleaseVersionResponse", namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.hl7.ctsmapi.GetHL7ReleaseVersionResponse param, boolean optimizeContent)
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
   