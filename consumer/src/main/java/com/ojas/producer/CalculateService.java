/**
 * CalculateService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ojas.producer;

public interface CalculateService extends javax.xml.rpc.Service {
    public java.lang.String getCalculateAddress();

    public com.ojas.producer.Calculate getCalculate() throws javax.xml.rpc.ServiceException;

    public com.ojas.producer.Calculate getCalculate(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
