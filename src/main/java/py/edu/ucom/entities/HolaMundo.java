package py.edu.ucom.entities;

import java.util.Date;

public class HolaMundo {
    public String nobmre;
    public Integer edad;
    public Date fechaNacimiento;

    public String getNobmre() {
        return nobmre;
    }

    public void setNobmre(String nobmre) {
        this.nobmre = nobmre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "HolaMundo [nobmre=" + nobmre + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

}
