package br.edu.ifba.saj.ads.poo;

public class ConverterExtenso1Digito extends ConverterExtenso{
    private String[] porExtenso = { "Zero",
    "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove" };

    public ConverterExtenso1Digito(int numero) {
        super(numero);
    }

    @Override
    public String toString() {
        return porExtenso[numero%10];
    }

}
