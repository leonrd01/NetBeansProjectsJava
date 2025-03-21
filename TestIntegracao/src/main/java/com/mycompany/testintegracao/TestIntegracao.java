package com.mycompany.testintegracao;

import java.util.Scanner;



public class TestIntegracao {
    

    public static void main(String[] args) throws InterruptedException {
        
        
        
        Scanner ler = new Scanner(System.in);
        Envio envio = new Envio(); // criando instância da classe Envio
        EnvioTest enviotest = new EnvioTest(); // criando instância da classe EnvioTest
        
        
        
        System.out.println("Preencha os dados abaixo: ");
        System.out.println("");
        System.out.println("");
        
        System.out.print("NOME: ");
        envio.nome = ler.next();
        
        System.out.print("SOBRENOME: ");
        envio.sobrenome = ler.next();
        
        System.out.print("CPF: ");
        envio.cpf = ler.next();
        
        System.out.print("E-MAIL: ");
        envio.email = ler.next();
        
        System.out.print("TELEFONE: ");
        envio.telefone = ler.next();
        
        System.out.print("SENHA: ");
        envio.senha = ler.next();
        
        
        System.out.println("");
        System.out.println("Validando Cadastro...");
        Thread.sleep(4000);
       
        envio.envioemail(); // Executa metódo da classe Envio que simula o envio do Email
        System.out.println("Cadastro Efetuado com Sucesso!");
            
        
                                      
    }
    
   
}


