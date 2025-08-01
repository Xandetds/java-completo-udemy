package ProgramacaoFuncional.expressoesLambda;

import java.util.*;

public class exercicio06 {
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        lista.add("Banana");
        lista.add("maca");
        lista.add("Uva");
        lista.add("Pera");

        lista.removeIf(s -> s.length() > 5);

        lista.add(0, "morango");

        lista.forEach(s -> System.out.println(s));
    }
    
}
