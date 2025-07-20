public class exercicio18 {
    public static void main(String[] args) {
        var soma = 0;
        
        for (int i = 0; i <= 10; i++){
            soma += i;
            System.out.println("i: " + i + " | Soma: " + soma);
        }
        System.out.println("Soma total de 1 a 10: " + soma);

    }
}
