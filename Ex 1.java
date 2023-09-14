public class ComparacaoNumeros {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        System.out.print("Digite um número real: ");
        int numeroReal = scanner.nextDouble();

        if (numeroInteiro < numeroReal) {
            System.out.println("O número inteiro é menor do que o número real.");
        }

        scanner.close();
    }
}
