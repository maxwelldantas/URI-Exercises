package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1035 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int valorA = entrada.nextInt();
        int valorB = entrada.nextInt();
        int valorC = entrada.nextInt();
        int valorD = entrada.nextInt();

        // Cálculos
        var somaCD = valorC + valorD;
        var somaAB = valorA + valorB;

        if (valorB > valorC && valorD > valorA && somaCD > somaAB && (Math.signum(valorC) > 0 && Math.signum(valorD) > 0) && (valorA % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }

}
