package topico_5;

//Essa linha abaixo cria uma classe chamada HelloWorld. Uma classe é uma “caixa” que organiza o seu código. 
// Neste começo, você pode pensar que a classe é o “nome do programa”.
public class HelloWorld { 
//Essa linha abaixo cria o método main, que é o ponto de entrada do programa. Isso significa que o Java começa a executar o seu programa a partir daqui.
//A palavra public indica que esse método pode ser acessado de fora. A palavra static permite que o Java execute esse método sem precisar criar um 
// objeto da classe. A palavra void indica que o método não devolve um valor de retorno.
//O trecho String[] args representa argumentos que poderiam ser passados pela linha de comando, e você vai ver isso mais adiante no curso.
    public static void main(String[] args) {
//Essa linha abaixo imprime um texto no console. System.out representa a saída padrão (o console). println imprime e pula uma linha no final.
//As aspas indicam que "Hello, World!" é um texto (uma string).
        System.out.println("Hello, World!");
        System.out.println("bundia");
        

    }

} //Essas chaves fecham o método main e depois fecham a classe. Uma regra prática é: cada { precisa ter um } correspondente.

//---------------------------------------------------------------------------------------------------------------------------

//Compilar: Na pasta onde está o arquivo HelloWorld.java, execute: javac HelloWorld.java
//Se tudo der certo, esse comando cria um arquivo chamado HelloWorld.class na mesma pasta. Esse arquivo .class é o resultado da compilação 
// e é o que a JVM executa.
// Executar: java HelloWorld
// Você não coloca .java aqui, porque você está rodando a classe compilada. java topico_5.HelloWorld