package com.labs2160.example.rs;

import javax.annotation.ManagedBean;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Example of a singleton resource
 */
@ManagedBean
@ApplicationScoped
@Path("/counter")
public class SingletonCounterResource {

    @Resource(name="counter")
    private int counter = 0;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return Integer.toString(++counter);
    }
}
