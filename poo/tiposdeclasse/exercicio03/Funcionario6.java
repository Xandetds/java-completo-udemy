package poo.tiposdeclasse.exercicio03;

public class Funcionario6 {
    private String nome;
    private double salario;

    public Funcionario6(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
    }
    public String obterInfo(){
        return "Nome: " + nome + ", Salario: " + salario;
    }
    
    public void aumentarSalario(double aumento){
        salario += aumento;
    }
}