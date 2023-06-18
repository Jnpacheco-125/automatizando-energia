package com.grupo38.automatizandoenergia.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;

@EqualsAndHashCode(exclude = {"usuario"})
public class Pessoa {
    @Getter
    @JsonProperty
    private String nome;
    @Getter
    @JsonProperty
    private String dataDeNascimento;
    @Getter
    @JsonProperty
    private String sexo;
    @Getter
    @JsonProperty
    private String parentescoComUsuario;
    @JsonIgnore
    private Usuario usuario;

    public Pessoa() {
    }

    public Pessoa(String nome, String  dataDeNascimento, String sexo, String parentescoComUsuario, Usuario usuario) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.parentescoComUsuario = parentescoComUsuario;
        this.usuario = usuario;
    }

    public Pessoa(String nome, String  dataDeNascimento, String sexo, String parentescoComUsuario) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.parentescoComUsuario = parentescoComUsuario;
    }
}
