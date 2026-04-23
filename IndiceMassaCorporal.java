import java.util.Scanner;

public class IndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Digite seu peso");
        peso = leitor.nextDouble();

         System.out.println("Digite sua altura");
         altura = leitor.nextDouble();

         imc = peso / (altura*altura);
         System.out.printf("O seu IMC é: %.2f", imc);
    


        leitor.close();
    }
    
}
