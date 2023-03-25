package com.example.demo.controllers;

import com.example.demo.entities.Habilidad;
import com.example.demo.services.habilidad.I_HabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class HabilidadController {

    @Autowired
    I_HabilidadService service;

    @GetMapping("/api/habilidades")
    public List<Habilidad> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/habilidades/{id}")
    public Habilidad getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/habilidades/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/habilidades")
    public void save(@RequestBody Habilidad habilidad) {
        service.save(habilidad);
    }
}