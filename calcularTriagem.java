public class calcularTriagem {
    // Situação Desafio
    // O Mistério da Variável Invisível

    // Imagine que você está a desenvolver o módulo de Triagem do Smart Hospital.
    // Você cria um método para calcular o nível de urgência de um paciente e,
    // dentro dele, declara uma variável chamada pontuacaoRisco.

    public static void calcularTriagem() {
        int pontuacaoRisco = 85; // Variável criada aqui
        System.out.println("Risco calculado: " + pontuacaoRisco);
    }

    // Agora, o seu colega precisa de usar essa mesma pontuacaoRisco noutro método
    // chamado imprimirRelatorio(). Ele tenta simplesmente escrever:

    public static void imprimirRelatorio() {
        // O seu colega tenta aceder à variável aqui
        System.out.println("O relatório final indica risco: " + pontuacaoRisco);
    }

    // O Problema: O Java vai sublinhar o código dele a vermelho e dizer: "Cannot
    // find symbol" (Não consigo encontrar este símbolo). Para o Java, a variável
    // pontuacaoRisco não existe fora do método onde foi criada. Ela "nasceu" e
    // "morreu" entre as chaves { } do método calcularTriagem.

    // O Desafio: Como é que podemos estruturar o código para que as informações
    // importantes sejam partilhadas entre diferentes métodos sem violar as regras
    // de segurança? E se precisarmos que uma variável (como o nomeDoHospital) seja
    // visível para todos os métodos ao mesmo tempo? Como distinguir quando uma
    // variável deve ser "passageira" e quando deve ser "permanente"?
}
