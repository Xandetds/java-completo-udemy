package poo.tiposdeclasse.exercicio10;

public class Personagem {
    public String nome;
    public int nivelDePoder;

    Personagem(String nome, int nivelDePoder) {
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }

    public int aumentarPoder(int aumento){
        this.nivelDePoder += aumento;
        return this.nivelDePoder;
    }

    public String mudarNome(String novoNome){
        this.nome = novoNome;
        return this.nome;
    }

    public static void main(String[] args) {
        Personagem personagem1 = new Personagem("Goku", 8000);
        System.out.println("Nivel de poder : " + personagem1.nivelDePoder);
        personagem1.aumentarPoder(2000);
        System.out.println("Nivel de poder apos aumento: " + personagem1.nivelDePoder);
        personagem1.mudarNome("Kakarotto");
        System.out.println("Novo nome do personagem: " + personagem1.nome + ", nivel de poder: " + personagem1.nivelDePoder);
    }
}
