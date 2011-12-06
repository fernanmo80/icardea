
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */

            package org.hl7;
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "ArrayOf_xsd_string".equals(typeName)){
                   
                            return  org.hl7.ArrayOf_xsd_string.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "CodeSystemIdAndVersions".equals(typeName)){
                   
                            return  org.hl7.CodeSystemIdAndVersions.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "UnknownLanguageCode".equals(typeName)){
                   
                            return  org.hl7.UnknownLanguageCode.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "CTSVersionId".equals(typeName)){
                   
                            return  org.hl7.CTSVersionId.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "UnknownCodeSystem".equals(typeName)){
                   
                            return  org.hl7.UnknownCodeSystem.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "StringAndLanguage".equals(typeName)){
                   
                            return  org.hl7.StringAndLanguage.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "NoApplicableDesignationFound".equals(typeName)){
                   
                            return  org.hl7.NoApplicableDesignationFound.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "TimeoutError".equals(typeName)){
                   
                            return  org.hl7.TimeoutError.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "ConceptId".equals(typeName)){
                   
                            return  org.hl7.ConceptId.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "UnknownRelationQualifier".equals(typeName)){
                   
                            return  org.hl7.UnknownRelationQualifier.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "UnknownRelationshipCode".equals(typeName)){
                   
                            return  org.hl7.UnknownRelationshipCode.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "UnknownConceptCode".equals(typeName)){
                   
                            return  org.hl7.UnknownConceptCode.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "CodeSystemInfo".equals(typeName)){
                   
                            return  org.hl7.CodeSystemInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "UnexpectedError".equals(typeName)){
                   
                            return  org.hl7.UnexpectedError.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn://hl7.org/CTSVAPI".equals(namespaceURI) &&
                  "CodeSystemNameIdMismatch".equals(typeName)){
                   
                            return  org.hl7.CodeSystemNameIdMismatch.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    