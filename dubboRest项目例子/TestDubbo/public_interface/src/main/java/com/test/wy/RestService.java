package com.test.wy;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public interface RestService {
    @GET // #3
    @Path("{id: \\d+}")
    String getUser(@PathParam("id")int id);
}
