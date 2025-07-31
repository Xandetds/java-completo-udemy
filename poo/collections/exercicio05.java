package poo.collections;

import java.util.*;

public class exercicio05{
    public static void main(String []args){
    Map<String, Integer> mapa = new HashMap<>();
    mapa.put("Cachos de banana", 3);
    mapa.put("Garrafas de refri", 10);
    mapa.put("Pacotes de carne moida", 5);
    System.out.println("Quantas garrafas de refri tem? " + mapa.get("Garrafas de refri"));


    System.out.println("Estoque atual: " + mapa);

    String produtoParaRemover = "Pacotes de carne moida";
    int quantidadeParaRemover = 2;


    if(mapa.containsKey(produtoParaRemover)){
        int quantidadeAtual = mapa.get(produtoParaRemover);
    

    if (quantidadeAtual >= quantidadeParaRemover){
        int novaQuantidade = quantidadeAtual - quantidadeParaRemover;
        mapa.put(produtoParaRemover, novaQuantidade);
        System.out.println("Removido: " + quantidadeParaRemover + " de " + produtoParaRemover );
        System.out.println("Nova quantidade de " + produtoParaRemover + ": " + mapa.get(produtoParaRemover));
    }else{
        System.out.println("Estoque insuficiente para " + produtoParaRemover + ". Quantidade disponivel: " + mapa.get(produtoParaRemover));
    }
}
    System.out.println("Estoque atualizado: " + mapa);

}
}