package poo.imutabilidade;

final class Veiculo {
    String ligarMotor(){
        System.out.println("Motor ligado");
    }
}

class Carro extends Veiculo{

}


public class exercicio07{
    public static void main(String[] args) {
        Carro uno = new Carro();
        uno.ligarMotor();
    }
}