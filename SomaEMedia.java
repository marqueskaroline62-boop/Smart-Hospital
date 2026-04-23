import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero decimal: ");

        int a = entrada.nextInt();

        System.out.println("Digite outro numero pra somar:");

        int b = entrada.nextInt();

        int soma = a + b;

        System.out.println("A soma é " + soma);

        int media = (a + b) /2;

        System.out.println("E a média " + media);

        entrada.close();
    }
}
