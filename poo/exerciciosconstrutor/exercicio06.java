package poo.exerciciosconstrutor;
class Carro {
    String marca;
    String modelo;
    int ano;


    Carro(){
    }
    Carro(String marcaDoCarro, String modeloDoCarro){
        marca = marcaDoCarro;
        modelo = modeloDoCarro;
    }
    Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro ){
        marca = marcaDoCarro;
        modelo = marcaDoCarro;
        ano = anoDoCarro;
    }
public static void main(String[] args) {
    Carro carro1 = new Carro("Fiat", "Uno");
    Carro carro2 = new Carro("Renault", "Sandero", 1999);
    Carro carro3 = new Carro();


    System.out.println("Nome: " + carro1.marca);
    System.out.println("Senha: "+ carro3.modelo);
    System.out.println("Idade: " + carro2.ano);
}

}
