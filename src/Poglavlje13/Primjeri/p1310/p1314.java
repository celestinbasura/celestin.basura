/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje13.Primjeri.p1310;

/**
 * Primjer p1214
 * Možemo uhvatiti i više različitih iznimki navodeći catch blokove jedan
 * ispod drugoga.
 */
public class p1314 {

    public static void main(String[] args) {

        int[] brojevi = {2, 5, 3, 5, 4, 2, 3};
        String index = "7htzuj";

        try {
            int br = Integer.parseInt(index);
            int element = brojevi[br];
            System.out.printf("Zadnji broj je: %d", element);
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.printf("Nemamo toliko elemenata. \n");
        }
        catch(NumberFormatException ex) {
            System.out.println("Parsiranje broja nije uspjelo: \n"
                    + ex.getMessage());
        }

    }
}
