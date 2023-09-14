public class EncontrarMaiorNumero {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println(numero1 + " é o maior.");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " é o maior.");
        } else {
            System.out.println("Estes números são iguais.");
        }

        scanner.close();
    }
}
