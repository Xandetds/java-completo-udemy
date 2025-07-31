package poo.exceptions;

public class exercicio06{

    public static void main(String []args){
        Integer numero = null;

        try{
            String numeroString = numero.toString();

            System.out.println("Numero em string: " + numeroString);
        } catch (NullPointerException e){
            System.out.println("Erro: " + e.getMessage());
        } finally{
            System.out.println("Programa encerrado!");
        }
    }
}