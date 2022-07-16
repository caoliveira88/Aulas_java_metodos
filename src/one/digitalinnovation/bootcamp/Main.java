package one.digitalinnovation.bootcamp;

// Classe principal dos exercícios da Aula 1 de Métodos.

public class Main {

    public static void main(String[] args) {

        //Calculos
        System.out.println("Exercícios calculadora");
        Calculos.soma(3, 6);
        Calculos.subtracao(9, 8);
        Calculos.multiplicacao(2, 2);
        Calculos.divisao(8, 4);

        //Mensagem
        System.out.println("Exercícios mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(21);
        Mensagem.obterMensagem(1);
    }
}
