package poo.heranca;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}


class Estudante extends Pessoa {
    String matricula;

    Estudante(String nome, int idade, String matricula) {
        super(nome, idade); 
        this.matricula = matricula;
    }
}


public class exercicio07 {
    public static void main(String[] args) {
        Estudante xande = new Estudante("Alexandre", 19, "123456");
        System.out.println(xande.nome + " " + xande.idade + " " + xande.matricula);
    }
}

