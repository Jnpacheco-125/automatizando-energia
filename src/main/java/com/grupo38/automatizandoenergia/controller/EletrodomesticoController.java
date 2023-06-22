package com.grupo38.automatizandoenergia.controller;

import com.grupo38.automatizandoenergia.controller.dto.EletrodomesticoDto;
import com.grupo38.automatizandoenergia.dominio.Eletrodomestico;
import com.grupo38.automatizandoenergia.service.EletrodomesticoService;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Path;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eletrodomestico")
public class EletrodomesticoController {
    @Autowired
    private EletrodomesticoService eletrodomesticoService;
    @Autowired
    private Validator validator;

    @PostMapping
    public ResponseEntity cadastrarEletrodomestico(@RequestBody EletrodomesticoDto eletrodomesticoDto){
        Map<Path, String> violacoesToMap = validar(eletrodomesticoDto);
        if(!violacoesToMap.isEmpty()) return ResponseEntity.badRequest().body(violacoesToMap);
        Eletrodomestico eletrodomestico = eletrodomesticoDto.toEletrodomestico();
        eletrodomesticoService.save(eletrodomestico);
        return ResponseEntity.status(HttpStatus.CREATED).body(eletrodomestico);
    }
    private  <T> Map<Path, String> validar(T dto) {
        Set<ConstraintViolation<T>> violacoes =
                validator.validate(dto);
        Map<Path, String> violacoesToMap = violacoes
                .stream()
                .collect(Collectors.toMap(
                        violacao -> violacao.getPropertyPath(), violacao -> violacao.getMessage()));
        return violacoesToMap;
    }
}
