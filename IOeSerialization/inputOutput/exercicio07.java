package IOeSerialization.inputOutput;

import java.io.*;
import java.nio.file.*;


public class exercicio07{
    public static void main(String[] args) {

        String nomeArquivo = "arquivoTeste2.txt";
        String conteudo = "Conteudo do arquivo teste 2";

       escreverNoArquivo(nomeArquivo,  conteudo);

        String conteudoLido = lerDoArquivo(nomeArquivo);
        System.out.println("Conteudo do arquivo: " + conteudoLido);
        
        }

    public static void escreverNoArquivo(String nomeArquivo, String conteudo) {
    try {
        Path path = Paths.get(nomeArquivo);
        Files.write(path, conteudo.getBytes());
        System.out.println("Arquivo criado e texto escrito com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
    public static String lerDoArquivo(String nomeArquivo) {
        try {
            Path path = Paths.get(nomeArquivo);
            byte[] bytes = Files.readAllBytes(path);
            return new String(bytes);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        return "";
        }
    }
}