package poo.interfaces;

interface InterfaceEspecial {
    void metodoAbtstrato();
    
    default void metodoDefault(){
        System.out.println("Metodo default na interface");
    }

    static void metodoStatic(){
        System.out.println("Metodo static na interface");
    }
}


public class exercicio05 implements InterfaceEspecial{
    public void metodoAbtstrato(){
        System.out.println("Implementação do abstrato");
    }

    public static void main(String[] args) {
        exercicio05 exemplo = new exercicio05();
        exemplo.metodoAbtstrato();
        exemplo.metodoDefault();
        InterfaceEspecial.metodoStatic();
    }
}