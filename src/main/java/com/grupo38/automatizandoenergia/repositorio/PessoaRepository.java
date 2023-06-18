package com.grupo38.automatizandoenergia.repositorio;

import com.grupo38.automatizandoenergia.dominio.Pessoa;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashSet;
import java.util.Set;

@Repository
public class PessoaRepository implements IPessoaRepository {
    private static Set<Pessoa> pessoas;
    static {
        pessoas = new LinkedHashSet<>();
        Pessoa  pessoa1 = new Pessoa( "teresa", "1990-1-2", "feminino", "primo");
        Pessoa  pessoa2 = new Pessoa( "maria", "1990-3-1", "feminino", "irma");

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
    }
//    public PessoaRepository(){ pessoas = new HashSet<>();}
//    public void salvar(Pessoa pessoa){pessoas.add(pessoa);}

    @Override
    public Pessoa save(Pessoa pessoa) {
       pessoas.add(pessoa);
       return pessoa;
    }
}
