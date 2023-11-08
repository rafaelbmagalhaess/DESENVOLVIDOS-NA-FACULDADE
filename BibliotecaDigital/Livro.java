package BibliotecaDigital;

public class Livro {
    private String titulo;
    private Autor autor;
    private Categorias categoria;

    
    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public Autor getAutor() {
        return autor;
    }


    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    public Categorias getCategoria() {
        return categoria;
    }


    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }


    public Livro(String titulo, Autor autor, Categorias categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

       
}
