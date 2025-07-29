package poo.polimorfismo;

abstract class Animal{
    public abstract void fazerSom();
}

class Cachorro extends Animal{
    public void fazerSom(){
        System.out.println("cachorro faz auau");
    }
}

class Gato extends Animal{
    public void fazerSom(){
        System.out.println("gato faz miau");
    }
}

public class exercicio01{
    public static void main(String[] args) {
        Animal dog = new Cachorro();
        Animal cat = new Gato();
        
        dog.fazerSom();
        cat.fazerSom();
    }
}