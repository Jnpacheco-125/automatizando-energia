package com.grupo38.automatizandoenergia.controller.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.grupo38.automatizandoenergia.dominio.Pessoa;
import com.grupo38.automatizandoenergia.dominio.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.time.LocalDate;

public class PessoaDto {

    @JsonProperty
    @NotBlank(message = "Nome é um campo obrigatorio e não pode estar em branco")
    //@Size(min=1, max=25)
    private String nome;

    @JsonProperty
    @NotBlank(message = "Data de nascimento é um campo obrigatorio e não pode estar em branco")
   // @Past (message ="A data de nascimento deve ser anterior a data atual.")
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    //@Past(message = "A data de nascimento deve ser anterior à data atual")
    private String dataDeNascimento;

    @JsonProperty
    @NotBlank(message = "Sexo é um campo obrigatorio e não pode estar em branco")
    private String sexo;

    @JsonProperty
    @NotBlank(message = "Parentesco é um campo obrigatorio e não pode estar em branco")
    private String parentescoComUsuario;

    public Pessoa toPessoa(){ return new Pessoa(nome, dataDeNascimento, sexo, parentescoComUsuario); }
}
