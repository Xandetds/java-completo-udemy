package poo.imutabilidade;

class Calculadora {
    final void somar(int a, int b){
        System.out.println(a + b);
    }
}

class CalculadoraCientifica extends Calculadora{
    final void somar(int d, int c){
        System.out.println(somar(d, c));
    }
}

public class exercicio06{
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.somar(1, 2);
    }
}