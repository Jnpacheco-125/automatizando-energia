package com.grupo38.automatizandoenergia.service;

import com.grupo38.automatizandoenergia.dominio.Endereco;
import com.grupo38.automatizandoenergia.repositorio.IEnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private IEnderecoRepository repo;

    public Endereco save(Endereco endereco){
        var enderecoSaved = repo.save(endereco);
        return enderecoSaved;
    }
}
