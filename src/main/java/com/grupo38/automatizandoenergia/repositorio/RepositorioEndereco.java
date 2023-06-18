package com.grupo38.automatizandoenergia.repositorio;

import com.grupo38.automatizandoenergia.dominio.Endereco;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class RepositorioEndereco {
    private Set<Endereco> enderecos;
    public  RepositorioEndereco(){
        enderecos = new HashSet<>();
    }
    public void salvar(Endereco endereco){
        enderecos.add(endereco);
    }
}
