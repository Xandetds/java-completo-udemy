package poo.tiposdeclasse.exercicio03;

class FolhaDePagamento {
    public static void main(String[] args) {
    Funcionario6 funcionario6 = new Funcionario6("Alexandre", 2500.00);
    System.out.println(funcionario6.obterInfo());
    funcionario6.aumentarSalario(500.00);
    System.out.println(funcionario6.obterInfo());
      
}
}