// Atividade 1: diagnóstico rápido (escolha do laço certo)
// Evocação (problema-núcleo): Repetir com controle e parar no momento certo.
// Critério: Escolher o laço que deixa o código mais claro e com menor risco de erro.
// Evidência: Justificativa curta e objetiva.

// Enunciado (responda em 6–10 linhas):
// Para cada situação abaixo, escolha for, while ou do-while e justifique em 1 frase.

// Ler exatamente 12 temperaturas e calcular a média.
// Resposta: A quantidade conhecida é exatamente 12 temperaturas, para este caso usamos for

// Pedir uma senha e repetir até estar correta (sem saber quantas tentativas).
// Resposta: A quantidade de tentativas é desconhecida e depende do usuário, então usamos while.

// Pedir um valor de pH e aceitar apenas se estiver entre 0 e 14.
// Resposta: A repetição depende de validação com quantidade desconhecida de tentativas, então usamos while.

// Ler valores até o usuário digitar -1 para encerrar.
// Resposta: A quantidade é desconhecida e controlada por sentinela, portanto usamos while.

// Dica: Você deve mencionar “quantidade conhecida” para for, “quantidade desconhecida” para while e “executar pelo menos uma vez” para do-while.
import java.util.Scanner;

/*
Atividade 1: Diagnóstico Rápido (Escolha Do Laço Certo).
Objetivo: Ver Na Prática Como Cada Cenário “Pede” Um Tipo De Laço.
Evidência: Você Consegue Relacionar “Quantidade Conhecida”, “Quantidade Desconhecida” E “Executar Ao Menos Uma Vez”.
*/
public class atividade1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Atividade 1: Diagnóstico De Laços");
        System.out.println("Você Vai Ver Quatro Cenários E uma implementação mínima para cada um.");
        System.out.println("A Ideia Aqui É Enxergar O Motivo Da Escolha Do Laço, E Não Só A Sintaxe.\n");

        // 1) Ler Exatamente 12 Temperaturas E Calcular A Média.
        // Laço Mais Natural: For, Porque A Quantidade É Conhecida (12 Leituras).
        double somaTemp = 0.0;
        for (int i = 1; i <= 12; i++) {
            System.out.print("Cenário 1 - Digite A Temperatura " + i + ": ");
            double t = entrada.nextDouble();
            somaTemp += t;
        }
        double mediaTemp = somaTemp / 12.0;
        System.out.println("Cenário 1 - Média Das 12 Temperaturas: " + String.format("%.2f", mediaTemp));
        System.out.println();

        // 2) Pedir Uma Senha E Repetir Até Estar Correta (Sem Saber Quantas
        // Tentativas).
        // Laço Mais Natural: While, Porque Você Não Sabe Quantas Tentativas Serão
        // Necessárias.
        String senhaCorreta = "java123";
        System.out.print("Cenário 2 - Digite A Senha: ");
        String senha = entrada.next();
        while (!senha.equals(senhaCorreta)) {
            System.out.print("Senha Incorreta. Digite Novamente: ");
            senha = entrada.next();
        }
        System.out.println("Cenário 2 - Acesso Liberado.\n");

        // 3) Pedir Um Valor De pH E Aceitar Apenas Se Estiver Entre 0 E 14.
        // Laço Muito Natural: Do-While, Porque Você Precisa Perguntar Pelo Menos Uma
        // Vez.
        double ph;
        do {
            System.out.print("Cenário 3 - Informe O pH (0 A 14): ");
            ph = entrada.nextDouble();
        } while (ph < 0 || ph > 14);
        System.out.println("Cenário 3 - pH Válido: " + String.format("%.2f", ph));
        System.out.println();

        // 4) Ler Valores Até O Usuário Digitar -1 Para Encerrar.
        // Laço Mais Natural: While Com Sentinela, Porque A Parada É Um “Sinal” (-1).
        System.out.println("Cenário 4 - Digite Valores (Digite -1 Para Encerrar).");
        double soma = 0.0;
        int cont = 0;

        double valor = entrada.nextDouble();
        while (valor != -1) {
            soma += valor;
            cont++;
            valor = entrada.nextDouble();
        }

        if (cont > 0) {
            System.out.println("Cenário 4 - Média: " + String.format("%.2f", soma / cont));
        } else {
            System.out.println("Cenário 4 - Nenhum Valor Foi Informado.");
        }

        entrada.close();
    }
}