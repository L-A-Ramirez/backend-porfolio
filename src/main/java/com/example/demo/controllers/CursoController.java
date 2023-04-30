package com.example.demo.controllers;

import com.example.demo.entities.Curso;
import com.example.demo.services.curso.I_CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cursos")
@CrossOrigin(origins={"https://porfolio-project-1f13a.web.app","porfolio.fly.dev","http://localhost:4200"})
public class CursoController {


    @Autowired
    private I_CursoService service;

    @GetMapping("/lista")
    public List<Curso> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Curso getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("delete/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }


    @PostMapping("/create")
    public void save(@RequestBody Curso curso) {
        service.save(curso);
    }


    @PutMapping("/update")
    public void update(@RequestBody Curso curso) {
        service.save(curso);
    }
}