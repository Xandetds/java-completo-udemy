package IOeSerialization.inputOutput;

import java.io.*;

public class exercicio04{
    public static void main(String[] args) {
        try{

            FileWriter writer = new FileWriter("C:\\Users\\Admin\\java-completo-udemy\\IOeSerialization\\meuArquivo.txt");

            writer.write("Olá mundo!");
            writer.close(); 

            FileReader reader = new FileReader("C:\\\\Users\\\\Admin\\\\java-completo-udemy\\\\IOeSerialization\\\\meuArquivo.txt"); 
            int data = reader.read();


            while (data != -1){
                System.out.println(data); // sem casting pra mostrar sem a conversao para char (mostrando com println pra ver melhor)

                data = reader.read();
            }
            reader.close();


        } catch (IOException e){
            System.out.println("Problemas de IO " + e.getMessage());
        }
    }
}
    