package com.example.demo.entities;

import javax.persistence.*;
import lombok.*;

//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;

import java.util.Date;

@Entity
@Table(name = "proyectos")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    //@JdbcTypeCode(SqlTypes.INTEGER)

    private Integer id;
    private String nombre;
    private Date project_inicio;
    private Date project_fin;
    private String descripcion;
    private Integer dni_persona;

}
