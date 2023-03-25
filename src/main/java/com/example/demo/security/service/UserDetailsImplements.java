package com.example.demo.security.service;

import com.example.demo.entities.Usuario;
import com.example.demo.security.entity.UsuarioPrincipal;
import com.example.demo.services.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImplements implements UserDetailsService {
    @Autowired
    UsuarioService service;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = service.getByEmail(email).get();
        return UsuarioPrincipal.build(usuario);
    }
}
