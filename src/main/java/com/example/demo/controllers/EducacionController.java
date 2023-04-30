package com.example.demo.controllers;

import com.example.demo.entities.Educacion;
import com.example.demo.services.educacion.I_EducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/educacion")
@CrossOrigin(origins={"https://porfolio-project-1f13a.web.app","porfolio.fly.dev","http://localhost:4200"})
public class EducacionController {

    @Autowired
    I_EducacionService service;

    @GetMapping("/lista")
    public List<Educacion> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Educacion getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/create")
    public void save(@RequestBody Educacion educacion) {
        service.save(educacion);
    }

    @PutMapping("/update")
    public void update(@RequestBody Educacion educacion) {
        service.save(educacion);
    }

}