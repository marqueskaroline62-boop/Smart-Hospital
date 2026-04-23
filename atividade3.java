
// Atividade 3: validação robusta (while dentro do fluxo)
// Evocação (problema-núcleo): Confiabilidade de entrada.
// Critério: Não aceitar valor inválido e não travar o programa.
// Evidência: O programa sempre volta a pedir o dado até ficar válido.

// Enunciado:
// Você está registrando tempo de amostras (minutos).

// A quantidade de amostras deve ser maior que zero.
// O tempo de cada amostra não pode ser negativo.
// Implemente um programa que:
// 1. Leia amostras e valide com while.
// 2. Use for para ler cada tempo.
// 3. Se o tempo for inválido, use while para pedir novamente.
// 4. Calcule e mostre o tempo médio ao final.

// Ponto de atenção:
// Se você esquecer de ler novamente dentro do while, seu laço pode ficar
// infinito.

// Entrega: Cole o código e rode com um teste onde o usuário digita um valor
// inválido e depois corrige.

import java.util.Locale;
import java.util.Scanner;

/*
Atividade 3: Validação Robusta (While Dentro Do Fluxo).
Objetivo: Garantir Que O Programa Não Aceite Entradas Inválidas E Não Trave.
Cenário: Ler Quantidade De Amostras (N > 0) E Tempos (Tempo >= 0) E Calcular Média.
Critério: Sempre Repetir A Pergunta Até O Dado Ficar Válido (Evidência No Console).
*/
public class atividade3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe A Quantidade De Amostras (Maior Que Zero): ");
        int amostras = entrada.nextInt();

        // Valida A Quantidade Para Evitar Laço Inútil E Divisão Por Zero.
        while (amostras <= 0) {
            System.out.print("Valor Inválido. Digite Novamente (Maior Que Zero): ");
            amostras = entrada.nextInt();
        }

        double somaTempo = 0.0;

        // For É Natural Aqui Porque Você Já Sabe Quantas Amostras Vai Ler.
        for (int i = 1; i <= amostras; i++) {
            System.out.print("Tempo Da Amostra " + i + " (Minutos, >= 0): ");
            double tempo = entrada.nextDouble();

            // Valida Cada Tempo Para Garantir Consistência Do Resultado Final.
            while (tempo < 0) {
                System.out.print("Tempo Inválido. Digite Novamente (>= 0): ");
                tempo = entrada.nextDouble();
            }

            somaTempo += tempo;
        }

        double media = somaTempo / amostras;

        System.out.println("\n=== Indicador ===");
        System.out.println("Tempo Médio (Min): " + String.format("%.2f", media));

        entrada.close();
    }
}