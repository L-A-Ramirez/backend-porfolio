package com.example.demo.services.persona;


import com.example.demo.entities.Persona;

import java.util.List;

public interface I_PersonaService {
    List<Persona> getAll();
    void save(Persona persona);
    void remove(Integer id);
    Persona getById(Integer id);
}
