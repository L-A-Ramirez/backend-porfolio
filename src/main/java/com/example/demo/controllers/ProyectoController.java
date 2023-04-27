package com.example.demo.controllers;

import com.example.demo.entities.Proyecto;
import com.example.demo.services.proyecto.I_ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/proyectos")
public class ProyectoController {

    @Autowired
    I_ProyectoService service;

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @GetMapping("/lista")
    public List<Proyecto> getAll() {
        return service.getAll();
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @GetMapping("/{id}")
    public Proyecto getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PostMapping("/create")
    public void save(@RequestBody Proyecto proyecto) {
        service.save(proyecto);
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PutMapping("/update")
    public void update(@RequestBody Proyecto proyecto) {
        service.save(proyecto);
    }
}