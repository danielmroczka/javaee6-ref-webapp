/*
 * Copyright daniel.mroczka@gmail.com. All rights reserved. 
 */
package com.labs.dm.jee6.webapp.jaxrs;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author daniel
 */
public class HelloTest {

    private static final String URL = "http://localhost:9998/";
    private static HttpServer server;
    private final Client client = Client.create(new DefaultClientConfig());

    @BeforeClass
    public static void before() throws IOException {
        server = HttpServerFactory.create(URL);
        server.start();
    }

    @AfterClass
    public static void after() {
        server.stop(0);
    }

    @Test
    public void testGetName() {
        WebResource service = client.resource(URL);
        Assert.assertEquals("Hello World from GET!", getResponseAsString(service.path("/")));
    }

    @Test
    public void testPostName() {
        WebResource service = client.resource(URL);
        Assert.assertEquals("Hello World from POST!", postResponseAsString(service.path("/")));
    }

    private static String getResponseAsString(WebResource service) {
        return service.get(String.class);
    }

    private static String postResponseAsString(WebResource service) {
        return service.post(String.class);
    }

}
