package poo.heranca;

class Funcionario {
    void calcularSalario(double salario, double aumento){
        double salarioFinal = salario + aumento;
        System.out.println("O salario calculado é: "+ salarioFinal);
    }
}

class Assistente extends Funcionario{
    String nome;
    int salario;
    int aumento;
    void ajudar(){
        System.out.println("O assistente ajudou");
    }
}

public class exercicio06{
    public static void main(String[] args) {
        Assistente ajudante = new Assistente();
        ajudante.nome = "xande";
        ajudante.salario = 1000;
        ajudante.aumento = 200;
        ajudante.ajudar();
        ajudante.calcularSalario(ajudante.salario, ajudante.aumento);

}
}