package com.example.demo.services.proyecto;


import com.example.demo.entities.Proyecto;
import com.example.demo.repositories.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService implements I_ProyectoService {

    @Autowired
    private ProyectoRepository repository;

    @Override
    public List<Proyecto> getAll() {
        return (List<Proyecto>) repository.findAll();
    }

    @Override
    public void save(Proyecto proyecto) {
        repository.save(proyecto);
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Proyecto getById(Integer id) {
        //return (domicilio) repository.findById(id).get();
        Proyecto proyecto = repository.findById(id).orElse(null);
        return proyecto;
    }
}
