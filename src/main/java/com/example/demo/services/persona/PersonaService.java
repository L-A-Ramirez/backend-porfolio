package com.example.demo.services.persona;

import com.example.demo.entities.Persona;
import com.example.demo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements I_PersonaService {

    @Autowired
    private PersonaRepository repository;

    @Override
    public List<Persona> getAll() {
        return (List<Persona>) repository.findAll();
    }

    @Override
    public void save(Persona persona) {
        repository.save(persona);
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Persona getById(Integer id) {
        //return (Persona) repository.findById(id).get();
        Persona persona = repository.findById(id).orElse(null);
        return persona;
    }
}
