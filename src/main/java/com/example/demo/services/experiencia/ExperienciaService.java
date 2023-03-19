package com.example.demo.services.experiencia;


import com.example.demo.entities.Experiencia_Laboral;
import com.example.demo.repositories.Experiencia_LaboralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService implements I_ExperienciaService {

    @Autowired
    private Experiencia_LaboralRepository repository;

    @Override
    public List<Experiencia_Laboral> getAll() {
        return (List<Experiencia_Laboral>) repository.findAll();
    }

    @Override
    public void save(Experiencia_Laboral experiencia) {
        repository.save(experiencia);
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Experiencia_Laboral getById(Integer id) {
        //return (domicilio) repository.findById(id).get();
        Experiencia_Laboral experiencia = repository.findById(id).orElse(null);
        return experiencia;
    }
}
