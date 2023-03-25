package com.example.demo.security.dto;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter @Setter
public class LoginUsuario {
    @NotNull
    private String  emailUsuario;
    @NotNull
    private String password;

}
