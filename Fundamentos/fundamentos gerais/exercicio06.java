package Fundamentos.exercicios;
public class exercicio06 {
    public static void main(String[] args) {
        byte a = 1;
        short b = 1000;
        char c = 'a';
        int d = 12345;
        long e = 700000000;
        float f = 1.5f;
        double g = 555.55;


        var soma = a + b;
        var multiplicacao = f * d;
        var subtracao = g - a;
        var divisao = e / f;
        System.out.println("O char é: " + c);
        System.out.println("A Soma, Multiplicação, Subtração e Divisão São respectivamente: "
         + soma + ' '  + multiplicacao + ' ' + subtracao + ' ' + divisao);
    }
}
