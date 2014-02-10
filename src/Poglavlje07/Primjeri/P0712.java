/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje07.Primjeri;

/**
 * p0612
 * Svojstva polja: prvi element, zadnji element, dužina polja
 */
class P0712 {

    public static void main(String[] args) {

        int[] polje = new int[10];

        int prviElement = polje[0];
        int zadnjiElement = polje[9];

        int duljinaPolja = polje.length;

        System.out.format("Prvi element polja: %d \n"
                + "Zadnji element polja: %d \n"
                + "Duljina polja: %d \n",
                prviElement, zadnjiElement, duljinaPolja);

    }
}
