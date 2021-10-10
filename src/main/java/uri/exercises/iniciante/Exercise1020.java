package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
 * <p>
 * Obs.: apenas para facilitar o cálculo, considere qualquer ano com 365 dias e qualquer mês com 30 dias.
 * Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
 * Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
 * <p>
 * Entrada
 * <p>
 * O arquivo de entrada contém um valor inteiro.
 * <p>
 * Saída
 * <p>
 * Imprima a saída conforme exemplo fornecido.
 *
 * <tr>
 * <td style='padding-right: 20px'>Exemplo de Entrada</td>
 * <td>Exemplo de Saída</td>
 * </tr>
 * <tr>
 * <td>400</td>
 * <td>
 * 1 ano(s)
 * 1 mes(es)
 * 5 dia(s)
 * </td>
 * </tr>
 * <tr>
 * <td>800</td>
 * <td>
 * 2 ano(s)
 * 2 mes(es)
 * 10 dia(s)
 * </td>
 * </tr>
 * <tr>
 * <td>30</td>
 * <td>
 * 0 ano(s)
 * 1 mes(es)
 * 0 dia(s)
 * </td>
 * </tr>
 */
public class Exercise1020 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int idadePessoa = entrada.nextInt();
        int ano = 365;
        int mes = 30;

        // Cálculo
        int idadeAnos = idadePessoa / ano;
        int idadeMeses = (idadePessoa - (ano * idadeAnos)) / mes;
        int idadeDias = ((idadePessoa - (ano * idadeAnos)) - (mes * idadeMeses));

        System.out.println(idadeAnos + " ano(s)");
        System.out.println(idadeMeses + " mes(es)");
        System.out.println(idadeDias + " dia(s)");
    }
}
