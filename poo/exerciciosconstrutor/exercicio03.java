package poo.exerciciosconstrutor;
class Usuario {

    String nome;
    String senha;
    int idade;

    Usuario(String nomeUsuario, String senhaUsuario, int idadeUsuario){
        nome = nomeUsuario;
        senha = senhaUsuario;
        idade = idadeUsuario;
    }
 
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Mateus", "12345", 16);

        System.out.println("Nome: " + usuario1.nome);
        System.out.println("Senha: "+ usuario1.senha);
        System.out.println("Idade: " + usuario1.idade);
}
    
}
