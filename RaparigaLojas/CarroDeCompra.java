package RaparigaLojas;

import java.util.ArrayList;

public class CarroDeCompra {
    private ArrayList<Roupa> carrinhoDeCompra;
    private float valorTotal;
    private int quantidadeDeItens;

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void setQuantidadeDeItens(int quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public CarroDeCompra() {
        this.carrinhoDeCompra = new ArrayList<>();
        this.valorTotal = 0;
        this.quantidadeDeItens = 0;
    }

    public boolean adicionarRoupaNoCarro (Roupa roupa, Departamento departamento)
    {
        for (Roupa procurandoRoupa : departamento.getArara()) {
            if(procurandoRoupa.equals(roupa))
            {
                if(departamento.removerRoupa(roupa)!=null)
                {
                 carrinhoDeCompra.add(roupa);
                valorTotal+=roupa.getPreco();
                quantidadeDeItens++;
                return true;
                }
                
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "CARRO DE COMPRA :" + carrinhoDeCompra ;
    }



    
}
