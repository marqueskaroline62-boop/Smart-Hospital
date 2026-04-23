public class PotenciaDoArCondicionado {
    public static void main(String[] args) {

        int tempAtual = 22;

        int tempAlvo = 22;

        int diferenca = tempAtual - tempAlvo;

        if (diferenca > 5) {
            System.out.println("Modo: Potência Máxima (Turbo)");

        } else if (diferenca > 0) {
            System.out.println("Modo: Potência Econômica");

        } else {
            System.out.println("Modo: Manter Temperatura / Ventilar");

        }
    }
}
