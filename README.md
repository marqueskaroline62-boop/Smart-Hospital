public class CalculadoraClinica {

    public static void main(String[] args) {
        try {
            double pesoPaciente = 50;
            double alturaPaciente = 1.80;

            double imcFinal = calcularIMC(pesoPaciente, alturaPaciente);
            System.out.printf("O IMC do paciente é: %.2f%n", imcFinal);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static double calcularIMC(double peso, double altura) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero");
        }
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero");
        }

        return peso / (altura * altura);
    }
}
