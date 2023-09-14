package com.mycompany.exercicio1;

import java.util.Scanner;

public class Exercicio11 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código de estado (1 a 5): ");
        int codigoEstado = sc.nextInt();

        System.out.print("Digite o valor inicial de carga: ");
        double valorInicial = sc.nextDouble();

        sc.close();

        double valorFinal = 0;

        switch (codigoEstado) {
            case 1:
            case 3:
            case 4:
                valorFinal = valorInicial - (valorInicial * 0.15);
                break;
            case 2:
            case 5:
                valorFinal = valorInicial - (valorInicial * 0.12); 
                break;
            default:
                System.out.println("Código de estado inválido. Deve ser 1 a 5.");
                return;
        }

        System.out.println("Valor final da carga: R$" + valorFinal);
    }
}
    

