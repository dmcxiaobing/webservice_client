package com.david;

public class DavidWebServiceImplProxy implements com.david.DavidWebServiceImpl {
  private String _endpoint = null;
  private com.david.DavidWebServiceImpl davidWebServiceImpl = null;
  
  public DavidWebServiceImplProxy() {
    _initDavidWebServiceImplProxy();
  }
  
  public DavidWebServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initDavidWebServiceImplProxy();
  }
  
  private void _initDavidWebServiceImplProxy() {
    try {
      davidWebServiceImpl = (new com.david.DavidWebServiceImplServiceLocator()).getDavidWebServiceImplPort();
      if (davidWebServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)davidWebServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)davidWebServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (davidWebServiceImpl != null)
      ((javax.xml.rpc.Stub)davidWebServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.david.DavidWebServiceImpl getDavidWebServiceImpl() {
    if (davidWebServiceImpl == null)
      _initDavidWebServiceImplProxy();
    return davidWebServiceImpl;
  }
  
  public java.lang.String sayHello(java.lang.String arg0) throws java.rmi.RemoteException{
    if (davidWebServiceImpl == null)
      _initDavidWebServiceImplProxy();
    return davidWebServiceImpl.sayHello(arg0);
  }
  
  
}