package com.example.demo.controllers;

import com.example.demo.entities.Experiencia_Laboral;
import com.example.demo.services.experiencia.I_ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://porfolio-project-1f13a.web.app")
public class ExperienciaController {

    @Autowired
    I_ExperienciaService service;

    @GetMapping("/api/experiencias")
    public List<Experiencia_Laboral> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/experiencias/{id}")
    public Experiencia_Laboral getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/experiencias/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/experiencias")
    public void save(@RequestBody Experiencia_Laboral experiencia) {
        service.save(experiencia);
    }
}