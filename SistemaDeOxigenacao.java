public class SistemaDeOxigenacao {
    public static void main(String[] args) {
        
    int oxigenacao = 92; // Valor simulado do sensor

if (oxigenacao < 92) {

    // Bloco de emergência: Protegido pelas chaves

    System.out.println("ALERTA: Oxigenação em "  + "oxigenação " + "%");

    System.out.println("Status: Crítico - Acionar equipe.");

} else {

    // Bloco de normalidade: O sistema não fica “mudo”

    System.out.println("Status: Estável - Oxigenação em " + oxigenacao + "%");

    System.out.println("Monitoramento prossegue normalmente.");

}
}}
