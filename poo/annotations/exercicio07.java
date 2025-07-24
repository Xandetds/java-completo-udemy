package poo.annotations;

class ExemploDepreated {
    @Deprecated
    public void metodoobsoleto(){
        System.out.println("Metodo Obsoleto");

    }
    }
    
public class exercicio07 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        ExemploDepreated exemplo = new ExemploDepreated();
        exemplo.metodoobsoleto();
        
    }
}

