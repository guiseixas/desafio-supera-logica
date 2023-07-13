import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        StringBuilder resultadoFinal = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String linha = scanner.nextLine();
            StringBuilder primeiraMetade = new StringBuilder(linha.substring(0, linha.length() / 2));
            StringBuilder segundaMetade  = new StringBuilder(linha.substring(linha.length() / 2));
            primeiraMetade.reverse();
            segundaMetade .reverse();
            resultadoFinal.append(primeiraMetade).append(segundaMetade );

            //Evitar excesso de quebra de linha
            if (i != N - 1) {
                resultadoFinal.append("\n");
            }
        }

        System.out.println(resultadoFinal.toString());
    }
}
