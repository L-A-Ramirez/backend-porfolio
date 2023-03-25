package com.example.demo.repositories;

import com.example.demo.entities.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad,Integer> {

}
