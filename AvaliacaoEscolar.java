public class AvaliacaoEscolar {
    public static void main(String[] args) {

        // Aqui, a ordem decrescente (do maior para o menor) evita que um aluno com nota
        // 9 caia acidentalmente na recuperação.

        double nota = 4;

        if (nota >= 7.0) {
            System.out.println("Resultado: Aprovado");

        } else if (nota >= 5.0) {
            System.out.println("Resultado: Recuperação");

        } else {
            System.out.println("Resultado: Reprovado");

        }
    }

}