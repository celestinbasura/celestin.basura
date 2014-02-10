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
public class Ormar {
    private int ukupnaNapunjenost;
    private int ukupniProstor;
    ArrayList<Polica> popisPolica = new ArrayList<>(); 
    
    void AddPolica(int kapacitetPolice){
        
        popisPolica.add(new Polica(kapacitetPolice));
        ukupniProstor += kapacitetPolice;
    }
    Polica AddKutija(Kutija newBox){
        int indexNajpraznije;
        int velicina = 0;
         for(int i = 0; i < popisPolica.size(); i++){
             if(popisPolica.get(i).slobodanProstor() > velicina){
                 indexNajpraznije = i;
             }
             
         }
        for(int i = 0; i < popisPolica.size(); i++){
            if(popisPolica.get(i).popisKutija.contains(newBox))
                return null;
        }
       
      
       return null;
        
    }
}
