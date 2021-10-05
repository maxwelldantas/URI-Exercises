package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1019 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int duracaoEmSegundos = entrada.nextInt();

        // Cálculos
        int segundos = duracaoEmSegundos % 60;
        int horas = duracaoEmSegundos / 3600;
        int minutos = (duracaoEmSegundos - (horas * 3600)) / 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

    }

}
