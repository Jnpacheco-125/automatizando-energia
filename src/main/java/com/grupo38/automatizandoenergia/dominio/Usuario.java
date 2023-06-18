package com.grupo38.automatizandoenergia.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Usuario {
    @JsonProperty
    private String nome;
    @JsonProperty
    private String codigo;

    public Usuario(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
}
