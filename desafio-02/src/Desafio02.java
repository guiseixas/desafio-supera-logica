import java.util.Locale;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        /*
        * A linha abaixo é usada para aceitar entradas no programa com ".". Caso a entrada dos casos de teste sejam com ","
        * por exemplo: 576,73, por favor comentar esta linha -> Locale.setDefault(Locale.US).
         */
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        double valorMonetario = scanner.nextDouble();

        int valorCentavos = (int) (valorMonetario * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidadeNotas = valorCentavos / nota;
            System.out.printf("%d nota(s) de R$ %.2f\n", quantidadeNotas, nota / 100.0);
            valorCentavos %= nota;
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidadeMoedas = valorCentavos / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidadeMoedas, moeda / 100.0);
            valorCentavos %= moeda;
        }
    }
}
