
package Exercicio5;


public class ex5Retangulo {
     
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();
        
        retangulo.largura = 8.5;
        retangulo.altura = 12.3;
        
        System.out.println("�rea do ret�ngulo: " + retangulo.calcularArea());
        System.out.println("Per�metro do ret�ngulo: " + retangulo.calcularPerimetro());
    }
}
