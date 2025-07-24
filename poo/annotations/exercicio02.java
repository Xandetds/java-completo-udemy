package poo.annotations;

class InformaRegras{

    @Deprecated
    public void mostrarRegrasAposentadoria() {
        System.out.println("Regras de aposentadoria: ");
    }   

    public void novasRegrasAposentadoria() {
        System.out.println("Novas regras de aposentadoria: ");
    }
}

public class exercicio02{
    public static void main(String[] args) {
        
        InformaRegras regras = new InformaRegras();
        regras.mostrarRegrasAposentadoria();
        regras.novasRegrasAposentadoria();

    }
}