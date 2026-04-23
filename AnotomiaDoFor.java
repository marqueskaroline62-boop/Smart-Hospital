// Estrutura geral:

// for (inicializacao; condicao; atualizacao) {
// // corpo do laço
// }
// Inicialização: geralmente cria o contador (int i = 1).
// Condição: define quando continua (i <= n).
// Atualização: muda o contador (i++).
// Corpo: executa o trabalho (ler valor, somar, comparar, imprimir).

// Contador x acumulador (o par mais comum em repetição)

// Em programas com for, quase sempre existe:

// Um contador (i) para controlar a repetição.
// Um acumulador (soma) para juntar resultados.

// Exemplo simples: somar N valores.

// double soma = 0.0;

// for (int i = 1; i <= n; i++) {
// double valor = entrada.nextDouble();
// soma += valor;
// }
// Off-by-one: o erro mais comum com for
// Um erro clássico acontece quando você repete uma vez a mais ou uma vez a
// menos. Isso ocorre por confusão entre:
// i < n (repete n-1 vezes se começar em 1, ou n vezes se começar em 0).
// i <= n (repete n vezes se começar em 1, ou n+1 vezes se começar em 0).
// Um jeito prático de evitar isso é escolher um padrão e manter consistência:

// Padrão A: começar em 1 e ir até <= n.
// Padrão B: começar em 0 e ir até < n.
// Os dois são válidos, mas misturar eles é onde o erro aparece.

// Padrão Exemplo Quantas vezes repete
// Começa em 1 i = 1; i <= n; i++ n
// Começa em 0 i = 0; i < n; i++ n

// Passo (step): quando repetir não significa “de 1 em 1”
// Nem sempre você quer avançar de 1 em 1. Às vezes você quer:
// Processar apenas posições pares.
// Executar uma tarefa de 5 em 5.
// Contar ao contrário.
// Exemplos:

// for (int i = 0; i <= 10; i += 2) {
// System.out.println(i);
// }
// for (int i = 10; i >= 1; i--) {
// System.out.println(i);
// }
// Isso amplia seu repertório e te ajuda a perceber que o for não é “contador
// simples”, é um controle completo de evolução.

// Eficiência: “não recalcular dentro do laço” é uma regra de ouro
// Em termos práticos, eficiência aqui significa:
// Evitar trabalho repetido desnecessário.
// Evitar recomputar valores que podem ser calculados no final.
// Fazer uma única “passada” pelos dados sempre que possível.

// Um erro comum é tentar calcular média a cada leitura. A melhor prática é
// somar tudo e dividir no final. Isso reduz operações e aumenta clareza.