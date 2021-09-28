package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1016 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int distanciaKm = entrada.nextInt();

        // Cálculos
        int distancia = distanciaKm * 2;

        System.out.printf(Locale.US, "%d minutos\n", distancia);
    }

}
