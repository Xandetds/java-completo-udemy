package poo.collections;

import java.util.Set;
import java.util.HashSet;
// da pra ser em um só: import java.util.*; q importa tudo de util

public class exercicio01{
    public static void main(String[]args){
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("JavaScript");
        System.out.println("Contem java? " + conjunto.contains("Java"));
        
        conjunto.add("PHP");
        conjunto.add("c++");
        System.out.println("Conjunto completo: " + conjunto);

        conjunto.remove("Python");
        System.out.println("Conjunto apos remocao: " + conjunto);

        //tentando um duplicado
        boolean foiAdicionado = conjunto.add("Java");
        System.out.println("Java foi adicionado novamente? " + foiAdicionado);

        conjunto.clear();
        System.out.println("Conjunto depois de clear: " + conjunto);
    }
}
