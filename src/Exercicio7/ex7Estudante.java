
package Exercicio7;

public class ex7Estudante {

    public static void main(String[] args) {
        
        Estudante estudante = new Estudante();
        
        estudante.nome = "Vitor Rosa Batista";
        estudante.idade = 16;
        
        
        estudante.adicionarDisciplinas("Ingl?s");
        estudante.adicionarDisciplinas("Química");
    
        estudante.exibirDisciplinas();
    }
    
}
