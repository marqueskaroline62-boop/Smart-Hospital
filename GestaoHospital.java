// Aplicação Prática
// O Caso do Inventário

// Vamos aplicar estas fronteiras no software do Smart Hospital. Imagine um sistema que controla o stock de oxigénio. Temos uma variável que todos precisam de ver (Global)
// e cálculos que acontecem apenas dentro dos departamentos (Local).

public class GestaoHospital {
    // VARIÁVEL DE CLASSE (Escopo Global/Classe)
    // Todos os métodos podem ver e alterar esta variável.
    static int stockOxigenio = 500;

    public static void main(String[] args) {
        int pedidoPaciente = 20; // LOCAL ao main

        usarOxigenio(pedidoPaciente);
        System.out.println("Stock atualizado no mural: " + stockOxigenio);
    }

    public static void usarOxigenio(int quantidade) {
        // 'quantidade' é LOCAL (parâmetro)
        // 'novaReserva' é LOCAL a este método
        int novaReserva = stockOxigenio - quantidade;

        stockOxigenio = novaReserva; // Altera a global

        if (stockOxigenio < 100) {
            String alerta = "CRÍTICO"; // LOCAL ao bloco IF
            System.out.println("Status: " + alerta);
        }
        // System.out.println(alerta); // ERRO! 'alerta' morreu ao fechar o IF.
    }
}
// O que aprendemos aqui:
// Abertura e Fecho: A variável alerta só existe dentro do if. Tentar usá-la
// fora resultaria num erro de compilação.
// Persistência: A variável stockOxigenio permanece "viva" mesmo depois de o
// método usarOxigenio terminar, porque ela pertence à classe, não ao método.
// Isolamento: O main não consegue ver a variável novaReserva. Para o main, o
// que acontece dentro de usarOxigenio é uma "caixa preta".