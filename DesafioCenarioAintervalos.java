public class DesafioCenarioAintervalos {
    public static void main(String[] args) {

        int pulsacao = 101;

        if (pulsacao < 60) {
            System.out.println("Braquicardia");
        }

        else if (pulsacao <= 100) {
            System.out.println("Normal");

        } else {
            System.out.println("Taquicardia");
        }
    }
}
