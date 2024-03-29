
/**
 * ValidateCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package org.hl7;
            

            /**
            *  ValidateCode bean class
            */
        
        public  class ValidateCode
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "urn://hl7.org/CTSMAPI",
                "validateCode",
                "ns2");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn://hl7.org/CTSMAPI")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for VocabularyDomain_name
                        */

                        
                                    protected org.hl7.cts.ST localVocabularyDomain_name ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.hl7.cts.ST
                           */
                           public  org.hl7.cts.ST getVocabularyDomain_name(){
                               return localVocabularyDomain_name;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VocabularyDomain_name
                               */
                               public void setVocabularyDomain_name(org.hl7.cts.ST param){
                            
                                            this.localVocabularyDomain_name=param;
                                    

                               }
                            

                        /**
                        * field for CodeToValidate
                        */

                        
                                    protected org.hl7.cts.CD localCodeToValidate ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.hl7.cts.CD
                           */
                           public  org.hl7.cts.CD getCodeToValidate(){
                               return localCodeToValidate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CodeToValidate
                               */
                               public void setCodeToValidate(org.hl7.cts.CD param){
                            
                                            this.localCodeToValidate=param;
                                    

                               }
                            

                        /**
                        * field for ApplicationContext_code
                        */

                        
                                    protected org.hl7.cts.ST localApplicationContext_code ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localApplicationContext_codeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return org.hl7.cts.ST
                           */
                           public  org.hl7.cts.ST getApplicationContext_code(){
                               return localApplicationContext_code;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ApplicationContext_code
                               */
                               public void setApplicationContext_code(org.hl7.cts.ST param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localApplicationContext_codeTracker = true;
                                       } else {
                                          localApplicationContext_codeTracker = false;
                                              
                                       }
                                   
                                            this.localApplicationContext_code=param;
                                    

                               }
                            

                        /**
                        * field for ActiveConceptsOnly
                        */

                        
                                    protected org.hl7.cts.BL localActiveConceptsOnly ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.hl7.cts.BL
                           */
                           public  org.hl7.cts.BL getActiveConceptsOnly(){
                               return localActiveConceptsOnly;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActiveConceptsOnly
                               */
                               public void setActiveConceptsOnly(org.hl7.cts.BL param){
                            
                                            this.localActiveConceptsOnly=param;
                                    

                               }
                            

                        /**
                        * field for ErrorCheckOnly
                        */

                        
                                    protected org.hl7.cts.BL localErrorCheckOnly ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.hl7.cts.BL
                           */
                           public  org.hl7.cts.BL getErrorCheckOnly(){
                               return localErrorCheckOnly;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorCheckOnly
                               */
                               public void setErrorCheckOnly(org.hl7.cts.BL param){
                            
                                            this.localErrorCheckOnly=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       ValidateCode.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn://hl7.org/CTSMAPI");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":validateCode",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "validateCode",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localVocabularyDomain_name==null){
                                                 throw new org.apache.axis2.databinding.ADBException("vocabularyDomain_name cannot be null!!");
                                            }
                                           localVocabularyDomain_name.serialize(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","vocabularyDomain_name"),
                                               factory,xmlWriter);
                                        
                                            if (localCodeToValidate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("codeToValidate cannot be null!!");
                                            }
                                           localCodeToValidate.serialize(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","codeToValidate"),
                                               factory,xmlWriter);
                                         if (localApplicationContext_codeTracker){
                                            if (localApplicationContext_code==null){
                                                 throw new org.apache.axis2.databinding.ADBException("applicationContext_code cannot be null!!");
                                            }
                                           localApplicationContext_code.serialize(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","applicationContext_code"),
                                               factory,xmlWriter);
                                        }
                                            if (localActiveConceptsOnly==null){
                                                 throw new org.apache.axis2.databinding.ADBException("activeConceptsOnly cannot be null!!");
                                            }
                                           localActiveConceptsOnly.serialize(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","activeConceptsOnly"),
                                               factory,xmlWriter);
                                        
                                            if (localErrorCheckOnly==null){
                                                 throw new org.apache.axis2.databinding.ADBException("errorCheckOnly cannot be null!!");
                                            }
                                           localErrorCheckOnly.serialize(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","errorCheckOnly"),
                                               factory,xmlWriter);
                                        
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                            elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                                      "vocabularyDomain_name"));
                            
                            
                                    if (localVocabularyDomain_name==null){
                                         throw new org.apache.axis2.databinding.ADBException("vocabularyDomain_name cannot be null!!");
                                    }
                                    elementList.add(localVocabularyDomain_name);
                                
                            elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                                      "codeToValidate"));
                            
                            
                                    if (localCodeToValidate==null){
                                         throw new org.apache.axis2.databinding.ADBException("codeToValidate cannot be null!!");
                                    }
                                    elementList.add(localCodeToValidate);
                                 if (localApplicationContext_codeTracker){
                            elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                                      "applicationContext_code"));
                            
                            
                                    if (localApplicationContext_code==null){
                                         throw new org.apache.axis2.databinding.ADBException("applicationContext_code cannot be null!!");
                                    }
                                    elementList.add(localApplicationContext_code);
                                }
                            elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                                      "activeConceptsOnly"));
                            
                            
                                    if (localActiveConceptsOnly==null){
                                         throw new org.apache.axis2.databinding.ADBException("activeConceptsOnly cannot be null!!");
                                    }
                                    elementList.add(localActiveConceptsOnly);
                                
                            elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI",
                                                                      "errorCheckOnly"));
                            
                            
                                    if (localErrorCheckOnly==null){
                                         throw new org.apache.axis2.databinding.ADBException("errorCheckOnly cannot be null!!");
                                    }
                                    elementList.add(localErrorCheckOnly);
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ValidateCode parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ValidateCode object =
                new ValidateCode();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"validateCode".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ValidateCode)org.hl7.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","vocabularyDomain_name").equals(reader.getName())){
                                
                                                object.setVocabularyDomain_name(org.hl7.cts.ST.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","codeToValidate").equals(reader.getName())){
                                
                                                object.setCodeToValidate(org.hl7.cts.CD.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","applicationContext_code").equals(reader.getName())){
                                
                                                object.setApplicationContext_code(org.hl7.cts.ST.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","activeConceptsOnly").equals(reader.getName())){
                                
                                                object.setActiveConceptsOnly(org.hl7.cts.BL.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSMAPI","errorCheckOnly").equals(reader.getName())){
                                
                                                object.setErrorCheckOnly(org.hl7.cts.BL.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          