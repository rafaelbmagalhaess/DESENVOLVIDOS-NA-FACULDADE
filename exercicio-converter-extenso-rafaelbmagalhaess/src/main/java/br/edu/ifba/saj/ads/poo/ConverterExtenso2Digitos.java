package br.edu.ifba.saj.ads.poo;

public class ConverterExtenso2Digitos extends ConverterExtenso1Digito {
    private String[] dezenas = {"", "Dez", "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta",
            "Oitenta", "Noventa"};

    public ConverterExtenso2Digitos(int numero) {
        super(numero);
    }

    @Override
    public String toString() {
        if (numero == 0) {
            return "";
        } else if (numero <= 10) {
            return super.toString();
        } else {
            return dezenas[numero / 10] + " e " + super.toString();
        }
    }
}