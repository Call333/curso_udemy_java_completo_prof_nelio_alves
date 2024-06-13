package secao14.aula166;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao14.aula166.Classes.Pessoa;
import secao14.aula166.Classes.PessoaFisica;
import secao14.aula166.Classes.PessoaJuridica;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Tax payer #%d data: %n", (i + 1));
            System.out.print("Individual or company (i/c)? ");
            char resp = sc.next().charAt(0);
            System.out.print("Name: ");
            String nome = sc.next();
            System.out.print("Anual Income: ");
            Double renda = sc.nextDouble();

            if(resp == 'i'){
                System.out.print("Health expenditures: ");
                Double despesasMedicas = sc.nextDouble();
                pessoas.add(new PessoaFisica(nome, renda, despesasMedicas));
            }if(resp == 'c'){
                System.out.print("Number of employees: ");
                Integer numberOfEmps = sc.nextInt();
                pessoas.add(new PessoaJuridica(nome, renda, numberOfEmps));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", pessoa.calcularImposto()));
        }

        sc.close();
    }
}
