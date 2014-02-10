/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje10.Zadaci.Z1002.MojOrmar;

import java.util.ArrayList;

/**
 *
 * @author Celestin
 */
public class Polica {
    
    private int kapacitet = 0;
    int napunjenost = 0;
    ArrayList<Kutija> popisKutija = new ArrayList<>(); 
    
    public Polica(int noviKapacitet){
        this.kapacitet = noviKapacitet;        
    }
    public Polica(){
        super();
    }
    void addKutija(Kutija newBox){
        if(newBox != null && !popisKutija.contains(newBox)){
            if(newBox.getVelicina() + napunjenost >= kapacitet ){
            popisKutija.add(newBox);     
            napunjenost += newBox.getVelicina();
            }
        }
    }
    void removeKutija(Kutija newBox){
        
        popisKutija.remove(popisKutija.indexOf(newBox));
    }
    ArrayList getBoxReference(){        
        return popisKutija;
    }
    int getKapacitet(){
        
        return kapacitet;
    }
    int getNapunjenost(){
        return napunjenost;
    }
    int slobodanProstor(){
        return kapacitet - napunjenost;
    }
}
