package com.labs.dm.jee6.webapp.jaxrs;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/")
public class Hello {

    @GET
    public String helloWorldGet() {
        return "Hello World from GET!";
    }

    @POST
    public String helloWorldPost() {
        return "Hello World from POST!";
    }

    @PUT
    public String helloWorldPut() {
        return "Hello World from PUT!";
    }

    @DELETE
    public String helloWorldDelete() {
        return "Hello World from DELETE!";
    }

    @OPTIONS
    public String helloWorldOptions() {
        return "Hello World from OPTIONS!";
    }
    
    @HEAD
    public String helloWorldHead() {
        return "Hello World from HEAD!";
    }
    
}
