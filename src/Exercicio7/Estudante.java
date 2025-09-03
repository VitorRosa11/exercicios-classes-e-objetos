
package Exercicio7;

import java.util.ArrayList;



public class Estudante {
    
    String nome;
    int idade;
    ArrayList<String> disciplinas = new ArrayList<>();
    
    public void adicionarDisciplinas(String disciplina){
        disciplinas.add(disciplina);
        System.out.println("Disciplina adicionada: " + disciplina);
    }
    public void exibirDisciplinas(){
        System.out.println("Disciplinas registradas na matrícula: " + disciplinas);
        for (String d : disciplinas) {
            System.out.println("- " + d);
        }
        
    }
    
    
    
}
