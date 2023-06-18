package com.grupo38.automatizandoenergia.repositorio;

import com.grupo38.automatizandoenergia.dominio.Endereco;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashSet;
import java.util.Set;

@Repository
public class EnderecoRepository implements IEnderecoRepository {
    private static Set<Endereco> enderecos;
//    public  RepositorioEndereco(){
//        enderecos = new HashSet<>();
//    }
//    public void salvar(Endereco endereco){
//        enderecos.add(endereco);
//    }
    static {
        enderecos = new LinkedHashSet<>();
        Endereco endereco1 = new Endereco("rua sem nome", "45b", "liberdade", "nova linda", "Brasilia");
        Endereco endereco2 = new Endereco("rua dois nome", "5b", "fechado", "sonhos", "Sao paulo");

        enderecos.add(endereco1);
        enderecos.add(endereco2);
    }

    @Override
    public Endereco save(Endereco endereco) {
       enderecos.add(endereco);
       return endereco;
    }
}
