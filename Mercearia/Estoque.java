package Mercearia;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> gandola;
    

    public Estoque()
    {
        this.gandola= new ArrayList<>();
    }


    public void adicionarProduto(Produto produto)
    {           
                this.gandola.add(produto);
                     
    }

    @Override
    public String toString()
    {
        return "Produtos disponiveis : " + gandola;
    }
    
    
}
