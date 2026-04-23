
import java.util.Scanner;

public class padraoProfissional1validacaoDeFaixaIntervalo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Padrão profissional 1: validação de faixa (intervalo)
        // Exemplo: pH deve estar entre 0 e 14.

        double ph;

        do {
            System.out.print("Informe O pH (Entre 0 E 14): ");
            ph = entrada.nextDouble();
        } while (ph < 0 || ph > 14);

        System.out.println("pH Valido: " + ph);
        // Aqui você já vê uma habilidade que será usada muito: construir condições
        // compostas (|| e &&) para validar regras de negócio.
    }
}
