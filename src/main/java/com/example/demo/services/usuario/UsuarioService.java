package com.example.demo.services.usuario;


import com.example.demo.entities.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements I_UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public List<Usuario> getAll() {
        return (List<Usuario>) repository.findAll();
    }

    @Override
    public void save(Usuario usuario) {
        repository.save(usuario);
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Usuario getById(Integer id) {
        Usuario usuario = repository.findById(id).orElse(null);
        return usuario;
    }
}
