package br.edu.ifba.saj.ads.poo;

public class ConverterExtenso4Digitos extends ConverterExtenso3Digitos {
    private int milhar;
    private ConverterExtenso3Digitos converterExtenso3Digitos;
    private String[] unidadaDeMilhar =  { "", "Mil", "Dois Mil", "Três Mil", "Quatro Mil", "Cinco Mil", "Seis Mil",
    "Sete Mil", "Oito Mil", "Nove Mil" };

    public ConverterExtenso4Digitos(int numero) {
        super(numero);
        this.milhar = numero/1000;
        int sobra = numero % 1000;
        if(sobra>0)
        {
            converterExtenso3Digitos = new ConverterExtenso3Digitos(sobra);
        }
    }

    @Override
    public String toString() {
        if(numero==0)
        {
            return "Zero";
        }
        else
        {
            String escrevendo = unidadaDeMilhar[milhar];
            if(converterExtenso3Digitos!=null)
            {
                escrevendo += " " + converterExtenso3Digitos.toString();
            }
            return escrevendo;
        }

       
    }




}
