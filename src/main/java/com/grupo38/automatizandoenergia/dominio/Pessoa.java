package com.grupo38.automatizandoenergia.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_pessoa")

@EqualsAndHashCode(of = {"id"})
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Getter
    private UUID id;
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
//    @JsonIgnore
//    private Usuario usuario;

    public Pessoa() {
    }



    public Pessoa(String nome, String  dataDeNascimento, String sexo, String parentescoComUsuario) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.parentescoComUsuario = parentescoComUsuario;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", sexo='" + sexo + '\'' +
                ", parentescoComUsuario='" + parentescoComUsuario + '\'' +
               // ", usuario=" + usuario +
                '}';
    }
}
