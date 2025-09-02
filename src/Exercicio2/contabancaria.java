
package Exercicio2;

public class contabancaria {
    
    public static void main(String[] args) {
        
        classeContaBancaria contaBancaria = new classeContaBancaria();
        
        contaBancaria.titular = "Guilherme Rosa Batista";
        contaBancaria.numeroConta = 4378665;
        contaBancaria.saldo = 2670.80;
        
        contaBancaria.exibirSaldo();
        contaBancaria.depositar(1500.00);
        contaBancaria.sacar(850.90);
        contaBancaria.exibirSaldo();
        
        
    }
}
