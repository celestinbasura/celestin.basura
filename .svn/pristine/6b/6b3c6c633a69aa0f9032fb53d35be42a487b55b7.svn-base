/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje13.Primjeri.p1310;

/**
 * Primjer p1216
 * Ukoliko želimo da se neke naredbe sigurno izvrše, bez obzira da li je
 * došlo od iznimke ili ne navodimo ih u finally blok koji se piše na
 * samom kraju, iza svih catch blokova.
 */
public class p1316 {

    public static void main(String[] args) {

        int[] brojevi = {2, 5, 3, 5, 4, 2, 3};
        String element = "3";

        try {
            int br = Integer.parseInt(element);
            int zadnji = brojevi[br];
            System.out.printf("Zadnji broj je: %d", zadnji);
        }
        finally {
            System.out.printf("Kako god bilo, ja se izvršim. \n");
        }

    }
}
