package poo.abstratas;

abstract class Carro{
    int codigo = 10;

    Carro(int cod){
        codigo = cod;
    }

    abstract void acelerar();
    void frear(){
        System.out.println("O carro esta freando");
    }
}


class Caminhao extends Carro{
    Caminhao(int codigo){
        super(codigo);
    }
    void acelerar(){
        System.out.println("O caminhao esa acelerando");
    }
}

public class exercicio03{
    public static void main (String[] args){
                
        Caminhao caminhao = new Caminhao(100);
        System.out.println("Codigo: " + caminhao.codigo);

        
    }
}