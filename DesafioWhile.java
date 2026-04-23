import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe A Quantidade De Amostras (Maior Que Zero): ");
        int amostras = entrada.nextInt();

        while (amostras <= 0) {
            System.out.print("Valor Invalido. Digite Novamente: ");
            amostras = entrada.nextInt();

        }
    }
}