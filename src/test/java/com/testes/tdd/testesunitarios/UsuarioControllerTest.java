package com.testes.tdd.testesunitarios;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(UsuarioControllerTest.class)
public class UsuarioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUserList() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.get("/user"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isArray());
    }
}
