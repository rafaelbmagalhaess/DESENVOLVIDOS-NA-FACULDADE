package Mercearia;

import java.time.LocalDate;


public class MercadinhoDoZe {
    public static void main(String[] args) {
         
        Produto p1 = new Produto("Leite ", Categoria.Bebida, 5, 6.49f, LocalDate.of(2023, 5, 21) );
        Produto p2 = new Produto("Arroz ", Categoria.Alimento, 10, 9.99f, LocalDate.of(2023, 5, 21));

        Estoque gandolaAlimentos = new Estoque();
        gandolaAlimentos.adicionarProduto(p2);
        gandolaAlimentos.adicionarProduto(p1);
        System.out.println(gandolaAlimentos);

        CarroDeCompras carroDerafael = new CarroDeCompras();

        carroDerafael.adicionarProdutoCarro(p2,11);
        System.out.println(carroDerafael);
        
        
    }
    
}
