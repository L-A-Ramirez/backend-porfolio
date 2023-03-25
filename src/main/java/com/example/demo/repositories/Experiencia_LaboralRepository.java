package com.example.demo.repositories;


import com.example.demo.entities.Experiencia_Laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Experiencia_LaboralRepository extends JpaRepository<Experiencia_Laboral,Integer> {

}
