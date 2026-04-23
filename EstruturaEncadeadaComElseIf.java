public class EstruturaEncadeadaComElseIf {
    public static void main(String[] args) {
        // Aqui, as condições formam uma unidade lógica. O Java testa de cima para baixo
        // e, ao encontrar a primeira verdade, ignora o restante. Atenção à ordem:
        // começamos pelo mais grave.

        int oxigenacao = 85;

        if (oxigenacao < 90) {

            System.out.println("Status: Crítico"); // Executa este...

        } else if (oxigenacao < 95) {

            System.out.println("Status: Atenção"); // ...e ignora todo o resto.

        } else {

            System.out.println("Status: Normal");

        }

        // Resultado: Apenas "Status: Crítico" é exibido.
    }
}
