// Atividade 5: comparação de eficiência e clareza (mini-análise)
// Evocação (problema-núcleo): Escolher uma solução não só porque “funciona”,
// mas porque é melhor.
// Critério: Comparar abordagens com base em clareza, risco de erro e custo de
// processamento.
// Evidência: Você aponta pelo menos 2 critérios e conclui com justificativa.

// Enunciado (responda em 10–14 linhas):
// Compare duas abordagens para calcular média de tempos:
// Abordagem 1: Somar tudo e dividir no final.
// Abordagem 2: Atualizar a média a cada leitura.

// Explique qual é mais clara e por quê.
// Explique qual é mais segura e por quê.
// Explique qual tende a ser mais eficiente e por quê.

// 1. Clareza e Simplicidade A Abordagem 1 (Somar tudo e dividir no final) é
// muito mais clara e intuitiva. Ela segue o modelo mental que aprendemos na
// matemática básica:
// $\text{Média} = \frac{\sum \text{Valores}}{N}$. No código, isso se traduz em
// uma única linha de divisão fora do loop, facilitando a leitura e manutenção
// por outros programadores,
// enquanto a Abordagem 2 exige uma fórmula de atualização cumulativa mais
// complexa dentro do laço.

// 2. Segurança e Precisão
// A Abordagem 1 tende a ser mais segura contra erros de precisão numérica em
// grandes volumes de dados. Atualizar a média a cada passo (Abordagem 2)
// envolve múltiplas divisões sucessivas,
// o que pode acumular pequenos erros de arredondamento de ponto flutuante
// (floating-point errors) ao longo do tempo. Além disso, na Abordagem 1, o
// risco de uma "divisão por zero"
// é tratado em um único ponto isolado antes da exibição dos resultados.

// 3. Eficiência
// A Abordagem 1 é mais eficiente em termos de processamento. Realizar uma única
// divisão ao final de 1.000 leituras consome muito menos ciclos de CPU do que
// realizar 1.000 divisões
// (uma a cada ciclo do loop). A Abordagem 2 só seria justificável em sistemas
// de tempo real ou streaming de dados infinitos, onde o valor médio precisa
// estar disponível instantaneamente
// a qualquer milissegundo, sem que o processo de leitura termine.

// Conclusão: Para a maioria das aplicações acadêmicas e laboratoriais, a
// Abordagem 1 é a vencedora por ser matematicamente mais robusta,
// computacionalmente mais leve e visualmente
// mais limpa no código.

import java.util.Locale;
import java.util.Scanner;

/*
Atividade 5: Comparação De Eficiência E Clareza (Mini-Análise Com Código).
Objetivo: Implementar Duas Maneiras De Calcular Média E Observar Diferenças.
Abordagem 1: Somar Tudo E Dividir No Final (Mais Clara E Menos Trabalho Repetido).
Abordagem 2: Atualizar “Média Parcial” A Cada Leitura (Funciona, Mas Pode Ser Menos Intuitiva Para Iniciantes).
Critério: Mesmo Resultado Final, Mas Com Discussão De Clareza E Custo.
Evidência: Console Mostra Média Final E “Médias Parciais” (Se Você Quiser Ver O Processo).
*/
public class atividade5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe A Quantidade De Valores (N > 0): ");
        int n = entrada.nextInt();

        while (n <= 0) {
            System.out.print("Valor Inválido. Digite N Novamente (N > 0): ");
            n = entrada.nextInt();
        }

        // Abordagem 1: Soma E Divide No Final.
        double soma1 = 0.0;

        // Abordagem 2: Média Parcial Atualizada A Cada Leitura.
        // Observação: A Fórmula Abaixo Mantém A Média Sem Guardar Todos Os Valores.
        // NovaMedia = MediaAnterior + (ValorAtual - MediaAnterior) / i
        double mediaParcial = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite O Valor " + i + ": ");
            double v = entrada.nextDouble();

            // Atualiza Para Abordagem 1.
            soma1 += v;

            // Atualiza Para Abordagem 2 (Média Parcial).
            mediaParcial = mediaParcial + (v - mediaParcial) / i;

            // Esta Linha É Opcional, Mas Ajuda A Visualizar O Processo De Atualização.
            System.out.println("Média Parcial Após " + i + " Valor(es): " + String.format("%.2f", mediaParcial));
        }

        double mediaFinalAbordagem1 = soma1 / n;

        System.out.println("\n=== Comparação Final ===");
        System.out.println("Abordagem 1 (Soma / N): " + String.format("%.2f", mediaFinalAbordagem1));
        System.out.println("Abordagem 2 (Média Parcial): " + String.format("%.2f", mediaParcial));

        // Observação Prática:
        // As Duas Tendem A Chegar No Mesmo Resultado Final (Podem Variar Levemente Por
        // Arredondamento).
        // A Abordagem 1 É Mais Direta Para Leitura E Revisão, Por Isso É A Mais
        // Recomendada Neste Nível.

        entrada.close();
    }
}