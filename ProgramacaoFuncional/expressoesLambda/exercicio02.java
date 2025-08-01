package ProgramacaoFuncional.expressoesLambda;

import java.util.*;

public class exercicio02{
    public static void main(String[] args) {

    List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5);

    listaDeNumeros.forEach( (Integer numero) -> System.out.println(numero));
}
}