package ej209;

public class Main {

    public static void main(String[] args) {

        int objetivo = 3;

        // monedas[0] = monedas de 1
        // monedas[1] = monedas de 2
        // monedas[2] = monedas de 5
        int[] monedas = {3, 1, 0};

        int resultado = Cambio.contarFormasCambio(objetivo, monedas);

        System.out.println("Número de formas: " + resultado);
    }
}