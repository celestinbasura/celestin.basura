/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje13.Primjeri.p1310;

/**
 * Primjer p1215
 * Možemo uhvatiti i više različitih iznimki navodeći catch blok za
 * iznimku nadklase. Catch blokovi se moraju navoditi jedan ispod drugoga
 * počevši od konkretnijig iznimki prema apstraktijima.
 */
public class p1315 {

    public static void main(String[] args) {

        int[] brojevi = {2, 5, 3, 5, 4, 2, 3};
        String element = "7";

        try {
            int br = Integer.parseInt(element);
            int zadnji = brojevi[br];
            System.out.printf("Zadnji broj je: %d", zadnji);
        } catch(NumberFormatException ex) {
            
        }
        catch(Exception ex) {
            System.out.printf("Nešto ne valja. \n");
        }

    }
}
