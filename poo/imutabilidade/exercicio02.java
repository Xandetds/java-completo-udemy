package poo.imutabilidade;

class MinhaClasse{
    final int CODIGO_FIXO = 10;
    final void meuMetodo(){
        System.out.println("Metodo de final");
    }
}



public class exercicio02 extends MinhaClasse{
    final void meuMetodo(){
        System.out.println("Metodo sobreescrito");
    }

    public static void main(String[] args) {
        
        MinhaClasse classe = new MinhaClasse();
        classe.meuMetodo();
    }
}