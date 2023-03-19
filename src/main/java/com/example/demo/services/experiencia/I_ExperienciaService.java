package com.example.demo.services.experiencia;



import com.example.demo.entities.Experiencia_Laboral;

import java.util.List;

public interface I_ExperienciaService {
    List<Experiencia_Laboral> getAll();
    void save(Experiencia_Laboral experiencia);
    void remove(Integer id);
    Experiencia_Laboral getById(Integer id);
}
