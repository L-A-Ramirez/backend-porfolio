package com.example.demo.repositories;

import com.example.demo.entities.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {

}
