package poo.interfaces;

interface Animal{
    void fazerSom(); //metodo absrato
}

class Cachorro implements Animal{
    public void fazerSom(){
        System.out.println("au au");
    }
}

class Gato implements Animal{
    public void fazerSom(){
        System.out.print("miau");
    }
}

public class exercicio02{
    public static void main(String[] args){
        Animal bixo = new Animal();

        Gato gato = new Gato();
        gato.fazerSom();
    }
}