// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * CustomerExtensionSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * A CustomerExtensionSetting is used to add or modify extensions
 * being served for the customer.
 */
public class CustomerExtensionSetting  implements java.io.Serializable {
    /* The extension type the extension setting applies to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.FeedType extensionType;

    /* The extension setting specifying which extensions to serve
     * for all of the customer's campaigns. */
    private com.google.api.ads.adwords.axis.v201809.cm.ExtensionSetting extensionSetting;

    public CustomerExtensionSetting() {
    }

    public CustomerExtensionSetting(
           com.google.api.ads.adwords.axis.v201809.cm.FeedType extensionType,
           com.google.api.ads.adwords.axis.v201809.cm.ExtensionSetting extensionSetting) {
           this.extensionType = extensionType;
           this.extensionSetting = extensionSetting;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("extensionSetting", getExtensionSetting())
            .add("extensionType", getExtensionType())
            .toString();
    }

    /**
     * Gets the extensionType value for this CustomerExtensionSetting.
     * 
     * @return extensionType   * The extension type the extension setting applies to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.FeedType getExtensionType() {
        return extensionType;
    }


    /**
     * Sets the extensionType value for this CustomerExtensionSetting.
     * 
     * @param extensionType   * The extension type the extension setting applies to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setExtensionType(com.google.api.ads.adwords.axis.v201809.cm.FeedType extensionType) {
        this.extensionType = extensionType;
    }


    /**
     * Gets the extensionSetting value for this CustomerExtensionSetting.
     * 
     * @return extensionSetting   * The extension setting specifying which extensions to serve
     * for all of the customer's campaigns.
     */
    public com.google.api.ads.adwords.axis.v201809.cm.ExtensionSetting getExtensionSetting() {
        return extensionSetting;
    }


    /**
     * Sets the extensionSetting value for this CustomerExtensionSetting.
     * 
     * @param extensionSetting   * The extension setting specifying which extensions to serve
     * for all of the customer's campaigns.
     */
    public void setExtensionSetting(com.google.api.ads.adwords.axis.v201809.cm.ExtensionSetting extensionSetting) {
        this.extensionSetting = extensionSetting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerExtensionSetting)) return false;
        CustomerExtensionSetting other = (CustomerExtensionSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extensionType==null && other.getExtensionType()==null) || 
             (this.extensionType!=null &&
              this.extensionType.equals(other.getExtensionType()))) &&
            ((this.extensionSetting==null && other.getExtensionSetting()==null) || 
             (this.extensionSetting!=null &&
              this.extensionSetting.equals(other.getExtensionSetting())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExtensionType() != null) {
            _hashCode += getExtensionType().hashCode();
        }
        if (getExtensionSetting() != null) {
            _hashCode += getExtensionSetting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerExtensionSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CustomerExtensionSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "extensionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Feed.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "extensionSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ExtensionSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
