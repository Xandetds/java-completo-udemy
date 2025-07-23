package poo.exerciciostiposdeclasse.exercicio04;

public class Funcionario7 {
    private String nome;
    private double salario;

    public Funcionario7(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
    }
    public String obterInfo(){
        return "Nome: " + nome + ", Salario: " + salario;
    }
    
    public void aumentarSalario(double aumento){
        salario += aumento;
    }

    public void alterarQualquerSalario(Funcionario7 funcionario7, double novoSalario) {
        funcionario7.salario = novoSalario;
    }
}