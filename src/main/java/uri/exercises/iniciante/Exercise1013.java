package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1013 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int valorA = entrada.nextInt();
        int valorB = entrada.nextInt();
        int valorC = entrada.nextInt();

        // Cálculo
        int maiorAB = (valorA + valorB + Math.abs(valorA - valorB)) / 2;

        if (maiorAB > valorC) {
            System.out.printf(Locale.US, "%d eh o maior\n", maiorAB);
        } else {
            System.out.printf(Locale.US, "%d eh o maior\n", valorC);
        }
    }

}
