
package Exercicio4;


public class Livro {
    
    String titulo;
    String autor;
    int numeroPaginas;
    int exemplaresDisponiveis;
    
    public void emprestarLivro(){
        if (exemplaresDisponiveis > 0){
            exemplaresDisponiveis--;
            System.out.println("Livro emprestado.");
        } else {
            System.out.println("Nenhum exemplar disponível no momento.");
        }
    }
    
    public void devolverLivro(){
        exemplaresDisponiveis++;
        System.out.println("Livro devolvido.");
    }
    public void exibirExemplares(){
        System.out.println("Total de exemplares disponíveis: "  + exemplaresDisponiveis);
    }
}
