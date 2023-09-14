import java.util.Scanner;

public class VerificaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro de quatro dígitos: ");
        int numero = scanner.nextInt();

        // Verifica se o número tem exatamente quatro dígitos
        if (numero >= 1000 && numero <= 9999) {
            int primeiroDigito = numero / 1000;
            int segundoDigito = (numero / 100) % 10;
            int terceiroDigito = (numero / 10) % 10;
            int quartoDigito = numero % 10;

            // Verifica as condições da senha
            if ((primeiroDigito == 8 || primeiroDigito == 5) &&
                (quartoDigito == 5 || quartoDigito == 1) &&
                ((quartoDigito == 5 && (segundoDigito + terceiroDigito) == 3) ||
                 (quartoDigito == 1 && (segundoDigito + terceiroDigito) == 0))) {
                System.out.println("É uma senha válida.");
            } else {
                System.out.println("Não é uma senha válida.");
            }
        } else {
            System.out.println("O número não tem quatro dígitos.");
        }

        // Feche o scanner para liberar recursos.
        scanner.close();
    }
}
