package com.example.demo.controllers;

import com.example.demo.entities.Habilidad;
import com.example.demo.services.habilidad.I_HabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/habilidades")
public class HabilidadController {

    @Autowired
    I_HabilidadService service;

    @GetMapping("/lista")
    public List<Habilidad> getAll() {
        return service.getAll();
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @GetMapping("/{id}")
    public Habilidad getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PostMapping("/create")
    public void save(@RequestBody Habilidad habilidad) {
        service.save(habilidad);
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PutMapping("/update")
    public void update(@RequestBody Habilidad habilidad) {
        service.save(habilidad);
    }

}