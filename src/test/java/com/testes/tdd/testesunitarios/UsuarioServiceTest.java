package com.testes.tdd.testesunitarios;

import com.testes.tdd.testesunitarios.service.UsuarioService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioServiceTest {

    @InjectMocks
    public UsuarioService usuarioService;

    @Test
    public void verificaMaiorIdade(){
        Boolean test = usuarioService.verifaMaiorIdade(18);
        Assert.assertTrue(test);
    }

    @Test
    public void verificaMenorIdade(){
        boolean test = usuarioService.verifaMaiorIdade(17);
        Assert.assertFalse(test);
    }
}
