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

        //Sobrecarga - Calculo quadrilátero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5, 5);
        Quadrilatero.area(7, 8, 9);

        //Retornos
        System.out.println("Exercícios retornos");

        double areaQuadrado = Retorno.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Retorno.area(5, 5);
        System.out.println("Área do retangulo: " + areaRetangulo);

        double areaTrapezio = Retorno.area(7, 8, 9);
        System.out.println("Área do trapezio: " + areaTrapezio);

    }
}
