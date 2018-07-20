
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "test", targetNamespace = "http://ws/", className = "ws.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://ws/", className = "ws.TestResponse")
    @Action(input = "http://ws/BanqueService/testRequest", output = "http://ws/BanqueService/testResponse")
    public String test();

    /**
     * 
     * @param mt
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "soldeBanque", targetNamespace = "http://ws/", className = "ws.SoldeBanque")
    @ResponseWrapper(localName = "soldeBanqueResponse", targetNamespace = "http://ws/", className = "ws.SoldeBanqueResponse")
    @Action(input = "http://ws/BanqueService/soldeBanqueRequest", output = "http://ws/BanqueService/soldeBanqueResponse")
    public float soldeBanque(
        @WebParam(name = "mt", targetNamespace = "")
        float mt);

}