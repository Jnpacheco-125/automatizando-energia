package com.grupo38.automatizandoenergia.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;



import java.util.UUID;

@Entity
@Table(name = "tb_endereco")
@EqualsAndHashCode(of = {"id"})
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Getter
    private UUID id;
    @Getter
    @JsonProperty
    private String rua;
    @Getter
    @JsonProperty
    private String numero;
    @Getter
    @JsonProperty
    private String bairro;
    @Getter
    @JsonProperty
    private String cidade;
    @Getter
    @JsonProperty
    private String estado;
//    @JsonIgnore
//    private Usuario usuario;

    public Endereco() {
    }

    public Endereco( String rua, String numero, String bairro, String cidade, String estado) {
        this.id = UUID.randomUUID();
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
               // ", usuario=" + usuario +
                '}';
    }
}
