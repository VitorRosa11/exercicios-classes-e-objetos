
package Exercicio3;


public class Carro {
    
    String marca;
    String modelo;
    int ano;
    int velocidade;
    
     public void acelerar(int incremento) {
        velocidade += incremento;
        System.out.println("O carro acelerou. Velocidade atual: " + velocidade + " km/h");
    }

    public void desacelerar(int decremento) {
        if (velocidade - decremento >= 0) {
            velocidade -= decremento;
        } else {
            velocidade = 0;
        }
        System.out.println("O carro desacelerou. Velocidade atual: " + velocidade + " km/h");
    }
}
