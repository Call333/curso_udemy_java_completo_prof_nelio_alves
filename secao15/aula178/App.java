package secao15.aula178;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import secao15.aula178.Classes.Conta;
import secao15.aula178.Classes.ExecptionDeConta;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Insira os dados da conta: ");
            System.out.print("Numero: ");
            Integer numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Titular: ");
            String titular = sc.nextLine();
            System.out.print("Saldo inicial: ");
            Double saldoInicial = sc.nextDouble();
            System.out.print("Saque Limite: ");
            Double saqueLimite = sc.nextDouble();

            Conta conta = new Conta(numero, titular, saldoInicial, saqueLimite);
            System.out.println();
            System.out.print("Insira o valor para saque: ");
            Double saque = sc.nextDouble();

            conta.withdraw(saque);
            System.out.printf("Novo saldo: %.2f", conta.getSaldo());
        } catch (ExecptionDeConta e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("valor de entrada inválido.");
        }
        sc.close();

    }
}
