package ProgramacaoFuncional.interfacesFuncionais;

public class exercicio01 {
    public double somar(double a, double b){
        return a + b;
    }   

    public double subtrair(double a, double b){
        return a - b;
    }

    public double multiplicar(double a, double b){
        return a * b;
    }

    public double dividir(double a, double b){
        return a / b;
    }

    public static void main(String[] args) {
        exercicio01 calculadora = new exercicio01();

        double soma = calculadora.somar(1, 3);
        System.out.println(soma);
        
        double subs = calculadora.subtrair(44, 55);
        System.out.println(subs);
        
        double mult = calculadora.multiplicar(33, 10);
        System.out.println(mult);
        
        double div = calculadora.dividir(44, 4);
        System.out.println(div);

        
    }
}
