package com.labs2160.example.rs;

import javax.inject.Inject;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.labs2160.example.AppManager;
import com.labs2160.example.AppStatus;

@Path("status")
public class StatusResource {

	@Inject
	private AppManager app;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return app.getStatus().name();
    }

    @PUT
    public Response update(@FormParam("newStatus") String newStatus) {
    	try {
    		app.setStatus(AppStatus.valueOf(newStatus));
    		return Response.ok().build();
    	} catch (IllegalArgumentException e) {
    		return Response.status(Response.Status.BAD_REQUEST).build();
    	}
    }
}
