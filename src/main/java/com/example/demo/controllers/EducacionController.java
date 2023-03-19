package com.example.demo.controllers;

import com.example.demo.entities.Educacion;
import com.example.demo.services.educacion.I_EducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {

    @Autowired
    I_EducacionService service;

    @GetMapping("/api/educacion")
    public List<Educacion> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/educacion/{id}")
    public Educacion getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/educacion/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/educacion")
    public void save(@RequestBody Educacion educacion) {
        service.save(educacion);
    }
}