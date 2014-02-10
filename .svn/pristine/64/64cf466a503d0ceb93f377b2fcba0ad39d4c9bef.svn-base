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
public class SimKartica {
    
    final long telBroj = 95530953;
    int pinBroj = 1234;
    final long serijskiBroj = 232323232;
    final long pukBroj = 89898989;
    int pinErrorCount = 0;
    int pukErrorCount = 0;
    boolean simLocked = false;   
    boolean simFullyLocked = false;

    
    public long getTelBroj(){
        return this.telBroj;
    }
    public long getserijskiBroj(){
        return this.serijskiBroj;
    }
    public boolean provjeriPin(int provjeraPin){
        
        if(simLocked){
            System.out.println("Kartica je zakljucana, mozete samo unijeti PUK broj za otkljucavanje.");
            return false;
        }else{
        
            if(provjeraPin == pinBroj){
                pinErrorCount = 0;
                System.out.println("Pin je tocan");
                return true; 
                 
            }else{
                pinErrorCount++;
                 if(pinErrorCount == 3) {
                    System.out.println("SIM je zakljucana zbog unosa krivog PIN-a 3 puta");
                    simLocked = true;
                    return false;
                }
                System.out.println("Pin je netocan i imate jos " + 
                        (3 - pinErrorCount) +
                        " pokusaja za unos");
                return false;
            }        
        }
    }
    public boolean promjeniPIN(int noviPin, int stariPin){
        if(simLocked){
            System.out.println("Kartica je zakljucana, mozete samo unijeti PUK broj za otkljucavanje.");
            return false;
        }else{
            if(stariPin == pinBroj){
                pinBroj = noviPin;
                pinErrorCount = 0;
                System.out.println("Pin je promijenjen");
                return true;
         }else{
                pinErrorCount++;
                if(pinErrorCount == 3) {
                    System.out.println("SIM je zakljucana zbog unosa krivog PIN-a 3 puta");
                    simLocked = true;
                    return false;
                }
                System.out.println("Unesen je krivi pin i imate jos " +
                (3 - pinErrorCount) +
                " pokusaja za unos");
                return false;
            }
        }
            
    }
    public boolean provjeriPUK(long provjeraPUK){
        if(provjeraPUK == pukBroj){
            System.out.println("PUK je ispravan");
            return true;
        }else{
            System.out.println("PUK je netocan");
            return false;
        }
    
    }
    public boolean resetPIN (long provjeraPUK, int noviPIN){
        
        if(simFullyLocked){
            System.out.println("SIM je kompletno zakljucan i molim da se javite svom operateru za pomoc");
            return false;
        }else{
            if(provjeraPUK == pukBroj){
                pinBroj = noviPIN;
                System.out.println("PIN broj je promijenjen i SIM je otkljucana");
                return true;
            }else{           
                pukErrorCount++;
                    if(pukErrorCount == 8) {
                        System.out.println("SIM je zakljucana zbog unosa krivog PUK-a 8 puta");
                        simLocked = true;
                        simFullyLocked = true;
                        return false;
                    }
                    System.out.println("Unesen je krivi PUK i imate jos " +
                    (8 - pukErrorCount) +
                    "pokusaja za unos");
                    return false;
                }
            }        
        }
   
}
