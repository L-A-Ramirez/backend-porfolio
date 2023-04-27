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
@CrossOrigin(origins = { "https://porfolio-project-1f13a.firebaseapp.com/", "https://porfolio-yoprogramo.onrender.com"})
//,"https://porfolio-yoprogramo.onrender.com"
public class PersonaController {

    @Autowired
    I_PersonaService service;

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @GetMapping("/lista")
    public List<Persona> getAll() {
        return service.getAll();
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @GetMapping("/{id}")
    public Persona getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public void save(@RequestBody Persona persona) {
        service.save(persona);
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PutMapping("/update")
    public void update(@RequestBody Persona persona) {
        service.save(persona);
    }
}