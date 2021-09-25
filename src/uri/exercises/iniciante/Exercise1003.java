package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1003 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int varA = entrada.nextInt();
        int varB = entrada.nextInt();

        int soma = varA + varB;

        System.out.printf("SOMA = %d\n", soma);
    }

}
