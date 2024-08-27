package py.edu.ucom.services.api;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import py.edu.ucom.config.GenericDAO;
import py.edu.ucom.entities.apiresponse.Gastos;
import py.edu.ucom.repository.ApiResponseRepository;

@ApplicationScoped
public class GenericDaoServiceWithJason implements GenericDAO<Gastos, Integer> {

    public ApiResponseRepository repository;

    public GenericDaoServiceWithJason(ApiResponseRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Gastos> listar() {
        return this.repository.listar();
    }

    @Override
    public Gastos obtener(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Gastos modificar(Gastos param) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Gastos agregar(Gastos param) {
        return this.repository.agregar(param);
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Gastos mayorGasto() {
        List<Gastos> lista = this.repository.listar();
        Integer max = 0;
        Integer id = 0;
        for (Gastos elem : lista) {
            if (elem.getMonto() > max) {
                max = elem.getMonto();
                id = elem.getId();
            }
        }
        Gastos data = this.repository.obtenerById(id);
        return data;

    }

}
