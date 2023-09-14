public class CompararNumeros {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("Primeiro maior do que o segundo.");
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("Segundo maior do que o primeiro");
        } else {
            System.out.println("os números são iguais.");
        }

        scanner.close();
    }
}
