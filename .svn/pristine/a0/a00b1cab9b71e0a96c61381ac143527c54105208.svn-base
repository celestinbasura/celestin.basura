/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje13.Primjeri.p1310;

/**
 * Primjer p1217
 * Try blok mora imati ili barem jedan catch blok ili finally blok, a može
 * imati i više catch blokova i finally blok.
 *
 * Java7: multi catch statement, u jednom catch bloku možemo uhvatiti više
 * različitih iznimki pa smo spriječili ponavljanje koda. U ovakvom bloku
 * parametar je final. Generirani bytecode je efikasniji.
 */
public class p1317 {

    public static void main(String[] args) {

        int[] brojevi = {2, 5, 3, 5, 4, 2, 3};
        String element = "7";

        try {
            int br = Integer.parseInt(element);
            int zadnji = brojevi[br];
            System.out.printf("Zadnji broj je: %d", zadnji);
        }
        catch(ArrayIndexOutOfBoundsException | NumberFormatException ex) {
            System.out.printf("Element je nedohvatljiv! \n");
        }
        finally {
            System.out.printf("Kako god bilo, ja se izvršim. \n");
        }

    }
}
