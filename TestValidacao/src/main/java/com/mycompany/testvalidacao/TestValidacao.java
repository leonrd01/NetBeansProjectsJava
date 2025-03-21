package com.mycompany.testvalidacao;
import java.util.Scanner;



public class TestValidacao {
    

    public static void main(String[] args) throws InterruptedException {
        
        
        
       Scanner ler = new Scanner(System.in);
        Envio envio = new Envio(); // criando instância da classe Envio
        EnvioTest enviotest = new EnvioTest(); // criando instância da classe EnvioTest
        
        //enviotest.testCamposNaoNulos(); // Executa metódo da classe EnvioTest 
        
        System.out.println("Preencha os dados abaixo: ");
        System.out.println("");
        System.out.println("");
        
        System.out.print("NOME: ");
        envio.nome = ler.next();
        
        System.out.print("SOBRENOME: ");
        envio.sobrenome = ler.next();
        
        System.out.print("CPF: ");
        envio.cpf = ler.next();
        
        //System.out.print("E-MAIL: ");
        //envio.email = ler.next();
        
        System.out.print("TELEFONE: ");
        envio.telefone = ler.next();
        
        System.out.print("SENHA: ");
        envio.senha = ler.next();
        
        
        System.out.println("");
        System.out.println("Validando Cadastro...");
        Thread.sleep(4000);
         // Verifica se todos os campos estão preenchidos
        if (validarCampos(envio)) {
            envio.envioemail(); // Executa metódo da classe Envio que simula o envio do Email
            System.out.println("Cadastro Efetuado com Sucesso!");
            
        } else {
            System.out.println("ERRO: TODOS OS CAMPOS DEVEM SER PREEENCHIDOS!!");
        }
        
        
        
        
        
    }
    
    // Método para validar campos (substitui o TestCampo)
    private static boolean validarCampos(Envio envio) {
        return envio.nome != null && !envio.nome.isEmpty() &&
               envio.sobrenome != null && !envio.sobrenome.isEmpty() &&
               envio.cpf != null && !envio.cpf.isEmpty() &&
               envio.email != null && !envio.email.isEmpty() &&
               envio.telefone != null && !envio.telefone.isEmpty() &&
               envio.senha != null && !envio.senha.isEmpty();
    }

    
}


