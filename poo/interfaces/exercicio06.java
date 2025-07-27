package poo.interfaces;

interface Veiculo {
    void iniciar();
    void parar();
    void buzinar();
}

class Carro implements Veiculo{
    public void iniciar(){
        System.out.println("Carro inicia");
    }
    public void parar(){
        System.out.println("Carro para");
    }
    public void buzinar(){
        System.out.println("Carro buzina");
    }
    
}

class Caminhao implements Veiculo{
    public void buzinar(){
        System.out.println("Caminhao buzina");
    }
    public void parar(){
        System.out.println("Caminhao para");
    }
    public void iniciar(){
        System.out.println("Caminhao inicia");
    }
}

public class exercicio06{
    public static void main(String[] args) {
    Carro carro = new Carro();
    carro.iniciar();
    carro.parar();
    
    Caminhao caminhao = new Caminhao();
    caminhao.buzinar();
}
}