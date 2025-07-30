package poo.generics.exercicio02;

public class CaixaDeCoisas<T>{
    private T coisaNaCaixa;

    public void  guardar(T coisa){
        this.coisaNaCaixa = coisa;
    }


    public T pegar(){
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        CaixaDeCoisas<String> caixaDeTexto = new CaixaDeCoisas<>();
        
        CaixaDeCoisas<Integer> caixaDeNumero = new CaixaDeCoisas<>(); //int vira Integer

        caixaDeTexto.guardar("Bola");

        caixaDeNumero.guardar(55);

        String texto = caixaDeTexto.pegar(); 
        int numero = caixaDeNumero.pegar();

        System.out.println(numero);
        
        System.out.println(texto);
    }
}