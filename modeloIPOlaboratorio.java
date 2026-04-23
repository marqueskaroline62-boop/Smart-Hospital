// 1- IPO: Input Entrada: Entrará 3 dados digitados pelo usuário, total tempo, amostras, e amostrasValidas 
// (são variaveis já foram declaradas como double total tempo, int amostras e int amostrasValidas). 
// Processamento: Serão feitos 2 calculos usando os valores de entrada que o usuario informou, primeiro 
// calculo o tempo medio = total tempo/amostras, e segundo calculo percentual validos: amostrasvalidas/amostras.
// E por ultimo o Output Saída: Exibirá o resultado dos cálculo com as devidas formatações.

// 2- Variáveis: double totalTempo, int amostras, int amostrasValidas, double tempoMedio, double percentualValidos

// 3- Serão dois testes, sendo o primeiro totalTempo 100 minutos e amostras 10, tempoMedio = totalTempo/amostras
// resultando em 10, e percentualValidos = (double)amostrasValidas/amostra sendo amostras validas igual a 5 então:
// 5/10 resultando em 50% Teste 2 (realista)
//Exemplo: tempoTotal = 250 amostras = 20 amostrasValidas = 18 Resultados esperados: tempoMedio = 12.5
//percentualValidos = 0.9 (ou 90%).

import java.util.Locale;
import java.util.Scanner;

public class modeloIPOlaboratorio {
    public static void main(String[] args) {  // Define o padrão regional do programa.
        Locale.setDefault(Locale.US); // Locale.US usa ponto como separador decimal (ex.: 3.50)
        Scanner leitor = new Scanner (System.in); // Cria um Scanner para ler dados digitados no teclado (console).
        System.out.println("Relatorio Diario Do Laboratorio");// Título do programa (saída informativa).

        int amostras;
        double totalTempo;
        int amostrasValidas;

        double totalMedia;
        double percentualValidos;


        System.out.println("Informe A Quantidade De Amostras Processadas:"); // Solicita a quantidade de amostras (inteiro)
        amostras = leitor.nextInt();

        System.out.println("Informe O Tempo Total Gasto (Em Minutos)"); // Solicita o tempo total gasto (pode ter casas decimais)
        totalTempo = leitor.nextDouble();

        System.out.println("Informe O Numero De Resultados Validos:");// Solicita o número de resultados válidos (inteiro)
        amostrasValidas = leitor.nextInt();

        totalMedia = (double)totalTempo/amostras;
        percentualValidos = amostrasValidas/(double)amostras;

        System.out.printf("Total Media tempo:  %.2f\n", totalMedia);
        System.out.printf("Total Percentual Válidos: %.2f\n", percentualValidos*100);

    

        leitor.close();
    }
    
}

//O IPO está em, entrada: amostras, totalTempo e amostras válidas
//  e o Processamento está no cálculo dos dados fornecidos na entrada ex: totalMedia = (Double)totalTempo/amostras; percentual validos = (double)amostrasValidas/amostras.
// E a saída está nos dados de exibição deste cálculo ex: Total Media tempo: " e "Total percentual Válidos: "

// Primeiro teste esperado quantidade de amostras 10, total de tempo 100 minutos, amostras válidas 5. Total media 
// tempo 10, total percentual válido 50%. Segundo teste esperado 20 amostras, 250 minutos e 18 validas, resultado
//  esperado total media tempo 12,50 total percentual válido 90%

//“eu sempre vou planejar entrada → processamento → saída antes de programar”.

//Tabela para organizar escolhas 

// Objetivo do cálculo	    Tipo recomendado	Exemplo em Java	                        Observação
// Contar itens	            int	                int amostras = 120;	                    Contagem não precisa de casas decimais
// Medir tempo com fração	double	            double tempo = 37.5;                    Use double para médias e percentuais
// Percentual	            double	            double pct = validos/(double) amostras;	Faça conversão para evitar truncamento
// Formatar saída	        String	            String.format("%.2f", valor)	        Ajuda evidência e leitura