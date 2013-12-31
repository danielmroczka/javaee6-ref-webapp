/*
 * Copyright daniel.mroczka@gmail.com. All rights reserved. 
 */
package com.labs.dm.jee6.webapp.jaxrs;

import com.labs.dm.jee6.webapp.jaxb.Foo;
import java.io.Serializable;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author daniel
 * 
 * Method | URL        | Action
 * ---------------------------
 * PUT      /foo         Add a new book
 * GET      /foo         Get all foo's
 * 
 */
@Path("/jee")
public class FooService implements Serializable {

    private final FooContainer dao = FooContainer.getInstance();
    
    @PUT
    @Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_XML})
    public Response addFoo(Foo foo) {
        dao.addItem(foo);
        System.out.println(foo.getName());
        return Response.noContent().build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Foo> getFoo() {
        return dao.getItems();
    }     
}
