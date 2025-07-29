package poo.polimorfismo;

abstract class Animal{
    public abstract void fazerSom();

    public void tipoObjeto(){
        System.out.println("objeto do tipo animal");
    }
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

public class exercicio02{
    public static void main(String[] args) {
        Animal dog = new Cachorro();
        Animal cat = new Gato();
        
        dog.fazerSom();
        cat.fazerSom();

        dog.tipoObjeto();
        cat.tipoObjeto();
    }
} 
