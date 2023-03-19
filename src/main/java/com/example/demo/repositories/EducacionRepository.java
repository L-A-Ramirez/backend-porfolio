package com.example.demo.repositories;

import com.example.demo.entities.Educacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EducacionRepository extends CrudRepository<Educacion,Integer> {

}
