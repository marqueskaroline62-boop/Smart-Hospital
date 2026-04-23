//input: nota1, nota2, nota3
//process: media final= nota1/nota2/nota3
//output: media final
//teste 1:
//entrada: 10, 10, 10
//resultado esperado: média = 10.00
//teste 2: 
//entrada: 7, 8.5, 6
//resultado esperado: média = 7.17 (aproximado)

import java.util.Locale;
import java.util.Scanner;

public class CalculoDeMediaEevidencia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner (System.in);

        System.out.println("Qual a primeira nota?");
        double nota1 = leitor.nextDouble();

        System.out.println("Qual a segunda nota?");
        double nota2 = leitor.nextDouble();

        System.out.println("Qual a terceira nota?");
        double nota3 = leitor.nextDouble();

        double calculoMediaSimples;

        double soma = nota1 + nota2 + nota3;
        calculoMediaSimples = soma / 3;

        System.out.printf("A média simples é: %.0f\n", calculoMediaSimples);
        System.out.printf("A média final é: %.2f\n", calculoMediaSimples);
    
        leitor.close();


    }
    
}
