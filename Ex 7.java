package com.mycompany.exercicio1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da peça de roupa: ");
        double valorPeca = sc.nextDouble();

        System.out.println("Escolha a opção de compra:");
        System.out.println("0 - Compra à vista");
        System.out.println("1 - Compra parcelada no cartão");
        System.out.println("2 - Crediário");
        int opcao = sc.nextInt();

        sc.close();

        double valorFinal = 0;
        switch (opcao) {
            case 0:
                valorFinal = valorPeca * 0.9; 
                break;
            case 1:
                System.out.print("Digite o número de parcelas desejado: ");
                int numParcelas = sc.nextInt();
                valorFinal = valorPeca / numParcelas;
                break;
            case 2:
                System.out.print("Digite o número de parcelas desejado: ");
                int numParcelasCrediario = sc.nextInt();
                valorFinal = (valorPeca * 1.1) / numParcelasCrediario; 
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Valor final da peça de roupa: R$" + valorFinal);
    }
}

     