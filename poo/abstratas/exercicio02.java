package poo.abstratas;

abstract class Carro{
    int codigo = 10;
    abstract void acelerar();
    void frear(){
        System.out.println("O carro esta freando");
    }
}

class CarroF1 extends Carro{
    void acelerar(){
        System.out.println("O carro f1 esta acelerando");
    }
}

class Caminhao extends Carro{
    void acelerar(){
        System.out.println("O caminhao esa acelerando");
    }
}

public class exercicio02{
    public static void main (String[] args){
        
        //Carro carro = new Carro(); NÃO PODE INSTANCIAR 
        
        Caminhao caminhao = new Caminhao();

        caminhao.acelerar();
        caminhao.frear();

        System.out.println("Codigo: " + caminhao.codigo);
        caminhao.codigo = 123;
        System.out.println("Novo codigo: " + caminhao.codigo); //pode trocar e interface nao pode
    }
}