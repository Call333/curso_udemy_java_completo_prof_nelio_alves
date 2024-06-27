
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Students> students = new LinkedHashSet<>();

        System.out.print("How many students for course A? ");
        int nA = sc.nextInt();  

        for (int i = 0; i < nA; i++) {
            int userNumber = sc.nextInt();
            students.add(new Students(userNumber));
        }

        System.out.print("How many students for course B? ");
        int nB = sc.nextInt();

        for (int i = 0; i < nB; i++) {
            int userNumber = sc.nextInt();
            students.add(new Students(userNumber));
        }

        System.out.print("How many students for course C? ");
        int nC = sc.nextInt();

        for (int i = 0; i < nC; i++) {
            int userNumber = sc.nextInt();
            students.add(new Students(userNumber));
        }
        
        int qtdStudents = 0;
        for (Students stdu : students) {
            if(stdu.equals(stdu)){
                qtdStudents += 1;
            }
        }
        System.out.print("Total students: " + qtdStudents);

        sc.close();
    }
}