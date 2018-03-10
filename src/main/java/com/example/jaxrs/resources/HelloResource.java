package com.example.jaxrs.resources;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public class HelloResource {
    @GET
    public Response getHello() {
        return Response.ok("Hello").build();
    }
}
