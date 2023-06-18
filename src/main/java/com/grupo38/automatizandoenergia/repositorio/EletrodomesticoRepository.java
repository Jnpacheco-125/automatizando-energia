package com.grupo38.automatizandoenergia.repositorio;

import com.grupo38.automatizandoenergia.dominio.Eletrodomestico;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Repository
public class EletrodomesticoRepository implements IEletrodomesticoRepository {
    private static Set<Eletrodomestico> eletrodomesticos;
    static {
        eletrodomesticos = new LinkedHashSet<>();
        Eletrodomestico eletrodomestico1 = new Eletrodomestico("geladeira", "vertical", "60w");
        Eletrodomestico eletrodomestico2 = new Eletrodomestico("tv", "32'", "10w");

        eletrodomesticos.add(eletrodomestico1);
        eletrodomesticos.add(eletrodomestico2);
    }
//    public EletrodomesticoRepository(){ eletrodomesticos = new HashSet<>();}
//    public void salvar(Eletrodomestico eletrodomestico){ eletrodomesticos.add(eletrodomestico);}
//

    @Override
    public Eletrodomestico save(Eletrodomestico eletrodomestico) {
        eletrodomesticos.add(eletrodomestico);
        return eletrodomestico;
    }
}
