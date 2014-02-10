/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak - NetAkademija
 */
package Poglavlje05.Rjesenja;

import java.util.Scanner;

/**
 * V0508
 * Napisati program koji tra�i od korisnika da unese tekst i potvrdi unos sa enterom.
 * Program mora sadr�avati metodu koja broji koliko rijeci koje je korisnik unio rije�i
 * koje po�inju sa slovom �A� ili �a�.
 * (Napomena: koristiti objekte Scanner i StringBuilder). 
 *
 * @author Tomislav Novak
 * @version 1.0
 */
public class V0508 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tekst i potvrdite sa enterom:");
        Scanner sc1 = new Scanner(sc.nextLine());

        System.out.println("Ulazni tekst ima " + brojiA(sc1) + " rijeci koje pocinju sa 'a' ili 'A'");

    }

    /**
     * Metod koja ra�una koliko ima rije�i koje po�inju sa znakovima a ili A u 
     * stringu koji ulazni objekt klase Scanner �ita.
     * 
     * @param ulaz Objekt klase Scanner
     * @return Broj rije�i koje po�inju na slovo a ili A.
     */
    static int brojiA(Scanner ulaz) {

        StringBuilder sb = new StringBuilder();
        int br = 0;

        while (ulaz.hasNext()) {
            
            sb.replace(0, sb.length(), ulaz.next()); //kako bi string builder sadr�avao samo aktualnu rijec.
            
            if (sb.charAt(0) == 'a' || sb.charAt(0) == 'A') {
                br++;
            }
        }

        return br;

    }
}
