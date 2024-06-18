package secao17.testes;


import java.io.File;
import java.util.Scanner;

public class testePath {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println();
        System.out.println("______ Folders ______");
        for (File folder : folders) {
            System.out.println(folder);
        }

        System.out.println("______ Files ______");
        File[] files = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file.getName());
        }

        sc.close();
    }
}
