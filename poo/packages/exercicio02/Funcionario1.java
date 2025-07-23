package poo.packages.exercicio02;

public class Funcionario1 {
    private String nome;
    double salario;

    private Funcionario1(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }

    public Funcionario1() {
        Funcionario1 func = new Funcionario1("Mario", 4000);
    }
}