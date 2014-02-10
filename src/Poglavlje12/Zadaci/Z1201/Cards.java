/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje12.Zadaci.Z1201;

/**
 *
 * @author Celestin
 */
public class Cards {

    private Brojevi b;
    private Znakovi z;

    Cards(Znakovi zn, Brojevi bn) {
       this.b = bn;
       this.z = zn;
    }

    @Override
    public String toString() {

        return z.toString() + b.toString();
    }
   
           
}
