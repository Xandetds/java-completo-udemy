package poo.tiposdeclasse.exercicio05;

public class Funcionario8 {
    private String nome;
    private double salario;

    public Funcionario8(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
    }
    public String obterInfo(){
        return "Nome: " + nome + ", Salario: " + salario;
    }
    
    public void aumentarSalario(double aumento){
        salario += aumento;
    }

    public void aumentarSalario(int porcentagem){
        salario += salario * porcentagem / 100.0;
    }
}