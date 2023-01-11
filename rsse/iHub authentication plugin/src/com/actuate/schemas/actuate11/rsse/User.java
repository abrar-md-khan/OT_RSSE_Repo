
/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:58 BST)
 */

            
                package com.actuate.schemas.actuate11.rsse;
            

            /**
            *  User bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class User
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = User
                Namespace URI = http://schemas.actuate.com/actuate11/rsse
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            
                                            this.localName=param;
                                       

                               }
                            

                        /**
                        * field for EmailAddress
                        */

                        
                                    protected java.lang.String localEmailAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmailAddressTracker = false ;

                           public boolean isEmailAddressSpecified(){
                               return localEmailAddressTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEmailAddress(){
                               return localEmailAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmailAddress
                               */
                               public void setEmailAddress(java.lang.String param){
                            localEmailAddressTracker = param != null;
                                   
                                            this.localEmailAddress=param;
                                       

                               }
                            

                        /**
                        * field for HomeFolder
                        */

                        
                                    protected java.lang.String localHomeFolder ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHomeFolderTracker = false ;

                           public boolean isHomeFolderSpecified(){
                               return localHomeFolderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHomeFolder(){
                               return localHomeFolder;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HomeFolder
                               */
                               public void setHomeFolder(java.lang.String param){
                            localHomeFolderTracker = param != null;
                                   
                                            this.localHomeFolder=param;
                                       

                               }
                            

                        /**
                        * field for LicenseOptions
                        */

                        
                                    protected com.actuate.schemas.actuate11.rsse.ArrayOfString localLicenseOptions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLicenseOptionsTracker = false ;

                           public boolean isLicenseOptionsSpecified(){
                               return localLicenseOptionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.actuate.schemas.actuate11.rsse.ArrayOfString
                           */
                           public  com.actuate.schemas.actuate11.rsse.ArrayOfString getLicenseOptions(){
                               return localLicenseOptions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LicenseOptions
                               */
                               public void setLicenseOptions(com.actuate.schemas.actuate11.rsse.ArrayOfString param){
                            localLicenseOptionsTracker = param != null;
                                   
                                            this.localLicenseOptions=param;
                                       

                               }
                            

                        /**
                        * field for ViewPreference
                        */

                        
                                    protected java.lang.String localViewPreference ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localViewPreferenceTracker = false ;

                           public boolean isViewPreferenceSpecified(){
                               return localViewPreferenceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getViewPreference(){
                               return localViewPreference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ViewPreference
                               */
                               public void setViewPreference(java.lang.String param){
                            localViewPreferenceTracker = param != null;
                                   
                                            this.localViewPreference=param;
                                       

                               }
                            

                        /**
                        * field for MaxJobPriority
                        */

                        
                                    protected long localMaxJobPriority ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxJobPriorityTracker = false ;

                           public boolean isMaxJobPrioritySpecified(){
                               return localMaxJobPriorityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getMaxJobPriority(){
                               return localMaxJobPriority;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxJobPriority
                               */
                               public void setMaxJobPriority(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localMaxJobPriorityTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localMaxJobPriority=param;
                                       

                               }
                            

                        /**
                        * field for SendNoticeForSuccess
                        */

                        
                                    protected boolean localSendNoticeForSuccess ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSendNoticeForSuccessTracker = false ;

                           public boolean isSendNoticeForSuccessSpecified(){
                               return localSendNoticeForSuccessTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSendNoticeForSuccess(){
                               return localSendNoticeForSuccess;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SendNoticeForSuccess
                               */
                               public void setSendNoticeForSuccess(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localSendNoticeForSuccessTracker =
                                       true;
                                   
                                            this.localSendNoticeForSuccess=param;
                                       

                               }
                            

                        /**
                        * field for SendNoticeForFailure
                        */

                        
                                    protected boolean localSendNoticeForFailure ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSendNoticeForFailureTracker = false ;

                           public boolean isSendNoticeForFailureSpecified(){
                               return localSendNoticeForFailureTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSendNoticeForFailure(){
                               return localSendNoticeForFailure;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SendNoticeForFailure
                               */
                               public void setSendNoticeForFailure(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localSendNoticeForFailureTracker =
                                       true;
                                   
                                            this.localSendNoticeForFailure=param;
                                       

                               }
                            

                        /**
                        * field for SuccessNoticeExpiration
                        */

                        
                                    protected long localSuccessNoticeExpiration ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSuccessNoticeExpirationTracker = false ;

                           public boolean isSuccessNoticeExpirationSpecified(){
                               return localSuccessNoticeExpirationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getSuccessNoticeExpiration(){
                               return localSuccessNoticeExpiration;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SuccessNoticeExpiration
                               */
                               public void setSuccessNoticeExpiration(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localSuccessNoticeExpirationTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localSuccessNoticeExpiration=param;
                                       

                               }
                            

                        /**
                        * field for FailureNoticeExpiration
                        */

                        
                                    protected long localFailureNoticeExpiration ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFailureNoticeExpirationTracker = false ;

                           public boolean isFailureNoticeExpirationSpecified(){
                               return localFailureNoticeExpirationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getFailureNoticeExpiration(){
                               return localFailureNoticeExpiration;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FailureNoticeExpiration
                               */
                               public void setFailureNoticeExpiration(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localFailureNoticeExpirationTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localFailureNoticeExpiration=param;
                                       

                               }
                            

                        /**
                        * field for SendEmailForSuccess
                        */

                        
                                    protected boolean localSendEmailForSuccess ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSendEmailForSuccessTracker = false ;

                           public boolean isSendEmailForSuccessSpecified(){
                               return localSendEmailForSuccessTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSendEmailForSuccess(){
                               return localSendEmailForSuccess;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SendEmailForSuccess
                               */
                               public void setSendEmailForSuccess(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localSendEmailForSuccessTracker =
                                       true;
                                   
                                            this.localSendEmailForSuccess=param;
                                       

                               }
                            

                        /**
                        * field for SendEmailForFailure
                        */

                        
                                    protected boolean localSendEmailForFailure ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSendEmailForFailureTracker = false ;

                           public boolean isSendEmailForFailureSpecified(){
                               return localSendEmailForFailureTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSendEmailForFailure(){
                               return localSendEmailForFailure;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SendEmailForFailure
                               */
                               public void setSendEmailForFailure(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localSendEmailForFailureTracker =
                                       true;
                                   
                                            this.localSendEmailForFailure=param;
                                       

                               }
                            

                        /**
                        * field for AttachReportInEmail
                        */

                        
                                    protected boolean localAttachReportInEmail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttachReportInEmailTracker = false ;

                           public boolean isAttachReportInEmailSpecified(){
                               return localAttachReportInEmailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAttachReportInEmail(){
                               return localAttachReportInEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AttachReportInEmail
                               */
                               public void setAttachReportInEmail(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localAttachReportInEmailTracker =
                                       true;
                                   
                                            this.localAttachReportInEmail=param;
                                       

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


        
               return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this,parentQName));
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://schemas.actuate.com/actuate11/rsse");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":User",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "User",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "Name", xmlWriter);
                             

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localEmailAddressTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "EmailAddress", xmlWriter);
                             

                                          if (localEmailAddress==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("EmailAddress cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEmailAddress);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHomeFolderTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "HomeFolder", xmlWriter);
                             

                                          if (localHomeFolder==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("HomeFolder cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHomeFolder);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLicenseOptionsTracker){
                                            if (localLicenseOptions==null){
                                                 throw new org.apache.axis2.databinding.ADBException("LicenseOptions cannot be null!!");
                                            }
                                           localLicenseOptions.serialize(new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","LicenseOptions"),
                                               xmlWriter);
                                        } if (localViewPreferenceTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "ViewPreference", xmlWriter);
                             

                                          if (localViewPreference==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ViewPreference cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localViewPreference);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxJobPriorityTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "MaxJobPriority", xmlWriter);
                             
                                               if (localMaxJobPriority==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MaxJobPriority cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxJobPriority));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSendNoticeForSuccessTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "SendNoticeForSuccess", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SendNoticeForSuccess cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSendNoticeForSuccess));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSendNoticeForFailureTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "SendNoticeForFailure", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SendNoticeForFailure cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSendNoticeForFailure));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSuccessNoticeExpirationTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "SuccessNoticeExpiration", xmlWriter);
                             
                                               if (localSuccessNoticeExpiration==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SuccessNoticeExpiration cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuccessNoticeExpiration));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFailureNoticeExpirationTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "FailureNoticeExpiration", xmlWriter);
                             
                                               if (localFailureNoticeExpiration==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("FailureNoticeExpiration cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFailureNoticeExpiration));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSendEmailForSuccessTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "SendEmailForSuccess", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SendEmailForSuccess cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSendEmailForSuccess));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSendEmailForFailureTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "SendEmailForFailure", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SendEmailForFailure cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSendEmailForFailure));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAttachReportInEmailTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "AttachReportInEmail", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AttachReportInEmail cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttachReportInEmail));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://schemas.actuate.com/actuate11/rsse")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace,attName,attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace,attName,attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace,attName,attValue);
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
                    xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
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
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static User parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            User object =
                new User();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();
                
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
                    
                            if (!"User".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (User)com.actuate.schemas.actuate11.rsse.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                   
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","Name").equals(reader.getName()) || new javax.xml.namespace.QName("","Name").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Name" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","EmailAddress").equals(reader.getName()) || new javax.xml.namespace.QName("","EmailAddress").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"EmailAddress" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEmailAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","HomeFolder").equals(reader.getName()) || new javax.xml.namespace.QName("","HomeFolder").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"HomeFolder" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHomeFolder(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","LicenseOptions").equals(reader.getName()) || new javax.xml.namespace.QName("","LicenseOptions").equals(reader.getName()) ){
                                
                                                object.setLicenseOptions(com.actuate.schemas.actuate11.rsse.ArrayOfString.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","ViewPreference").equals(reader.getName()) || new javax.xml.namespace.QName("","ViewPreference").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ViewPreference" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setViewPreference(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","MaxJobPriority").equals(reader.getName()) || new javax.xml.namespace.QName("","MaxJobPriority").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MaxJobPriority" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxJobPriority(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","SendNoticeForSuccess").equals(reader.getName()) || new javax.xml.namespace.QName("","SendNoticeForSuccess").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SendNoticeForSuccess" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSendNoticeForSuccess(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","SendNoticeForFailure").equals(reader.getName()) || new javax.xml.namespace.QName("","SendNoticeForFailure").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SendNoticeForFailure" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSendNoticeForFailure(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","SuccessNoticeExpiration").equals(reader.getName()) || new javax.xml.namespace.QName("","SuccessNoticeExpiration").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SuccessNoticeExpiration" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSuccessNoticeExpiration(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","FailureNoticeExpiration").equals(reader.getName()) || new javax.xml.namespace.QName("","FailureNoticeExpiration").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"FailureNoticeExpiration" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFailureNoticeExpiration(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","SendEmailForSuccess").equals(reader.getName()) || new javax.xml.namespace.QName("","SendEmailForSuccess").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SendEmailForSuccess" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSendEmailForSuccess(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","SendEmailForFailure").equals(reader.getName()) || new javax.xml.namespace.QName("","SendEmailForFailure").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SendEmailForFailure" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSendEmailForFailure(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","AttachReportInEmail").equals(reader.getName()) || new javax.xml.namespace.QName("","AttachReportInEmail").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"AttachReportInEmail" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAttachReportInEmail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                             else{
                                        // 3 - A start element we are not expecting indicates an invalid parameter was passed
                                        
                                            throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                        
                             }
                          
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    