package Fundamentos.exercicios;
public class exercicio20 {
    public static void main(String[] args) {
        var soma = 0;
        var numero = 10;
        do{
            soma += numero;
            numero--;
            System.out.println(soma);
        }while (numero > 0);
        System.out.println(soma);
    }
}
