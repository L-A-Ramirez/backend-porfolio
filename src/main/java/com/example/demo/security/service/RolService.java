package com.example.demo.security.service;

import com.example.demo.security.entity.Rol;
import com.example.demo.security.enums.RolEmail;
import com.example.demo.security.repository.I_RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    I_RolRepository repository;

    public Optional<Rol>getByRolEmail (RolEmail rolEmail){
        return repository.findByRolEmail(rolEmail);
    }

    public void save(Rol rol){
        repository.save(rol);
    }
}