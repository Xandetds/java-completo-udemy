package Fundamentos.exercicios;
public class exercicio09{
    public static void main(String[] args) {
        var numero = 10;

        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par");
        }
        else{
            System.out.println("O número " + numero + " é impar");
        };


        int numero2 = 9;
        String resultado = (numero2 % 2 == 0) ? "par" : "impar";
        System.out.println(resultado);
 

        Object obj = "alexandre";
        if (obj instanceof String) {
        System.out.println(obj); 
        } 
    }
}