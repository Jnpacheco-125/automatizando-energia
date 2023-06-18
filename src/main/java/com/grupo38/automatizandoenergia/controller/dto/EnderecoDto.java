package com.grupo38.automatizandoenergia.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.grupo38.automatizandoenergia.dominio.Endereco;
import jakarta.validation.constraints.NotBlank;

public class EnderecoDto {
    @JsonProperty
    @NotBlank(message = "A rua é um campo obrigatorio e não pode estar em branco")
    private String rua;
    @JsonProperty
    @NotBlank(message = "O numero é um campo obrigatorio e não pode estar em branco")
    private String numero;
    @JsonProperty
    @NotBlank(message = "O bairro é um campo obrigatorio e não pode estar em branco")
    private String bairro;
    @JsonProperty
    @NotBlank(message = "A cidade é um campo obrigatorio e não pode estar em branco")
    private String cidade;
    @JsonProperty
    @NotBlank(message = "Nome é um campo obrigatorio e não pode estar em branco")
    private String estado;

    public Endereco toEndereco(){
        return new Endereco(rua, numero, bairro, cidade, estado);
    }
}
