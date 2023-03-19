package com.example.demo.entities;

import javax.persistence.*;

import lombok.*;

//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;

import java.time.Year;

@Entity
@Table(name = "educacion")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String titulo;
    private String ingreso;
    private String egreso;
    private Integer dni_persona;

}
