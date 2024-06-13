package secao8.aulasetenta.exercicios.tres;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student st01 = new Student();

        st01.nome = sc.nextLine();
        st01.nota1 = sc.nextInt();
        st01.nota2 = sc.nextInt();
        st01.nota3 = sc.nextInt();

        System.out.printf("FINAL GRADE = %.2f%n", st01.notaFinal());

        if (st01.aprovedOrNot(st01.notaFinal()) == true) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", (60 - st01.notaFinal()));
        }

        sc.close();
    }
}
