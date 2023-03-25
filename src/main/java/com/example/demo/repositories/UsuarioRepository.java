package com.example.demo.repositories;

import com.example.demo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findbyEmail (String Email);

    boolean existsByDni(Integer dni);

    boolean existsByEmail(String email);

    boolean existsByUsuario(String usuario);
}
