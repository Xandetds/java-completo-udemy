public class exercicio21 {
    public static void main(String[] args) {
        var codigoDeSaida = 9;
        for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++){
            if (codigoCarteirinha == codigoDeSaida){
                System.out.println("o código "+ codigoDeSaida + " de saida foi utilizado");               
                break;
        }else if (codigoCarteirinha == 3 || codigoCarteirinha == 5 || codigoCarteirinha == 7) {
            System.out.println("O código "+ codigoCarteirinha + " foi aceito");
            continue;
        }
        System.out.println("O código da carteirinha " + codigoCarteirinha + " não é aceito pelo hospital Santa Clara.");
    }
}
}