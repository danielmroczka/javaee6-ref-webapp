/*
 * Copyright daniel.mroczka@gmail.com. All rights reserved. 
 */
package com.labs.dm.jee6.webapp.jaxrs;

import com.labs.dm.jee6.webapp.jaxb.Foo;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author daniel
 * 
 * Method | URL        | Action
 * ---------------------------
 * PUT      /foo         Add a new book
 * 
 */
@Path("/foo")
public class FooService {

    @PUT
    @Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_XML})
    public Response addFoo(Foo foo) {
        System.out.println(foo.getName());
        return Response.noContent().build();
    }
    
    @GET
    public Foo getFoo() {
        return new Foo("test", "sample");
    }    
}
