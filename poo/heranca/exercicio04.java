package poo.heranca;

class Animal{
    String nome;

    Animal(String nome){
        this.nome = nome;
    }
}

class Cachorro extends Animal{
    String raca;

    Cachorro(String nome, String raca){
        super(nome);
        this.raca = raca;   
    }
}

public class exercicio04{
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Pingo", "Fox");
        dog.nome = "Pingo";
        System.out.println("O nome do animal é: " + dog.nome);
        System.out.println("A raca é: " + dog.raca);
        
    }
}