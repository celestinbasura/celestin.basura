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
 * Klasa koja sluzi za pretvaranje string reprezentacije cijelgo broja u cjelobrojnu vrijednost.
 * 
 * @author Tomislav Novak
 * @version 1.0 
 */
public class V0607 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki cijeli broj:");
        String broj = sc.next();
        
        System.out.printf("Ulazni string pretvoren u int vrijednost: %d", stringToInt(broj));
    }
    
    /**
     * Metoda koja pretvara String reprezentaciju cijelog broja u cijeli broj.
     * @param broj String reprezentacija cijelog broja.
     * @return cijelobrojna vrijednost String reprezentacije ulaznog parametra "broj".
     */
    public static int stringToInt(String broj) {
        
        /** negativan Varijabla koja indicira da li je broj negativan ili pozitivan.*/
        boolean negativan = false;
        /** rezultat Varijabla u koju se sprema rezultat pretvorbe*/
        int rezultat;                     
        int i;
        
        if (broj == null || !validString(broj)) {            
            return Integer.MAX_VALUE;                     //ako se string ne može parsirati kao cijeli broj        
        }

        if (broj.charAt(0) == '-') {            
            negativan = true;
            rezultat = broj.charAt(1) - 48;             //oduzima se 48 kako bi se dobila stvarna vrijednost unicode znaka znamenke.
            i = 2;            
        } else {               
            rezultat = broj.charAt(0) - 48;
            i = 1;            
        }
        
        for (; i < broj.length(); i++) {            
            rezultat = (rezultat * 10) + (broj.charAt(i) - 48);            
        }
        return (negativan ? -rezultat : rezultat);
    }
    
    /**
     * Metoda koja preovjerava da li String sadrzi samo znamenke dekadskog brojevnog sustava.
     * Teba imati na umu a negativni brojevi pocinju sa znakom "-".
     * @param brojString String koji predstavalja cijeli broj.
     * @return Cjelobrojna vrijednost koju predstavlja ulazni string.
     */
    private static boolean validString(String brojString) {
        
        int i = 0;
        if (brojString.charAt(0) == '-') {          //negativan broj počinje sa "-"
            i = 1;            
        } 
        
        for (; i < brojString.length(); i++) {            
            if (brojString.charAt(i) < '0' || brojString.charAt(i) > '9') {            
                return false;            
            }            
        }
        return true;
    }
    
}