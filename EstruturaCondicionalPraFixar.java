public class EstruturaCondicionalPraFixar {
    public static void main(String[] args) {

        int oxigenacao = 93;

        if (oxigenacao < 90) {
            // Caso 1: Extremo/Urgente
            System.out.println("ALERTA VERMELHO: Intervenção Imediata!");

        } else if (oxigenacao <= 93) {
            // Caso 2: Intermediário
            System.out.println("ALERTA AMARELO: Monitoramento Intensivo.");

        } else {
            // Caso 3: Padrão/Seguro
            System.out.println("STATUS VERDE: Paciente Estável.");
        }
    }

} // Isso é encadeamento, triagem.
