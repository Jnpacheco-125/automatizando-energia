package com.grupo38.automatizandoenergia.repositorio;

import com.grupo38.automatizandoenergia.dominio.Pessoa;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class RepositorioPessoa {
    private Set<Pessoa> pessoas;
    public RepositorioPessoa(){ pessoas = new HashSet<>();}
    public void salvar(Pessoa pessoa){pessoas.add(pessoa);}
}
