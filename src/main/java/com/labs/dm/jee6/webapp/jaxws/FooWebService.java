/*
 * Copyright daniel.mroczka@gmail.com. All rights reserved. 
 */
package com.labs.dm.jee6.webapp.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author daniel
 */
@WebService
public class FooWebService {

    /**
     * Web service operation
     *
     * @param x
     * @param y
     * @return
     */
    @WebMethod(operationName = "add")
    public Integer add(@WebParam(name = "x") Integer x, @WebParam(name = "y") Integer y) {
        return x + y;
    }

    /**
     * Web service operation
     *
     * @param parameter1
     * @param parameter2
     * @return
     */
    @WebMethod(operationName = "concat")
    public String concat(@WebParam(name = "parameter1") String parameter1, @WebParam(name = "parameter2") String parameter2) {
        return (parameter1 != null ? parameter1 : "") + " " + (parameter2 != null ? parameter2 : "");
    }

}
