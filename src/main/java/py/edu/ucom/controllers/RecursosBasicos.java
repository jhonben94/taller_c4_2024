package py.edu.ucom.controllers;

import java.util.HashMap;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import py.edu.ucom.entities.HolaMundo;

@Path("/recursos-basicos")
public class RecursosBasicos {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String recursoBasicoTest() {
        return "Se crea un nuevo recurso en OpenApi";
    }

    @GET
    @Path("suma")
    @Produces(MediaType.TEXT_PLAIN)
    public Integer suma() {
        return 5 + 5;
    }

    @GET
    @Path("resta")
    @Produces(MediaType.TEXT_PLAIN)
    public Integer resta() {
        return 100 - 5;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<String, Object> respuestaPost(HashMap<String, Object> param) {
        System.out.println(param.get("joni"));
        return param;
    }

    @POST
    @Path("hola")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public HolaMundo holaMundo(HolaMundo param) {
        System.out.println(param);
        return param;
    }

}
