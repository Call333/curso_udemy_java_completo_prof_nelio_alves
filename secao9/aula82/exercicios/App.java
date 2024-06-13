package secao9.aula82.exercicios;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta01;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);

        if(resp == 'y'){
            System.out.print("Enter initial deposit value: ");
            conta01 = new Conta(number, titular, sc.nextDouble());
        }else{
            conta01 = new Conta(number, titular);
        }

        System.out.println();
        System.out.println("Account Data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", 
        conta01.getNumeroDaConta(), conta01.getTitular(), conta01.getSaldo());

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double deposito = sc.nextDouble();
        conta01.deposito(deposito);

        System.out.println();
        System.out.println("Update account Data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", 
        conta01.getNumeroDaConta(), conta01.getTitular(), conta01.getSaldo());

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double saque = sc.nextDouble();
        conta01.sacar(saque);

        System.out.println();
        System.out.println("Update account Data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", 
        conta01.getNumeroDaConta(), conta01.getTitular(), conta01.getSaldo());

        sc.close();

    }
}
