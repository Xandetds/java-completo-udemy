package ProgramacaoFuncional.expressoesLambda;

import java.util.*;

public class exercicio05{
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 77, 88);
        List<Integer> impares = new ArrayList<>();

        numeros.forEach(numero -> {

        if (numero % 2 != 0){
            impares.add(numero);
        }});
        System.out.println("Numeros impares: " + impares);
    }
}
