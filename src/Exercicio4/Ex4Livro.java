
package Exercicio4;


public class Ex4Livro {
    
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        
        livro.titulo = "Nunca desista dos seus sonhos";
        livro.autor = "Augusto Cury";
        livro.numeroPaginas = 160;
        livro.exemplaresDisponiveis = 7;
       
        
        livro.exibirExemplares();
        livro.emprestarLivro();
        livro.devolverLivro();
        livro.exibirExemplares();
    }
}
