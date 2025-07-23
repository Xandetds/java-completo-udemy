package poo.tiposdeclasse.exercicio01;

public class Funcionario3 {
    private String nome;
    private double salario;

    public Funcionario3(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
    }
    public String obterInfo(){
        return "Nome: " + nome + ", Salario: " + salario;
    }
}