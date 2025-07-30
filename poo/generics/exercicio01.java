package poo.generics;

public class exercicio01<T>{
    private T coisaNaCaixa;

    public void guardar(T coisa){
        this.coisaNaCaixa = coisa;
    }

    public T pegar(){
        return coisaNaCaixa;
    }

    public static void main(String [] args){
        exercicio01<String> CaixaDeTexto = new exercicio01<>();

        CaixaDeTexto.guardar("Bola de fut");

        String objeto = CaixaDeTexto.pegar();

        System.out.println(objeto);
    }
}