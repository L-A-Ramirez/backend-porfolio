package com.example.demo.repositories;

import com.example.demo.entities.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Integer> {

}
