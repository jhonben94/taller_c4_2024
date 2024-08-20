package py.edu.ucom.services.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApiResponseService {
    public String responseDummy() {
        return "retorna desde el servicio";
    }
}
