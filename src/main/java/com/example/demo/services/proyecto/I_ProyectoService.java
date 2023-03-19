package com.example.demo.services.proyecto;



import com.example.demo.entities.Proyecto;

import java.util.List;

public interface I_ProyectoService {
    List<Proyecto> getAll();
    void save(Proyecto proyecto);
    void remove(Integer id);
    Proyecto getById(Integer id);
}
