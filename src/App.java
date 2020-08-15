package BasicTXTReader.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        
        String path = "C:\\Matheus\\CC-EE\\Curso Java\\Projetos\\BasicReader\\BasicTXTReader\\Products.txt";
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
           String line = br.readLine();
           
           while(line != null){
               System.out.println();
               System.out.println("-PRODUCT-");
               String[] splitted = line.split(",");
              for (int i = 0; i < splitted.length; i++) {
                  if(i==0){
                    System.out.print("Name: ");    
                  }else if(i==1){
                    System.out.print("Price: "); 
                  }else{
                    System.out.print("In stock: ");
                  }
                  System.out.println(splitted[i]);
              }
               
               line = br.readLine();
           }
        } 
        catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }

    }
}