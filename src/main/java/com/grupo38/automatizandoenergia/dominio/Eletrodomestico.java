package com.grupo38.automatizandoenergia.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@Entity
@Table(name = "tb_eletrodomestico")
@EqualsAndHashCode(of = {"id"})
public class Eletrodomestico {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Getter
    private UUID id;
    @Getter
    @JsonProperty
    private String nome;
    @Getter
    @JsonProperty
    private String modelo;
    @Getter
    @JsonProperty
    private String potencia;
//    @JsonIgnore
//    private Usuario usuario;

    public Eletrodomestico() {
    }


    public Eletrodomestico( String nome, String modelo, String potencia) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potencia='" + potencia + '\'' +
               // ", usuario=" + usuario +
                '}';
    }
}
