package py.edu.ucom;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Taller 1, se modifica recurso /hello";
    }

    @GET
    @Path("/path2")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2() {
        return "Taller 2, se modifica recurso /hello/test2";
    }
}
