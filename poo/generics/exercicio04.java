package poo.generics;

public class exercicio04 {
    private Object coisaNaCaixa;

    public void guardar(Object coisa){
        this.coisaNaCaixa = coisa;
    }

    public Object pegar(){
        return coisaNaCaixa;
    }

    public static void main(String [] args){
        exercicio04 caixaDeCarrinhos = new exercicio04();
        caixaDeCarrinhos.guardar(new Carrinho("Hot wheels"));

        exercicio04 caixaDeBoneco = new exercicio04();
        caixaDeBoneco.guardar(new Boneco("ben 10"));

        if (caixaDeCarrinhos.pegar() instanceof Carrinho){
            Carrinho carrinho = (Carrinho) caixaDeCarrinhos.pegar();
            System.out.println(carrinho.getModelo());
        }

        if (caixaDeBoneco.pegar() instanceof Boneco){
            Boneco boneco = (Boneco) caixaDeBoneco.pegar();
            System.out.println(boneco.getNome());
        }
    }
}
