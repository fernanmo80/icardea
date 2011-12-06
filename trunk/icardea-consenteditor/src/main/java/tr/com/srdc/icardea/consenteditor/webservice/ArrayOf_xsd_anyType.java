
/**
 * ArrayOf_xsd_anyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package tr.com.srdc.icardea.consenteditor.webservice;
            

            /**
            *  ArrayOf_xsd_anyType bean class
            */
        
        public  class ArrayOf_xsd_anyType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ArrayOf_xsd_anyType
                Namespace URI = http://webservice.consenteditor.icardea.srdc.com.tr
                Namespace Prefix = ns1
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservice.consenteditor.icardea.srdc.com.tr")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for Item
                        * This was an Array!
                        */

                        
                                    protected java.lang.Object[] localItem ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localItemTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object[]
                           */
                           public  java.lang.Object[] getItem(){
                               return localItem;
                           }

                           
                        


                               
                              /**
                               * validate the array for Item
                               */
                              protected void validateItem(java.lang.Object[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Item
                              */
                              public void setItem(java.lang.Object[] param){
                              
                                   validateItem(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localItemTracker = true;
                                          } else {
                                             localItemTracker = false;
                                                 
                                          }
                                      
                                      this.localItem=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.Object
                             */
                             public void addItem(java.lang.Object param){
                                   if (localItem == null){
                                   localItem = new java.lang.Object[]{};
                                   }

                            
                                 //update the setting tracker
                                localItemTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localItem);
                               list.add(param);
                               this.localItem =
                             (java.lang.Object[])list.toArray(
                            new java.lang.Object[list.size()]);

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
                       ArrayOf_xsd_anyType.this.serialize(parentQName,factory,xmlWriter);
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservice.consenteditor.icardea.srdc.com.tr");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ArrayOf_xsd_anyType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ArrayOf_xsd_anyType",
                           xmlWriter);
                   }

               
                   }
                if (localItemTracker){
                            
                            if (localItem!=null){
                                 for (int i = 0;i < localItem.length;i++){
                                    if (localItem[i] != null){

                                           if (localItem[i] instanceof org.apache.axis2.databinding.ADBBean){
                                                ((org.apache.axis2.databinding.ADBBean)localItem[i]).serialize(
                                                           new javax.xml.namespace.QName("http://webservice.consenteditor.icardea.srdc.com.tr","item"),
                                                           factory,xmlWriter,true);
                                            } else {
                                                java.lang.String namespace2 = "http://webservice.consenteditor.icardea.srdc.com.tr";
                                                if (! namespace2.equals("")) {
                                                    java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                                    if (prefix2 == null) {
                                                        prefix2 = generatePrefix(namespace2);

                                                        xmlWriter.writeStartElement(prefix2,"item", namespace2);
                                                        xmlWriter.writeNamespace(prefix2, namespace2);
                                                        xmlWriter.setPrefix(prefix2, namespace2);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace2,"item");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("item");
                                                }
                                                org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localItem[i], xmlWriter);
                                                xmlWriter.writeEndElement();
                                             }

                                    } else {
                                       
                                              // we have to do nothing since minOccurs is zero
                                        
                                    }
                                 }
                            } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("item cannot be null!!");
                                    
                            }

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

                 if (localItemTracker){
                             if (localItem!=null) {
                                 for (int i = 0;i < localItem.length;i++){

                                    if (localItem[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservice.consenteditor.icardea.srdc.com.tr",
                                                                          "item"));
                                         elementList.add(localItem[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("item cannot be null!!");
                                    
                             }

                        }

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
        public static ArrayOf_xsd_anyType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ArrayOf_xsd_anyType object =
                new ArrayOf_xsd_anyType();

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
                    
                            if (!"ArrayOf_xsd_anyType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ArrayOf_xsd_anyType)tr.com.srdc.icardea.consenteditor.webservice.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservice.consenteditor.icardea.srdc.com.tr","item").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    

                                             boolean loopDone1=false;
                                             javax.xml.namespace.QName startQname1 = new javax.xml.namespace.QName(
                                                    "http://webservice.consenteditor.icardea.srdc.com.tr",
                                                    "item");

                                             while (!loopDone1){
                                                 event = reader.getEventType();
                                                 if (javax.xml.stream.XMLStreamConstants.START_ELEMENT == event
                                                         && startQname1.equals(reader.getName())){

                                                      
                                                      list1.add(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                                            tr.com.srdc.icardea.consenteditor.webservice.ExtensionMapper.class));
                                                       
                                                 } else if (javax.xml.stream.XMLStreamConstants.START_ELEMENT == event &&
                                                            !startQname1.equals(reader.getName())){
                                                     loopDone1 = true;
                                                 }else if (javax.xml.stream.XMLStreamConstants.END_ELEMENT == event &&
                                                           !startQname1.equals(reader.getName())){
                                                     loopDone1 = true;
                                                 }else if (javax.xml.stream.XMLStreamConstants.END_DOCUMENT == event){
                                                     loopDone1 = true;
                                                 }else{
                                                     reader.next();
                                                 }

                                             }

                                            
                                                    object.setItem(list1.toArray());
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
           
          