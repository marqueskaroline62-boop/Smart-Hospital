import java.util.Scanner;

public class PadraoProfissional4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Padrão profissional 4: menu interativo (repetir até escolher sair)
        // Em sistemas de console, um menu é outra forma clássica de repetição.

        int opcao;

        do {
            System.out.println("\n1 - Registrar Tempo");
            System.out.println("2 - Mostrar Relatorio");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Registrando Tempo...");
            } else if (opcao == 2) {
                System.out.println("Mostrando Relatorio...");
            } else if (opcao != 0) {
                System.out.println("Opcao Invalida.");
            }
        } while (opcao != 0);

        System.out.println("Encerrado.");
        // Mesmo sem entrar em condicionais profundamente agora, o ponto é: o laço aqui
        // é a “espinha dorsal” de interação.

    }
}