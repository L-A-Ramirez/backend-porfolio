package com.example.demo.controllers;

import com.example.demo.entities.Curso;
import com.example.demo.entities.Persona;
import com.example.demo.repositories.PersonaRepository;
import com.example.demo.services.persona.I_PersonaService;
import com.example.demo.services.persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/personas")
//@CrossOrigin(origins = "http://localhost:4200")
//,"https://porfolio-yoprogramo.onrender.com"
public class PersonaController {

    @Autowired
    I_PersonaService service;

    @GetMapping("/lista")
    public List<Persona> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Persona getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public void save(@RequestBody Persona persona) {
        service.save(persona);
    }

    @PutMapping("/update")
    public void update(@RequestBody Persona persona) {
        service.save(persona);
    }
}