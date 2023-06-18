package com.grupo38.automatizandoenergia.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@EqualsAndHashCode(of = {"id"})
public class Endereco {
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
    @JsonIgnore
    private Usuario usuario;

    public Endereco() {
    }

    public Endereco(String rua, String numero, String bairro, String cidade, String estado, Usuario usuario) {
        this.id = UUID.randomUUID();
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.usuario = usuario;
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
                ", usuario=" + usuario +
                '}';
    }
}
