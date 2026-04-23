import java.util.Scanner;

public class whileValidacaoExistente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // while para validação com leitura já existente
        // O padrão mais comum com while é: você lê uma vez, testa, e repete enquanto
        // estiver inválido.

        System.out.print("Informe A Quantidade De Amostras (Maior Que Zero): ");
        int amostras = entrada.nextInt();

        while (amostras <= 0) {
            System.out.print("Valor Invalido. Digite Novamente: ");
            amostras = entrada.nextInt();
        }
        // Esse padrão é importante porque ele deixa clara a regra: “não avanço enquanto
        // não ficar correto”. Ele também reforça o ponto de segurança: a variável
        // precisa ser atualizada dentro do laço.
    }
}
