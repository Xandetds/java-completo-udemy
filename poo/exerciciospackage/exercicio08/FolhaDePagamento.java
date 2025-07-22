package poo.exerciciospackage.exercicio08;

class FolhaDePagamento {
    public static void main(String[] args) {
    Funcionario8 funcionario8 = new Funcionario8("Alexandre", 2500.00);
    funcionario8.aumentarSalario(1000.00);
    funcionario8.aumentarSalario(10); 
    System.out.println(funcionario8.obterInfo());

      
}
}