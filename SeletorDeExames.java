public class SeletorDeExames {
    public static void main(String[] args) {

        int opcaoExame = 88; // Simulação de uma escolha no painel

        switch (opcaoExame) {

            case 1:

                System.out.println("Procedimento: Registrar Hemograma");

                System.out.println("Status: Aguardando coleta.");

                break;

            case 2:

                System.out.println("Procedimento: Agendar Raio-X");

                System.out.println("Status: Sala de imagem disponível.");

                break;

            case 3:

                System.out.println("Procedimento: Solicitar Tomografia");

                System.out.println("Status: Requer jejum de 4 horas.");

                break;

            default:

                System.out.println("Erro: Código de exame não identificado.");

                System.out.println("Por favor, selecione uma opção de 1 a 3.");

                break;

        }
    }
}
