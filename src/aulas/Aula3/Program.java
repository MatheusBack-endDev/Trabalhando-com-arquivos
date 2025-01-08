package aulas.Aula3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String[] lines = new String[] {"Goog morning", "Good afternoon", "Good night"};

        String path = "C:\\teste\\in.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
