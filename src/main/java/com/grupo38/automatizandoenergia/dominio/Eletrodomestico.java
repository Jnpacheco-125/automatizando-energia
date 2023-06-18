package com.grupo38.automatizandoenergia.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public class Eletrodomestico {
    @Getter
    @JsonProperty
    private String nome;
    @Getter
    @JsonProperty
    private String modelo;
    @Getter
    @JsonProperty
    private String potencia;
    @JsonIgnore
    private Usuario usuario;

    public Eletrodomestico(String nome, String modelo, String potencia) {
        this.nome = nome;
        this.modelo = modelo;
        this.potencia = potencia;
    }
}
