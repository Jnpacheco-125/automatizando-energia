package com.grupo38.automatizandoenergia.controller;

import com.grupo38.automatizandoenergia.controller.dto.PessoaDto;
import com.grupo38.automatizandoenergia.dominio.Pessoa;
import com.grupo38.automatizandoenergia.repositorio.PessoaRepository;
import com.grupo38.automatizandoenergia.service.PessoaService;
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
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;
    @Autowired
    private Validator validator;

    @PostMapping
    public ResponseEntity cadastrarPessoa(@RequestBody PessoaDto pessoaDto){
        Map<Path, String> violacoesToMap = validar(pessoaDto);
        if(!violacoesToMap.isEmpty()) return ResponseEntity.badRequest().body(violacoesToMap);
        Pessoa pessoa = pessoaDto.toPessoa();
        pessoaService.save(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);
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
