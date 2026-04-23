public class MultiplosIfSemEncadeamento {
    public static void main(String[] args) {
        // Neste modelo, cada if é independente. Se o paciente estiver com 85% de
        // oxigenação (Estado Crítico), ele atende a todas as condições simultaneamente.

        int oxigenacao = 85;

        if (oxigenacao < 95) {

            System.out.println("Nível: Atenção"); // Será executado

        }

        if (oxigenacao < 92) {

            System.out.println("Nível: Alerta"); // Também será executado

        }

        if (oxigenacao < 90) {

            System.out.println("Nível: Crítico"); // Também será executado

        }

        // Resultado: O sistema dispararia 3 alertas diferentes ao mesmo tempo.
    }

}
