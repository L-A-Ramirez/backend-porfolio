package com.example.demo.controllers;

import com.example.demo.entities.Experiencia_Laboral;
import com.example.demo.services.experiencia.I_ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/experiencias")
@CrossOrigin(origins = { "https://porfolio-project-1f13a.firebaseapp.com/", "https://porfolio-yoprogramo.onrender.com"})
//,"https://porfolio-yoprogramo.onrender.com"
public class ExperienciaController {

    @Autowired
    I_ExperienciaService service;

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @GetMapping("/lista")
    public List<Experiencia_Laboral> getAll() {
        return service.getAll();
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @GetMapping("/{id}")
    public Experiencia_Laboral getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PostMapping("/create")
    public void save(@RequestBody Experiencia_Laboral experiencia) {
        service.save(experiencia);
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PutMapping("/update")
    public void update(@RequestBody Experiencia_Laboral experiencia) {
        service.save(experiencia);
    }

}