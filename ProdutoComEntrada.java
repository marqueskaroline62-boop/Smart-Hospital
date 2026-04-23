import java.util.Scanner;

public class ProdutoComEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
         System.out.println("Digite o primeiro número: ");
         int n1 = sc.nextInt();
         
         System.out.println("Digite o segundo número: ");
         int n2 = sc.nextInt();

         int produto = n1 * n2;

         System.out.println("O produto é: " + produto);
     
         sc.close();
     }
}
//Criei um programa Java chamado ProdutoComEntrada.java que lê dois numeros
//inteiros digitados pelo usuario e calcula o produto entre eles
// compilei com o comando javac ProdutoComEntrada.java 
// e executei com o comando java ProdutoComEntrada
//Compilar é criar um arquivo executável .class, enquanto executar é rodar
//esse arquivo para mostrar um resultado no console.
// Digite o primeiro número: 10
// Digite o segundo número: 10
// O produto é: 100