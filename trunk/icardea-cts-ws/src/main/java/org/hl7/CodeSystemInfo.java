
/**
 * CodeSystemInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package org.hl7;
            

            /**
            *  CodeSystemInfo bean class
            */
        
        public  class CodeSystemInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CodeSystemInfo
                Namespace URI = urn://hl7.org/CTSVAPI
                Namespace Prefix = ns1
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn://hl7.org/CTSVAPI")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for CodeSystem
                        */

                        
                                    protected org.hl7.CodeSystemIdAndVersions localCodeSystem ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.hl7.CodeSystemIdAndVersions
                           */
                           public  org.hl7.CodeSystemIdAndVersions getCodeSystem(){
                               return localCodeSystem;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CodeSystem
                               */
                               public void setCodeSystem(org.hl7.CodeSystemIdAndVersions param){
                            
                                            this.localCodeSystem=param;
                                    

                               }
                            

                        /**
                        * field for FullName
                        */

                        
                                    protected java.lang.String localFullName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFullName(){
                               return localFullName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FullName
                               */
                               public void setFullName(java.lang.String param){
                            
                                            this.localFullName=param;
                                    

                               }
                            

                        /**
                        * field for CodeSystemDescription
                        */

                        
                                    protected java.lang.String localCodeSystemDescription ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCodeSystemDescription(){
                               return localCodeSystemDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CodeSystemDescription
                               */
                               public void setCodeSystemDescription(java.lang.String param){
                            
                                            this.localCodeSystemDescription=param;
                                    

                               }
                            

                        /**
                        * field for SupportedLanguages
                        */

                        
                                    protected org.hl7.ArrayOf_xsd_string localSupportedLanguages ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.hl7.ArrayOf_xsd_string
                           */
                           public  org.hl7.ArrayOf_xsd_string getSupportedLanguages(){
                               return localSupportedLanguages;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SupportedLanguages
                               */
                               public void setSupportedLanguages(org.hl7.ArrayOf_xsd_string param){
                            
                                            this.localSupportedLanguages=param;
                                    

                               }
                            

                        /**
                        * field for SupportedRelations
                        */

                        
                                    protected org.hl7.ArrayOf_xsd_string localSupportedRelations ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.hl7.ArrayOf_xsd_string
                           */
                           public  org.hl7.ArrayOf_xsd_string getSupportedRelations(){
                               return localSupportedRelations;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SupportedRelations
                               */
                               public void setSupportedRelations(org.hl7.ArrayOf_xsd_string param){
                            
                                            this.localSupportedRelations=param;
                                    

                               }
                            

                        /**
                        * field for SupportedProperties
                        */

                        
                                    protected org.hl7.ArrayOf_xsd_string localSupportedProperties ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.hl7.ArrayOf_xsd_string
                           */
                           public  org.hl7.ArrayOf_xsd_string getSupportedProperties(){
                               return localSupportedProperties;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SupportedProperties
                               */
                               public void setSupportedProperties(org.hl7.ArrayOf_xsd_string param){
                            
                                            this.localSupportedProperties=param;
                                    

                               }
                            

                        /**
                        * field for SupportedMimeTypes
                        */

                        
                                    protected org.hl7.ArrayOf_xsd_string localSupportedMimeTypes ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.hl7.ArrayOf_xsd_string
                           */
                           public  org.hl7.ArrayOf_xsd_string getSupportedMimeTypes(){
                               return localSupportedMimeTypes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SupportedMimeTypes
                               */
                               public void setSupportedMimeTypes(org.hl7.ArrayOf_xsd_string param){
                            
                                            this.localSupportedMimeTypes=param;
                                    

                               }
                            

                        /**
                        * field for SupportedRelationQualifiers
                        */

                        
                                    protected org.hl7.ArrayOf_xsd_string localSupportedRelationQualifiers ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.hl7.ArrayOf_xsd_string
                           */
                           public  org.hl7.ArrayOf_xsd_string getSupportedRelationQualifiers(){
                               return localSupportedRelationQualifiers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SupportedRelationQualifiers
                               */
                               public void setSupportedRelationQualifiers(org.hl7.ArrayOf_xsd_string param){
                            
                                            this.localSupportedRelationQualifiers=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       CodeSystemInfo.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn://hl7.org/CTSVAPI");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":CodeSystemInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CodeSystemInfo",
                           xmlWriter);
                   }

               
                   }
               
                                    if (localCodeSystem==null){

                                            java.lang.String namespace2 = "urn://hl7.org/CTSVAPI";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"codeSystem", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"codeSystem");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("codeSystem");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCodeSystem.serialize(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","codeSystem"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "urn://hl7.org/CTSVAPI";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"fullName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"fullName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("fullName");
                                    }
                                

                                          if (localFullName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFullName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn://hl7.org/CTSVAPI";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"codeSystemDescription", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"codeSystemDescription");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("codeSystemDescription");
                                    }
                                

                                          if (localCodeSystemDescription==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCodeSystemDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localSupportedLanguages==null){

                                            java.lang.String namespace2 = "urn://hl7.org/CTSVAPI";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"supportedLanguages", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"supportedLanguages");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("supportedLanguages");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSupportedLanguages.serialize(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","supportedLanguages"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localSupportedRelations==null){

                                            java.lang.String namespace2 = "urn://hl7.org/CTSVAPI";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"supportedRelations", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"supportedRelations");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("supportedRelations");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSupportedRelations.serialize(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","supportedRelations"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localSupportedProperties==null){

                                            java.lang.String namespace2 = "urn://hl7.org/CTSVAPI";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"supportedProperties", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"supportedProperties");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("supportedProperties");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSupportedProperties.serialize(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","supportedProperties"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localSupportedMimeTypes==null){

                                            java.lang.String namespace2 = "urn://hl7.org/CTSVAPI";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"supportedMimeTypes", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"supportedMimeTypes");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("supportedMimeTypes");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSupportedMimeTypes.serialize(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","supportedMimeTypes"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localSupportedRelationQualifiers==null){

                                            java.lang.String namespace2 = "urn://hl7.org/CTSVAPI";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"supportedRelationQualifiers", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"supportedRelationQualifiers");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("supportedRelationQualifiers");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSupportedRelationQualifiers.serialize(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","supportedRelationQualifiers"),
                                        factory,xmlWriter);
                                    }
                                
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

                
                            elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                      "codeSystem"));
                            
                            
                                    elementList.add(localCodeSystem==null?null:
                                    localCodeSystem);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                      "fullName"));
                                 
                                         elementList.add(localFullName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFullName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                      "codeSystemDescription"));
                                 
                                         elementList.add(localCodeSystemDescription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodeSystemDescription));
                                    
                            elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                      "supportedLanguages"));
                            
                            
                                    elementList.add(localSupportedLanguages==null?null:
                                    localSupportedLanguages);
                                
                            elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                      "supportedRelations"));
                            
                            
                                    elementList.add(localSupportedRelations==null?null:
                                    localSupportedRelations);
                                
                            elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                      "supportedProperties"));
                            
                            
                                    elementList.add(localSupportedProperties==null?null:
                                    localSupportedProperties);
                                
                            elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                      "supportedMimeTypes"));
                            
                            
                                    elementList.add(localSupportedMimeTypes==null?null:
                                    localSupportedMimeTypes);
                                
                            elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                      "supportedRelationQualifiers"));
                            
                            
                                    elementList.add(localSupportedRelationQualifiers==null?null:
                                    localSupportedRelationQualifiers);
                                

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
        public static CodeSystemInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CodeSystemInfo object =
                new CodeSystemInfo();

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
                    
                            if (!"CodeSystemInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CodeSystemInfo)org.hl7.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","codeSystem").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCodeSystem(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCodeSystem(org.hl7.CodeSystemIdAndVersions.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","fullName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFullName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","codeSystemDescription").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCodeSystemDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","supportedLanguages").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSupportedLanguages(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSupportedLanguages(org.hl7.ArrayOf_xsd_string.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","supportedRelations").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSupportedRelations(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSupportedRelations(org.hl7.ArrayOf_xsd_string.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","supportedProperties").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSupportedProperties(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSupportedProperties(org.hl7.ArrayOf_xsd_string.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","supportedMimeTypes").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSupportedMimeTypes(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSupportedMimeTypes(org.hl7.ArrayOf_xsd_string.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","supportedRelationQualifiers").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSupportedRelationQualifiers(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSupportedRelationQualifiers(org.hl7.ArrayOf_xsd_string.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
           
          