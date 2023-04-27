package com.example.demo.controllers;

import com.example.demo.entities.Domicilio;
import com.example.demo.services.domicilio.I_DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/domicilios")
public class DomicilioController {

    @Autowired
    I_DomicilioService service;

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @GetMapping("/lista")
    public List<Domicilio> getAll() {
        return service.getAll();
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @GetMapping("/{id}")
    public Domicilio getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PostMapping("/create")
    public void save(@RequestBody Domicilio domicilio) {
        service.save(domicilio);
    }

    @CrossOrigin(origins = "https://backend-porfolio-ivqs.onrender.com")
    @PutMapping("/update")
    public void update(@RequestBody Domicilio domicilio) {
        service.save(domicilio);
    }
}