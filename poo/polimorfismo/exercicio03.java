package poo.polimorfismo;

abstract class Animal extends Object{
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

public class exercicio03{
    public static void main(String[] args) {
        Object dog = new Cachorro();
        Object cat = new Gato();

        Cachorro objConvertido = (Cachorro) dog; //casting

        ((Gato) cat).fazerSom(); //casting mais facil e ja chama o metodo
        
        // dog.fazerSom(); da erro pq object nao tem o fazerSom

        objConvertido.fazerSom();
    }
} 
