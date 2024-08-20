package py.edu.ucom.controllers;

import java.util.Date;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import main.java.py.edu.ucom.entities.HolaMundo;
import main.java.py.edu.ucom.services.api.ApiResponseService;
import py.edu.ucom.model.response.ApiResponse;

@Path("/api-examples")
public class ApiResponseResource {
    @Inject
    private ApiResponseService servicioConInject;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String recursoBasicoTest() {
        return "Se crea un nuevo recurso en OpenApi";
    }

    @GET
    @Path("clase-generica")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ApiResponse<HolaMundo> retornoDeClaseGenerica() {
        ApiResponse<HolaMundo> respuesta = new ApiResponse();
        respuesta.setCode(200);
        respuesta.setMessage("Primer mensaje");
        HolaMundo hm = new HolaMundo();
        hm.setNobmre("Jhony");
        hm.setEdad(29);
        hm.setFechaNacimiento(new Date());
        respuesta.setData(hm);
        return respuesta;
    }

    @GET
    @Path("clase-generica/path-param/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ApiResponse<Integer> retornoDeClaseGenericaConError(
            @PathParam("id") Integer id) {
        ApiResponse<Integer> respuesta = new ApiResponse();
        System.out.println(id);
        try {
            if (id == 2) {
                throw new Exception("se nos fue de las manos");
            }
            respuesta.setCode(Response.Status.OK.getStatusCode());
            respuesta.setMessage("Primer mensaje");
            respuesta.setData(id);
        } catch (Exception e) {
            // TODO: handle exception

            respuesta.setCode(Response.Status.CONFLICT.getStatusCode());
            respuesta.setMessage("Primer error");
            respuesta.setData(id);
        }

        return respuesta;
    }

    @GET
    @Path("clase-generica/service/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ApiResponse<String> retornoDeClaseGenericaConServicio(
            @PathParam("id") Integer id) {
        ApiResponse<String> respuesta = new ApiResponse();
        System.out.println(id);
        try {
            if (id == 2) {
                throw new Exception("se nos fue de las manos");
            }
            respuesta.setCode(Response.Status.OK.getStatusCode());
            respuesta.setMessage("Service message");
            respuesta.setData(servicioConInject.responseDummy());
        } catch (Exception e) {

            respuesta.setCode(Response.Status.CONFLICT.getStatusCode());
            respuesta.setMessage("Primer error");
            respuesta.setData(e.getMessage());
        }

        return respuesta;
    }
}
