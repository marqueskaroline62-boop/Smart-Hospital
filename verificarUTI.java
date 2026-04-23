
// Verificação de Aprendizagem
// Desafio de Código Mental: Analise o código abaixo. O compilador Java vai
// acusar um erro de compilação. Consegue identificar em qual linha e porquê?

// public static void verificarUTI(int pacientes) {
// if (pacientes > 10) {
// String mensagem = "UTI Lotada!";
// }
// System.out.println(mensagem);
// }

// Feedback Detalhado
// O erro ocorre na linha System.out.println(mensagem);.

// A Razão: A variável mensagem foi declarada dentro das chaves do bloco if.

// A Fronteira: O escopo dela está restrito a esse bloco. Para o código que está
// fora (mesmo que ainda esteja dentro do método), a variável mensagem
// simplesmente não existe.

// A Solução: Para funcionar, a variável teria de ser declarada antes do if,
// permitindo que o bloco interno a modificasse e o código externo a lesse.
public class verificarUTI {

    public static void main(String[] args) {
        verificarUTI(12); // chamada do método
    }

    public static void verificarUTI(int pacientes) {
        String mensagem;

        if (pacientes > 10) {
            mensagem = "UTI Lotada!";
        } else {
            mensagem = "UTI disponível";
        }

        System.out.println(mensagem);
    }
}