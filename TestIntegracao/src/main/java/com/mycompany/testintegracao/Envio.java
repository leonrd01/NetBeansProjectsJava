package com.mycompany.testintegracao;


public class Envio {
    
        public String nome;
        public String sobrenome;
        public String cpf;
        public String email;
        public String telefone;
        public String senha; 
        
        
       
        
        
        public void envioemail(){
            
            EnvioTest enviotest = new EnvioTest(); // criando instância da classe EnvioTest
            
        //caso esse bloco de envio do email não for executado, o teste falha -------------
           
        System.out.println("");
            System.out.println("---------ENVIO PARA O EMAIL---------");
            System.out.println("Boas Vindas " + nome + "!");
            System.out.println("Agradeçemos por ter você aqui!");
            System.out.println("------------------------------------");
            
            enviotest.teste = true;  
        //--------------------------------------------------------------------------------   
        
            enviotest.testEnvioEmail(); // lança o método para testar se o envio foi feiro
            
        }
        
    
}
