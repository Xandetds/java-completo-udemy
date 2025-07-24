package poo.imutabilidade;

class ExemploFinal{
    final int NUMERO_IMUTAVEL = 10;

    final void meuMetodo(){
        System.out.println("Esse é um metodo final. ");
    }
}

public class exercicio01{
    public static void main(String[] args) {
        ExemploFinal teste = new ExemploFinal();
        
        ///teste.NUMERO_IMUTAVEL = 55; ERRO
        
        System.out.println("Valor: " + teste.NUMERO_IMUTAVEL);
        teste.meuMetodo();
    }
}