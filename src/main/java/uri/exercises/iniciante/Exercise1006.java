package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1006 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double alunoNotaA = entrada.nextDouble();
        double alunoNotaB = entrada.nextDouble();
        double alunoNotaC = entrada.nextDouble();
        int pesoNotaA = 2;
        int pesoNotaB = 3;
        int pesoNotaC = 5;

        double media = ((alunoNotaA * pesoNotaA) + (alunoNotaB * pesoNotaB) + (alunoNotaC * pesoNotaC)) / (pesoNotaA + pesoNotaB + pesoNotaC);

        System.out.printf(Locale.US, "MEDIA = %.1f\n", media);
    }

}
