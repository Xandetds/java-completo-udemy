package poo.collections;
import java.util.*;

public class exercicio02{
    public static void main(String[] args) {
    Set<Integer> numeros = new HashSet<>();
    numeros.add(3);
    numeros.add(6);
    numeros.add(9);

    System.out.println("o numero 4 esta presente em numeros? " + numeros.contains(4));

    numeros.remove(6);

    System.out.println(numeros);
    }
}