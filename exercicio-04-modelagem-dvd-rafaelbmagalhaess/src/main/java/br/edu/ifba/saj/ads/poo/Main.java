package br.edu.ifba.saj.ads.poo;

public class Main {
    public static void main(String[] args) {
        Dvd meuDvd = new Dvd(); // Criando um novo DVD

        // Ligar o DVD
        meuDvd.ligar();

        // Inserir um filme
        Filme meuFilme = new Filme("O Poderoso Chefão", 2.5, Filme.Categoria.Drama);
        meuDvd.inserirFilme(meuFilme);

        // Dar play
        meuDvd.play();

        // Aumentar volume
        meuDvd.aumentarVolume();

        // Dar play novamente (agora com o filme em execução)
        meuDvd.play();

        // Diminuir volume
        meuDvd.diminuirVolume();

        // Parar a reprodução
        meuDvd.pause();

        // Remover o filme
        meuDvd.removerFilme();

        // Tentar dar play novamente (sem filme inserido)
        meuDvd.play();
    }
}
