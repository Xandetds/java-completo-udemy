public class exercicio10 {
    public static void main(String[] args) {
        int diaDaSemana = 3;
        switch (diaDaSemana) {
        case 1 -> System.out.println("Segunda");
        case 2 -> System.out.println("Terca");
        case 3 -> System.out.println("Quarta");
        default -> System.out.println("Desconhecido");
        }
    

    String dia = "Ter";

    String tipoDeDia = switch(dia) {
        case "Seg", "Ter", "Qua", "Qui", "Sex" -> "Dia util";
        case "Sab", "Dom" -> "Final de Semana";
        default -> "Desconhecido";
    };
    System.out.println(tipoDeDia);
}
}
