package poo.annotations;

class SuperClasse{
    public void imprime(){
        System.out.println("Imprime");
    }
}

class MinhaClasse extends SuperClasse{
    @Override
    public void imprime(){
        System.out.println("Imprime outra coisa");
    }
}

public class exercicio03{
    public static void main(String[] args) {
        MinhaClasse eu = new MinhaClasse();
        eu.imprime();
}
}