import java.util.Scanner;

public class SomarNvalores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double soma = 0.0;
        int n = 2;

        System.out.println("Digite dois valores: ");

        for (int i = 1; i <= n; i++) {
            double valor = entrada.nextDouble();
            soma += valor;

        }
        System.out.println("A soma é: " + soma);

        entrada.close();
    }
}
