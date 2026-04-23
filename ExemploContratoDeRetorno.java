public class ExemploContratoDeRetorno {

    public static void main(String[] args) {
        boolean resultado = ehEmergencia(130);
        System.out.println(resultado);
    }

    public static boolean ehEmergencia(int frequencia) {
        if (frequencia > 120) {
            return true;
        } else {
            return false;
        }
    }
}