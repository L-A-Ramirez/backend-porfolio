package com.example.demo.entities;

import javax.persistence.*;

import lombok.*;

//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "domicilio")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String pais;
    private String provincia;
    private String localidad;
    private Integer dni_persona;

}