package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1017 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int tempoGastoViagem = entrada.nextInt();
        int velocidadeMediaDuranteViagem = entrada.nextInt();
        double kmPorLitro = 12.000;

        // Cálculo
        double quantidadeLitrosViagem = (tempoGastoViagem * velocidadeMediaDuranteViagem) / kmPorLitro;

        System.out.printf(Locale.US, "%.3f\n", quantidadeLitrosViagem);
    }

}
