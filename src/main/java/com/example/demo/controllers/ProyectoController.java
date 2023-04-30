package com.example.demo.controllers;

import com.example.demo.entities.Proyecto;
import com.example.demo.services.proyecto.I_ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/proyectos")
@CrossOrigin(origins={"https://porfolio-project-1f13a.web.app","porfolio.fly.dev","http://localhost:4200"})
public class ProyectoController {

    @Autowired
    I_ProyectoService service;

    @GetMapping("/lista")
    public List<Proyecto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Proyecto getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/create")
    public void save(@RequestBody Proyecto proyecto) {
        service.save(proyecto);
    }

    @PutMapping("/update")
    public void update(@RequestBody Proyecto proyecto) {
        service.save(proyecto);
    }
}