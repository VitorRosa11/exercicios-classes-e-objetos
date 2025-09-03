
package Exercicio3;

public class ex3Carro {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        
        carro.marca = "Volkswagen";
        carro.modelo = "Tera";
        carro.ano = 2025;
        carro.velocidade = 0;
        
        carro.acelerar(60);
        carro.desacelerar(30);
        
    
        
    }
}
