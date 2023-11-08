package br.edu.ifba.saj.ads.poo;

public class CentralDeTeste {
    public static void main(String[] args) {
        TCL minhaTV = new TCL("TCL", 32.0, 1, 110); 
        minhaTV.ligar(); 
        minhaTV.aumentarVolume();
        minhaTV.aumentarVolume();
        minhaTV.aumentarVolume();
        minhaTV.aumentarVolume();
        minhaTV.aumentarVolume();
        minhaTV.aumentarVolume();
        minhaTV.subirCanal(); 

        System.out.println("Marca: " + minhaTV.marca);
        System.out.println("Polegadas: " + minhaTV.polegadas);
        System.out.println("Volume: " + minhaTV.volume);
        System.out.println("Canal: " + minhaTV.canal);
        System.out.println("Voltagem: " + minhaTV.volts);

        minhaTV.desligar(); 

        System.out.println("TV está ligada? " + minhaTV.display);       

    }
}
