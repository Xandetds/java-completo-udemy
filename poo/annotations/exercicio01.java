package poo.annotations;

class Animal{
    public String nome;
    public void fazerSom(int i){
        System.out.println("O animal faz um som");
    }
}


class Cachorro extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("O cachorro late");
    }
}


public class exercicio01{
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.fazerSom();
    }
}