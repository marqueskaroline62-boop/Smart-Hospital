// Atividade 2: implementação guiada (for mais acumuladores)
// Evocação (problema-núcleo): Processar N entradas com evidência (soma, média, maior, menor).
// Critério: Uma única passagem pelos dados, sem recalcular desnecessariamente.
// Evidência: Saída com duas casas decimais e resultados coerentes.

// Enunciado:
// Crie um programa em Java que:
// 1. Leia um inteiro n (quantidade de valores).
// 2. Leia n valores double.
// 3. Calcule e mostre: soma, média, maior e menor valor.

// Pontos de atenção (erros comuns):

// Você precisa inicializar maior/menor corretamente.
// Você não deve calcular média a cada repetição (faça no final).
// Você deve garantir que n > 0 (validação simples).
// Passo a passo sugerido:
// 1. Leia n.
// 2. Valide n com while (se necessário).
// 3. Inicialize soma, maior e menor.
// 4. Use for para ler valores e atualizar soma/maior/menor.
// 5. Calcule média ao final e imprima formatado.

// Entrega: Cole o código e rode com pelo menos 2 testes.

// Evidência mínima de teste:

// Caso A: n=3; valores 10, 20, 30 → soma=60, média=20, maior=30, menor=10
// Caso B: n=4; valores 5, 5, 7.5, 2.5 → soma=20, média=5, maior=7.5, menor=2.5
import java.util.Locale;
import java.util.Scanner;

/*
Atividade 2: Implementação Guiada (For + Acumuladores).
Objetivo: Ler N Valores E Calcular Soma, Média, Maior E Menor Em Uma Única Passada.
Critério: Clareza, Uma Passada Só, E Saída Conferível (Duas Casas Decimais).
*/
public class atividade2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe A Quantidade De Valores (N > 0): ");
        int n = entrada.nextInt();

        // Validação Simples Para Evitar Divisão Por Zero E Evitar Processamento Sem
        // Dados.
        while (n <= 0) {
            System.out.print("Valor Inválido. Digite N Novamente (N > 0): ");
            n = entrada.nextInt();
        }

        double soma = 0.0;

        // Inicialização De Maior/Menor Com Valores Extremamente “Aberto”.
        // Isso Evita Problemas Se O Primeiro Número For Negativo Ou Muito Grande.
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite O Valor " + i + ": ");
            double v = entrada.nextDouble();

            soma += v;

            if (v > maior) {
                maior = v;
            }

            if (v < menor) {
                menor = v;
            }
        }

        double media = soma / n;

        System.out.println("\n=== Resultados ===");
        System.out.println("Soma: " + String.format("%.2f", soma));
        System.out.println("Média: " + String.format("%.2f", media));
        System.out.println("Maior: " + String.format("%.2f", maior));
        System.out.println("Menor: " + String.format("%.2f", menor));

        entrada.close();
    }
}