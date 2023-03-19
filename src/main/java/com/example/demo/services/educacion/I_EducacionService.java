package com.example.demo.services.educacion;


import com.example.demo.entities.Educacion;

import java.util.List;

public interface I_EducacionService {
    List<Educacion> getAll();
    void save(Educacion educacion);
    void remove(Integer id);
    Educacion getById(Integer id);
}
