
package ex1pessoa;


public class Pessoa {
    
    public static void main(String[] args) {
        
        atributosPessoa pessoa = new atributosPessoa();
        
        pessoa.nome = "Vitor Rosa Batista";
        pessoa.idade = 16;
        pessoa.profissao = "Estudante";
        
        pessoa.exibirDetalhes();
    }
}
