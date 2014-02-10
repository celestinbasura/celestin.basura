/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje12.Zadaci.Z1201;

import java.util.ArrayList;

/**
 *
 * @author Celestin
 */
public class Deck {

    ArrayList<Cards> cardList = new ArrayList<>();

    public void createDeck() {
        for (Znakovi zn : Znakovi.values()) {
            for (Brojevi bn : Brojevi.values()) {
                cardList.add(new Cards(zn, bn));
            }

        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Cards cd : cardList){
            sb.append(cd.toString());            
        }
        return sb.toString();
    }
}
