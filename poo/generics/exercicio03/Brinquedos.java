package poo.generics.exercicio03;

class Carrinho {
    private String modelo;

    public Carrinho(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }
}

class Boneco{
    private String nome;

    public Boneco(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}

public class Brinquedos{
    public static void main(String [] args){
        Carrinho c = new Carrinho("Hot wheels");
        Boneco b = new Boneco("Ben 10");
        System.out.println("Carrinho: " + c.getModelo());
        System.out.println("Boneco do: " + b.getNome());
    }
}
