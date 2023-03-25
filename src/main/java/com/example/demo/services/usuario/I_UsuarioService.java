package com.example.demo.services.usuario;

import com.example.demo.entities.Usuario;

import java.util.List;

public interface I_UsuarioService {
    List<Usuario> getAll();
    void save(Usuario usuario);
    void remove(Integer id);
    Usuario getById(Integer id);

}