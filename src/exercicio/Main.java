package exercicio;

import exercicio.entitie.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno[] vect = new Aluno[10];

        System.out.print("Quantos quartos serão utilizados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Quarto alugado #" + i + ":");
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("E-mail: ");
            String email = sc.next();
            System.out.println("Quarto: ");
            int numeroQuarto = sc.nextInt();
            vect[numeroQuarto] = new Aluno(nome, email);
        }

        System.out.println();
        System.out.println("Quartos alugados: ");
        for (int i = 0; i<10; i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i].toString());
            }
        }
        sc.close();
    }
}
