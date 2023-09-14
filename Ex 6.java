import java.util.Scanner;

public class SaqueContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo da conta bancária: ");
        double saldoConta = scanner.nextDouble();

        System.out.print("Digite o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();

        if (valorSaque > saldoConta) {
            System.out.println("Não é possível realizar o saque. Saldo insuficiente.");
        } else {
            double saldoRemanescente = saldoConta - valorSaque;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Saldo remanescente: " + saldoRemanescente);
        }

        // Feche o scanner para liberar recursos.
        scanner.close();
    }
}
