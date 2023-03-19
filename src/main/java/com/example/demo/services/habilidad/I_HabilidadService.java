package com.example.demo.services.habilidad;



import com.example.demo.entities.Habilidad;

import java.util.List;

public interface I_HabilidadService {
    List<Habilidad> getAll();
    void save(Habilidad habilidad);
    void remove(Integer id);
    Habilidad getById(Integer id);
}
