package poo.exceptions;

public class exercicio04{
    
        public static int calcularMedia(int totalNotas, int totalAlunos) throws ArithmeticException {
            return totalNotas / totalAlunos;
        }

        public static void main(String[] args) {
            
            int totalNotas = 57;
            int totalAlunos = 0;

            try {
               int media = calcularMedia(totalNotas, totalAlunos);

               System.out.println("Media: " + media);
            } catch (ArithmeticException ae) {
                System.out.println("Erro: divisao por zero.     " + ae.getMessage());
            }
        }
    }
