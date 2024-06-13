package secao9.aula94;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Alugador[] quartos = new Alugador[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.printf("Rent #%d: %n", i + 1);
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int quarto = sc.nextInt();
            sc.nextLine();
            if(quartos[quarto] == null){
                quartos[quarto] = new Alugador(nome, email, quarto);
            }
        }
        System.out.println("Busy Rooms:");
        for (int i = 0; i < quartos.length; i++) {
            if(quartos[i] != null){
                System.out.printf("%d: %s %n", i, quartos[i]);
            }
        }

        sc.close();

    }
}
