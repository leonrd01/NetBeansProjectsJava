package com.mycompany.testvalidacao;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class EnvioTest {
    Envio envio = new Envio();
    public boolean teste;
    
    @Test
    public void testEnvioEmail() {
        
        assertTrue(this.teste, "Envio da mensagem de boas vindas falhou"); // Testa se o valor da var teste é true, se não for ele lança o erro
    
    }

    @Test
    public void testCamposNaoNulos() {
        Envio envio = new Envio();
        envio.nome = "Nome";
        envio.sobrenome = "sobrenome";
        envio.cpf = "12345678900";
        envio.email = "email@teste.com";
        envio.telefone = "11999999999";
        envio.senha = "senha123";

        assertNotNull(envio.nome, "O campo Nome deve ser preenchido");
        assertNotNull(envio.sobrenome, "O campo Sobrenome deve ser preenchido");
        assertNotNull(envio.cpf, "O campo CPF deve ser preenchido");
        assertNotNull(envio.email, "O campo Email deve ser preenchido");
        assertNotNull(envio.telefone, "O campo Telefone deve ser preenchido");
        assertNotNull(envio.senha, "O campo Senha deve ser preenchido");
    }
   
    
    
}
