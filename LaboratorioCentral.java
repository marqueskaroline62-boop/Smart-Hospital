public class LaboratorioCentral {

    public static void main(String[] args) {
        double tempFahrenheit = 100.0;

        // A mágica acontece aqui: a chamada do método SE TORNA o valor
        double tempCelsius = converterParaCelsius(tempFahrenheit);

        System.out.println("A temperatura processada é: " + tempCelsius + "°C");

        if (tempCelsius > 37.5) {
            System.out.println("ALERTA: Paciente com febre!");
        }
    }

    // Trocamos 'void' por 'double' (Promessa de retorno)
    public static double converterParaCelsius(double fahrenheit) {
        double resultado = (fahrenheit - 32) * 5.0 / 9.0;
        return resultado; // Entrega o produto final e encerra o método
    }
}