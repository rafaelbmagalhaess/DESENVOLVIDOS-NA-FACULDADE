package br.edu.ifba.saj.ads.poo;

public class Filme {
    /*nome, categoria e duração. */
    String nome;
    double duracao;
    public enum Categoria {
        Romance,
        Drama,
        Terror,
        Suspense
    }
    Categoria categoria;
    public Filme(String nome, double duracao, Categoria categoria) {
        this.nome = nome;
        this.duracao = duracao;
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", categoria=" + categoria +
                '}';
    }
}
