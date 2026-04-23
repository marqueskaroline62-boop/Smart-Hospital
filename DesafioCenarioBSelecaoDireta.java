public class DesafioCenarioBSelecaoDireta {

    public static void main(String[] args) {

        int menuDeRecepção = 88;

        switch (menuDeRecepção) {

            case 1:
                System.out.println("Encaminhando para Emergência");
                break;

            case 2:
                System.out.println("Agendando Consulta de Rotina");
                break;

            case 3:
                System.out.println("Preparando Retirada de Exames");
                break;

            default:
                System.out.println("Opção inválida");
                break;

        }
    }
}