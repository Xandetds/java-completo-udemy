package poo.imutabilidade;

class FinalVariables {
    final int NUMERO_MAXIMO = 100;
    final String MENSAGEM = "Bem vindo!";
    public void imprimirValores(){
        System.out.println("Numero: " + NUMERO_MAXIMO + ", string: " + MENSAGEM);
    }
}

public class exercicio05{
    public static void main(String[] args) {
        FinalVariables vari = new FinalVariables();
        //vari.NUMERO_MAXIMO = 44;
        //vari.MENSAGEM = "olá";
        vari.imprimirValores();
    }
}
