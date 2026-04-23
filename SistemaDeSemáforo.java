public class SistemaDeSemáforo {
    public static void main(String[] args) {

        String cor = "Verde";

        if (cor.equals("Vermelho")) {
            System.out.println("Ação: Pare Imediatamente.");

        } else if (cor.equals("Amarelo")) {
            System.out.println("Ação: Atenção, Reduza a Velocidade.");

        } else {
            System.out.println("Ação: Prossiga com Segurança.");

        }
    }
}
