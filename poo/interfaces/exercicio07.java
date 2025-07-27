package poo.interfaces;

interface PedidoRestaurante{
    void adicionarItem(String item, double preco);
    double calcularTotal();
}

class Pedido implements PedidoRestaurante{
    private double total = 0;
    public void adicionarItem(String item, double preco){
        System.out.println("O pedido é de: " + item + " e vale "+ preco);
        total += preco;
    }
    public double calcularTotal(){
        return total;
    }
    
}

public class exercicio07{
    public static void main(String[] args) {
    PedidoRestaurante pedido = new Pedido();
    pedido.adicionarItem("Hambúrguer", 35.0);
    pedido.adicionarItem("Batata Frita", 22.0);
    pedido.adicionarItem("Refrigerante", 5.50);
            
    System.out.println("O valor total do pedido é: " + pedido.calcularTotal());
}
}