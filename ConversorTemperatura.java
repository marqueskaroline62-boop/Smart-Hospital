//input: Celsius
//process: F = C * 9/5 + 32.
//output: ler em Celsius, ler temperatura em Fahrenheit.
//teste 1:
//entrada: C = 0
//resultado esperado: F = 32.00
//teste 2: 
//entrada:C = 25
//resultado esperado: F = 77.00

import java.util.Locale;
import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Conversor Celsius Para Fahrenheit ===");
        System.out.print("Informe A Temperatura Em Celsius: ");
        double celsius = entrada.nextDouble();

        // Complete o processamento:
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperatura Em Fahrenheit: " + String.format("%.2f", fahrenheit));

        entrada.close();
    }
}
