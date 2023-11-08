package RaparigaLojas;

public class Loja {
    public static void main(String[] args) {
        Roupa blusa = new Roupa(Tamanho.p, 10.00f, "Vermelho","Blusinha");
        Roupa calca = new Roupa(Tamanho.pp, 150.00f, "Branco","Calca azulada");
        Roupa vestido = new Roupa(Tamanho.g, 220.00f, "Azul","Vestido longo");
        Roupa casaco = new Roupa(Tamanho.m, 359.99f, "Bege","Casaco BEGE");
        Roupa bermuda = new Roupa(Tamanho.gg, 56.80f, "Estampa florida", "Bermuda verão");
        Roupa croped = new Roupa(Tamanho.p, 89.99f, "Preto", "Croped outono");

        //cirando departamentos 
        Departamento masculinoDepartamento = new Departamento();
        Departamento femininoDepartamento = new Departamento();
        Departamento infantilDepartamento = new Departamento();  

        //adicionando as roupas nos departamentos
        for(int x=0;x<10;x++)
        {
             masculinoDepartamento.adicionarRoupa(blusa); 
             masculinoDepartamento.adicionarRoupa(calca);
             masculinoDepartamento.adicionarRoupa(bermuda);
             masculinoDepartamento.adicionarRoupa(casaco);
             
        }
         for(int x=0;x<10;x++)
        {
             femininoDepartamento.adicionarRoupa(blusa); 
             femininoDepartamento.adicionarRoupa(vestido);
             femininoDepartamento.adicionarRoupa(croped);
             femininoDepartamento.adicionarRoupa(casaco);
        }
         for(int x=0;x<10;x++)
        {
             infantilDepartamento.adicionarRoupa(bermuda); 
             infantilDepartamento.adicionarRoupa(bermuda); 
        }

        
        CarroDeCompra comprasDeRafael = new CarroDeCompra();



        //testando verficação de exesso de retirada do departamento...
         for(int x=0;x<15;x++)
        {
             comprasDeRafael.adicionarRoupaNoCarro(blusa, masculinoDepartamento);
        }


        
        
        System.out.println(comprasDeRafael);
        System.out.println("VALOR TOTAL DA COMPRA :"+ comprasDeRafael.getValorTotal());
        System.out.println("QUANTIDADE DE ITENS: "+comprasDeRafael.getQuantidadeDeItens());

    }
    
}
