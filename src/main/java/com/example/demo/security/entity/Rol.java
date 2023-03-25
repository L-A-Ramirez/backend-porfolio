package com.example.demo.security.entity;

import com.example.demo.security.enums.RolEmail;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolEmail rolEmail;

    public Rol() {
    }

    public Rol(RolEmail rolEmail) {
        this.rolEmail = rolEmail;
    }
}
