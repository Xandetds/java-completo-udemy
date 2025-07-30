package poo.generics.exercicio01;

public class CaixaDeCoisas<T>{
    private T coisaNaCaixa;

    public void guardar(T coisa){
        this.coisaNaCaixa = coisa;
    }

    public T pegar(){
        return coisaNaCaixa;
    }

    public static void main(String [] args){
        CaixaDeCoisas<String> CaixaDeTexto = new CaixaDeCoisas<>();

        CaixaDeTexto.guardar("Bola de fut");

        String objeto = CaixaDeTexto.pegar();

        System.out.println(objeto);
    }
}