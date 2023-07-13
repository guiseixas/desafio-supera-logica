import java.util.Scanner;

import static java.lang.Math.abs;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        int contador = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(abs(array[i] - array[j]) == k){ //Retorno do valor absoluto na diferença array[i] - array[j] função abs
                    contador++;
                }
            }
        }

        System.out.println(contador);
    }
}
