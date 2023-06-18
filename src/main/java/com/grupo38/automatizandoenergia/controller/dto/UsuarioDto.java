package com.grupo38.automatizandoenergia.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grupo38.automatizandoenergia.dominio.Usuario;
import jakarta.validation.constraints.NotBlank;

public class UsuarioDto {
    @JsonProperty
    @NotBlank(message = "O nome do usuario é campo obrigatorio e não pode estar em branco")
    private String nome;
    @JsonProperty
    @NotBlank(message = "O codigo é campo obrigatorio e não pode estar em branco")
    private String codigo;

    public Usuario toUsuario(){
        return new Usuario(nome, codigo);
    }
}
