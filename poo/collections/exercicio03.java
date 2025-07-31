package poo.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
//java.util.*

public class exercicio03{
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("Java");
        System.out.println("Lista: " + lista);

        
        lista.remove("Java");
        System.out.println("Contem java? " + lista.contains("Java"));


        List<String> outraLista = Arrays.asList("JavaScript", "Ruby");
        lista.addAll(outraLista);
        System.out.println(lista);


        String elemento = lista.get(2);
        System.out.println("Elemento no indice 2: " + elemento);


        lista.clear();
        System.out.println(lista);


    }
}