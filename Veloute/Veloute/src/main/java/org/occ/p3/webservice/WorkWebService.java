
package org.occ.p3.webservice;

import java.util.List;
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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WorkWebService", targetNamespace = "http://webservice.p3.occ.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WorkWebService {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "init", targetNamespace = "http://webservice.p3.occ.org/", className = "org.occ.p3.webservice.Init")
    @ResponseWrapper(localName = "initResponse", targetNamespace = "http://webservice.p3.occ.org/", className = "org.occ.p3.webservice.InitResponse")
    @Action(input = "http://webservice.p3.occ.org/WorkWebService/initRequest", output = "http://webservice.p3.occ.org/WorkWebService/initResponse")
    public void init();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.occ.p3.webservice.Work>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByAuthor", targetNamespace = "http://webservice.p3.occ.org/", className = "org.occ.p3.webservice.FindByAuthor")
    @ResponseWrapper(localName = "findByAuthorResponse", targetNamespace = "http://webservice.p3.occ.org/", className = "org.occ.p3.webservice.FindByAuthorResponse")
    @Action(input = "http://webservice.p3.occ.org/WorkWebService/findByAuthorRequest", output = "http://webservice.p3.occ.org/WorkWebService/findByAuthorResponse")
    public List<Work> findByAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.occ.p3.webservice.Work
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWorkById", targetNamespace = "http://webservice.p3.occ.org/", className = "org.occ.p3.webservice.GetWorkById")
    @ResponseWrapper(localName = "getWorkByIdResponse", targetNamespace = "http://webservice.p3.occ.org/", className = "org.occ.p3.webservice.GetWorkByIdResponse")
    @Action(input = "http://webservice.p3.occ.org/WorkWebService/getWorkByIdRequest", output = "http://webservice.p3.occ.org/WorkWebService/getWorkByIdResponse")
    public Work getWorkById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}