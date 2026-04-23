import java.util.Scanner;

public class SomaDecimal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor (pode ter decimal):");

        double a = entrada.nextDouble();

        System.out.println("Digite o segundo valor (pode ter decimal):");

        double b = entrada.nextDouble();

        double soma = a + b;

        System.out.println("A soma e: " + soma);

        entrada.close();

    }



}
// Explicação sobre int e double
// int representa números inteiros, como 1, 2, 3, 10, -5.
// double representa números com casas decimais, como 2.5, 3.14, 10.0.