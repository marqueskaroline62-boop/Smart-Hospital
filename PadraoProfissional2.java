import java.util.Scanner;

public class PadraoProfissional2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Padrão profissional 2: tentativas limitadas (evitar abuso e travamentos)
        // Em sistemas reais, muitas vezes você não quer repetir “para sempre”. Você
        // quer limitar tentativas por segurança e experiência do usuário.

        // Exemplo: pedir uma senha com no máximo 3 tentativas.

        final int maxTentativas = 3;
        int tentativas = 0;
        boolean autenticado = false;

        while (tentativas < maxTentativas && !autenticado) {
            System.out.print("Digite A Senha: ");
            String senha = entrada.next();

            if (senha.equals("java123")) {
                autenticado = true;
            } else {
                System.out.println("Senha Incorreta.");
            }

            tentativas++;
        }

        if (autenticado) {
            System.out.println("Acesso Liberado.");
        } else {
            System.out.println("Acesso Bloqueado Por Excesso De Tentativas.");
        }
        // Esse exemplo mostra um ponto essencial: laços não são só repetição, são
        // controle de fluxo com critério. Você usa variáveis de estado (autenticado)
        // para guiar a repetição.
    }
}
