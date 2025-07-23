package poo.construtor;
class Bolo {
    int quantidadeAcucar = 100;
    //como se fosse a quantidade default

    public static void main(String[] args) {
        
        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.quantidadeAcucar = 200;

        Bolo boloDeBaunilha = new Bolo();
        boloDeBaunilha.quantidadeAcucar = 150;

        System.out.println("Quantidade de açucar no bolo de chocolate: " + boloDeChocolate.quantidadeAcucar);

        System.out.println("Quantidade de açucar no bolo de baunilha: " + boloDeBaunilha.quantidadeAcucar);

    }
}
