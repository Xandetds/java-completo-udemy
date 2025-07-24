package poo.imutabilidade;

final class MinhaClasse{
    final int CODIGO_FIXO = 10;
    final void meuMetodo(){
        System.out.println("Metodo de final");
    }
}



public class exercicio03 extends MinhaClasse{
    public static void main(String[] args) {
        
        MinhaClasse classe = new MinhaClasse();
        classe.meuMetodo();
    }
}