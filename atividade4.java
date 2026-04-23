// Atividade 4: sentinela ou quantidade fixa (decisão + justificativa)
// Evocação (problema-núcleo): Decidir a abordagem mais adequada ao contexto.
// Critério: Justificar a escolha com clareza (dados variáveis x dados fixos).
// Evidência: Uma explicação curta e uma implementação mínima.

// Enunciado (escolha uma opção e implemente):
// Opção A (quantidade fixa): O operador informa quantas medições fará e você usa for.
// Opção B (sentinela): O operador digita medições até digitar -1 para encerrar.

// Tarefa:
// 1. Escolha A ou B.
// 2. Explique em 5–8 linhas por que essa escolha é melhor para o cenário a seguir: “Um laboratório recebe amostras ao longo do dia e o número total pode variar; o operador não sabe o total no início.”
// 3. Faça uma implementação mínima que calcule soma e média.

// Dica de decisão:

// Se o volume é incerto e o operador não sabe o total, sentinela costuma ser mais natural.
// Se o processo é padronizado e o total é conhecido, quantidade fixa facilita teste e controle.

// Justificativa (Escolha: Opção B)
// Em um ambiente de laboratório onde as amostras chegam de forma contínua e imprevisível ao longo do dia, a Opção B é superior porque oferece flexibilidade operacional. 
// Se usássemos a quantidade fixa (Opção A), o operador seria forçado a contar manualmente todas as amostras antes de começar a digitar, o que gera trabalho duplo e margem para erro humano.
//  Com o valor sentinela (como o -1), o programa se adapta ao fluxo de trabalho real: o operador apenas processa o que tem em mãos e encerra o ciclo no momento em que a última amostra 
//  termina, sem precisar prever o futuro ou interromper o fluxo para contar lotes.

import java.util.Locale;
import java.util.Scanner;

/*
Atividade 4: Sentinela Ou Quantidade Fixa (Decisão + Implementação Mínima).
Objetivo: Escolher Uma Abordagem E Justificar Com Base No Contexto.
Cenário Dado: “O Laboratório Recebe Amostras Ao Longo Do Dia E O Total Varia.”
Escolha Implementada Aqui: Sentinela (-1), Porque O Operador Pode Não Saber O Total No Início.
Critério: Parada Clara (Sentinela), Tratamento De Inválidos, E Evidência (Soma, Média, Contagem).
*/
public class atividade4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite Tempos Em Minutos (Digite -1 Para Encerrar).");
        System.out.println("Dica: Valores Negativos Diferentes De -1 Serão Considerados Inválidos.\n");

        double soma = 0.0;
        int contValidos = 0;

        while (true) {
            System.out.print("Informe Um Tempo: ");
            double tempo = entrada.nextDouble();

            // Sentinela: Quando O Usuário Digita -1, O Programa Encerra A Entrada De Dados.
            if (tempo == -1) {
                break;
            }

            // Validação: Tempo Não Pode Ser Negativo (Exceto O -1 Que É O Encerramento).
            if (tempo < 0) {
                System.out.println("Tempo Inválido. Tente Novamente.");
                continue;
            }

            soma += tempo;
            contValidos++;
        }

        System.out.println("\n=== Resultados ===");
        System.out.println("Quantidade De Tempos Válidos: " + contValidos);

        if (contValidos > 0) {
            double media = soma / contValidos;
            System.out.println("Soma Dos Tempos: " + String.format("%.2f", soma));
            System.out.println("Média Dos Tempos: " + String.format("%.2f", media));
        } else {
            System.out.println("Nenhum Tempo Válido Foi Informado.");
        }

        entrada.close();
    }
}