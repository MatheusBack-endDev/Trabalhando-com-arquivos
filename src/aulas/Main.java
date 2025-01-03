package aulas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\teste\\in.txt");
        Scanner leitura = null;

        try {
            leitura = new Scanner(file);
            while (leitura.hasNextLine()){
                System.out.println(leitura.nextLine());
            }
        }catch (IOException e){
            System.out.println("erro ioe" + e.getMessage());
        }finally {
            if (leitura != null){
                leitura.close();
            }
        }

    }
}