package poo.annotations;
 class MinhaClasse{
    public void calcularSoma(int a, int b){
        System.out.println("Soma: " + (a + b));
    }
    @Deprecated
    public void calcularProduto(int a, int b){
        System.out.println("Produto: " + (a * b));
    }
 }


 public class exercicio06{
    public static void main(String[] args) {
    MinhaClasse classe = new MinhaClasse();
    classe.calcularSoma(5,10);
    classe.calcularProduto(5,10);
 }
}