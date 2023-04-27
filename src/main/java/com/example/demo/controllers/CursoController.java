package com.example.demo.controllers;

import com.example.demo.entities.Curso;
import com.example.demo.services.curso.I_CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cursos")

public class CursoController {


    @Autowired
    private I_CursoService service;

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @GetMapping("/lista")
    public List<Curso> getAll() {
        return service.getAll();
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @GetMapping("/{id}")
    public Curso getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @DeleteMapping("delete/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }


    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PostMapping("/create")
    public void save(@RequestBody Curso curso) {
        service.save(curso);
    }


    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PutMapping("/update")
    public void update(@RequestBody Curso curso) {
        service.save(curso);
    }
}