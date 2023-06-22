package com.grupo38.automatizandoenergia.controller;

import com.grupo38.automatizandoenergia.controller.dto.EnderecoDto;
import com.grupo38.automatizandoenergia.dominio.Endereco;
import com.grupo38.automatizandoenergia.service.EnderecoService;
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
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;
    @Autowired
    private Validator validator;
    @PostMapping
    public ResponseEntity cadastraEndereco(@RequestBody EnderecoDto enderecoDto) {

        Map<Path, String> violacoesToMap = validar(enderecoDto);
        if(!violacoesToMap.isEmpty()) return ResponseEntity.badRequest().body(violacoesToMap);
        Endereco endereco = enderecoDto.toEndereco();
//        String rua = "13 de maio";
//        String numero = "35b";
//        String bairro = "Liberdade";
//        String cidade = "Desconhecida";
//        String estado = "Bahia";
//        Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, usuario);
        enderecoService.save(endereco);
        return ResponseEntity.status(HttpStatus.CREATED).body(endereco);
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
