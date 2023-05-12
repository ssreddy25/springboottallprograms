package com.ojas.producer;

public class CalculateProxy implements com.ojas.producer.Calculate {
  private String _endpoint = null;
  private com.ojas.producer.Calculate calculate = null;
  
  public CalculateProxy() {
    _initCalculateProxy();
  }
  
  public CalculateProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculateProxy();
  }
  
  private void _initCalculateProxy() {
    try {
      calculate = (new com.ojas.producer.CalculateServiceLocator()).getCalculate();
      if (calculate != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculate)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculate != null)
      ((javax.xml.rpc.Stub)calculate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ojas.producer.Calculate getCalculate() {
    if (calculate == null)
      _initCalculateProxy();
    return calculate;
  }
  
  public int calci(int i, int j) throws java.rmi.RemoteException{
    if (calculate == null)
      _initCalculateProxy();
    return calculate.calci(i, j);
  }
  
  
}