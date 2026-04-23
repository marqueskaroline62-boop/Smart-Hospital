public class AprendizagemSwitch {

    public static void main(String[] args) {
        // Para este exercício final, vamos testar sua capacidade de identificar falhas
        // de fluxo. Analise o código abaixo, que simula a escolha de um plano de saúde
        // para um paciente, e responda ao desafio.

        // int planoPaciente = 1; // 1: Básico, 2: VIP

        // switch (planoPaciente) {
        // case 1:
        // System.out.println("Plano Básico: Acomodação em Enfermaria.");
        // case 2:
        // System.out.println("Plano VIP: Acomodação em Quarto Privativo.");
        // break;
        // default:
        // System.out.println("Plano não identificado.");
        // }

        // Seu Desafio:

        // O que será impresso no console ao executar este código com planoPaciente = 1?
        // Resposta: Serão exibidas duas mensagens devido ao efeito de queda
        // (fall-through).

        // Qual é o erro técnico presente no case 1 e como ele afeta a experiência do
        // paciente?
        // Resposta: a falta do break, o usuário ficará confuso pois não espera o
        // resultado de dois planos diferentes

        // Corrija o trecho de código para que cada plano exiba apenas a sua respectiva
        // acomodação.
        // Resposta:

        int planoPaciente = 1; // 1: Básico, 2: VIP

        switch (planoPaciente) {

            case 1:
                System.out.println("Plano Básico: Acomodação em Enfermaria.");
                break;

            case 2:
                System.out.println("Plano VIP: Acomodação em Quarto Privativo.");
                break;

            default:
                System.out.println("Plano não identificado.");
        }

    }
}