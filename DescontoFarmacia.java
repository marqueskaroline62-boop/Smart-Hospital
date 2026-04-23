public class DescontoFarmacia {
    public static void main(String[] args) {

        double valorCompra = 500; // Exemplo de entrada

        double valorFinal;

        if (valorCompra >= 500.0) {

            valorFinal = valorCompra * 0.80;

            System.out.println("Desconto de 20% aplicado. R$" + valorFinal);

        } else if (valorCompra >= 200.0) {

            valorFinal = valorCompra * 0.90;

            System.out.println("Desconto de 10% aplicado. R$ " + valorFinal);

        } else {

            valorFinal = valorCompra;

            System.out.println("Sem desconto disponível. R$ " + valorFinal);

        }
    }
}
// System.out.println("Valor a pagar: R$ " + valorFinal);

// Por que esta é a solução correta?

// Ordem de Precedência: Começamos pelo maior valor (500.0). Se começássemos
// pelo 200.0, uma compra de 600.0 entraria no bloco de 10% e o Java encerraria
// a execução, prejudicando o cliente.

// Exclusão Mútua: O uso do else if garante que o sistema não tente aplicar dois
// descontos diferentes à mesma compra.

// Abrangência: O else final captura todos os casos residuais (compras de 0 a
// 199.99), garantindo que a variável valorFinal sempre receba um valor,
// evitando erros de compilação.