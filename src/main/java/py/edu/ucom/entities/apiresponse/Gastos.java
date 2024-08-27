package py.edu.ucom.entities.apiresponse;

import java.util.Date;

public class Gastos {
    private Integer id;
    private Date fecha;
    private Integer monto;
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter para fecha
    public Date getFecha() {
        return fecha;
    }

    // Setter para fecha
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Getter para monto
    public Integer getMonto() {
        return monto;
    }

    // Setter para monto
    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    // Getter para descripcion
    public String getDescripcion() {
        return descripcion;
    }

    // Setter para descripcion
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
