package poo.generics.exercicio04;

class Tubarao{
    private String nome;
    private int dentes;

    public Tubarao (String nome, int dentes){
        this.nome = nome;
        this.dentes = dentes;
    }
        public String getNome(){
            return nome;
        }
        public int getDentes(){
            return dentes;
        }
}

class Polvo{
    private String nome;
    private int tentaculos;

    public Polvo(String nome, int tentaculos){
        this.nome = nome;
        this.tentaculos = tentaculos;
    }

    public String getNome(){
        return nome;
    }
    public int getTentaculos(){
        return tentaculos;
    }
}

class VaraDePesca<T>{
    private T conteudo;

    public void guardarNoCesto(T conteudo){
        this.conteudo = conteudo;
    }

    public T pescar(){
        return conteudo;
    }
}

public class Pescador{
    public static void main(String[] args) {
        VaraDePesca<Tubarao> tubaraoPescado = new VaraDePesca<>();
        tubaraoPescado.guardarNoCesto(new Tubarao("Tuba", 44));
        Tubarao tubarao = tubaraoPescado.pescar();
        System.out.println("Nome do tubarao pescado: " + tubarao.getNome() + ", numero de dentes dele: " + tubarao.getDentes());

        
        VaraDePesca<Polvo> polvoPescado = new VaraDePesca<>();
        polvoPescado.guardarNoCesto(new Polvo("Polva", 8));
        Polvo polvo = polvoPescado.pescar();
        System.out.println("Nome do polvo pescado: " + polvo.getNome() + ", numero de tentaculos dele: " + polvo.getTentaculos());

        
        
    }
}
