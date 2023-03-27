package com.example.demo.services.usuario;

import com.example.demo.entities.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService implements I_UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> getAll() {
        return repository.findAll();
    }
    public void save(Usuario usuario) {
        repository.save(usuario);
    }
    public void remove(Integer id) {
        repository.deleteById(id);
    }
    public Usuario getById(Integer id) {
        Usuario usuario = repository.findById(id).orElse(null);
        return usuario;
    }
    public Optional<Usuario> getByEmail(String email){
        return repository.findbyEmail(email);
    }

    public boolean existsByDni(Integer dni){
        return repository.existsByDni(dni);
    }
    public boolean existsByEmail(String email){
        return repository.existsByEmail(email);
    }
    public boolean existsByUsuario(String usuario){
        return repository.existsByUsuario(usuario);
    }
}