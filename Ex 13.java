import java.util.Scanner;

public class OrdenaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (diferente do primeiro): ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro (diferente dos dois anteriores): ");
        int numero3 = scanner.nextInt();

        // Verifica se os números são diferentes
        if (numero1 != numero2 && numero1 != numero3 && numero2 != numero3) {
            // Ordena os números em ordem crescente
            int menor, meio, maior;
            if (numero1 < numero2 && numero1 < numero3) {
                menor = numero1;
                if (numero2 < numero3) {
                    meio = numero2;
                    maior = numero3;
                } else {
                    meio = numero3;
                    maior = numero2;
                }
            } else if (numero2 < numero1 && numero2 < numero3) {
                menor = numero2;
                if (numero1 < numero3) {
                    meio = numero1;
                    maior = numero3;
                } else {
                    meio = numero3;
                    maior = numero1;
                }
            } else {
                menor = numero3;
                if (numero1 < numero2) {
                    meio = numero1;
                    maior = numero2;
                } else {
                    meio = numero2;
                    maior = numero1;
                }
            }

            System.out.println("N
