public class exercicio12 {
    public static void main(String[] args) {
        int mes = 6;
        
        String mesDoAno = switch(mes){
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Isso não é um mês";
        };

        System.out.println(mesDoAno);
    }
}
