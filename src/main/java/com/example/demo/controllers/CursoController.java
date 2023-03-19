package com.example.demo.controllers;

import com.example.demo.entities.Curso;
import com.example.demo.services.curso.I_CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CursoController {

    @Autowired
    private I_CursoService service;

    @GetMapping("/api/cursos")
    public List<Curso> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/cursos/{id}")
    public Curso getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/cursos/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/cursos")
    public void save(@RequestBody Curso curso) {
        service.save(curso);
    }
}