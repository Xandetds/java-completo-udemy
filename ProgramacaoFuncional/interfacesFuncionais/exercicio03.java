package ProgramacaoFuncional.interfacesFuncionais;

@FunctionalInterface
interface OperacaoMatematica{
    double excecutar(double a, double b);
}

public class exercicio03 {
    public static void main(String[] args) {

    OperacaoMatematica pow = (a, b) -> Math.pow(a, b);
    OperacaoMatematica sqrt = (a, b) -> Math.sqrt(a + b);

    System.out.println(pow.excecutar(3, 3));

    System.out.println(sqrt.excecutar(70, 11));
    }
    


}
