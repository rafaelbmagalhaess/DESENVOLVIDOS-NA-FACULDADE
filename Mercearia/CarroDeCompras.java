package Mercearia;

import java.util.ArrayList;

public class CarroDeCompras {
    private ArrayList<Produto> listaDeCompras;
    

    public CarroDeCompras()
    {
        this.listaDeCompras=new ArrayList<>();
    }

    public void adicionarProdutoCarro (Produto produto, int quant)
    {
        if(produto.removerQuantidade(quant))
        {
            listaDeCompras.add(produto);
        }
        
    }
    @Override
    public String toString()
    {
        return "Itens :" + listaDeCompras ;
    }



    
    
}
