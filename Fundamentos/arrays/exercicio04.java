package Fundamentos.arrays;

public class exercicio04 {
    public static void main(String[] args) {
        int pares[] = new int[6];
        pares[0] = 2;
        pares[1] = 4;
        pares[2] = 6;
        pares[3] = 8;
        pares[4] = 10;
        pares[5] = 77;

        for (int elemento : pares){
            if (elemento % 2 == 0) {
                System.out.println("O número " + elemento + " e par.");
            } else {
                System.out.println("O número " + elemento + " e impar.");
            }
        }
    }
}
