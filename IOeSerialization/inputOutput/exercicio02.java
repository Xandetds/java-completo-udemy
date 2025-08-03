package IOeSerialization.inputOutput;

import java.io.*;

public class exercicio02{
    public static void main(String[] args) {
        try{

            FileWriter writer = new FileWriter("meuArquivo.txt");

            writer.write("Olá mundo!");
            writer.close(); 

            FileReader reader = new FileReader("meuArquivo.txt");
            int data = reader.read();


            while (data != -1){
                System.out.print((char) data);

                data = reader.read();
            }
            reader.close();


        } catch (IOException e){
            System.out.println("Problemas de IO " + e.getMessage());
        }
    }
}
    