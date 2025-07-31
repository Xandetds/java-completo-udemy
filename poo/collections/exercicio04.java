package poo.collections;

import java.util.HashMap;
import java.util.Map;

public class exercicio04{
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Python", 10);
        mapa.put("Java", 20);
        mapa.put("JavaScript", 30);
        System.out.println("Contem Java?" + mapa.containsKey("Java"));
        System.out.println("Valor associado a Java: " + mapa.get("Java"));

        mapa.put("PHP", 25);
        System.out.println(mapa);
        
        mapa.remove("Python");
        System.out.println(mapa);

        mapa.put("PHP", 100);
        System.out.println(mapa);

        mapa.clear();
        System.out.println(mapa);
    }
}

