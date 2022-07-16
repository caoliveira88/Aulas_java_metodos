package one.digitalinnovation.bootcamp;

// Classe de exemplo para exercícios da Aula 1 sobre metodos (com 2 parametros)

public class Calculos {

    public static void soma(int numero1, int numero2) {

        int resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subtracao(int numero1, int numero2) {

        int resultado = numero1 - numero2;

        System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(int numero1, int numero2) {

        int resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void divisao(int numero1, int numero2) {

        int resultado = numero1 / numero2;

        System.out.println("A divisao de " + numero1 + " por " + numero2 + " é " + resultado);
    }

}
