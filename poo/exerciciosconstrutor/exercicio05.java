class Aluno {

    String nome;
    String senha;
    int idade;

    Aluno(String nomeAluno, String senhaAluno, int idadeAluno){
        nome = nomeAluno;
        senha = senhaAluno;
        idade = idadeAluno;
        }
    Aluno(String nomeAluno){
        nome = nomeAluno;

        }
    Aluno(int idadeAluno){
        idade = idadeAluno;
    }
    Aluno(){
    }
 
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(12);


        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Senha: "+ aluno1.senha);
        System.out.println("Idade: " + aluno1.idade);
}
    
}
