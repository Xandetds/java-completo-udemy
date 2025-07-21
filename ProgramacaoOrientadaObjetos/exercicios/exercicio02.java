class Funcionario {
    
    String nome;
    String cargo;
    int idade;
    
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        
        funcionario1.nome = "xande";
        funcionario1.cargo = "desenvolvedor";
        funcionario1.idade = 19;

        Funcionario funcionario2 = new Funcionario();

        funcionario2.nome = "joao";
        funcionario2.cargo = "gerente";
        funcionario2.idade = 120;
        

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: "+ funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade);

        System.err.println(" ");

        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: "+ funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);
    }
}
