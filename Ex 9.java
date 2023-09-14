package com.mycompany.exercicio1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
    
        double nota1;
        double nota2;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota entre 0 e 10: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota entre 0 e 10: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 9) 
        {
            System.out.println("Parabéns, continue assim!");
        }
        else if (media >= 7 && media <9)
        {
            System.out.println("Aprovado.");
        }
        else if (media >= 6 && media <7)
        {
            System.out.println("Aprovado no limite, estude um pouco mais.");
        }
        else if (media >= 2 && media <6)
        {
            System.out.println("Não está aprovado mas ainda pode fazer a segunda época");
        }
        else if (media < 2)
        {
            System.out.println("Reprovado. Nos vemos semestre que vem.");
        }
    }
}

   
