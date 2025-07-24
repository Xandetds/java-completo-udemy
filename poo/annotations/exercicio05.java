package poo.annotations;

class InformaRegras{

    @Deprecated
    public void mostrarRegrasAposentadoria() {
        System.out.println("Regras de aposentadoria: ");
    }   

    public void novasRegrasAposentadoria() {
        System.out.println("Novas regras de aposentadoria: ");
    }
    public void ChamarMetodoObsoletoMesmaClasse(){
        mostrarRegrasAposentadoria();
    }
    
}

public class exercicio05{
    public static void main(String[] args) {
        
        InformaRegras regras = new InformaRegras();
        regras.ChamarMetodoObsoletoMesmaClasse();

    }
}