package poo.generics;

public class exercicio02<T>{
    private T coisaNaCaixa;

    public void  guardar(T coisa){
        this.coisaNaCaixa = coisa;
    }


    public T pegar(){
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        exercicio02<String> caixaDeTexto = new exercicio02<>();
        
        exercicio02<Integer> caixaDeNumero = new exercicio02<>(); //int vira Integer

        caixaDeTexto.guardar("Bola");

        caixaDeNumero.guardar(55);

        String texto = caixaDeTexto.pegar(); 
        int numero = caixaDeNumero.pegar();

        System.out.println(numero);
        
        System.out.println(texto);
    }
}