package poo.exerciciosconstrutor;

class Livro{
    private String autor;
    public String titulo;
    protected int anoPublicacao;
    double preco;


Livro(){
}
Livro(String autor, String titulo){
    this.autor = autor;
    this.titulo = titulo;
}
Livro(String autor, String titulo, int anoPublicacao, double preco){
    this.autor = autor;
    this.titulo = titulo;
    this.anoPublicacao = anoPublicacao;
    this.preco = preco;
}

public static void main(String[] args) {
    Livro livro1 = new Livro();
    Livro livro2 = new Livro("jk rowling", "Harry Potter");
    Livro livro3 = new Livro("Tolkien", "O Senhor dos Anéis", 1954, 29.90);

    System.out.println("Autor: " + livro2.autor);
    System.out.println("Título: " + livro2.titulo);
    System.out.println("Os dados desse livro são: " + livro3.autor + ", " + livro3.titulo + ", " + livro3.anoPublicacao + ", " + livro3.preco);
    System.out.println("Os dados desse livro são: " + livro1.autor + ", " + livro1.titulo + ", " + livro1.anoPublicacao + ", " + livro1.preco);

}
}

