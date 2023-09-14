package com.mycompany.exercicio1;

import java.util.Scanner;

public class Exercicio8 {
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura em metros: ");
        double altura = sc.nextDouble();

        System.out.print("Digite o peso em quilogramas: ");
        double peso = sc.nextDouble();

        sc.close();

        double imc = peso / (altura * altura);

        String mensagem;
        if (imc < 18.5) {
            mensagem = "Abaixo do peso ideal.";
        } else if (imc >= 18.5 && imc <= 24.9) {
            mensagem = "Peso ideal, muito bem.";
        } else if (imc >= 25.0 && imc <= 29.9) {
            mensagem = "Sobrepeso, um regime leve pode ajudar.";
        } else if (imc >= 30.0 && imc <= 34.9) {
            mensagem = "Obesidade leve.";
        } else if (imc >= 35.0 && imc <= 39.9) {
            mensagem = "Obesidade moderada.";
        } else {
            mensagem = "Obesidade mórbida.";
        }

        System.out.println("Seu IMC é " + imc);
        System.out.println("Resultado: " + mensagem);
    }
}

     
        

