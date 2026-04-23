public class OpcoesCaixaEletronico {
    public static void main(String[] args) {
        int escolhaUsuario = 88; // O usuário apertou o botão "1" no painel

        switch (escolhaUsuario) {

            case 1:

                System.out.println("Iniciando módulo de SAQUE...");

                // Lógica de saque aqui

                break;

            case 2:

                System.out.println("Iniciando módulo de DEPÓSITO...");

                // Lógica de depósito aqui

                break;

            case 3:

                System.out.println("Gerando EXTRATO bancário...");

                // Lógica de extrato aqui

                break;

            default:

                System.out.println("Opção inválida. Tente novamente.");

                break;

        }

        // Respondendo às Perguntas Reflexivas:

        // Faixa de valores vs. Valores exatos: No banco, as opções são fixas e
        // discretas (1, 2 ou 3).
        // Não existe a opção "1,5" ou "entre 1 e 2". Portanto, usar valores exatos com
        // switch é tecnicamente mais limpo e evita erros de lógica que faixas poderiam
        // introduzir.

        // O perigo do break esquecido: Se você esquecesse o break no case 1 (Saque),
        // assim que o cliente terminasse de sacar o dinheiro, o sistema imprimiria
        // automaticamente o Extrato
        // (ou abriria a tela de depósito), pois o Java continuaria "escorrendo" para o
        // próximo caso. Isso seria uma falha grave de experiência do usuário (UX) e de
        // segurança.

        // Tipos de Dados Suportados

        // O switch não aceita qualquer tipo de variável. No Java, você pode usá-lo com:

        // 1. Tipos integrais: byte, short, char, int.

        // 2. Classes "embrulho" (Wrapper): Byte, Short, Character, Integer.

        // 3. Strings (desde o Java 7).

        // 4.Enums (tipos enumerados que estudaremos futuramente).

        // Atenção: Você não pode usar switch com números decimais (float ou double) ou
        // valores booleanos. Para esses casos, o if-else continua sendo a única opção.

        // Alguns cuidados tornam o uso do switch mais seguro, legível e fácil de
        // manter:

        // Sempre utilize o default: mesmo quando todos os casos parecem cobertos, o
        // default funciona como uma proteção contra entradas inesperadas e facilita o
        // processo de depuração (debug).

        // Mantenha os case curtos: se um case exigir muitas linhas de código, o ideal é
        // extrair essa lógica para um método separado e apenas chamá-lo dentro do
        // switch. Isso melhora a organização e a legibilidade do código.

    }

}
