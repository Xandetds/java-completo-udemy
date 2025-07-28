package poo.abstratas;

abstract class Carro{
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

public class exercicio01{
    public static void main (String[] args){
        CarroF1 f1 = new CarroF1();
        Caminhao caminhao = new Caminhao();

        f1.acelerar();
        f1.frear();
        caminhao.acelerar();

        caminhao.frear();
    }
}