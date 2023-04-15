package com.example.demo.entities;

import javax.persistence.*;

import lombok.*;

//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "experiencia_laboral")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Experiencia_Laboral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    //@JdbcTypeCode(SqlTypes.INTEGER)
    private Integer id;
    private String trabajo;
    private String puesto;
    private String cargo;
    private String herramientas;
    private String referencia;
    @ManyToOne
    @JoinColumn(name = "dni_persona", insertable = false, updatable = false)
    private Persona persona;
    private Integer dni_persona;
}
