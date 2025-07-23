package Fundamentos.arrays;

public class exercicio02 {
    
    public static void main(String[] args) {
        double[] notas = new double[5];
        notas[0] = 10.0;
        notas[1] = 8.5;
        notas[2] = 9.2;
        notas[3] = 10.0;
        notas[4] = 0.0;
        
        for (double elemento: notas){
            System.out.println(elemento);
        }
    }
}