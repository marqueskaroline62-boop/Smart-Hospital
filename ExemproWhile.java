import java.util.Scanner;

public class ExemproWhile {
    public static void main(String[] args) {
        // Exemplo em etapas: laço como “trava de qualidade” (validação de entrada)
        // No exemplo abaixo queremos garantir que uma quantidade de amostras seja
        // positiva.

        // Abordagem com while (valida antes de seguir):

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe A Quantidade De Amostras (Maior Que Zero): ");
        int amostras = entrada.nextInt();

        while (amostras <= 0) {
            System.out.print("Valor Invalido. Digite Novamente: ");
            amostras = entrada.nextInt();

        }
        // Você está usando repetição para aumentar a confiabilidade do programa. Você
        // não está “repetindo por repetir”, você está garantindo regra.

        // “While statement: executes a statement repeatedly until an expression
        // evaluates to false.” (Oracle, Java Tutorials).
        // Essa definição formal reforça que o laço é guiado por uma condição e que a
        // segurança vem de planejar a condição e o que muda a cada ciclo. Em um sistema
        // real, isso significa: se nada muda dentro do laço, a condição pode nunca
        // mudar e o programa pode travar em loop infinito.
    }
}
