import java.util.Scanner;

public class flagEbrake {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int turnos = 2; // evidência mínima

        for (int t = 1; t <= turnos; t++) {
            System.out.println("\n--- Turno " + t + " ---");

            boolean encerrarTurno = false;

            while (!encerrarTurno) {
                System.out.print("Digite o valor da amostra (-1 para encerrar turno): ");
                int valor = entrada.nextInt();

                if (valor == -1) {
                    System.out.println("Encerrando turno " + t);
                    encerrarTurno = true;
                } else {
                    System.out.println("Valor registrado: " + valor);
                }
            }
        }

        System.out.println("\nColeta finalizada.");
        entrada.close();
    }
}
// “eu só considero uma solução pronta quando eu consigo provar com evidência:
// pelo menos dois testes, uma condição de parada explícita e uma explicação
// clara do que muda a cada repetição”.