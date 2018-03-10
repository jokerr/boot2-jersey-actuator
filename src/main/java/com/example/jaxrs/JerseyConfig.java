package com.example.jaxrs;

import com.example.jaxrs.resources.HelloResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/v1")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
//        packages(JerseyConfig.class.getPackage().getName());
        register(HelloResource.class);
    }
}
