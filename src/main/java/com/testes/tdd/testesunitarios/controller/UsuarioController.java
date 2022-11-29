package com.testes.tdd.testesunitarios.controller;

import com.testes.tdd.testesunitarios.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("user")
public class UsuarioController {

    @GetMapping
    public List<Usuario> userList(){
       return Arrays.asList(
               Usuario
                       .builder()
                       .nome("iagatha")
                       .email("iagatha@gmail.com")
                       .idade(23).build()
       );
    }

}
