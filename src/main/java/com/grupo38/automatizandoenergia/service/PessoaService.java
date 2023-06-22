package com.grupo38.automatizandoenergia.service;

import com.grupo38.automatizandoenergia.dominio.Pessoa;
import com.grupo38.automatizandoenergia.repositorio.IPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private IPessoaRepository repo;

    public Pessoa save(Pessoa pessoa){
        var pessoaSaved = repo.save(pessoa);
        return pessoaSaved;
    }

}
