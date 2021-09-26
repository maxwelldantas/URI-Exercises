package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1005 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double alunoNotaA = entrada.nextDouble();
        double alunoNotaB = entrada.nextDouble();
        double pesoNotaA = 3.5;
        double pesoNotaB = 7.5;

        double media = ((alunoNotaA * pesoNotaA) + (alunoNotaB * pesoNotaB)) / (pesoNotaA + pesoNotaB);

        System.out.printf("MEDIA = %.5f\n", media);
    }

}
