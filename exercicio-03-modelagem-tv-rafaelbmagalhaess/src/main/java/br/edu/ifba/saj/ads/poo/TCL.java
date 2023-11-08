package br.edu.ifba.saj.ads.poo;

public class TCL {
   String marca;
   Double polegadas;
   int volume;
   int canal;
   boolean display;
   int volts;

public TCL(String marca, Double polegadas, int canal, int volts) {
    this.marca = marca;
    this.polegadas = polegadas;
    this.volume = 5;
    this.canal = canal;
    this.volts = volts;
    this.display=false;
}

void ligar ()
{
    if(!display)
    {
        this.display=true;
        System.out.printf("LIGADA !!! >>%f<< \n", this.polegadas*this.volts);
    }

}
void desligar()
{
    if(display)
    {
        this.display=false;
    }
}

void aumentarVolume()
{
    if(display)
    {
        if(volume<10)
        {
            this.volume++;
        }
    }

}
void baixarVolume()
{
    if(display)
    {
        if(volume>1)
        {
            this.volume--;
        }
    }
}
void subirCanal()
{
    if(display)
    {
        this.canal++;
    }

}
void descerCanal()
{
    if(display)
    {
        if(canal>1)
        {
            this.canal--;
        }
        
    }
}



}
