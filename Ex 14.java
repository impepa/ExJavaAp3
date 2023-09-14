import java.util.Scanner;

public class CalculoMediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlunos = 10;
        double somaNotas = 0;
        int alunosComNotaMaiorQue8 = 0;
        int alunosComNotaZero = 0;

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;

            if (nota > 8) {
                alunosComNotaMaiorQue8++;
            }

            if (nota == 0) {
                alunosComNotaZero++;
            }
        }

        double media = somaNotas / totalAlunos;

        System.out.println("Média das notas: " + media);

        if (media >= 6) {
            System.out.println("Quantidade de alunos com nota maior que 8: " + alunosComNotaMaiorQue8);
        } else {
            System.out.println("Quantidade de alunos com nota zero: " + alunosComNotaZero);
        }

        // Feche o scanner para liberar recursos.
        scanner.close();
    }
}
