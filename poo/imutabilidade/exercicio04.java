package poo.imutabilidade;

enum DiaDaSemana {
    SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO
}
 
public class exercicio04 {
    public static void main(String[] args) {
        DiaDaSemana dia = DiaDaSemana.SEGUNDA;
        System.out.println("Hoje é " + dia);
    }
}