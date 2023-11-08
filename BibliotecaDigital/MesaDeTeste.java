package BibliotecaDigital;

import java.util.ArrayList;

public class MesaDeTeste {
    public static void main(String[] args) {
       
        Autor autor1 = new Autor("autor1@email.com", "Autor 1");
        Autor autor = new Autor("autor2@email.com", "Autor 2");

       
        Livro livro1 = new Livro("Livro 1", autor1, Categorias.Terror);
        Livro livro2 = new Livro("Livro 2", autor1, Categorias.Terror);
        Livro livro3 = new Livro("Livro 3", autor1, Categorias.Comedia);

       
        Estante estante = new Estante();

        
        estante.adicionarNovoLivro(livro1);
        estante.adicionarNovoLivro(livro2);
        estante.adicionarNovoLivro(livro3);

        ArrayList<Livro> livrosEncontrados = estante.procurandLivro("Terror");

        if (livrosEncontrados != null) {
            for (Livro livro : livrosEncontrados) {
                System.out.println("Livro encontrado: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor().getNome());
                System.out.println("Categoria: " + livro.getCategoria());
            }
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
