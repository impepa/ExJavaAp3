public class VerificarIgualdade {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número real: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double numero2 = scanner.nextDouble();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        }

        scanner.close();
    }
}
