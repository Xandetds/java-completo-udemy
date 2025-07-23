package poo.tiposdeclasse.exercicio02;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String pegarInfo() {
        return "Nome: " + nome + ", Preco: " + preco + ", Quantidade em estoque: " + quantidadeEmEstoque;
    }
}