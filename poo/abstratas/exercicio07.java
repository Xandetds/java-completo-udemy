package poo.abstratas;

abstract class FiguraGeometrica{
    abstract void calcularArea();
    abstract void calcularPerimetro();
}

class Retangulo extends FiguraGeometrica{
    int largura;
    int altura;

    Retangulo(int a, int b){
    this.largura = a;
    this.altura = b;
    }

    @Override
    void calcularArea (){
        System.out.println("Area: " + (this.largura * this.altura));
    }
    
    @Override
    void calcularPerimetro(){
        System.out.println("Perimetro: " + ((this.largura * 2) + (this.altura * 2)));
    }
}


public class exercicio07{
    public static void main(String[] args){
    Retangulo retangulo = new Retangulo(10, 20);
    retangulo.calcularArea();
    retangulo.calcularPerimetro();
}
}
