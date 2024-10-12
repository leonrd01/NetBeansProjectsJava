package com.mycompany.sistemaidade;
import java.util.Scanner;
import java.time.LocalTime;


public class SistemaIdade {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        LocalTime horario = LocalTime.now();
        
        int horas = horario.getHour();
        
        if(horas >= 6  && horas < 18 ){
             System.out.println("---------------------");
             System.out.println("Ola, Boa Tarde!");
             System.out.println("---------------------");
             System.out.println("");
             System.out.println("");
        }else{
             System.out.println("---------------------");
             System.out.println("Ola, Boa Noite!");
             System.out.println("---------------------");
             System.out.println("");
             System.out.println("");
        }
        
        System.out.print("Digite sua Idade: ");
        int idade = ler.nextInt();
        System.out.println("");
        if(idade <= 10){
            System.out.println("-----------------");
            System.out.println("Você e Criança!");
            System.out.println("-----------------");
        }else if(idade > 10 && idade < 18){
             System.out.println("-----------------");
             System.out.println("Você e Adolecente!");
             System.out.println("-----------------");
        }else{
             System.out.println("-----------------");
             System.out.println("Você e Adulto!");
             System.out.println("-----------------");
        }
        
        
     
        
        
       
    }
}
