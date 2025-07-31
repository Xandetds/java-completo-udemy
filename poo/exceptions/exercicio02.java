package poo.exceptions;

public class exercicio02{
    public static void main(String[]args){
        String nome = null;

        try{
            
            int tamanhoNome = nome.length();

            System.out.println("Tamanho do nome: " + tamanhoNome);
        } catch (NullPointerException e){

            System.out.println("Erro: A variavel 'nome' esta nula!");
        } finally{
            System.out.println("Finalizado!");
        }
    }
}