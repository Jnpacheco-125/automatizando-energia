package com.grupo38.automatizandoenergia.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grupo38.automatizandoenergia.dominio.Eletrodomestico;
import jakarta.validation.constraints.NotBlank;

public class EletrodomesticoDto {
    @JsonProperty
    @NotBlank(message = "O nome é um campo obrigatorio e não pode estar em branco")
    private String nome;
    @JsonProperty
    @NotBlank(message = "O modelo é um campo obrigatorio e não pode estar em branco")
    private String modelo;
    @JsonProperty
    @NotBlank(message = "A potencia é um campo obrigatorio e não pode estar em branco")
    private String potencia;
    public Eletrodomestico toEletrodomestico(){ return new Eletrodomestico(nome, modelo, potencia);}
}
