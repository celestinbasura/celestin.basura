/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje07.Rjesenja;

import java.util.Scanner;

/**
 * vježba v0605
 * Implementirati metodu koja za ulazne paremetre prima niz znakova (String) i
 * znak (char). Ulazni niz predstavlja skup riječi koje je potrebno rastaviti
 * na pojedinačne riječi čije početno slovo odgovara ulaznom znaku. U glavni
 * program vratiti polje sa riječima te ispisati njegov sadržaj. Ako za skup
 * riječi i znak nisu predani parametri metodi main, tada ih je potrebno učitati
 * putem konzole.
 *
 * Primjer:
 * C:\>java SlovoRijeci  "ivan sanja sanda goran jurica igor" s
 * Iz skupa riječi:
 * "ivan sanja sanda goran jurica igor"
 * riječi [ sanja, sanda ] počinju sa slovom 's'.
 *
 * Primjer:
 * C:\>java SlovoRijeci
 * Ulazni parametri nisu specificirani!
 * Unesite broj skup riječi: "ivan sanja sanda iva jurica igor"
 * Unesite znak: i
 * Iz skupa riječi:
 * "ivan sanja sanda iva jurica igor"
 * riječi [ ivan, iva, igor ] počinju sa slovom 'i'.
 */
public class V0705 {

    public static void main(String[] args) {

        String[] polje;
        char c;

        if(args.length == 0) {
            System.out.println("Nema ulaznih parametara! ");
            Scanner sc = new Scanner(System.in);

            System.out.print("Unesite recenicu : ");
            String recenica = sc.nextLine();
            polje = recenica.split(" ");

            System.out.print("Unesite znak : ");
            String rijec = sc.next();
            c = rijec.charAt(0);

        }
        else {
            polje = args[0].split(" ");
            c = args[1].charAt(0);
        }

        System.out.print("Iz skupa rijeci: ");
        for(String s : polje) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.print("Slijedece rijeci: ");
        for(String s : polje) {
            if(s.charAt(0) == c) {
                System.out.print(s + " ");
            }
        }
        System.out.println("pocinju sa " + c);

    }
}
