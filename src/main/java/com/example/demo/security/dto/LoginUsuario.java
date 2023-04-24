package com.example.demo.security.dto;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;


@Getter @Setter
public class LoginUsuario {
    @NotNull
    private String NombreUsuario;
    @NotNull
    private String password;

}
