public class Main {
    public static void main(String[]args) {
       //CASO 1
        boolean premium = true;
        double valor = 200.0;
        calcularDesconto(premium, valor);

        //CASO 2
        premium = false;
        valor = 200.0;
        calcularDesconto(premium, valor);

        //CASO 3 
        premium = true;
        valor = 199.99;
        calcularDesconto(premium, valor);
 }
         public static void calcularDesconto(boolean premium, double valor) {
          double percentual = 0;
         if (valor >= 200) {
         if (premium) {
            percentual = 0.15;
        } else {
            percentual= 0.05;
        }
    }

double desconto = valor * percentual;
double valorFinal = valor - desconto;

System.out.println ("Valor original: " + valor);
System.out.println ("Cliente premium: " + premium);
System.out.println ("Percentual aplicado: " + (percentual*100) + "%");
System.out.println ("Valor final: " + valorFinal);

//Como vc garante que não tem erro lógico?
//por ter tabela de decisão
//por ter casos de teste
//por ter código organizado

//isso evita erro tipo: esquecer um caso, aplicar desconto errado e inverter condilç

//R: Para evitar erros de lógica, organizei uma tabela de decisão com todos
//os cenários possíveis, e realizei testes incluindo o valor maior, igual 
// ou menor que 200, para diferentes tipos de cliente. O resultado tem base
// nessas regras garantindo que cada condição fosse realizada de forma 
//correta e válida no console
//
}
}
