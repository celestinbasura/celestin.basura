/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Marijan Matic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * zadatak Z0302
 * Koriste�i petlje napisati koliko se izme�u dvije u�itane godine nalazi
 * prestupnih godina.
 */
public class Z0302 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Unesite prvu godinu: ");
        int pocetna = sc.nextInt();
        System.out.print("Unesite zadnju godinu: ");
        int zavrsna = sc.nextInt();
        int brojac = 0;

        for(int i = pocetna; i < zavrsna; i++) {
            if((i % 100 == 0) ? (i % 400 == 0) : (i % 4 == 0)) {
                brojac++;
            }
        }

        System.out.println("Broj prestupnih godina: " + brojac);

    }
}