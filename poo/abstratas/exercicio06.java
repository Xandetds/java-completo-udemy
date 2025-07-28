package poo.abstratas;

interface Inter1{
    void metodo1();
}

interface Inter2{
    void metodo2();
}



abstract class Exemplo implements Inter1, Inter2{
    public void metodo1(){
        System.out.println("Metodo 1");
    }
    public void metodo2(){
        System.out.println("Metodo 2");
    }
 
}

public class exercicio06 extends Exemplo{
    
    public static void main(String [] args){
        exercicio06 teste = new exercicio06();
        teste.metodo1();
        teste.metodo2();

}
}