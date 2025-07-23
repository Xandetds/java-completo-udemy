package Fundamentos.arrays;

public class exercicio01{
    public static void main(String[] args) {
        int[] meuArray;

        meuArray = new int[3];
        meuArray[0] = 5;
        meuArray[1] = 10;
        meuArray[2] = 15;
        
        //ou

        meuArray = new int[]{5, 10, 15};

        System.out.println(meuArray[0]);
        System.out.println(meuArray[1]);
        System.out.println(meuArray[2]);

        //alterando elemento

        meuArray[0] = 44;
        System.out.println("Valor alterado: " + meuArray[0]);

        //percorrer array

        for (int i =  0; i < meuArray.length; i++){
            System.out.println(meuArray[i]);
        // da pra usar  for (int elemento : meuArray)
        }
    }
}