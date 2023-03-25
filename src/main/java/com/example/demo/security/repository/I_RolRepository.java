package com.example.demo.security.repository;

import com.example.demo.security.entity.Rol;
import com.example.demo.security.enums.RolEmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface I_RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolEmail(RolEmail rolEmail);
}
