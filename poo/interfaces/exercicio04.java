package poo.interfaces;

interface SerVivo{
    void respirar();
}

interface Animal extends SerVivo{
    public static final String DESCRICAO = "descricao do animal";
    void fazerSom(); //metodo absrato
}

class Cachorro implements Animal{
    public void respirar(){
        System.out.println("Cao respira ");
    }
    public void fazerSom(){
        System.out.println("au au");
    }
}

class Gato implements Animal{
    public void respirar(){
        System.out.println("Gato respira ");
    }
    public void fazerSom(){
        System.out.print(" miau ");
    }
}

public class exercicio04{
    public static void main(String[] args){
        Cachorro cao = new Cachorro();
        cao.fazerSom();
        cao.respirar();

        Gato gato = new Gato();
        gato.fazerSom();
        gato.respirar();

        System.out.println(" "+ Animal.DESCRICAO);
    }
}