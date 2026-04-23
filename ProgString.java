import java.util.Scanner;

public class ProgString {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String texto, palavra;

        System.out.println("Digite algum texto");
        texto = leitor.nextLine();
        texto = texto.toUpperCase();

        System.out.println("Digite uma palavra");
        palavra = leitor.nextLine();
        palavra = palavra.toUpperCase();

        texto = texto.replace("JAVA", palavra);
        System.out.println("O texto está contendo: " + texto);

        leitor.close();
    }
    
}
