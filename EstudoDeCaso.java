import java.util.Scanner;

public class EstudoDeCaso {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double tempo;
        double soma = 0;
        int contador = 0;

        System.out.println("Digite os tempos (-1 para encerrar):");

        while (true) {
            tempo = entrada.nextDouble();

            // 🔴 condição de parada
            if (tempo == -1) {
                break;
            }

            // ⚠️ ignora negativos inválidos
            if (tempo < 0) {
                System.out.println("Tempo inválido. Ignorado.");
                continue;
            }

            // ✅ valor válido
            soma += tempo;
            contador++;
        }

        // 📊 resultado final
        if (contador == 0) {
            System.out.println("Nenhum Tempo Valido");
        } else {
            double media = soma / contador;
            System.out.println("Quantidade: " + contador);
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
        }

        entrada.close();
    }
}
