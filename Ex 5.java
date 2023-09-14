public class Ex 5 {
    
}
import java.util.Scanner;

public class CalculadoraNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        // Calculando a soma
        int soma = numero1 + numero2 + numero3;

        // Calculando a média
        double media = (double) soma / 3;

        // Calculando o produto
        int produto = numero1 * numero2 * numero3;

        // Encontrando o menor número
        int menor = Math.min(Math.min(numero1, numero2), numero3);

        // Encontrando o maior número
        int maior = Math.max(Math.max(numero1, numero2), numero3);

        // Imprimindo os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Produto: " + produto);
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);

        // Feche o scanner para liberar recursos.
        scanner.close();
    }
}
