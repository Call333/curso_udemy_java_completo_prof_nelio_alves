package secao18.exercicios.aula230.Classes.services;

import java.time.LocalDate;

import secao18.exercicios.aula230.Classes.entities.Contract;
import secao18.exercicios.aula230.Classes.entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double paymentFee = onlinePaymentService.paymentFee(basicQuota + interest);
            double totalQuota = basicQuota + interest + paymentFee;
            
            contract.getInstallments().add(new Installment(dueDate, totalQuota));
        }
    }
}
