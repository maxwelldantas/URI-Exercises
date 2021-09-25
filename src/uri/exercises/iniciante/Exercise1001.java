package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1001 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int varA = entrada.nextInt();
        int varB = entrada.nextInt();

        int x = varA + varB;

        System.out.printf("X = %d\n", x);
    }

}
