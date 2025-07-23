package Fundamentos.exercicios;
public class exercicio07{
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        var c = a + b;

        System.out.println("O valor da adição é de " + c);

        var numero = 5;
        var soma = numero += 3;
        var subtracao = numero -= 3;
        var multiplicacao = numero *= 3;


        System.out.println("Os valores são "+ soma + ' ' + subtracao + ' ' + multiplicacao);

    }
}