package com.mycompany.adivinheonumero;
import java.util.Scanner;
import java.util.Random;

public class AdivinheoNumero {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        
        int x = random.nextInt(100) + 1;
        int tentativas = 0;
        int palp = 0;
        
        System.out.println("----------------------------");
        System.out.println("     Adivinhe o Numero!     ");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.println("Tente adivinhar o Numero que esta entre 1 e 100");
        System.out.println("");
       
        while(palp != x){
             System.out.println("");
             System.out.println("Tentativas: " +tentativas);
             System.out.println("");
             System.out.print("Digite um numero: ");
             palp = ler.nextInt();
             tentativas++;
                
            if(palp != x){
                System.out.println("Ops, numero errado!");
                System.out.println("Tente Novamente");
                
            }else{
                System.out.println("Carambaa!!");
                System.out.println("Parabens, voce Acertou!!!");
                System.out.println("");
                System.out.println("Voce acertou o numero em " +tentativas+ " Tentativas");
            }
        
        
            
        }
    }
}
