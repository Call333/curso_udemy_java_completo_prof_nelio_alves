package secao13.aula153.exercicios.Classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Client client;
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> itens = new ArrayList<>();

    public Order() {
    }

    public Order(Client client, Date moment, OrderStatus status) {
        this.client = client;
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem item) {
        itens.add(item);
    }

    public void removeItem(OrderItem item) {
        itens.remove(item);
    }

    public double total() {
        double soma = 0;
        for (OrderItem orderItem : itens) {
            soma += orderItem.subTotal();
        }
        return soma;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItens() {
        return itens;
    }

    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order statud: " + status + "\n");
        sb.append("Client: " + client.getName() + " (" + sdf.format(client.getBirthDate()) + ")" + " - " + client.getEmail() + "\n");
        sb.append("Order items: " + "\n");
        for (OrderItem orderItem : itens) {
            sb.append(orderItem.getProduct().getName() + ", $" + String.format("%.2f", orderItem.getPrice()) 
            + ", Quantity: " + orderItem.getQuantity() + ", Subtotal: $" + String.format("%.2f", orderItem.getPrice()) + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));

        return sb.toString();
    }
}
