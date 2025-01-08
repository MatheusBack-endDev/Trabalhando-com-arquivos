package aulas.aula4;

import java.io.File;
import java.util.Scanner;
import java.util.SortedMap;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String stfpath = sc.nextLine();

        File path = new File(stfpath);

        File[] fouders = path.listFiles(File::isDirectory);
        System.out.println("FOUDERS: ");
        for (File fouder : fouders){
            System.out.println(fouder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("File: ");
        for (File file : files){
            System.out.println(file);
        }

        boolean successs = new File(stfpath + "\\teste2").mkdir();
        System.out.println("Criado com sucesso" + successs);
    }
}
