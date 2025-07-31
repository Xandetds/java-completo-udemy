package poo.exceptions;

public class exercicio01{
    public static void main(String []args){
    int totalNotas = 0;
    int totalAlunos = 0;

    try{
        int media = totalNotas / totalAlunos;
    }catch (ArithmeticException e){
            System.out.println("Problema: divisao por zero!");
    }finally{
        System.out.println("Programa terminou!");
    }
    }
    
}