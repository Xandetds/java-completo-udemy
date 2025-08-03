package IOeSerialization.inputOutput;

import java.io.*;

public class exercicio06{
    public static void main(String[] args) {

        String nomeArquivo = "arquivoTeste.txt";
        String conteudo = "Esse é o conteúdo do arquivo teste";
        
        escreverNoArquivo(nomeArquivo,  conteudo);

        String conteudoLido = lerDoArquivo(nomeArquivo);
        System.out.println("Conteudo do arquivo: " + conteudoLido);
        }

    public static void escreverNoArquivo(String nomeArquivo, String conteudo){

        try{
            FileWriter writer = new FileWriter(nomeArquivo);
            writer.write(conteudo);
            writer.close();
            System.out.println("Arquivo criado e conteudo escrito com sucesso!");
        } catch (IOException e){
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public static String lerDoArquivo(String nomeArquivo){
        StringBuilder conteudo = new StringBuilder();

        try{FileReader reader = new FileReader(nomeArquivo);
        int caractere;
        while ((caractere = reader.read()) != -1){
            conteudo.append((char) caractere);
        }
        reader.close();
        
        } catch (IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return conteudo.toString();
    }

    }
    






