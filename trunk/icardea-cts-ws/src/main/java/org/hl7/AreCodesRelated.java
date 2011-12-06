
/**
 * AreCodesRelated.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package org.hl7;
            

            /**
            *  AreCodesRelated bean class
            */
        
        public  class AreCodesRelated
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "urn://hl7.org/CTSVAPI",
                "areCodesRelated",
                "ns1");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn://hl7.org/CTSVAPI")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for CodeSystem_id
                        */

                        
                                    protected java.lang.String localCodeSystem_id ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCodeSystem_id(){
                               return localCodeSystem_id;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CodeSystem_id
                               */
                               public void setCodeSystem_id(java.lang.String param){
                            
                                            this.localCodeSystem_id=param;
                                    

                               }
                            

                        /**
                        * field for Source_code
                        */

                        
                                    protected java.lang.String localSource_code ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSource_code(){
                               return localSource_code;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Source_code
                               */
                               public void setSource_code(java.lang.String param){
                            
                                            this.localSource_code=param;
                                    

                               }
                            

                        /**
                        * field for Target_code
                        */

                        
                                    protected java.lang.String localTarget_code ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTarget_code(){
                               return localTarget_code;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Target_code
                               */
                               public void setTarget_code(java.lang.String param){
                            
                                            this.localTarget_code=param;
                                    

                               }
                            

                        /**
                        * field for Relationship_code
                        */

                        
                                    protected java.lang.String localRelationship_code ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRelationship_code(){
                               return localRelationship_code;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Relationship_code
                               */
                               public void setRelationship_code(java.lang.String param){
                            
                                            this.localRelationship_code=param;
                                    

                               }
                            

                        /**
                        * field for RelationQualifiers
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRelationQualifiers ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRelationQualifiers(){
                               return localRelationQualifiers;
                           }

                           
                        


                               
                              /**
                               * validate the array for RelationQualifiers
                               */
                              protected void validateRelationQualifiers(java.lang.String[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param RelationQualifiers
                              */
                              public void setRelationQualifiers(java.lang.String[] param){
                              
                                   validateRelationQualifiers(param);

                               
                                      this.localRelationQualifiers=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRelationQualifiers(java.lang.String param){
                                   if (localRelationQualifiers == null){
                                   localRelationQualifiers = new java.lang.String[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRelationQualifiers);
                               list.add(param);
                               this.localRelationQualifiers =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for DirectRelationsOnly
                        */

                        
                                    protected boolean localDirectRelationsOnly ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDirectRelationsOnly(){
                               return localDirectRelationsOnly;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DirectRelationsOnly
                               */
                               public void setDirectRelationsOnly(boolean param){
                            
                                            this.localDirectRelationsOnly=param;
                                    

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
                       AreCodesRelated.this.serialize(MY_QNAME,factory,xmlWriter);
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn://hl7.org/CTSVAPI");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":areCodesRelated",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "areCodesRelated",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "urn://hl7.org/CTSVAPI";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"codeSystem_id", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"codeSystem_id");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("codeSystem_id");
                                    }
                                

                                          if (localCodeSystem_id==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("codeSystem_id cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCodeSystem_id);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn://hl7.org/CTSVAPI";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"source_code", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"source_code");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("source_code");
                                    }
                                

                                          if (localSource_code==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("source_code cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSource_code);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn://hl7.org/CTSVAPI";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"target_code", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"target_code");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("target_code");
                                    }
                                

                                          if (localTarget_code==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("target_code cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTarget_code);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn://hl7.org/CTSVAPI";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"relationship_code", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"relationship_code");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("relationship_code");
                                    }
                                

                                          if (localRelationship_code==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("relationship_code cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRelationship_code);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                             if (localRelationQualifiers!=null) {
                                   namespace = "urn://hl7.org/CTSVAPI";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localRelationQualifiers.length;i++){
                                        
                                            if (localRelationQualifiers[i] != null){
                                        
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"relationQualifiers", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"relationQualifiers");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("relationQualifiers");
                                                }

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRelationQualifiers[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           throw new org.apache.axis2.databinding.ADBException("relationQualifiers cannot be null!!");
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("relationQualifiers cannot be null!!");
                                    
                             }

                        
                                    namespace = "urn://hl7.org/CTSVAPI";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"directRelationsOnly", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"directRelationsOnly");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("directRelationsOnly");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("directRelationsOnly cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDirectRelationsOnly));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
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
                                                                      "codeSystem_id"));
                                 
                                        if (localCodeSystem_id != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodeSystem_id));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("codeSystem_id cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                      "source_code"));
                                 
                                        if (localSource_code != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSource_code));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("source_code cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                      "target_code"));
                                 
                                        if (localTarget_code != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTarget_code));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("target_code cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                      "relationship_code"));
                                 
                                        if (localRelationship_code != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRelationship_code));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("relationship_code cannot be null!!");
                                        }
                                    
                            if (localRelationQualifiers!=null){
                                  for (int i = 0;i < localRelationQualifiers.length;i++){
                                      
                                         if (localRelationQualifiers[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                              "relationQualifiers"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRelationQualifiers[i]));
                                          } else {
                                             
                                                    throw new org.apache.axis2.databinding.ADBException("relationQualifiers cannot be null!!");
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("relationQualifiers cannot be null!!");
                                
                            }

                        
                                      elementList.add(new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI",
                                                                      "directRelationsOnly"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDirectRelationsOnly));
                            

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
        public static AreCodesRelated parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AreCodesRelated object =
                new AreCodesRelated();

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
                    
                            if (!"areCodesRelated".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AreCodesRelated)org.hl7.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","codeSystem_id").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCodeSystem_id(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","source_code").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSource_code(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","target_code").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTarget_code(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","relationship_code").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRelationship_code(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","relationQualifiers").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list5.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone5 = false;
                                            while(!loopDone5){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone5 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","relationQualifiers").equals(reader.getName())){
                                                         list5.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone5 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setRelationQualifiers((java.lang.String[])
                                                        list5.toArray(new java.lang.String[list5.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn://hl7.org/CTSVAPI","directRelationsOnly").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDirectRelationsOnly(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
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
           
          