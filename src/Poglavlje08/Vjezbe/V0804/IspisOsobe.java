/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje08.Vjezbe.V0804;

import java.util.Scanner;

/**
 *
 * @author Celestin
 */
public class IspisOsobe {
    public static void main(String[] args) {
    
    Osoba cele;
    cele = new Osoba();
    Osoba druga;
    druga = new Osoba();
    int unosGodine = 2013;
    Scanner sc = new Scanner(System.in);
    System.out.println("Unesite ime prve osobe: ");
    cele.setIme(sc.nextLine());
    System.out.println("Unesite prezime prve osobe: ");
    cele.setPrezime(sc.nextLine());
    System.out.println("Unesite godinu rodjenja prve osobe: ");
    cele.setGodinaRodjenja(sc.nextInt());
    sc.nextLine();
    System.out.println("Unesite ime druge osobe: ");
    druga.setIme(sc.nextLine());
    System.out.println("Unesite prezime druge osobe: ");
    druga.setPrezime(sc.nextLine());
    System.out.println("Unesite godinu rodjenja druge osobe: ");
    druga.setGodinaRodjenja(sc.nextInt());
    
    
   
        if(cele.getGodinaRodjenja() < druga.getGodinaRodjenja()){
            System.out.println(cele.getIme() + " je stariji za " + (druga.getGodinaRodjenja() - cele.getGodinaRodjenja()));
        } else 
            if(cele.getGodinaRodjenja() > druga.getGodinaRodjenja()){
                 System.out.println(druga.getIme() + " je stariji za " + (cele.getGodinaRodjenja() - druga.getGodinaRodjenja()));
            }else {
                 System.out.println("Osobe su jednako stare ");
            }
          
   // System.out.println(cele.stanje());
    System.out.println("Hvala na koristenju programa ");
    
    
    
    }
}
