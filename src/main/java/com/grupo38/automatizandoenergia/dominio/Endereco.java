package com.grupo38.automatizandoenergia.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EqualsAndHashCode(exclude = {"usuario"})
public class Endereco {
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
    @JsonProperty
    private Usuario usuario;

    public Endereco(String rua, String numero, String bairro, String cidade, String estado, Usuario usuario) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.usuario = usuario;
    }
}
