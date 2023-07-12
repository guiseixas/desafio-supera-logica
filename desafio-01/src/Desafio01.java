import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        ArrayList<Integer> valoresPares = new ArrayList<Integer>();
        ArrayList<Integer> valoresImpares = new ArrayList<Integer>();

        for(int i = 0; i < N; i++){
            int valor = scanner.nextInt();
            inputs.add(valor);

            if(inputs.get(i) % 2 == 0){
                valoresPares.add(inputs.get(i));
            }else{
                valoresImpares.add(inputs.get(i));
            }
        }

        Collections.sort(valoresPares);
        Collections.sort(valoresImpares, Collections.reverseOrder());

        for(int valorPar : valoresPares){
            System.out.println(valorPar);
        }

        for(int valorImpar : valoresImpares){
            System.out.println(valorImpar);
        }
    }
}
