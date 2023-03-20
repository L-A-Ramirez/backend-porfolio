package com.example.demo.controllers;

import com.example.demo.entities.Proyecto;
import com.example.demo.services.proyecto.I_ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://porfolio-project-1f13a.web.app")
public class ProyectoController {

    @Autowired
    I_ProyectoService service;

    @GetMapping("/api/proyectos")
    public List<Proyecto> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/proyectos/{id}")
    public Proyecto getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/proyectos/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/proyectos")
    public void save(@RequestBody Proyecto proyecto) {
        service.save(proyecto);
    }
}