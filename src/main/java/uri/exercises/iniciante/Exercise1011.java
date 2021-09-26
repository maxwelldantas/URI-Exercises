package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1011 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double pi = 3.14159;
        double raio = entrada.nextDouble();

        double volume = ((4 / 3.0) * pi * Math.pow(raio, 3));

        System.out.printf(Locale.US, "VOLUME = %.3f\n", volume);
    }

}
