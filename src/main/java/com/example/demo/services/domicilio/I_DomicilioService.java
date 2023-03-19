package com.example.demo.services.domicilio;

import com.example.demo.entities.Domicilio;

import java.util.List;

public interface I_DomicilioService {
    List<Domicilio> getAll();
    void save(Domicilio domicilio);
    void remove(Integer id);
    Domicilio getById(Integer id);
}
