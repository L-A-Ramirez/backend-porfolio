package com.example.demo.services.habilidad;


import com.example.demo.entities.Habilidad;
import com.example.demo.repositories.HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadService implements I_HabilidadService {

    @Autowired
    private HabilidadRepository repository;

    @Override
    public List<Habilidad> getAll() {
        return (List<Habilidad>) repository.findAll();
    }

    @Override
    public void save(Habilidad habilidad) {
        repository.save(habilidad);
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Habilidad getById(Integer id) {
        //return (domicilio) repository.findById(id).get();
        Habilidad habilidad = repository.findById(id).orElse(null);
        return habilidad;
    }
}
