package com.example.demo.controllers;

import com.example.demo.entities.Experiencia_Laboral;
import com.example.demo.services.experiencia.I_ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/experiencias")
//@CrossOrigin(origins = "http://localhost:4200")
//,"https://porfolio-yoprogramo.onrender.com"
public class ExperienciaController {

    @Autowired
    I_ExperienciaService service;

    @GetMapping("/lista")
    public List<Experiencia_Laboral> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Experiencia_Laboral getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/create")
    public void save(@RequestBody Experiencia_Laboral experiencia) {
        service.save(experiencia);
    }

    @PutMapping("/update")
    public void update(@RequestBody Experiencia_Laboral experiencia) {
        service.save(experiencia);
    }

}