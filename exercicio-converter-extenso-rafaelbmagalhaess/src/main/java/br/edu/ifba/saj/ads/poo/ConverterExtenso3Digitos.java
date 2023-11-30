package br.edu.ifba.saj.ads.poo;

public class ConverterExtenso3Digitos extends ConverterExtenso2Digitos{
    private ConverterExtenso2Digitos converterExtenso2Digitos;
    int centena;
    private String[] centenas = { "", "Cento", "Duzentos", "Trezentos", "Quatrocentos", "Quinhentos", "Seiscentos",
    "Setecentos", "Oitocentos", "Novecentos" };

    public ConverterExtenso3Digitos(int numero)
    {
        super(numero);
        this.centena= numero/100;
        int sobra= numero%100;
        if (sobra>0)
        {
            converterExtenso2Digitos = new ConverterExtenso2Digitos(sobra);
        }
    }


    @Override
    public String toString() {
        if(numero==0)
        {
            return"";
        } 
        else
        {
            String escrevendo = centenas[centena];
            if(converterExtenso2Digitos!= null)
            {
                escrevendo += " e "+converterExtenso2Digitos.toString();
            }
            return escrevendo;
        }
    }

}
