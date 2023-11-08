package RaparigaLojas;

import java.util.ArrayList;

public class Departamento{

    private ArrayList<Roupa> arara;

   //construtor-inicializa 
public Departamento() {
    this.arara=new ArrayList<>();    
}

public ArrayList<Roupa> getArara() {
    return arara;
}

public void setArara(ArrayList<Roupa> arara) {
    this.arara = arara;
}

public void adicionarRoupa (Roupa roupa){
    arara.add(roupa);
} 


protected Roupa removerRoupa(Roupa roupa){
    Roupa roupaAchada=null;
    for (Roupa araraRoupa : arara) {
        if(araraRoupa.equals(roupa))
        {
            roupaAchada=araraRoupa;
            break;
        }     
              
    }
        if( roupa!= null)
        {
            arara.remove(roupaAchada);
            return roupaAchada;
        }else{
            return null;
        } 
}

}