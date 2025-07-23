package poo.tiposdeclasse.exercicio08;

public class SalaDeAula {
    
    static int alunos = 0;
    public SalaDeAula() {
        alunos++;
    }
    static int getAlunos() {
        return alunos;
    }
}