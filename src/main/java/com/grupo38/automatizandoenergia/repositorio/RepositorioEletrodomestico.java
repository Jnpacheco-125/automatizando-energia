package com.grupo38.automatizandoenergia.repositorio;

import com.grupo38.automatizandoenergia.dominio.Eletrodomestico;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class RepositorioEletrodomestico {
    private Set<Eletrodomestico> eletrodomesticos;
    public RepositorioEletrodomestico(){ eletrodomesticos = new HashSet<>();}
    public void salvar(Eletrodomestico eletrodomestico){ eletrodomesticos.add(eletrodomestico);}


}
