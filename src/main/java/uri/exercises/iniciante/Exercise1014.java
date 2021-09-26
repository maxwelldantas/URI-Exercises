package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1014 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int distanciaTotalPercorrida = entrada.nextInt();
        double totalCombustivelGasto = entrada.nextDouble();

        // Cálculo
        double consumoMedio = distanciaTotalPercorrida / totalCombustivelGasto;

        System.out.printf(Locale.US, "%.3f km/l\n", consumoMedio);
    }

}
