package poo.abstratas;

interface Inter1{
    void metodo1();
}

interface Inter2{
    void metodo2();
}



class Exemplo implements Inter1, Inter2{
    public void metodo1(){
        System.out.println("Metodo 1");
    }
    public void metodo2(){
        System.out.println("Metodo 2");
    }
 
}

public class exercicio05{
    public static void main(String [] args){

    Exemplo exemplo = new Exemplo();
    exemplo.metodo1();
    exemplo.metodo2();
}
}