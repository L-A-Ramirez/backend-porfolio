package com.example.demo.entities;

import javax.persistence.*;

import lombok.*;

//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "habilidades")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    //@JdbcTypeCode(SqlTypes.INTEGER)
    private Integer id;
    private String nombre;
    private Integer porcentaje;
    private String foto;
    private Integer dni_persona;
}
