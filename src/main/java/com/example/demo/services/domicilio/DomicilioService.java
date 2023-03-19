package com.example.demo.services.domicilio;

import com.example.demo.entities.Domicilio;
import com.example.demo.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioService implements I_DomicilioService {

    @Autowired
    private DomicilioRepository repository;

    @Override
    public List<Domicilio> getAll() {
        return (List<Domicilio>) repository.findAll();
    }

    @Override
    public void save(Domicilio domicilio) {
        repository.save(domicilio);
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Domicilio getById(Integer id) {
        //return (domicilio) repository.findById(id).get();
        Domicilio domicilio = repository.findById(id).orElse(null);
        return domicilio;
    }
}
