package poo.tiposdeclasse.exercicio09;

public class Aplicacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Alexandre";
        pessoa.telefone = 48996494554L;
        pessoa.setIdade(19);
        pessoa.endereco = "Rua A, 123";

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Telefone: " + pessoa.telefone);
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.endereco);   
     }
}