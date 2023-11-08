package BibliotecaDigital;

import java.util.ArrayList;

public class Estante {
    private ArrayList<Livro> pateleira;

    public Estante() {
        this.pateleira = new ArrayList<>();
    }

    public void adicionarNovoLivro(Livro livroAdLivro) {
        boolean livroJaExiste = false;
    
        for (Livro livroColetado : pateleira) {
            if (livroAdLivro.getTitulo().equals(livroColetado.getTitulo())) {
                livroJaExiste = true;
                break;
            }
        }
    
        if (!livroJaExiste) {
            pateleira.add(livroAdLivro);
        }
    }
    

    public ArrayList<Livro> procurandLivro(String procurando) {
        ArrayList<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livroColetado : pateleira) {
            if (procurando.equals(livroColetado.getTitulo()) ||
                procurando.equals(livroColetado.getAutor().getNome()) ||
                procurando.equals(livroColetado.getCategoria().toString())) {
                livrosEncontrados.add(livroColetado);
            }
        }

        return livrosEncontrados;
    }
    
}
