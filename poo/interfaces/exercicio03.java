package poo.interfaces;

interface Animal{
    public static final String DESCRICAO = "descricao do animal";
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

public class exercicio03{
    public static void main(String[] args){
        Gato gato = new Gato();
        gato.fazerSom();

        System.out.println(" "+ Animal.DESCRICAO);
    }
}