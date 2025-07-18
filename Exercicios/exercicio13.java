public class exercicio13 {
    public static void main(String[] args) {
        String mes = "Fevereiro";
        
        String diasNoMes = switch(mes){
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> "31";
            case  "Abril", "Junho", "Setembro", "Novembro" -> "30";
            case "Fevereiro" -> "28";
            default -> "Esse mês não existe";
        };
        System.out.println("Esse mês tem "+ diasNoMes + " dias");
    }
}
