package poo.heranca;

class Veiculo {
    void acelerar(){
        System.out.println("Veiculo acelerando");
    }
}

class Carro extends Veiculo{
    void acelerar(){
        super.acelerar();
        System.out.println("Carro acelerando");
    }
}

public class exercicio05{
    public static void main(String[] args) {
        Carro uno = new Carro();
        uno.acelerar();
    }
}
