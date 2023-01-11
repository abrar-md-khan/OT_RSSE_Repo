
/**
 * StartResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:58 BST)
 */

            
                package com.actuate.schemas.actuate11.rsse;
            

            /**
            *  StartResponse bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class StartResponse
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = StartResponse
                Namespace URI = http://schemas.actuate.com/actuate11/rsse
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for IntegrationLevel
                        */

                        
                                    protected java.lang.String localIntegrationLevel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntegrationLevelTracker = false ;

                           public boolean isIntegrationLevelSpecified(){
                               return localIntegrationLevelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIntegrationLevel(){
                               return localIntegrationLevel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IntegrationLevel
                               */
                               public void setIntegrationLevel(java.lang.String param){
                            localIntegrationLevelTracker = param != null;
                                   
                                            this.localIntegrationLevel=param;
                                       

                               }
                            

                        /**
                        * field for ExternalProperties
                        */

                        
                                    protected com.actuate.schemas.actuate11.rsse.ArrayOfString localExternalProperties ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExternalPropertiesTracker = false ;

                           public boolean isExternalPropertiesSpecified(){
                               return localExternalPropertiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.actuate.schemas.actuate11.rsse.ArrayOfString
                           */
                           public  com.actuate.schemas.actuate11.rsse.ArrayOfString getExternalProperties(){
                               return localExternalProperties;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalProperties
                               */
                               public void setExternalProperties(com.actuate.schemas.actuate11.rsse.ArrayOfString param){
                            localExternalPropertiesTracker = param != null;
                                   
                                            this.localExternalProperties=param;
                                       

                               }
                            

                        /**
                        * field for RSSEVersion
                        */

                        
                                    protected java.lang.String localRSSEVersion ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRSSEVersion(){
                               return localRSSEVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RSSEVersion
                               */
                               public void setRSSEVersion(java.lang.String param){
                            
                                            this.localRSSEVersion=param;
                                       

                               }
                            

                        /**
                        * field for UserACLExternal
                        */

                        
                                    protected boolean localUserACLExternal ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserACLExternalTracker = false ;

                           public boolean isUserACLExternalSpecified(){
                               return localUserACLExternalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUserACLExternal(){
                               return localUserACLExternal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserACLExternal
                               */
                               public void setUserACLExternal(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localUserACLExternalTracker =
                                       true;
                                   
                                            this.localUserACLExternal=param;
                                       

                               }
                            

                        /**
                        * field for ConnectionPropertyExternal
                        */

                        
                                    protected boolean localConnectionPropertyExternal ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConnectionPropertyExternalTracker = false ;

                           public boolean isConnectionPropertyExternalSpecified(){
                               return localConnectionPropertyExternalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getConnectionPropertyExternal(){
                               return localConnectionPropertyExternal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConnectionPropertyExternal
                               */
                               public void setConnectionPropertyExternal(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localConnectionPropertyExternalTracker =
                                       true;
                                   
                                            this.localConnectionPropertyExternal=param;
                                       

                               }
                            

                        /**
                        * field for SelectUsersOfRole
                        */

                        
                                    protected boolean localSelectUsersOfRole ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSelectUsersOfRoleTracker = false ;

                           public boolean isSelectUsersOfRoleSpecified(){
                               return localSelectUsersOfRoleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSelectUsersOfRole(){
                               return localSelectUsersOfRole;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SelectUsersOfRole
                               */
                               public void setSelectUsersOfRole(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localSelectUsersOfRoleTracker =
                                       true;
                                   
                                            this.localSelectUsersOfRole=param;
                                       

                               }
                            

                        /**
                        * field for SelectGroupsOfUser
                        */

                        
                                    protected boolean localSelectGroupsOfUser ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSelectGroupsOfUserTracker = false ;

                           public boolean isSelectGroupsOfUserSpecified(){
                               return localSelectGroupsOfUserTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSelectGroupsOfUser(){
                               return localSelectGroupsOfUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SelectGroupsOfUser
                               */
                               public void setSelectGroupsOfUser(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localSelectGroupsOfUserTracker =
                                       true;
                                   
                                            this.localSelectGroupsOfUser=param;
                                       

                               }
                            

                        /**
                        * field for SupportGetTranslatedUserNames
                        */

                        
                                    protected boolean localSupportGetTranslatedUserNames ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSupportGetTranslatedUserNamesTracker = false ;

                           public boolean isSupportGetTranslatedUserNamesSpecified(){
                               return localSupportGetTranslatedUserNamesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSupportGetTranslatedUserNames(){
                               return localSupportGetTranslatedUserNames;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SupportGetTranslatedUserNames
                               */
                               public void setSupportGetTranslatedUserNames(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localSupportGetTranslatedUserNamesTracker =
                                       true;
                                   
                                            this.localSupportGetTranslatedUserNames=param;
                                       

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
                           namespacePrefix+":StartResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "StartResponse",
                           xmlWriter);
                   }

               
                   }
                if (localIntegrationLevelTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "IntegrationLevel", xmlWriter);
                             

                                          if (localIntegrationLevel==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("IntegrationLevel cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIntegrationLevel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExternalPropertiesTracker){
                                            if (localExternalProperties==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ExternalProperties cannot be null!!");
                                            }
                                           localExternalProperties.serialize(new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","ExternalProperties"),
                                               xmlWriter);
                                        }
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "RSSEVersion", xmlWriter);
                             

                                          if (localRSSEVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RSSEVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRSSEVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localUserACLExternalTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "UserACLExternal", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("UserACLExternal cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserACLExternal));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localConnectionPropertyExternalTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "ConnectionPropertyExternal", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ConnectionPropertyExternal cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConnectionPropertyExternal));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSelectUsersOfRoleTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "SelectUsersOfRole", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SelectUsersOfRole cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSelectUsersOfRole));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSelectGroupsOfUserTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "SelectGroupsOfUser", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SelectGroupsOfUser cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSelectGroupsOfUser));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSupportGetTranslatedUserNamesTracker){
                                    namespace = "http://schemas.actuate.com/actuate11/rsse";
                                    writeStartElement(null, namespace, "SupportGetTranslatedUserNames", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SupportGetTranslatedUserNames cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSupportGetTranslatedUserNames));
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
        public static StartResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            StartResponse object =
                new StartResponse();

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
                    
                            if (!"StartResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (StartResponse)com.actuate.schemas.actuate11.rsse.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","IntegrationLevel").equals(reader.getName()) || new javax.xml.namespace.QName("","IntegrationLevel").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"IntegrationLevel" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIntegrationLevel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","ExternalProperties").equals(reader.getName()) || new javax.xml.namespace.QName("","ExternalProperties").equals(reader.getName()) ){
                                
                                                object.setExternalProperties(com.actuate.schemas.actuate11.rsse.ArrayOfString.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","RSSEVersion").equals(reader.getName()) || new javax.xml.namespace.QName("","RSSEVersion").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RSSEVersion" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRSSEVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","UserACLExternal").equals(reader.getName()) || new javax.xml.namespace.QName("","UserACLExternal").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"UserACLExternal" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserACLExternal(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","ConnectionPropertyExternal").equals(reader.getName()) || new javax.xml.namespace.QName("","ConnectionPropertyExternal").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ConnectionPropertyExternal" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConnectionPropertyExternal(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","SelectUsersOfRole").equals(reader.getName()) || new javax.xml.namespace.QName("","SelectUsersOfRole").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SelectUsersOfRole" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSelectUsersOfRole(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","SelectGroupsOfUser").equals(reader.getName()) || new javax.xml.namespace.QName("","SelectGroupsOfUser").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SelectGroupsOfUser" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSelectGroupsOfUser(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.actuate.com/actuate11/rsse","SupportGetTranslatedUserNames").equals(reader.getName()) || new javax.xml.namespace.QName("","SupportGetTranslatedUserNames").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SupportGetTranslatedUserNames" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSupportGetTranslatedUserNames(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // 2 - A start element we are not expecting indicates a trailing invalid property
                                
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    