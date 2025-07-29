package poo.polimorfismo;

abstract class Operacao{
    abstract void calcular(double a, double b);
}

class Soma extends Operacao{
    void calcular(double a, double b){
        System.out.println("Soma: " + (a+ b));
    }
}

class Subtracao extends Operacao{
    void calcular(double a, double b){
        System.out.println("Subtracao: " + (a - b));
}
}

class Divisao extends Operacao{
    void calcular(double a, double b){
        System.out.println("Divisao: " + (a / b));
}
}

class Multiplicacao extends Operacao{
    void calcular(double a, double b){
        System.out.println("Multiplicacao: " + (a * b));
}
}

public class exercicio05{
    public static void main(String[] args) {
        Operacao soma = new Soma();
        Operacao subs = new Subtracao();
        Operacao div = new Divisao();
        Operacao mult = new Multiplicacao();

        soma.calcular(1, 2);
        subs.calcular(44, 55);
        div.calcular(5, 2);
        mult.calcular(66, 44);
    }
}