package com.example.demo.services.curso;

import com.example.demo.entities.Curso;
import com.example.demo.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements I_CursoService {

    @Autowired
    private CursoRepository repository;


    public List<Curso> getAll() {
        return (List<Curso>) repository.findAll();
    }

    public void save(Curso curso) {
        repository.save(curso);
    }

    public void remove(Integer id) {
        repository.deleteById(id);
    }

    public Curso getById(Integer id) {
        Curso curso = repository.findById(id).orElse(null);
        return curso;
    }
}