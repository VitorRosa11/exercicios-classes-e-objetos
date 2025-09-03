
package Exercicio5;


public class ex5Retangulo {
     
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();
        
        retangulo.largura = 8.5;
        retangulo.altura = 12.3;
        
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}
