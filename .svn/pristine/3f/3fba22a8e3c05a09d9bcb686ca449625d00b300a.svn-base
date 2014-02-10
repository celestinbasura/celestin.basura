/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak - NetAkademija
 */
package Poglavlje06.Rjesenja;

import java.util.Scanner;

/**
 * Napisati program koji sa standardnog ulaza (System.in) pomoću objekta klase 
 * Scanner učitava jedan string (cijelu zadanu liniju, zajedno sa razmacima) i 
 * provjerava da li zadana rečenica sadrži sva slova engleske abecede (mala ili velika). 
 * Program mora imati posebnu metodu koja radi zadanu provjeru.
 *
 * @author Tomislav Novak
 * @version 1.0
 */
public class V0606 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Unesite rečenicu:");
        String str =  sc.nextLine();
        
        System.out.println("Da li ova rečenica sadrži sva slova engleske abecede? " + (provjeriRecenicu(str)? "Da" : "Ne"));
        
    }
    
    /**
     * Metoda koja provjerava da li ulazni string sadrži sva slova engleske abecede.
     * 
     * @param recenica Ulazni string.
     * @return True ukoliko rečenica sadrži sva slova negleske abecede, inače false.
     */
    static boolean provjeriRecenicu(String recenica) {
    
        String pattern = "";//string u koji ćemo spremati sva različita slova iz recenice.
        
        recenica = recenica.toUpperCase();//sva slova pretvoriti u velika slova
        
        for (int i = 0; i < recenica.length(); i++) {
            
            char slovo = recenica.charAt(i);
            
            if (slovo >= 'A' && slovo <= 'Z') { //provjera da li je trenutni znak slovo en. abecede
                
                if (!pattern.contains(((Character)slovo).toString())) {
                    pattern += slovo;
                }            
            }            
        }
        return pattern.length() == 26;    //duljina svih pronađenih slova će biti 26 ako se pojavljuju sva slova en. abecede.
    }
}
