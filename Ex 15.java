import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor por hora (número real positivo): ");
        double valorPorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas (inteiro): ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o imposto (real entre 0 e 1, inclusive): ");
        double imposto = scanner.nextDouble();

        System.out.print("Digite a comissão (número real positivo): ");
        double comissao = scanner.nextDouble();

        // Calcula o salário bruto
        double salarioBruto = valorPorHora * horasTrabalhadas;

        // Verifica se o número de horas trabalhadas é pelo menos 120 para incluir a comissão
        if (horasTrabalhadas >= 120) {
            salarioBruto += comissao;
        }

        // Calcula o salário líquido
        double salarioLiquido = salarioBruto - (salarioBruto * imposto);

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Salário Líquido: " + salarioLiquido);

        // Feche o scanner para liberar recursos.
        scanner.close();
    }
}

