package com.grupo38.automatizandoenergia.service;

import com.grupo38.automatizandoenergia.dominio.Eletrodomestico;
import com.grupo38.automatizandoenergia.repositorio.IEletrodomesticoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class EletrodomesticoService {

    @Autowired
    private IEletrodomesticoRepository repo;

    public Eletrodomestico save(Eletrodomestico eletrodomestico){
        var eletrodomesticoSaved = repo.save(eletrodomestico);
        return eletrodomesticoSaved;
    }
}
