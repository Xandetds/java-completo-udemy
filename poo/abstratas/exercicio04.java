package poo.abstratas;

interface Inter1{
    void metodo1();
}

interface Inter2{
    void metodo2();
}

interface Inter3 extends Inter1, Inter2{
    void metodo3();
}

class Exemplo implements Inter3{
    public void metodo1(){
        System.out.println("Metodo 1");
    }
    public void metodo2(){
        System.out.println("Metodo 2");
    }
    public void metodo3(){
        System.out.println("Metodo 3");
    }
}

public class exercicio04{
    public static void main(String [] args){

    Exemplo exemplo = new Exemplo();
    exemplo.metodo1();
    exemplo.metodo2();
    exemplo.metodo3();
}
}