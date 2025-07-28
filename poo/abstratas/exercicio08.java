package poo.abstratas;

abstract class Loja{
    abstract void abrir();
    abstract void fechar();
}

class LojaComercial extends Loja{
    @Override
    void abrir(){
        System.out.println("Loja abre");
    }

    @Override
    void fechar(){
        System.out.println("Loja fecha");
    }
}


public class exercicio08{
    public static void main(String []args){

        LojaComercial fruteira = new LojaComercial();
        fruteira.abrir();
        fruteira.fechar();
    }
}