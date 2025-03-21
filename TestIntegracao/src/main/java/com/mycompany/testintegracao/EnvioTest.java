package com.mycompany.testintegracao;
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

    
        
}
