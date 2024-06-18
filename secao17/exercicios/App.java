package secao17.exercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao17.exercicios.Classes.Product;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        String strPath = "C://temp//Exer1Aula221//estoque.csv";

        List<Product> products = new ArrayList<>();

        File file = new File(strPath);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] s = sc.nextLine().split(",");
                Product p = new Product(s[0], Double.parseDouble(s[1]), Integer.parseInt(s[2]));
                products.add(p);
            }
            boolean makerDirectoryOut = new File("C://temp//out").mkdir();
            
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C://temp//out//summary.csv"))) {
            
                for (Product line : products) {
                    bw.write(line.getNome() + "," + String.format("%.2f", line.valorTotal()));
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        
    }
}
