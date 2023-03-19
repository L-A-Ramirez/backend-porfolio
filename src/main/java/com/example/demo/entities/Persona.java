package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "personas")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Persona {
    @Id
    @Column(name = "dni", nullable = false)
    //@JdbcTypeCode(SqlTypes.INTEGER)
    private Integer dni;
    private String nombre;
    private String apellido;
    private String contacto;
    private String mail;
    private String profesion;
    private String acercademi;

}