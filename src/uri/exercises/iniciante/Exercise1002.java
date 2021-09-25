package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1002 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double pi = 3.14159;
        double raio = entrada.nextDouble();

        double area = (pi * Math.pow(raio, 2));

        System.out.printf(Locale.US, "A=%.4f\n", area);
    }

}
