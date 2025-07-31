package poo.exceptions;

public class exercicio07 {

    public static int acessarElemento(int[] array, int indice){
    
        try{
            return array[indice];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage());
            return -1;
        } finally{
            System.out.println("Programa finalizado");
        }
    }
    public static void main(String[]args){
        int[] numeros = {1, 22, 333, 4444};

        acessarElemento(numeros, 12);
    }
}
