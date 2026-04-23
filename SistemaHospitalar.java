// Passo 1
// Localização
// Identifique o final do método main. Você deve escrever seu novo método após a chave de fechamento do main, mas antes da chave de fechamento da class.

// Passo 2
// Definição da Assinatura
// Começamos com public static. Como este método apenas exibirá uma mensagem na tela e não devolverá nenhum número para cálculo, o tipo de retorno será void (vazio). 
// Daremos o nome de exibirAlerta.

// Escrita do Corpo
// Dentro das chaves { }, colocamos a lógica que queremos isolar.

public class SistemaHospitalar {

    public static void main(String[] args) {

        // O main apenas "chama" o método pelo nome

        exibirAlerta();

        System.out.println("Monitorando sinais...");

        exibirAlerta();

    }

    // Declaração do método fora do main

    public static void exibirAlerta() {

        System.out.println("--- ALERTA DE SEGURANÇA ---");

        System.out.println("Verificar integridade do sensor!");

    }

}
