package secao13.aula153.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import secao13.aula153.exercicios.Classes.Client;
import secao13.aula153.exercicios.Classes.Order;
import secao13.aula153.exercicios.Classes.OrderItem;
import secao13.aula153.exercicios.Classes.OrderStatus;
import secao13.aula153.exercicios.Classes.Product;

public class App {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date dateBirthDate = s1.parse(sc.next());

        Client client = new Client(name, email, dateBirthDate);

        System.out.println();
        System.out.println("Enter Order Data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("How many itens to this order? ");
        Integer quantity = sc.nextInt();
        
        Order order = new Order(client, new Date(), status);

        for (int i = 0; i < quantity; i++) {
            sc.nextLine();
            System.out.printf("Enter #%d item data: %n", (i + 1));
            System.out.print("Product name: ");
            String nome = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qtd = sc.nextInt();

            Product product = new Product(nome, price);
            OrderItem orderItem = new OrderItem(qtd, price, product);

            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        sc.close();
    }
}