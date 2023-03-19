package com.example.demo.controllers;

import com.example.demo.entities.Usuario;
import com.example.demo.services.usuario.I_UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    I_UsuarioService service;

    @GetMapping("/api/usuarios")
    public List<Usuario> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/usuarios/{id}")
    public Usuario getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/usuarios/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/usuarios")
    public void save(@RequestBody Usuario usuario) {
        service.save(usuario);
    }
}