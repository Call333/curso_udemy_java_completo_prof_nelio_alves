package secao14.aula163;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao14.aula163.Classes.ImportedProduct;
import secao14.aula163.Classes.Product;
import secao14.aula163.Classes.UsedProduct;

public class App {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf02 = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> produtos = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int qtdProducts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdProducts; i++) {
            System.out.printf("Product #%d data: %n", (i + 1));
            System.out.print("Common, used or imported (c, u, i)? ");
            char resp = sc.next().charAt(0);
            System.out.print("Name: ");
            String nome = sc.next();
            System.out.print("Price: ");
            Double preco = sc.nextDouble();
            if (resp == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                produtos.add(new ImportedProduct(nome, preco, customsFee));
            }
            if (resp == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf02.parse(sc.next());
                produtos.add(new UsedProduct(nome, preco, manufactureDate));
            }
            if (resp == 'c') {
                produtos.add(new Product(nome, preco));
            }
        }

        for (Product product : produtos) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
