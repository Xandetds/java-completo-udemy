package poo.heranca;

class Animal{
    public void fazerSom(){
        System.out.println("O animal faz um som");
    }
}


class Cachorro extends Animal{
    public void fazerSom(){
        System.out.println("O cachorro late");
    }
}


public class exercicio02{
    public static void main(String[] args) {
        Cachorro pingo = new Cachorro();

        pingo.fazerSom();
    }
}