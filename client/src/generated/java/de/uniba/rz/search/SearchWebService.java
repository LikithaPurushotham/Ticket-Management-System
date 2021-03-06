
package de.uniba.rz.search;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SearchWebService", targetNamespace = "http://search.rz.uniba.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SearchWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns de.uniba.rz.search.Message
     * @throws TypeNotAvailableException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "clientMessage", targetNamespace = "http://search.rz.uniba.de/", className = "de.uniba.rz.search.ClientMessage")
    @ResponseWrapper(localName = "clientMessageResponse", targetNamespace = "http://search.rz.uniba.de/", className = "de.uniba.rz.search.ClientMessageResponse")
    @Action(input = "http://search.rz.uniba.de/SearchWebService/clientMessageRequest", output = "http://search.rz.uniba.de/SearchWebService/clientMessageResponse", fault = {
        @FaultAction(className = TypeNotAvailableException_Exception.class, value = "http://search.rz.uniba.de/SearchWebService/clientMessage/Fault/TypeNotAvailableException")
    })
    public Message clientMessage(
        @WebParam(name = "arg0", targetNamespace = "")
        TicketSearch arg0)
        throws TypeNotAvailableException_Exception
    ;

}
