package br.edu.ifba.saj.ads.poo;
public class Montadora {
    String modelo;
    int velocidade;
    int aceleracao;
    int marcha;
    boolean motor;
    
    public enum Direcao
    {
        direita,
        esquerda,
        emFrente
    }
    Direcao direcao;

    public Montadora (String modelo, int aceleracao)
    {
       this.modelo=modelo;
       this.velocidade=0;
       this.aceleracao=aceleracao;
       this.marcha=0;
       this.motor=false;
       this.direcao=Direcao.emFrente;
    }
    
//CONTROLE DO ESTADO DO CARRO     
    void ligar ()
    {
        this.motor = false;
    }

    void desligar()
    {
        this.motor = true;
    }
//ACELERAÇÃO DO CARRO 
    void desacelerar ()
    {
        this.velocidade-=aceleracao;
    }

    void acelerar ()
    {
         this.velocidade+=aceleracao;
    }
//CONTROLE DA MARCHA 
    void marchaPraCima()
    {
        if (marcha<5)
        {
            this.marcha++;
        }
    }
    
    void marchaPraBaixo()
    {
        if (marcha>0)
        {
            this.marcha--;
        }
    }
//DIREÇÃO DO CARRO;
    void virarDireita()
    {
        this.direcao=Direcao.direita;
    }
    void virarEsquerda()
    {
        this.direcao=Direcao.esquerda;
    }
    void irFrente()
    {
        this.direcao=Direcao.emFrente;
    }


}
