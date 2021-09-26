package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1012 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double valorA = entrada.nextDouble();
        double valorB = entrada.nextDouble();
        double valorC = entrada.nextDouble();

        double pi = 3.14159;

        // Cálculos
        double areaDoTrianguloRetangulo = (valorA * valorC) / 2;
        double areaDoCirculo = pi * Math.pow(valorC, 2);
        double areaDoTrapezio = ((valorA + valorB) * valorC) / 2;
        double areaDoQuadrado = Math.pow(valorB, 2);
        double areaDoRetangulo = valorA * valorB;

        System.out.printf(Locale.US, "TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",
                areaDoTrianguloRetangulo, areaDoCirculo, areaDoTrapezio, areaDoQuadrado, areaDoRetangulo);
    }

}
