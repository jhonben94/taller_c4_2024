package py.edu.ucom.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.enterprise.context.ApplicationScoped;
import py.edu.ucom.entities.apiresponse.Gastos;

@ApplicationScoped
public class ApiResponseRepository {

    private static final String FILE_PATH = "src/main/resources/data/gastos.json";
    private List<Gastos> gastosList;
    private ObjectMapper objectMapper;

    public ApiResponseRepository() {
        objectMapper = new ObjectMapper();
        gastosList = cargarDatos();
    }

    private List<Gastos> cargarDatos() {
        try {
            System.out.println("CARGA DE DATOS" + FILE_PATH);
            File file = new File(FILE_PATH);
            if (file.exists()) {
                return objectMapper.readValue(file, new TypeReference<List<Gastos>>() {
                });
            } else {

                System.out.println("UPSSS NO HAY DATOS");
                return new ArrayList<>();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private void guardarDatos() {
        try {
            objectMapper.writeValue(new File(FILE_PATH), gastosList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Gastos obtenerById(Integer id) {
        return gastosList.stream()
                .filter(gasto -> gasto.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Gastos> listar() {

        return new ArrayList<>(gastosList);
    }

    public Gastos agregar(Gastos param) {
        Integer newId = gastosList.isEmpty() ? 1
                : gastosList.stream()
                        .mapToInt(Gastos::getId)
                        .max()
                        .getAsInt() + 1;

        param.setId(newId);
        gastosList.add(param);
        guardarDatos();
        return param;
    }

    public Gastos modificar(Gastos param) {
        Optional<Gastos> existingGasto = gastosList.stream()
                .filter(gasto -> gasto.getId().equals(param.getId()))
                .findFirst();

        if (existingGasto.isPresent()) {
            gastosList = gastosList.stream()
                    .map(gasto -> gasto.getId().equals(param.getId()) ? param : gasto)
                    .collect(Collectors.toList());
            guardarDatos();
            return param;
        } else {
            return null;
        }
    }

    public void eliminar(Integer id) {
        gastosList = gastosList.stream()
                .filter(gasto -> !gasto.getId().equals(id))
                .collect(Collectors.toList());
        guardarDatos();
    }
}
