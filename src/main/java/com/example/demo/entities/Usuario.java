package com.example.demo.entities;

import javax.persistence.*;

import com.example.demo.security.entity.Rol;
import com.sun.istack.NotNull;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

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
    private String email;
    private String usuario;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn (name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();

    public Usuario() {
    }

    public Usuario(Integer dni,String email, String usuario , String password) {
        this.dni = dni;
        this.email = email;
        this.usuario = usuario;
        this.password = password;
    }

}