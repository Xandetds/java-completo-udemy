package ProgramacaoFuncional.interfacesFuncionais;

@FunctionalInterface    
interface Calculadora{
    double calcular(double a, double b);
}

public class exercicio02{
    public static void main(String[] args) {
        Calculadora soma = (a, b) -> a + b;
        Calculadora substracao = (a, b) -> a - b;
        Calculadora multiplicacao = (a, b) -> a * b;
        Calculadora divisao = (a, b) -> a / b;

        System.out.println("Soma: " +soma.calcular(2, 3));
        System.out.println("Substracao: " + substracao.calcular(2, 20));
        System.out.println("Multiplicacao: " + multiplicacao.calcular(44, 444));
        System.out.println("Divisao: " + divisao.calcular(990, 9));
    }
}