/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje08.Zadaci.Z0801;

/**
 *
 * @author Celestin
 */
public class Mobitel {
    SimKartica simica = new SimKartica();
    
    public void unosPIN(int uneseniPIN){
        simica.provjeriPin(uneseniPIN);
    }
    public long prikaziBroj(){
        return simica.getTelBroj();
    }
    public long prikaziSerijski(){
        return simica.getserijskiBroj();
    }
    public boolean promjeniPIN(int stariPin, int noviPin){
        return simica.promjeniPIN(noviPin, stariPin);
    }
    public boolean otkljucajSIM(long provjeraPUK, int noviPin){
        return simica.resetPIN(provjeraPUK, noviPin);
    }
    
}
