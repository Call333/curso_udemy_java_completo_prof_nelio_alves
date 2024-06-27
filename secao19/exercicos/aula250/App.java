package secao19.exercicos.aula250;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> candidatos = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String strPath = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);
                
                if(candidatos.containsKey(name)){
                    int votos = candidatos.get(name);
                    candidatos.put(name, count + votos);
                }else{
                    candidatos.put(name, count);
                }
                
                line = br.readLine();
            }

            for (String k : candidatos.keySet()) {
                System.out.println(k + ": " + candidatos.get(k));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        sc.close();
    }
}
