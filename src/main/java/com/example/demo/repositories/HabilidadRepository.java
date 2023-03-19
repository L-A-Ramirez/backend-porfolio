package com.example.demo.repositories;

import com.example.demo.entities.Habilidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface HabilidadRepository extends CrudRepository<Habilidad,Integer> {

}
