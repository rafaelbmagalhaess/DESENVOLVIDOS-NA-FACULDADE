package br.edu.ifba.saj.ads.poo;


public class Dvd {
    private boolean estado;
    private boolean reproduzindo;
    private int volume;// deve iniciar em 2
    private Filme filme;
    
    public Dvd() {
        this.estado = false;
        this.reproduzindo = false;
        this.volume = 2;
        this.filme = null;
    }
    public boolean getEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public void ligar ()
    {
        if(!getEstado())
        {
            setEstado(true);
        }
    }

    public void desligar()
    {
        if (getEstado())
        {
            setEstado(false);
        }
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public void play()
    {
        if(getEstado()&&getFilme()!=null)
        {
            setReproduzindo(true);
            System.out.println(getFilme().toString());
        }
    }
       public void pause()
    {
        if(getEstado()&&getFilme()!=null)
        {
            setReproduzindo(false);
        }
    }



    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void aumentarVolume()
    {
        if(getEstado())
        {
            if(getVolume()<5)
            {
                setVolume(getVolume()+1);
            }
        }
    }
    public void diminuirVolume()
    {
        if(getEstado())
        {
            if(getVolume()>1)
            {
                setVolume(getVolume()-1);
            }
        }
    }
    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    public void inserirFilme(Filme filme )
    {
        if(getEstado()&&getFilme()==null)
        {
            setFilme(filme);
        }
    }
    public void removerFilme()
    {
        if(getEstado()&&getFilme()!=null)
        {
            setFilme(null);
        }
    } 


    
}
