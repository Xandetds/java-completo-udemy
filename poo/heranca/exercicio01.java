package poo.heranca;

class Animal{
    public void comer(){
        System.out.println("O animal come");
    }
}


class Cachorro extends Animal{
    public void latir(){
        System.out.println("O cachorro late");
    }
}


public class exercicio01{
    public static void main(String[] args) {
        Cachorro pingo = new Cachorro();

        pingo.latir();
        pingo.comer();
    }
}