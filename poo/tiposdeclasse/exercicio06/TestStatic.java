package poo.tiposdeclasse.exercicio06;

public class TestStatic {
    public static void exibirValor(int valor) {
        System.out.println("Valor: " + valor);
    }
    public static void exibirValor(String str){
        System.out.println("A string é: " + str);
    }
        
    public static void main(String[] args) {
        exibirValor(10);
        TestStatic.exibirValor("Alexandre");

    }
}
