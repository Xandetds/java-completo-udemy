package poo.packages.exercicio03;

public class Funcionario2 {
    private String nome;
    double salario;

    private Funcionario2(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }

    protected Funcionario2() {
        Funcionario2 func = new Funcionario2("Mario", 4000);
    }
}