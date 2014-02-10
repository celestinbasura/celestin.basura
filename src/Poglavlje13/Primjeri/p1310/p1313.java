/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje13.Primjeri.p1310;

/**
 * Primjer p1213
 * Neke iznimke nema smisla hvatati, pustimo ih jer ukazuju na grešku u
 * programu.
 */
public class p1313 {

    public static void main(String[] args) {

        int[] brojevi = {2, 5, 3, 5, 4, 2, 3};

        try {
            int zadnji = brojevi[brojevi.length];
            System.out.printf("Zadnji broj je: %d", zadnji);
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.printf("Ups, frka");
        }
        System.out.printf("Ups, frka");

    }
}
