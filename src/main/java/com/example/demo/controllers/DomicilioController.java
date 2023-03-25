package com.example.demo.controllers;

import com.example.demo.entities.Domicilio;
import com.example.demo.services.domicilio.I_DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class DomicilioController {

    @Autowired
    I_DomicilioService service;

    @GetMapping("/api/domicilios")
    public List<Domicilio> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/domicilios/{id}")
    public Domicilio getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/domicilios/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/domicilios")
    public void save(@RequestBody Domicilio domicilio) {
        service.save(domicilio);
    }
}