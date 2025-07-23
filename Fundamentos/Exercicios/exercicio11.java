package Fundamentos.exercicios;
public class exercicio11 {
    public static void main(String[] args) {
        var nivel = 1;

        switch(nivel) {
            case 1 -> System.out.println("Insatisfeito");
            case 2 -> System.out.println("Satisfeito");
            case 3 -> System.out.println("Muito satisfeito");
            default -> System.out.println("ERRO");
        };

        int diaDaSemana = 3;
        switch (diaDaSemana) {
            case 1:
            System.out.println("Seg");
            break;
            case 2:
            System.out.println("Ter");
            break;
            case 3:
            System.out.println("Qua");
            break;
            case 4:
            System.out.println("Qui");
            break;
            case 5:
            System.out.println("Sex");
            break;
            default:
            System.out.println("Dia desconhecido");
            break;
            };
                    
    
}
}