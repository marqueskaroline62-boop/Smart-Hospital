import java.util.Scanner;

public class SomaComEntrada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");

        int a = entrada.nextInt();

        System.out.println("Digite o segundo numero:");

        int b = entrada.nextInt();

        int soma = a + b;

        System.out.println("A soma é: " + soma);

        entrada.close();

    }

}
// Explicação detalhada (parte por parte)
// A linha import java.util.Scanner; permite usar a classe Scanner no seu programa.
// A linha Scanner entrada = new Scanner(System.in); cria um leitor associado ao teclado.
// A linha System.out.println("Digite o primeiro numero:"); mostra uma mensagem para orientar o usuário.
// A linha int a = entrada.nextInt(); lê um inteiro digitado e guarda em a.
// A linha int b = entrada.nextInt(); faz o mesmo para o segundo número.
// A linha int soma = a + b; calcula a soma.
// A linha entrada.close(); fecha o leitor e é uma boa prática para liberar recursos.