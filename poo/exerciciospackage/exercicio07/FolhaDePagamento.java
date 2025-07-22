package poo.exerciciospackage.exercicio07;

class FolhaDePagamento {
    public static void main(String[] args) {
    Funcionario7 funcionario7 = new Funcionario7("Alexandre", 2500.00);
    System.out.println(funcionario7.obterInfo());
    funcionario7.aumentarSalario(500.00);
    System.out.println(funcionario7.obterInfo());
    funcionario7.alterarQualquerSalario(funcionario7, 9000.00);
    System.out.println(funcionario7.obterInfo());
      
}
}