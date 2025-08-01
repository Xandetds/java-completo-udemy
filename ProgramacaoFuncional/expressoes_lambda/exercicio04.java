package ProgramacaoFuncional.expressoes_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercicio04 {
    public static void main(String[] args) {

    List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 100, 200);
    List<Integer> numerosPares = new ArrayList<>();

    int i = 10; // lambda considera como final int i = 10;
    //i++; ou i = 20; mostraria que nao é final(constante) e nao rodaria

    listaDeNumeros.forEach( numero -> {

        int y = 200;
        y++;


        System.out.println("Valor do final: " + i);

        System.out.println("Valor de variavel (dentro da expressao): " + y);

        if (numero % 2 == 0){
            numerosPares.add(numero);
        }
        });
    
    System.out.println("Numeros pares: " + numerosPares);
    }
}
