import java.util.Scanner;

public class DesafioFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double soma = 0.0;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        int n = 3;

        for (int i = 1; i <= n; i++) {
            System.out.print("Informe o valor " + i + ": ");
            double valor = entrada.nextDouble();

            soma += valor;

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        double media = soma / n;

        System.out.println("Soma: " + String.format("%.2f", soma));
        System.out.println("Media: " + String.format("%.2f", media));
        System.out.println("Maior: " + String.format("%.2f", maior));
        System.out.println("Menor: " + String.format("%.2f", menor));

        entrada.close();
    }
}