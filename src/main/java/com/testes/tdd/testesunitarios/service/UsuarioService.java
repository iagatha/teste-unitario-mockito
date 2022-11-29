package com.testes.tdd.testesunitarios.service;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public boolean verifaMaiorIdade(int idade){
        return idade >= 18;
    }
}
