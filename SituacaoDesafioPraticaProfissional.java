import java.util.Scanner;

public class SituacaoDesafioPraticaProfissional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double ph;

        while (true) {

            // Entrada com validação
            do {
                System.out.println("Digite o pH (0 a 14) ou -1 para sair:");
                ph = entrada.nextDouble();

                if (ph == -1) {
                    System.out.println("Encerrando...");
                    return; // sai do programa
                }

                if (ph < 0 || ph > 14) {
                    System.out.println("Valor inválido!");
                }

            } while (ph < 0 || ph > 14);

            // Aqui o valor é válido
            System.out.println("Medição registrada: pH = " + ph);
        }
    }
}