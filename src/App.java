package BasicTXTReader.src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        String pathIn = "C:\\Matheus\\CC-EE\\Curso Java\\Projetos\\BasicReader\\BasicTXTReader\\Products.txt";
        String pathOut = "C:\\Matheus\\CC-EE\\Curso Java\\Projetos\\BasicReader\\BasicTXTReader\\ProductsList.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(pathIn));
            BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))) {
            
            String line = br.readLine();
            String out = "";
            bw.write("-PRODUCTS-\n");
            bw.newLine();

            while (line != null) {
                System.out.println();
                System.out.println("-PRODUCT-");
                String[] splitted = line.split(",");
                for (int i = 0; i < splitted.length; i++) {
                    if (i == 0) {
                        System.out.print("Name: ");
                        out += "-Name: ";
                    } else if (i == 1) {
                        System.out.print("Price: ");
                        out += "-Price: ";
                    } else {
                        System.out.print("In stock: ");
                        out += "-In stock: ";
                    }
                    System.out.println(splitted[i]);
                    out += splitted[i] + " ";
                }
                line = br.readLine();
                bw.write(out);
                bw.newLine();
                out ="";
            }
            bw.write(out);
            System.out.println(out);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}