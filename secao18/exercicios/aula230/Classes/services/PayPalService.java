package secao18.exercicios.aula230.Classes.services;

public class PayPalService implements OnlinePaymentService{

    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * 0.01 * months;
    }
    
}
