/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje08.Zadaci.Z0801;

import java.util.Scanner;

/**
 *
 * @author Celestin
 */
public class Main {
     public static void main(String[] args) {
         Mobitel HTC = new Mobitel();
         int PIN;
         long PUK;
         int odabir = 1;
         
         
         while(odabir != 0){
         System.out.println("\n\nUnesite odabir funkcije mobitela: \n"
                 + "0.KRAJA PROGRAMA\n"
                 + "1.Unos PIN-a\n"
                 + "2.Promjena PIN-a\n"
                 + "3.Otkljucavanje SIM-a uz novi PIN\n"
                 + "4.Prikazi broj telefona\n"
                 + "5.Prikazi serijski broj\n");
         Scanner sc = new Scanner(System.in);
         
            odabir = sc.nextInt();         
            sc.nextLine();
            switch(odabir){
                case (1):
                    System.out.println("Unesite PIN za pocetak");
                    PIN = sc.nextInt();
                    HTC.unosPIN(PIN);
                    break;
                case (2):
                    System.out.println("Unesite PIN za pocetak");
                    PIN = sc.nextInt();
                    System.out.println("Unesite novi PIN");
                    HTC.promjeniPIN(PIN, sc.nextInt());
                    break;
                case (3):
                    System.out.println("Unesite PUK za pocetak");
                    PUK = sc.nextLong();
                    System.out.println("Unesite novi PIN");
                    HTC.otkljucajSIM(PUK, sc.nextInt());
                    break;
                case (4):
                    System.out.println("Broj telefona je " + HTC.prikaziBroj());
                    break;
                case (5):
                    System.out.println("Serijski broj telefona je " + HTC.prikaziSerijski());
                    break;
                default:
                     System.out.println("Odabrana je kriva funkcija");         
                 
         
            }
        }
         
          System.out.println("Hvala na koristenju ovoga super programa ");
     }    
}
