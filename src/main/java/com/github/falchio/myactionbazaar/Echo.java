package com.github.falchio.myactionbazaar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/echo")
public class Echo {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}