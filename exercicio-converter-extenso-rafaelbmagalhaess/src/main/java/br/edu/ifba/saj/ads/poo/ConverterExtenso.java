package br.edu.ifba.saj.ads.poo;

public abstract class ConverterExtenso {
    protected int numero;
    
    public abstract String toString();
    
    public ConverterExtenso(int numero)
    {
        this.numero=numero;
    }
}
