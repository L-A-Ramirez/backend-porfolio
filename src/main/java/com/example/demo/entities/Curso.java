package com.example.demo.entities;

import javax.persistence.*;
import lombok.*;

//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "cursos")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String nombre;
    private Integer carga_horaria;
    private String centro;
    private Integer dni_persona;
}
