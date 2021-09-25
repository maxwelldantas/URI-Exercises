package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1015 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();

        // Cálculos
        double distancia = Math.sqrt((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));

        System.out.printf(Locale.US, "%.4f\n", distancia);
    }

}
