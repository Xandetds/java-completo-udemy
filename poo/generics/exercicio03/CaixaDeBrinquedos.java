package poo.generics.exercicio03;

public class CaixaDeBrinquedos {
    private Object coisaNaCaixa;

    public void guardar(Object coisa){
        this.coisaNaCaixa = coisa;
    }

    public Object pegar(){
        return coisaNaCaixa;
    }

    public static void main(String [] args){
        CaixaDeBrinquedos caixaDeCarrinhos = new CaixaDeBrinquedos();
        caixaDeCarrinhos.guardar(new Carrinho("Hot wheels"));

        CaixaDeBrinquedos caixaDeBoneco = new CaixaDeBrinquedos();
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
