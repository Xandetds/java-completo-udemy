package IOeSerialization.inputOutput;

import java.io.*;

public class exercicio03{
    public static void main(String[] args) {
        try{

            FileWriter writer = new FileWriter("C:\\Users\\Admin\\java-completo-udemy\\IOeSerialization\\meuArquivo.txt");

            writer.write("Olá mundo!");
            writer.close(); 

            FileReader reader = new FileReader("meuArquivo.txt"); // vai dar exception pq nao ta no caminho tambem
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
    