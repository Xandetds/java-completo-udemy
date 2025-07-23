package poo.tiposdeclasse.exercicio02;

public class mostrarProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Banana", 1.50, 100);
        System.out.println(produto.pegarInfo());
        
    }
}
