package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1018 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int valor = entrada.nextInt();

        if (0 < valor && valor < 1000000) {
            System.out.println(valor);
            int valor100 = valor / 100;
            System.out.printf("%d nota(s) de R$ 100,00\n", valor100);
            int valor50 = (valor - valor100 * 100) / 50;
            System.out.printf("%d nota(s) de R$ 50,00\n", valor50);
            int valor20 = (valor - (valor100 * 100 + valor50 * 50)) / 20;
            System.out.printf("%d nota(s) de R$ 20,00\n", valor20);
            int valor10 = (valor - (valor100 * 100 + valor50 * 50 + valor20 * 20)) / 10;
            System.out.printf("%d nota(s) de R$ 10,00\n", valor10);
            int valor5 = (valor - (valor100 * 100 + valor50 * 50 + valor20 * 20 + valor10 * 10)) / 5;
            System.out.printf("%d nota(s) de R$ 5,00\n", valor5);
            int valor2 = (valor - (valor100 * 100 + valor50 * 50 + valor20 * 20 + valor10 * 10 + valor5 * 5)) / 2;
            System.out.printf("%d nota(s) de R$ 2,00\n", valor2);
            int valor1 = (valor - (valor100 * 100 + valor50 * 50 + valor20 * 20 + valor10 * 10 + valor5 * 5 + valor2 * 2)) / 1;
            System.out.printf("%d nota(s) de R$ 1,00\n", valor1);
        }
    }

}
