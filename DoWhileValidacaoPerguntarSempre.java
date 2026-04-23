import java.util.Scanner;

public class DoWhileValidacaoPerguntarSempre {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // do-while para validação com “perguntar sempre”
        // O padrão com do-while é: você pede e lê dentro do bloco, e só depois valida.

        int amostras;

        do {
            System.out.print("Informe A Quantidade De Amostras (Maior Que Zero): ");
            amostras = entrada.nextInt();
        } while (amostras <= 0);
        // Esse modelo é útil quando você quer evitar “código duplicado”, porque o
        // pedido ao usuário fica apenas uma vez dentro do laço. Ele também ajuda quando
        // o fluxo natural é: perguntar → ler → verificar.
    }
}
