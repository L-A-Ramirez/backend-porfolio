package com.example.demo.controllers;

import com.example.demo.entities.Persona;
import com.example.demo.services.persona.I_PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class PersonaController {

    @Autowired
    I_PersonaService service;

    @GetMapping("/api/personas")
    public List<Persona> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/personas/{id}")
    public Persona getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/personas/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/personas")
    public void save(@RequestBody Persona persona) {
        service.save(persona);
    }
}