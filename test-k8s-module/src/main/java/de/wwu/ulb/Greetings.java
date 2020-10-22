package de.wwu.ulb;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RequestScoped
@Path("/")
public class Greetings {

    @GET
    @Path("/hello")
    public String greetings() {
        return "Hell world";
    }
}
