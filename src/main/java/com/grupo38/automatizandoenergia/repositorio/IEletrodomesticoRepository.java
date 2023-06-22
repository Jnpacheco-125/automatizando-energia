package com.grupo38.automatizandoenergia.repositorio;

import com.grupo38.automatizandoenergia.dominio.Eletrodomestico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IEletrodomesticoRepository extends JpaRepository<Eletrodomestico, UUID> {

}
