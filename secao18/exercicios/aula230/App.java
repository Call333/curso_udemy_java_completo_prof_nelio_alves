package secao18.exercicios.aula230;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import secao18.exercicios.aula230.Classes.entities.Contract;
import secao18.exercicios.aula230.Classes.entities.Installment;
import secao18.exercicios.aula230.Classes.services.ContractService;
import secao18.exercicios.aula230.Classes.services.PayPalService;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);    

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);
        
        System.out.print("Entre com o número de parcelas: ");
        int months = sc.nextInt();

        ContractService contractService = new ContractService(new PayPalService());
        
        contractService.processContract(contract, months);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close(); 
    }
}
