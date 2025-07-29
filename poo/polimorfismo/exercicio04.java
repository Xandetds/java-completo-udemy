package poo.polimorfismo;

abstract class Veiculo {
    private String placa;
    private int ano;

    public Veiculo(String placa, int ano) { 
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Placa do veiculo: " + this.placa);
        System.out.println("Ano do veiculo: " + this.ano);
    }
}

class Onibus extends Veiculo {
    private int assentos; 

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano); 
        this.assentos = assentos; 
    }

    @Override 
    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("Assentos do onibus: " + this.assentos); 
    }
}

class Caminhao extends Veiculo {
    private int eixos; 

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano); 
        this.eixos = eixos; 
    }

    @Override 
    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("Eixos do caminhao: " + this.eixos); 
    }
}

public class exercicio04 { 
    public static void main(String[] args) {
        Onibus busao = new Onibus("ABC1234", 2010, 45);
        System.out.println(" ");
        busao.exibirInformacoes();

        System.out.println(" ");
        Caminhao meuCaminhao = new Caminhao("XYZ9876", 2022, 6);
        meuCaminhao.exibirInformacoes();
    }
}