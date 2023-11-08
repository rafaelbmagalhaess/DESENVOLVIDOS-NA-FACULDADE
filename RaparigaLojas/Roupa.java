package RaparigaLojas;



public class Roupa {
    private String nome;
    private  Tamanho tamanho;
    private float preco;
    private String cor;
    
    public Roupa(Tamanho tamanho, float preco, String cor, String nome) {
        this.tamanho = tamanho;
        this.preco = preco;
        this.cor = cor;
        this.nome= nome;
    }

     public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        
        return "\n"+"Roupa: " +   nome    + tamanho + ", " + cor + ", R$" + preco;
    }

    
}
