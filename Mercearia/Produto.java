package Mercearia;

import java.time.LocalDate;


public class Produto {
    private String nomeDoProduto;
    private Categoria categoriaDoProduto;
    private int quantidadeDisponivel;
    private float valorDoProduto;
    private LocalDate dataDeValidade;
    
    //precisa adicionar a data de validade


    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }
    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
    //construtor
    public Produto (String nome, Categoria categoria, int quantidade, float valor, LocalDate data)
    {
        this.nomeDoProduto=nome;
        this.categoriaDoProduto=categoria;
        this.quantidadeDisponivel=quantidade;
        this.valorDoProduto=valor;
        this.dataDeValidade=data;
    }
    public void adicionarQuantidade(int quant)
    {
        if(quant >=1){
            setquantidadeDisponivel(getquantidadeDisponivel() + quant);
        }
        
    }

    public boolean removerQuantidade(int quant)
    {
        if(quant <= quantidadeDisponivel)
        {
            this.setquantidadeDisponivel(getquantidadeDisponivel()-quant);
            return true;
        }
        else{
            return false;
        }
    }



    public void setValor(float valor)
    {
        this.valorDoProduto=valor;
    }
    
    public float getValor()
    {
        return valorDoProduto;
    }

    public void setquantidadeDisponivel(int x)
    {
        this.quantidadeDisponivel=x;
    }

    public int getquantidadeDisponivel ()
    {
        return quantidadeDisponivel;
    }

    public void setCategoria (Categoria categoria )
    {
        this.categoriaDoProduto =categoria;
    }

    public Categoria getCategoria()
    {
        return categoriaDoProduto;
    }

    public void setNomeDoProduto(String nome)
    {
        this.nomeDoProduto=nome;
    }

    public String getNomeDoProduto()
    {
        return nomeDoProduto;
    }

    @Override 

    public String toString()
    {
        return "\n Nome : " + nomeDoProduto + " Categoria : " 
        + categoriaDoProduto +" Quantidade : "+quantidadeDisponivel+" Valor : "+valorDoProduto+ " DATA DE VALIDADE : " + dataDeValidade;
    }
    
}

