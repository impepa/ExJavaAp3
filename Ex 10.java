package com.mycompany.exercicio1;

import java.util.Scanner;

public class Exercicio10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção do cardápio:");
        System.out.println("1 - Misto quente R$5,50");
        System.out.println("2 - Salada Chinesa R$10,20");
        System.out.println("3 - Suco de Laranja R$4,00");
        System.out.println("4 - Suco de Manga R$3,50");

        int escolha = sc.nextInt();

        sc.close();

        switch (escolha) {
            case 1 -> System.out.println("Tenha um excelente drink, vai lhe custar R$5,50.");
            case 2 -> System.out.println("Bom apetite, vai lhe custar R$10,20.");
            case 3 -> System.out.println("Tenha um excelente drink, vai lhe custar R$4,00.");
            case 4 -> System.out.println("Tenha um excelente drink, vai lhe custar R$3,50.");
            default -> System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 4.");
        }
    }
}
    

