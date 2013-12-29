package com.labs.dm.jee6.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
}
