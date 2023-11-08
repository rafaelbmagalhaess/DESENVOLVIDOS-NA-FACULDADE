package br.edu.ifba.saj.ads.poo;

public class Controle {
    public static void main(String[] args) {
        Montadora meuCarro = new Montadora("Mercedez Benz", 100);

        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.marchaPraCima();
        meuCarro.marchaPraCima();
        meuCarro.marchaPraCima();
        meuCarro.virarEsquerda();

        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Velocidade: " + meuCarro.velocidade);
        System.out.println("Marcha: " + meuCarro.marcha);
        System.out.println("Direcao: " + meuCarro.direcao);        
    }
}
