/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje09.Zadaci.Z0901;

/**
 *
 * @author Celestin
 */
public class Plovilo {
    
    Mornar[] mornari = new Mornar[10];
    Oficir[] oficiri = new Oficir[3];
    Oficir kapetan = new Oficir();
  
    
    
    @Override
        public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mornari.length; i++) {
            mornari[i] = new Mornar();
            sb.append(mornari[i].toString()).append("\n");
        }
        sb.append("");
        sb.append("\n\n");
         for (int i = 0; i < oficiri.length; i++) {
            oficiri[i] = new Oficir();
            sb.append(oficiri[i].toString()).append("\n");
        }
        sb.append(kapetan.toString());
        return sb.toString();
        }
    }
       
