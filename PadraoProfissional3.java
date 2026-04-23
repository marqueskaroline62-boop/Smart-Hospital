import java.util.Scanner;

public class PadraoProfissional3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Padrão profissional 3: sentinela (parar quando um valor especial aparecer)
        // Esse padrão é muito comum quando você não sabe quantos dados virão. Você lê
        // valores até um valor especial indicar “fim”.
        // Exemplo: ler tempos até o usuário digitar -1.

        double soma = 0.0;
        int cont = 0;

        System.out.println("Digite Tempos Em Minutos. Digite -1 Para Encerrar.");

        double tempo = entrada.nextDouble();

        while (tempo != -1) {
            if (tempo >= 0) {
                soma += tempo;
                cont++;
            } else {
                System.out.println("Valor Negativo Ignorado (Exceto -1 Para Encerrar).");
            }

            tempo = entrada.nextDouble();
        }

        if (cont > 0) {
            System.out.println("Media: " + String.format("%.2f", soma / cont));
        } else {
            System.out.println("Nenhum Tempo Valido Foi Informado.");
        }
        // Esse padrão reforça o critério de segurança: toda repetição deve ter uma
        // forma clara de encerrar. Aqui, o encerramento é o valor sentinela.
    }
}