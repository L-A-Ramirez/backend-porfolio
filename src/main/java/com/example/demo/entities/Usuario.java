package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "usuarios")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Usuario {
    @Id
    @Column(name = "dni", nullable = false)
    //@JdbcTypeCode(SqlTypes.INTEGER)
    private Integer dni;
    private String paswoord;

}
