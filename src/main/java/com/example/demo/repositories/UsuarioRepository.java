package com.example.demo.repositories;

import com.example.demo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findbyEmail(String email);

    boolean existsByDni(Integer dni);
    boolean existsByUsuario(String usuario);
    boolean existsByEmail(String email);


}
