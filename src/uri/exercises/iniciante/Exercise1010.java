package uri.exercises.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2,
 * o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 * <p>
 * Entrada
 * O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.
 * <p>
 * Saída
 * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
 * O valor deverá ser apresentado com 2 casas após o ponto.
 * <p>
 * Exemplos de Entrada
 * <br>
 * 12 1 5.30 <br>
 * 16 2 5.10
 * <p>
 * Exemplos de Saída
 * <br>
 * VALOR A PAGAR: R$ 15.50
 */
public class Exercise1010 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int codigoPeca1 = entrada.nextInt();
        int numeroPecas1 = entrada.nextInt();
        double valorUnitarioPeca1 = entrada.nextDouble();

        int codigoPeca2 = entrada.nextInt();
        int numeroPecas2 = entrada.nextInt();
        double valorUnitarioPeca2 = entrada.nextDouble();

        double valorParaPagar = (numeroPecas1 * valorUnitarioPeca1) + (numeroPecas2 * valorUnitarioPeca2);

        System.out.printf(Locale.US, "VALOR A PAGAR: R$ %.2f\n", valorParaPagar);
    }

}
