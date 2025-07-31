package poo.collections;

import java.util.*;

public class exercicio06{
    public static void main(String []args){
    List<String> filmes = new ArrayList<>();
    filmes.add("Senhor dos aneis");
    filmes.add("Quarteto fantastico");
    filmes.add("Bullet Train");
    
    System.out.println("O filme Bullet train esta na lista? " + filmes.contains("Bullet Train"));

    System.out.println("Lista de filmes: " + filmes);
    }

}