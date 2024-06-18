package secao18.exercicios.aula230.Classes.services;

public interface OnlinePaymentService {
    Double paymentFee(Double amount);
    Double interest(Double amount, Integer mounths);
}
