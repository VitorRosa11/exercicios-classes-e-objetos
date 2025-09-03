
package Exercicio6;


public class ex6Contador {
    
    public static void main(String[] args) {
        
        Contador contador = new Contador();
        
        contador.contagem = 4;
        contador.incrementar();
        contador.incrementar();
        contador.decrementar();
        contador.exibirValor();
    }
}
