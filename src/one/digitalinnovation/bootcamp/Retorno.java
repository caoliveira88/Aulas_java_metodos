package one.digitalinnovation.bootcamp;

// Classe de exemplo da Aula 3 para exercícios sobre Métodos. (Retorno)

public class Retorno {

    public static double area( double lado) {

        return lado * lado;

    }

    public static double area( double lado1, double lado2) {

        return lado1 * lado1;
    }

    public static double area( double baseMaior, double baseMenor, double altura) {

        return ((baseMaior+baseMenor)*altura) / 2;
    }
}
