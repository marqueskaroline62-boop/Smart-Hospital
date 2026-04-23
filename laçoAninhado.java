import java.util.Scanner;

public class laçoAninhado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Situação-desafio
        // Um laboratório organiza medições por turnos. Cada turno tem um número de
        // amostras, e o dia tem vários turnos. Você precisa calcular média por turno e
        // média do dia.
        // Como organizar isso sem virar um código confuso?

        // Laço aninhado (repetição dentro de repetição)
        // Exemplo: 2 turnos, cada turno com N amostras.

        for (int turno = 1; turno <= 2; turno++) {
            System.out.print("Quantidade De Amostras Do Turno " + turno + ": ");
            int n = entrada.nextInt();

            double soma = 0.0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Tempo Da Amostra " + i + ": ");
                double tempo = entrada.nextDouble();
                soma += tempo;
            }

            double mediaTurno = soma / n;
            System.out.println("Media Do Turno " + turno + ": " + String.format("%.2f", mediaTurno));
        }
        // break e continue com propósito (não como atalho confuso)
        // break: encerra o laço imediatamente.
        // continue: pula para a próxima repetição.
        // Use quando isso deixa a lógica mais clara e reduz condição aninhada.

        // Você aprende aqui a analisar: quantas repetições totais existem e qual custo
        // há dentro do corpo.

        // Estrutura Repetições aproximadas Exemplo
        // Laço simples N Ler N amostras
        // Aninhado N * M Turnos * amostras
        // Sentinela indefinido Ler até -1
    }
}
