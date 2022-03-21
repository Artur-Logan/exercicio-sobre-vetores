package vetores.exemplo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        //esse é a melhor forma de se ler um vetor...
        for (int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i<n; i++){
            soma += vect[i];
        }
        double media = soma / n;

        System.out.printf("Media dos resultados: %.2f%n", media);

        sc.close();
    }
}