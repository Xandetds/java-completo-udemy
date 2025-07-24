package poo.heranca;

class Animal{
    public String nome;
    public void fazerSom(){
        System.out.println("O animal faz um som");
    }
}


class Cachorro extends Animal{
    public void fazerSom(){
        super.fazerSom();
        System.out.println("O cachorro late");
    }
}


public class exercicio03{
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.nome = "Pingo";
        System.out.println("O nome do animal é: " + dog.nome);
        dog.fazerSom();
    }
}