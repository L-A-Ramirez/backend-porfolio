package com.example.demo.repositories;

import com.example.demo.entities.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PersonaRepository extends CrudRepository<Persona,Integer> {


}
