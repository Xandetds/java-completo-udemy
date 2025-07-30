package poo.generics.exercicio03;

public class CaixaGenerica<T> {
    private T coisaNaCaixa;

    public void guardar(T coisa){
    this.coisaNaCaixa = coisa;
    }

    public T pegar(){
        return coisaNaCaixa;
    } 

    public static void main(String []args){
        CaixaGenerica<Carrinho> caixaDeCarrinhos = new CaixaGenerica<>();

        caixaDeCarrinhos.guardar(new Carrinho("hotwheels"));

        CaixaGenerica<Boneco> caixaDeBonecos = new CaixaGenerica<>();

        caixaDeBonecos.guardar(new Boneco("barbie"));

        //nao precisa de cast pq pegar retorna um carrinho e uma boneca

        Carrinho carrinho = caixaDeCarrinhos.pegar();
        Boneco boneco = caixaDeBonecos.pegar();

        System.out.println(carrinho.getModelo());
        System.out.println(boneco.getNome());
    }
}
