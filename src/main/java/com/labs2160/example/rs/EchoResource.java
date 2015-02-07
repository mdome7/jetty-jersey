package com.labs2160.example.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("echo/{msg}")
public class EchoResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@PathParam("msg") String msg) {
        return msg;
    }
}
